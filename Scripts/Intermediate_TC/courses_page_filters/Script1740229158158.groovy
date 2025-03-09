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
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.JavascriptExecutor


WebUI.openBrowser('')

WebUI.openBrowser('https://www.joacademy.com/login')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Lenaattoun/lgoin and go to the my courese/Page_- joacademy.com/span_'))

WebUI.setText(findTestObject('Object Repository/Lenaattoun/lgoin and go to the my courese/Page_- joacademy.com/input__email'), 'lena_test_qa@joacademy.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Lenaattoun/lgoin and go to the my courese/Page_- joacademy.com/input__password'), 
    'aeHFOx8jV/A=')

WebUI.sendKeys(findTestObject('Object Repository/Lenaattoun/lgoin and go to the my courese/Page_- joacademy.com/input__password'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Lenaattoun/filters_in_Courses_page/Page_- joacademy.com/button_courses_page'))


WebUI.click(findTestObject('Object Repository/Lenaattoun/filters_in_Courses_page/Page_- joacademy.com (1)/Choose Subject'))

WebUI.click(findTestObject('Object Repository/Lenaattoun/filters_in_Courses_page/Page_- joacademy.com (1)/Option for subject'))

WebUI.click(findTestObject('Object Repository/Lenaattoun/filters_in_Courses_page/Page_- joacademy.com (1)/Choose Teacher'))

WebUI.click(findTestObject('Object Repository/Lenaattoun/filters_in_Courses_page/Page_- joacademy.com (1)/Option for teacher'))

WebUI.click(findTestObject('Object Repository/Lenaattoun/filters_in_Courses_page/Page_- joacademy.com (1)/Teacher Card'))


TestObject subjectName = findTestObject('Lenaattoun/filters_in_Courses_page/Page_- joacademy.com/result_subject_in_card')
JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getWebDriver()
// Use JavaScript to center the element on the screen
js.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'});", WebUI.findWebElement(subjectName))
WebUI.verifyElementText(findTestObject('Lenaattoun/filters_in_Courses_page/Page_- joacademy.com/result_subject_in_card'),'رياضيات الصف الرابع - فصل أول')

TestObject TeacherName = findTestObject('Lenaattoun/filters_in_Courses_page/Page_- joacademy.com/result_teacher_in_card')
// Use JavaScript to center the element on the screen
js.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'});", WebUI.findWebElement(TeacherName))
WebUI.verifyElementText(findTestObject('Lenaattoun/filters_in_Courses_page/Page_- joacademy.com/result_teacher_in_card'),'روان رافع')


