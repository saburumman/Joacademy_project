package shareTeacherProfileLink

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

public class Share_Teacher_Profile_Link {


	@Keyword
	def shareTeacherProfile() {
		
		//Copy Teacher Profile Link
		WebUI.click(findTestObject('Object Repository/Actions_on_Teacher_Profile/Share_Teacher_Profile'))

		//Make sure URL Link is Copied
		// Define the expected text
		String shareExpectedText = 'تم نسخ الرابط'

		def shareTeacherActualText = findTestObject('Object Repository/Actions_on_Teacher_Profile/Success_msg_Teacher_Profile_Copied')

		// Check if the text exists within the specified <h1> element
		boolean shareTeachertextExists = WebUI.verifyElementText(findTestObject('Object Repository/Actions_on_Teacher_Profile/Success_msg_Teacher_Profile_Copied'), shareExpectedText)

		// Assert the text exists
		if (shareTeachertextExists) {
			WebUI.comment('The text exists: ' + shareExpectedText)
		} else {
			WebUI.comment('The text does not exist: ' + shareExpectedText)
		}
	}
}
