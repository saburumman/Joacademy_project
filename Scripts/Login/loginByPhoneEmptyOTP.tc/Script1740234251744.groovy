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
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By as By

String validationMessage = 'يجب أن تتكون كلمة المرور لمرة واحدة من 6 أحرف.'

String xpath = '//*[@id=":rb:-form-item-message"]'

// Open the browser
WebUI.openBrowser('')

// Maximize the browser window
WebUI.maximizeWindow()

// Navigate to the URL specified in GlobalVariable
WebUI.navigateToUrl(GlobalVariable.URL)

// Enter the phone number
WebUI.setText(findTestObject('Object Repository/Shanab/login/Page_- joacademy.com/input__phone_number'), GlobalVariable.PhoneNumber2)

// Submit the login form
WebUI.click(findTestObject('Object Repository/Shanab/login/Page_- joacademy.com/Submit_phone_number'))

//select the user
// Get the WebDriver instance
WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> elements = driver.findElements(By.xpath('//body/div/div[@dir=\'rtl\']/div/div/div/div/div[@dir=\'rtl\']/section/section/div'))

if (elements.size() > 0) {
    // Generate a random index
    CustomKeywords.'com.ea.utilities.methods.randomSelector'(elements)

    WebUI.click(findTestObject('Object Repository/Shanab/login/Page_- joacademy.com/Submit_phone_number'))

    //check the validation
    CustomKeywords.'com.ea.utilities.methods.assertValidation'(validationMessage, xpath) //check the validation
} else {
    WebUI.click(findTestObject('Object Repository/Shanab/login/Page_- joacademy.com/Submit_phone_number'))

    CustomKeywords.'com.ea.utilities.methods.assertValidation'(validationMessage, xpath)
}


