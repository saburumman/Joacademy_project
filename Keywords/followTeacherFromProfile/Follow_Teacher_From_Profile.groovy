package followTeacherFromProfile

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Follow_Teacher_From_Profile {


	@Keyword
	def followTeacher() {
		// Ensure the page is fully loaded before proceeding
		WebUI.waitForPageLoad(10)
		WebUI.delay(5)

		// Define the expected text
		String followExpectedText = 'متابعة الاستاذ'
		String unfollowExpectedText = 'الغاء المتابعة'

		// Check if the text exists
		boolean followTextExists = WebUI.verifyElementPresent(findTestObject('Object Repository/Actions_on_Teacher_Profile/Follow_Teacher_Teacher_Profile'), 5, FailureHandling.OPTIONAL)


		// Check if the "Follow" button is present in the DOM
		if (followTextExists) {
			// If "Follow" button exists, click it
			WebUI.click(findTestObject('Object Repository/Actions_on_Teacher_Profile/Follow_Teacher_Teacher_Profile'))
			WebUI.comment('Action performed: Follow action completed' + followExpectedText )
			WebUI.takeScreenshot('Screenshots/Targets/Follow_Teacher')
		
		} else {
			// If "Follow" button does not exist, click "Unfollow" button
			WebUI.click(findTestObject('Object Repository/Actions_on_Teacher_Profile/Unfollow_Teacher_on_Teacher_Profile'))
			WebUI.comment('Action performed: Unfollow action completed' + unfollowExpectedText)
			WebUI.takeScreenshot('Screenshots/Targets/Unfollow_Teacher')
			
		}
	}
}
