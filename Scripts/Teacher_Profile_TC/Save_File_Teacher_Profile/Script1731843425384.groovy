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

//Save the file's name from the teacher card in an obj then get the string
def savedFile = findTestObject('Teacher_Profile/Added_to_Fav_File_Teacher_Profile')

String savedFileName = WebUI.getText(savedFile)

//Go to favorite page
WebUI.click(findTestObject('Favorite_Page/Fav_From_Side_Menu'))

//Check if the file is for the same saved from teacher's profile
boolean isSameFileNamePresent = WebUI.verifyTextPresent(savedFileName, false // 'false' makes it case-insensitive
	)

if (isSameFileNamePresent) {
	WebUI.comment('Same File I Saved is Found!')
} else {
	WebUI.comment('Not the Same File I Saved! BUG!!!!')
}