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

WebUI.waitForPageLoad(30) // Wait up to 30 seconds

// Define the expected text

String followExpectedText = 'متابعة الاستاذ'
String unfollowExpectedText = 'الغاء المتابعة'

// Check if the text exists
boolean unfollowTextExists = WebUI.verifyElementPresent(findTestObject('Object Repository/Saraa/Actions_on_Teacher_Profile/Unfollow_Teacher_on_Teacher_Profile'), 5, FailureHandling.OPTIONAL)

// Check if the "Unfollow" button is present in the DOM
		if (unfollowExpectedText) {
			// If "Unfollow" button exists, click it
			WebUI.click(findTestObject('Object Repository/Saraa/Actions_on_Teacher_Profile/Unfollow_Teacher_on_Teacher_Profile'))
			WebUI.comment('Action performed: Unfollow action completed' + unfollowExpectedText)
			WebUI.takeScreenshot('Screenshots/Targets/Unfollow_Teacher')
			
		} else {
			// If "Unfollow" button does not exist, click "Follow" button
			
			WebUI.click(findTestObject('Object Repository/Saraa/Actions_on_Teacher_Profile/Follow_Teacher_Teacher_Profile'))
			WebUI.comment('Action performed: Follow action completed' + followExpectedText )
			WebUI.takeScreenshot('Screenshots/Targets/Follow_Teacher')
			
				
		}
	