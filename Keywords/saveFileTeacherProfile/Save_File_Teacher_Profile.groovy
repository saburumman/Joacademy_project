package saveFileTeacherProfile

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
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.testobject.ConditionType

import internal.GlobalVariable

public class Save_File_Teacher_Profile {

	// Function to create a dynamic TestObject
	TestObject createDynamicObject(String xpath) {
		TestObject dynamicObject = new TestObject()
		dynamicObject.addProperty("xpath", ConditionType.EQUALS, xpath)
		return dynamicObject
	}
	
	@Keyword
	def saveFileFromTeacherProfile() {
	

		// Navigate to files tab
		WebUI.click(findTestObject('Object Repository/Teacher_Profile/Files_Teacher_Profile'))
		
		//Filter to show the files only
		WebUI.click(findTestObject('Object Repository/Teacher_Profile/Filter_Files_Based_on_Program_Teacher_Profile'))
		
		WebUI.click(findTestObject('Object Repository/Teacher_Profile/Filter_File_Type_Teacher_Profile'))
		
		WebUI.click(findTestObject('Object Repository/Teacher_Profile/Choose_Files_Option_Filter_File_Type_Teacher_Profile'))
		
		//Download the first file
		WebUI.click(findTestObject('Object Repository/Teacher_Profile/Download_File_btn_Teacher_Profile'))
		
		//Share the first file
		WebUI.click(findTestObject('Object Repository/Teacher_Profile/Share_File_Teacher_Profile'))
		
		//Check the file's link is copied successfully
		WebUI.click(findTestObject('Object Repository/Teacher_Profile/File_Link_Copied_Success_Msg'))
		
		//Add file to Favorite
		WebUI.click(findTestObject('Object Repository/Teacher_Profile/Add_File_to_Fav_Teacher_Profile'))
		
		WebUI.takeScreenshot('Screenshots/Targets/Save_File_Teacher_Profile')
		
		
		//Save the file's name from the teacher card in an obj then get the string
		// Create a dynamic TestObject for the <p> element
		TestObject savedFile = createDynamicObject("//p[contains(@class, 'tw-font-semibold')]")
		
		// Get the text of the <p> element
		String saveFileTextTeacherProfile = WebUI.getText(savedFile)
		
		// Print the dynamic text
		println("Dynamic Text: " + saveFileTextTeacherProfile)
		//Go to favorite page
		WebUI.click(findTestObject('Favorite_Page/Fav_From_Side_Menu'))
		
		
		TestObject savedFileFavPage = createDynamicObject("//h2[contains(@class, 'tw-font-bold')]")
		
		// Get the text of the <p> element
		String saveFileTextFavPage = WebUI.getText(savedFileFavPage)
		
		
		//Check if the file is for the same saved from teacher's profile
		// Compare the texts
		if (saveFileTextTeacherProfile.equals(saveFileTextFavPage)) {
			println("✅ The texts match!")
		} else {
			println("❌ The texts do NOT match!")
		}
	}
}
