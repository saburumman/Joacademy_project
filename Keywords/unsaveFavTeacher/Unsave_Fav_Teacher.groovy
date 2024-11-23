package unsaveFavTeacher

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

public class Unsave_Fav_Teacher {


	@Keyword
	def unSaveFavTeacher() {

		//Un-save Teacher
		WebUI.click(findTestObject('Object Repository/Teachers_Page- joacademy.com/Selected_Fav_Icon'))

		//Navigate to Courses, to refresh Teachers tab
		WebUI.click(findTestObject('Object Repository/Favorite_Page/Courses_Fav'))

		//Navigate back to Teachers tab
		WebUI.click(findTestObject('Object Repository/Favorite_Page/Teacher_Tab_In_Fav_Page'))
		
		//Verify Element is not present
		WebUI.verifyElementNotPresent(findTestObject('Teachers_Page- joacademy.com/Selected_Fav_Icon'), 0)

	}
}
