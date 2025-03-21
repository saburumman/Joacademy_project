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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.chrome.ChromeDriver as ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions
import internal.GlobalVariable as Global

WebUI.openBrowser('')

// Maximize the browser window
WebUI.maximizeWindow()

// Navigate to the URL specified in GlobalVariable
WebUI.navigateToUrl(GlobalVariable.URL)

// Click the login button
WebUI.click(findTestObject('Object Repository/Shanab/login/Page_- joacademy.com/login_by_email'))

// Enter the username
WebUI.setText(findTestObject('Object Repository/Shanab/login/Page_- joacademy.com/input__email'), GlobalVariable.InvalidUserName)

// Enter the password
WebUI.setText(findTestObject('Object Repository/Shanab/login/Page_- joacademy.com/input__password'), GlobalVariable.PassWord)

// Submit the login form
WebUI.click(findTestObject('Object Repository/Shanab/login/Page_- joacademy.com/Submit_login'))

String validationMessage = 'كلمة المرور او الإميل غير صحيح'

String xpath = ''

WebUI.verifyElementText(findTestObject('Shanab/login/Page_- joacademy.com/invalid_email'), 'كلمة المرور او الإميل غير صحيح')

