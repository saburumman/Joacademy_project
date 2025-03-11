import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.annotation.Keyword as Keyword
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

// Log in to JoAcademy
CustomKeywords.'com.ea.utilities.loginTest.loginToJoAcademy'()

// Click on the Course Button
WebUI.click(findTestObject('Shanab/Courses/CourseButton/CourseButton'))

// Set the search text for the course
WebUI.setText(findTestObject('Shanab/Courses/Filter/search-bar'), 'رياضيات - علمي - مسجل فصل اول - محمد صالح - 2007')

// Locate the "Activate with Card" button
WebElement cardRegister = DriverFactory.getWebDriver().findElement(By.xpath('//button[text()="تفعيل بالبطاقة"]'))

// Hover over the button
CustomKeywords.'com.ea.utilities.methods.hoverToTheButton'(cardRegister)

// Enter the card details
WebUI.setText(findTestObject('Shanab/Courses/CourseButton/Fill_the_card'), GlobalVariable.Card50Used)

// Submit the card
WebElement CardSubmit = DriverFactory.getWebDriver().findElement(By.xpath("//button[contains(text(),'أرسل')]"))
CustomKeywords.'com.ea.utilities.methods.hoverToTheButton'(CardSubmit)

// Validate the error message
String validationMessage = 'البطاقة غير موجودة او مستخدمة'
String xpath = "//*[contains(text(),'البطاقة غير موجودة او مستخدمة')]"
CustomKeywords.'com.ea.utilities.methods.assertValidation'(validationMessage, xpath)
