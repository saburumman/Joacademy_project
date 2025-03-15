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

// Login
CustomKeywords.'com.ea.utilities.loginTest.loginToJoAcademy'()

//Navogate to courses page
WebUI.click(findTestObject('Shanab/Courses/CourseButton/CourseButton'))

// category function
CustomKeywords.'com.ea.utilities.coursesFilter.category'()

// sub-category function
CustomKeywords.'com.ea.utilities.coursesFilter.subcategory'()

// subject function
CustomKeywords.'com.ea.utilities.coursesFilter.subject'()

//select the random course 
WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> elements = driver.findElements(By.xpath('//article'))

CustomKeywords.'com.ea.utilities.courses.CardCourse'(elements)

//check the successful message
String validationMessage = 'البطاقة غير موجودة او مستخدمة'

String xpath = '//p[@id=\':r13:-form-item-message\']'

CustomKeywords.'com.ea.utilities.methods.assertValidation'(validationMessage, xpath)

