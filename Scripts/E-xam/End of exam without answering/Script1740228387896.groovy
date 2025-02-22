import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import login.LoginTest as LoginTest
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import java.util.Random
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.JavascriptExecutor

def runTestCase3() {
    // ⏩ تسجيل الدخول
    LoginTest login = new LoginTest()
    login.loginJoAcademy('saber22@gmail.com', 'RigbBhfdqOBGNlJIWM1ClA==')
    
    // ⏩ تكبير نافذة المتصفح
    WebUI.maximizeWindow()
    
    // ⏩ الانتقال إلى صفحة الاختبارات الإلكترونية
    WebUI.waitForElementVisible(findTestObject('navegate to the E-exam page/Page_- joacademy.com/button e exams'), 10)
    WebUI.click(findTestObject('navegate to the E-exam page/Page_- joacademy.com/button e exams'))

    // 🔍 البحث عن أزرار "بدء الامتحان"
    List<WebElement> startExamButtons = WebUiCommonHelper.findWebElements(findTestObject('Object Repository/submet exam/Page_- joacademy.com/start exma'), 10)
    
    if (startExamButtons != null && !startExamButtons.isEmpty()) {
        Random random = new Random()
        int randomIndex = random.nextInt(startExamButtons.size())
        
        // 🟢 النقر على زر عشوائي "بدء الامتحان" باستخدام JavaScript Click
        WebUI.executeJavaScript("arguments[0].click();", Arrays.asList(startExamButtons.get(randomIndex)))
        WebUI.comment('✅ تم النقر على زر بدء الامتحان.')
    } else {
        WebUI.comment('❌ لم يتم العثور على أزرار بدء الامتحان!')
        return
    }

    // ⏸️ الانتظار قليلاً قبل التبديل إلى نافذة الامتحان
    WebUI.delay(5)
    
    // ⏩ التبديل إلى نافذة الاختبار (index 1)
    WebUI.switchToWindowIndex(1)

    // 🟢 التمرير إلى زر "إنهاء الامتحان" باستخدام JavaScript Scroll
    TestObject finishExamButton = findTestObject('Object Repository/submet exam/Page_- joacademy.com/finsh exma')
    JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getWebDriver()
    
    // التمرير إلى الزر "إنهاء الامتحان"
    js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", WebUI.findWebElement(finishExamButton))
    
    // ⏩ الانتظار حتى يصبح الزر مرئيًا وقابلاً للنقر
    WebUI.waitForElementVisible(finishExamButton, 30)
    WebUI.waitForElementClickable(finishExamButton, 30)
    
    // 🟢 النقر على زر "إنهاء الامتحان" باستخدام JavaScript Click كخيار بديل
    try {
        js.executeScript("arguments[0].click();", WebUI.findWebElement(finishExamButton))
        WebUI.comment('✅ تم النقر على زر إنهاء الامتحان باستخدام JavaScript.')
    } catch (Exception e) {
        WebUI.comment('⚠️ حدث خطأ أثناء النقر باستخدام JavaScript. سيتم استخدام WebUI.click().')
        WebUI.click(finishExamButton)
    }

    // ⏸️ الانتظار لفترة قصيرة للتحقق من الصفحة الجديدة
    WebUI.delay(5)
    
    // 🔍 تحقق مما إذا كان عنصر "التحقق من تسجيل الدخول" مرئيًا
    TestObject verifyLogin = findTestObject('Object Repository/submet exam/Page_- joacademy.com/verify login')
    if (WebUI.verifyElementVisible(verifyLogin, FailureHandling.CONTINUE_ON_FAILURE)) {
        WebUI.comment('✅ العنصر "التحقق من تسجيل الدخول" مرئي. سيتم إغلاق المتصفح.')
        WebUI.closeBrowser()
    } else {
        WebUI.comment('❌ العنصر "التحقق من تسجيل الدخول" غير موجود. سيتم إغلاق المتصفح.')
        WebUI.closeBrowser()
    }
}

def executeTestCases() {
    runTestCase3()
}

executeTestCases()
