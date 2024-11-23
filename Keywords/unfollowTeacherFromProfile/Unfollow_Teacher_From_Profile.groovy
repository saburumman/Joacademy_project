package unfollowTeacherFromProfile

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

public class Unfollow_Teacher_From_Profile {

	@Keyword
	def unfollowTeacher() {

		// Define the expected text
		String followExpectedText = 'متابعة الاستاذ'
		String unfollowExpectedText = 'الغاء المتابعة'

		// Check if the text exists
		boolean unfollowTextExists = WebUI.verifyElementPresent(findTestObject('Object Repository/Actions_on_Teacher_Profile/Unfollow_Teacher_on_Teacher_Profile'), 5, FailureHandling.OPTIONAL)

		// Check if the "Unfollow" button is present in the DOM
		if (unfollowExpectedText) {
			// If "Unfollow" button exists, click it
			WebUI.click(findTestObject('Object Repository/Actions_on_Teacher_Profile/Unfollow_Teacher_on_Teacher_Profile'))
			WebUI.comment('Action performed: Unfollow action completed' + unfollowExpectedText)
		} else {
			// If "Unfollow" button does not exist, click "Follow" button

			WebUI.click(findTestObject('Object Repository/Actions_on_Teacher_Profile/Follow_Teacher_Teacher_Profile'))
			WebUI.comment('Action performed: Follow action completed' + followExpectedText )
		}
	}
}
