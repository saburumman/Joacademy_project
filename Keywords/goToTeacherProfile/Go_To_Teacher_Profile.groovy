package goToTeacherProfile

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

public class Go_To_Teacher_Profile {

	@Keyword
	def goToTeacher() {

		//Navigate to teacher's page
		WebUI.click(findTestObject('Object Repository/Saraa/Main_Menu_List- joacademy.com/Teachers_From_Main_Menu'))

		//Search for a teacher
		WebUI.setText(findTestObject('Object Repository/Saraa/Teachers_Page- joacademy.com/Search_Box_for_Teacher'), 'اسامة العكور')

		WebUI.waitForPageLoad(20)
		WebUI.delay(2)
		

		//Go to the teacher's profile
		WebUI.click(findTestObject('Object Repository/Saraa/Teachers_Page- joacademy.com/Teacher_Card'))
	}
}
