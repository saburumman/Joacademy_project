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

WebUI.openBrowser('https://www.joacademy.com/login')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Lenaattoun/lgoin and go to the my courese/Page_- joacademy.com/span_'))

WebUI.setText(findTestObject('Object Repository/Lenaattoun/lgoin and go to the my courese/Page_- joacademy.com/input__email'), 'lena_test_qa@joacademy.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Lenaattoun/lgoin and go to the my courese/Page_- joacademy.com/input__password'), 
    'aeHFOx8jV/A=')

WebUI.sendKeys(findTestObject('Object Repository/Lenaattoun/lgoin and go to the my courese/Page_- joacademy.com/input__password'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Lenaattoun/My_Files_Page/Page_- joacademy.com/Button_for_myFiles_page'))

WebUI.click(findTestObject('Object Repository/Lenaattoun/My_Files_Page/Page_- joacademy.com/button_for_share_TheFile'))

WebUI.click(findTestObject('Object Repository/Lenaattoun/My_Files_Page/Page_- joacademy.com/button_success_copy_the_file'))

Boolean buttoncopy = WebUI.verifyElementText(findTestObject('Object Repository/Lenaattoun/My_Files_Page/Page_- joacademy.com/success_massage_for_copy'), 
    'تم النسخ بنجاح')

if (buttoncopy) {
    print('passed copy file ')
} else {
    print('field copy file ')
}

WebUI.click(findTestObject('Object Repository/Lenaattoun/My_Files_Page/Page_- joacademy.com/button_for_download-theFile'))

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

WebUI.click(findTestObject('Object Repository/Lenaattoun/My_Files_Page/Page_- joacademy.com/button_for_seccuss_download'))


WebUI.click(findTestObject('Lenaattoun/My_Files_Page/Page_- joacademy.com/button_remove_ToMy_favoret_page'))
//WebUI.click(findTestObject('My_Files_Page/Page_- joacademy.com/button_add_ToMy_favoret_page'))



