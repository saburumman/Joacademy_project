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

WebUI.openBrowser("https://www.joacademy.com/login")

//WebUI.navigateToUrl('https://www.joacademy.com/login')
WebUI.maximizeWindow()
WebUI.click(findTestObject('Object Repository/Lenaattoun/lgoin and go to the my courese/Page_- joacademy.com/span_'))

WebUI.setText(findTestObject('Object Repository/Lenaattoun/lgoin and go to the my courese/Page_- joacademy.com/input__email'), 'lena_test_qa@joacademy.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Lenaattoun/lgoin and go to the my courese/Page_- joacademy.com/input__password'), 
    'aeHFOx8jV/A=')

WebUI.sendKeys(findTestObject('Object Repository/Lenaattoun/lgoin and go to the my courese/Page_- joacademy.com/input__password'), 
    Keys.chord(Keys.ENTER))
WebUI.click(findTestObject('Object Repository/Lenaattoun/lgoin and go to the my courese/Page_UserView Page - joacademy.com/my courses'))

//close page 
WebUI.click(findTestObject('Object Repository/Lenaattoun/lgoin and go to the my courese/Page_- joacademy.com/button_Close'))
//WebUI.scrollToElement(findTestObject('Object Repository/StartCourseButton'), 10)

WebUI.delay(5)	

TestObject courseStartBTN = findTestObject('Object Repository/Lenaattoun/Button_For_Start_TheCourse/Page_- joacademy.com/button_start the coures')
JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getWebDriver()
// Use JavaScript to center the element on the screen
js.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'});", WebUI.findWebElement(courseStartBTN))
WebUI.click(findTestObject('Object Repository/Lenaattoun/Button_For_Start_TheCourse/Page_- joacademy.com/button_start the coures'))


WebUI.doubleClick(findTestObject('Object Repository/Lenaattoun/Button_For_Start_TheCourse/Page_- joacademy.com/Button_close_the_unit'))




WebUI.click(findTestObject('Object Repository/Lenaattoun/Button_For_Start_TheCourse/Page_- joacademy.com/Enter_to_TheLesson'))

// Step 1: Switch to the iframe
WebUI.switchToFrame(findTestObject('Object Repository/Lenaattoun/Button_For_Start_TheCourse/Page_- joacademy.com/iframe'), 10)

//click start video
WebUI.click(findTestObject('Object Repository/Lenaattoun/Button_For_Start_TheCourse/Page_- joacademy.com/button_for_start_to_watch'))

WebUI.delay(1)

// Step 3: Switch back to the main page
WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Object Repository/Lenaattoun/Button_For_Start_TheCourse/Page_- joacademy.com/button_for_stop_to_watch'))


WebUI.click(findTestObject('Object Repository/Lenaattoun/Button_For_Start_TheCourse/Page_- joacademy.com/Button_for_arrow_left'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Lenaattoun/Button_For_Start_TheCourse/Page_- joacademy.com/Button_for_arrow_Right'))

WebUI.click(findTestObject('Object Repository/Lenaattoun/Button_For_Start_TheCourse/Page_- joacademy.com/Button_For_Back_To_The_Course'))

WebUI.click(findTestObject('Object Repository/Lenaattoun/Button_For_Start_TheCourse/Page_- joacademy.com/p__1'))

WebUI.click(findTestObject('Object Repository/Lenaattoun/lgoin and go to the my courese/Page_- joacademy.com/button_Close'))


// this for testing only 
//session 
//ook 

