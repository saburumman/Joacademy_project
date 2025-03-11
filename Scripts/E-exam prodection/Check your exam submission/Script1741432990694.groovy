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
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject 
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import login.LoginTest as LoginTest
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import java.util.Random as Random
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.joacademy.com/online-exams')

WebUI.click(findTestObject('Object Repository/E-exam prodection/Page_/Page_joacademy.com/a_'))

WebUI.click(findTestObject('Object Repository/E-exam prodection/Page_/Page_/span_'))

WebUI.setText(findTestObject('Object Repository/E-exam prodection/Page_/Page_/input__email'), 'lenaparentest@joacademy.com')

WebUI.setEncryptedText(findTestObject('Object Repository/E-exam prodection/Page_/Page_/input__password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/E-exam prodection/Page_/Page_/button_'))

WebUI.click(findTestObject('Object Repository/E-exam prodection/Page_/Page_/a_'))

WebUI.click(findTestObject('Object Repository/E-exam prodection/Page_/Page_joacademy.com/button_'))

WebUI.switchToWindowTitle('سورة البلد الآيات الكريمة (1-10) | joacademy.com')

WebUI.click(findTestObject('Object Repository/E-exam prodection/Page_/Page_(1-10)  joacademy.com/true'))

WebUI.click(findTestObject('Object Repository/E-exam prodection/Page_/Page_(1-10)  joacademy.com/true3'))

WebUI.click(findTestObject('Object Repository/E-exam prodection/Page_/Page_(1-10)  joacademy.com/true2'))

WebUI.click(findTestObject('Object Repository/E-exam prodection/Page_/Page_(1-10)  joacademy.com/true4'))

WebUI.click(findTestObject('Object Repository/E-exam prodection/Page_/Page_(1-10)  joacademy.com/true5'))

WebUI.click(findTestObject('Object Repository/E-exam prodection/Page_/Page_(1-10)  joacademy.com/true6'))

WebUI.click(findTestObject('Object Repository/E-exam prodection/Page_/Page_(1-10)  joacademy.com/true7'))

WebUI.click(findTestObject('Object Repository/E-exam prodection/Page_/Page_(1-10)  joacademy.com/finsh button'))

boolean verify = WebUI.verifyElementVisible(findTestObject('Object Repository/E-exam prodection/Page_/Page_(1-10)  joacademy.com/div_3  7'))

if (verify || verify) {
	println("Passed")
	WebUI.closeBrowser()
} else {
	println("filed ")
}

