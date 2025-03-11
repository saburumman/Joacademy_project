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
WebUI.maximizeWindow()
WebUI.navigateToUrl('https://www.joacademy.com/online-exams')

WebUI.setText(findTestObject('Object Repository/E-exam prodection/Page_joacademy.com/input__tw-flex tw-h-10 tw-w-full tw-rounded_259cec'), 
    'سورة البلد الآيات الكريمة (1-10)')

boolean isElement1Visible = WebUI.verifyElementVisible(
    findTestObject('Object Repository/E-exam prodection/Page_joacademy.com/div_(1-10)   7   14'),
    FailureHandling.OPTIONAL)

boolean isElement2Visible = WebUI.verifyElementVisible(
    findTestObject('Object Repository/E-exam prodection/Page_joacademy.com/div_(1-10)   7   14_1'),
    FailureHandling.OPTIONAL)

if (isElement1Visible || isElement2Visible) {
    println("Passed")
    WebUI.closeBrowser()
} else {
    println("filed ")
}

