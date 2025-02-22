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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.joacademy.com/user/favorite')
WebUI.maximizeWindow()


WebUI.click(findTestObject('Object Repository/Lenaattoun/My_favoret_page/Page_- joacademy.com/button_login_by_email'))

WebUI.setText(findTestObject('Object Repository/Lenaattoun/My_favoret_page/Page_- joacademy.com/input__email'), 'lena_test_qa@joacademy.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Lenaattoun/My_favoret_page/Page_- joacademy.com/input__password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Lenaattoun/My_favoret_page/Page_- joacademy.com/button__submit_for_login'))

WebUI.click(findTestObject('Object Repository/Lenaattoun/My_favoret_page/Page_- joacademy.com/button_share_thefile_favoretpage'))

WebUI.click(findTestObject('Object Repository/Lenaattoun/My_favoret_page/Page_- joacademy.com/button_for_copy_TheFile_favoretpage'))

Boolean buttoncopy = WebUI.verifyElementText(findTestObject('Object Repository/Lenaattoun/My_favoret_page/Page_- joacademy.com/success_massage_for_copy_TheFile_favoretpage'), 
    'تم النسخ بنجاح')

if (buttoncopy) {
    print('passed copy file ')
} else {
    print('field copy file ')
}

WebUI.click(findTestObject('Object Repository/Lenaattoun/My_favoret_page/Page_- joacademy.com/button_for_download_TheFile_favoretpage'))

WebUI.delay(3)

//صفحتين
int numberOfWindows = WebUI.getWindowIndex()

if (numberOfWindows < 2) {
    println('لم يتم فتح نافذة جديدة.' // الانتقال إلى النافذة الثانية
        )
} else {
    WebUI.switchToWindowIndex(1)
}

WebUI.switchToWindowIndex(0)

println('عدنا إلى الصفحة الأصلية: ' + WebUI.getWindowTitle())

// استخراج اسم الملف الذي سيتم إزالته من المفضلة
String fileName = WebUI.getText(findTestObject('Object Repository/Lenaattoun/My_favoret_page/Page_- joacademy.com/h2_Comparative      1')).trim()

println('اسم الملف الذي سيتم إزالته: ' + fileName)

// النقر على زر الإزالة
WebUI.click(findTestObject('Object Repository/Lenaattoun/My_favoret_page/Page_- joacademy.com/button_for_remove_theheart'))

// تأخير وإعادة تحميل الصفحة
WebUI.delay(3)

WebUI.refresh()

//// التحقق من وجود الملف بعد التحديث
//TestObject dynamicFileCheck = new TestObject('dynamicFileCheck')
//
//dynamicFileCheck.addProperty('xpath', com.kms.katalon.core.testobject.ConditionType.EQUALS, ('//h2[text()=\'' + fileName) + 
//    '\']')
//
//boolean isFileStillPresent = WebUI.verifyElementNotPresent(dynamicFileCheck, 5)
//
//if (!(isFileStillPresent)) {
//    println('العنصر تم حذفه بنجاح: ' + fileName)
//} else {
//    println('العنصر ما زال موجودًا بعد التحديث: ' + fileName)
//}


WebUI.click(findTestObject('Object Repository/Lenaattoun/My_favoret_page/Page_- joacademy.com/button_for_courses_favoretpage'))

WebUI.click(findTestObject('Object Repository/Lenaattoun/My_favoret_page/Page_- joacademy.com/button_for_files_favoretpage'))

