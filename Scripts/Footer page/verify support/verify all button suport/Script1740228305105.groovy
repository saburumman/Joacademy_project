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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

// Open the browser and navigate to the URL
WebUI.openBrowser('')
WebUI.navigateToUrl('https://www.joacademy.com/home/tawjihi')
WebUI.maximizeWindow()

// Close the pop-up if it appears
WebUI.click(findTestObject('Object Repository/Check out quick links/Page_- joacademy.com/closeimage'))

// Custom function to scroll to the bottom of the page
def scrollToBottom() {
    try {
        // Scroll using WebUI to a large position
        WebUI.scrollToPosition(0, 9999999)
        WebUI.delay(2)
        
        // Execute JavaScript to ensure page scrolls to the bottom
        WebUI.executeJavaScript("window.scrollTo(0, document.body.scrollHeight);", null)
        WebUI.delay(2)
    } catch (Exception e) {
        println("⚠️ Scroll to bottom failed: " + e.getMessage())
    }
}

// ** Click on "Courses" button and verify page title **
scrollToBottom()
WebUI.click(findTestObject('Object Repository/verify all button suport/Page_- joacademy.com/courses'))
WebUI.delay(3)
if (WebUI.verifyElementText(findTestObject('Object Repository/verify all button suport/Page_-    - joacademy.com/header_courses page'), 'الدورات', FailureHandling.CONTINUE_ON_FAILURE)) {
    println("✅ PASSED: 'الدورات' is visible on the page.")
} else {
    println("❌ FAILED: 'الدورات' is NOT visible on the page.")
}
WebUI.delay(5)

// ** Click on "Shababik" button and verify page title **
scrollToBottom()
WebUI.click(findTestObject('Object Repository/verify all button suport/Page_-    - joacademy.com/shababick'))
WebUI.delay(3)
if (WebUI.verifyElementText(findTestObject('Object Repository/verify all button suport/Page_- joacademy.com/shababik'), 'شبابيك', FailureHandling.CONTINUE_ON_FAILURE)) {
    println("✅ PASSED: 'شبابيك' is visible on the page.")
} else {
    println("❌ FAILED: 'شبابيك' is NOT visible on the page.")
}
WebUI.delay(5)

// ** Click on "e-School" button and verify page title **
scrollToBottom()
WebUI.click(findTestObject('Object Repository/verify all button suport/Page_- joacademy.com/e-school'))
WebUI.delay(3)
if (WebUI.verifyElementText(findTestObject('Object Repository/verify all button suport/Page_- joacademy.com/e-school vreify'), 'اختر صفك الدراسي المناسب للمدرسة الالكترونية', FailureHandling.CONTINUE_ON_FAILURE)) {
    println("✅ PASSED: 'اختر صفك الدراسي المناسب للمدرسة الالكترونية' is visible on the page.")
} else {
    println("❌ FAILED: 'اختر صفك الدراسي المناسب للمدرسة الالكترونية' is NOT visible on the page.")
}
WebUI.delay(5)

// ** Click on "Teachers" button and verify page title **
scrollToBottom()
WebUI.click(findTestObject('Object Repository/verify all button suport/Page_- joacademy.com/teacher'))
WebUI.delay(3)
if (WebUI.verifyElementText(findTestObject('Object Repository/verify all button suport/Page_-   - joacademy.com/verify tittle teacher'), 'المعلمون - الثانوية العامة', FailureHandling.CONTINUE_ON_FAILURE)) {
    println("✅ PASSED: 'المعلمون - الثانوية العامة' is visible on the page.")
} else {
    println("❌ FAILED: 'المعلمون - الثانوية العامة' is NOT visible on the page.")
}
WebUI.delay(5)

// ** Click on "Files" button and verify page title **
scrollToBottom()
WebUI.click(findTestObject('Object Repository/verify all button suport/Page_-   - joacademy.com/files'))
WebUI.delay(3)
if (WebUI.verifyElementText(findTestObject('Object Repository/verify all button suport/Page_-    - joacademy.com/verify file tittle'), 'ملفات - مواد الثانوية العامة', FailureHandling.CONTINUE_ON_FAILURE)) {
    println("✅ PASSED: 'ملفات - مواد الثانوية العامة' is visible on the page.")
} else {
    println("❌ FAILED: 'ملفات - مواد الثانوية العامة' is NOT visible on the page.")
}
WebUI.delay(5)

// ** Click on "Scholarship" button and verify page title **
scrollToBottom()
WebUI.click(findTestObject('Object Repository/verify all button suport/Page_-    - joacademy.com/scolarship'))
WebUI.delay(3)
if (WebUI.verifyElementText(findTestObject('Object Repository/verify all button suport/Page_- joacademy.com/scolarship'), 'منح جواكاديمي', FailureHandling.CONTINUE_ON_FAILURE)) {
    println("✅ PASSED: 'منح جواكاديمي' is visible on the page.")
} else {
    println("❌ FAILED: 'منح جواكاديمي' is NOT visible on the page.")
}
WebUI.delay(5)

// ** Click on "Home Page" button to return to the main page **
scrollToBottom()
WebUI.click(findTestObject('Object Repository/verify all button suport/Page_-   - joacademy.com/home page'))
WebUI.delay(3)

// ** Close the browser after finishing all verifications **
WebUI.closeBrowser()
