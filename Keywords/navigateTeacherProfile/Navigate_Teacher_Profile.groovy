package navigateTeacherProfile

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

public class Navigate_Teacher_Profile {

	@Keyword
	def teacherProfile() {

		//Navigate to teacher's page
		WebUI.click(findTestObject('Object Repository/Saraa/Main_Menu_List- joacademy.com/Teachers_From_Main_Menu'))

		//Search for a teacher
		WebUI.setText(findTestObject('Object Repository/Saraa/Teachers_Page- joacademy.com/Search_Box_for_Teacher'), 'اسامة العكور')

		WebUI.takeScreenshot('Screenshots/Teacher_after_Search.png')

		//Save the teacher's name from the teacher card in an obj then get the string
		def teacherNameOnCard = findTestObject('Object Repository/Saraa/Teacher_Profile/Teachers_Name_on_Teachers_Card')

		String saveTeacherName = WebUI.getText(teacherNameOnCard)

		//Go to the teacher's profile
		WebUI.click(findTestObject('Object Repository/Saraa/Teacher_Profile/Teachers_Name_on_Teachers_Card'))

		//Check if the profile is for the same selected teacher
		boolean isSameTeacherNamePresent = WebUI.verifyTextPresent(saveTeacherName, false) // 'false' makes it case-insensitive

		if (isSameTeacherNamePresent) {
			WebUI.comment("Same Teacher I Searched For is Found!")
		} else {
			WebUI.comment("Not Same Teacher I Searched For! BUG!!!!")
		}

		WebUI.takeScreenshot('Screenshots/Teacher_Profile.png')

		// Navigate between teacher's profile tabs
		WebUI.click(findTestObject('Object Repository/Saraa/Teacher_Profile/Office_Hours_Teacher_Profile'))
		WebUI.takeScreenshot('Screenshots/Office_Hours_Teacher_Profile.png')

		WebUI.click(findTestObject('Object Repository/Saraa/Teacher_Profile/Shbabek_Teacher_Profile'))
		WebUI.takeScreenshot('Screenshots/Shbabek_Teacher_Profile.png')

		WebUI.click(findTestObject('Object Repository/Saraa/Teacher_Profile/Groups_Teacher_Profile'))
		WebUI.takeScreenshot('Screenshots/Groups_Teacher_Profile.png')

		WebUI.click(findTestObject('Object Repository/Saraa/Teacher_Profile/Posts_Teacher_Profile'))
		WebUI.takeScreenshot('Screenshots/Posts_Teacher_Profile.png')

		WebUI.click(findTestObject('Object Repository/Saraa/Teacher_Profile/Files_Teacher_Profile'))
		WebUI.takeScreenshot('Screenshots/Files_Teacher_Profile.png')

		WebUI.click(findTestObject('Object Repository/Saraa/Teacher_Profile/Events_Teacher_Profile'))
		WebUI.takeScreenshot('Screenshots/Events_Teacher_Profile.png')

		WebUI.click(findTestObject('Object Repository/Saraa/Teacher_Profile/Exams_Teacher_Profile'))
		WebUI.takeScreenshot('Screenshots/Exams_Teacher_Profile.png')

		WebUI.click(findTestObject('Object Repository/Saraa/Teacher_Profile/Mixed_Videos_Teacher_Profile'))
		WebUI.takeScreenshot('Screenshots/Mixed_Videos_Teacher_Profile.png')
	}
}
