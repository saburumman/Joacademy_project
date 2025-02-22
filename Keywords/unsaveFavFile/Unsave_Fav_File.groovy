package unsaveFavFile

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

public class Unsave_Fav_File {

	@Keyword
	def unSaveFavFile() {

		//Unsave File
		WebUI.doubleClick(findTestObject('Saraa/Favorite_Page/Saved_File_In_Fav_Page'))

		//Navigate to Courses, to refresh Teachers tab
		WebUI.click(findTestObject('Object Repository/Saraa/Favorite_Page/Courses_Fav'))

		WebUI.delay(5)

		//Navigate back to Files tab
		WebUI.click(findTestObject('Saraa/Favorite_Page/Files_Tab_In_Fav_Page'))

		//Veify Element is not present
		WebUI.verifyElementNotPresent(findTestObject('Saraa/Favorite_Page/Nothing_Added_to_Fav'), 0)
		
		WebUI.takeScreenshot('Screenshots/Targets/Unsave_File')
		
	}
}
