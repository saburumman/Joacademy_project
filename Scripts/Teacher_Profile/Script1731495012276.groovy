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
import loginCase.Login_Test_Case as Login_Test_Case

// Create an instance of the LoginKeywords class
Login_Test_Case loginFeature = new Login_Test_Case()

// Call the login method
loginFeature.login('962796141803@joacademy.com', 'aeHFOx8jV/A=')

// Optional: Perform additional actions after login
WebUI.comment('Logged in successfully.')

//Navigate to teacher's page
WebUI.click(findTestObject('Object Repository/Main_Menu_List- joacademy.com/Teachers_From_Main_Menu'))

//Search for a teacher
WebUI.setText(findTestObject('Object Repository/Teachers_Page- joacademy.com/Search_Box_for_Teacher'), 'اسامة العكور')

//Save the teacher's name from the teacher card in an obj then get the string
def teacherNameOnCard = findTestObject('Object Repository/Teacher_Profile/Teachers_Name_on_Teachers_Card')

String saveTeacherName = WebUI.getText(teacherNameOnCard)

//Go to the teacher's profile
WebUI.click(findTestObject('Object Repository/Teacher_Profile/Teachers_Name_on_Teachers_Card'))

//Check if the profile is for the same selected teacher 
boolean isSameTeacherNamePresent = WebUI.verifyTextPresent(saveTeacherName, false // 'false' makes it case-insensitive
    )

if (isSameTeacherNamePresent) {
    WebUI.comment('Same Teacher I Searched For is Found!')
} else {
    WebUI.comment('Not Same Teacher I Searched For! BUG!!!!')
}

// Navigate between teacher's profile tabs
WebUI.click(findTestObject('Object Repository/Teacher_Profile/Office_Hours_Teacher_Profile'))

WebUI.click(findTestObject('Object Repository/Teacher_Profile/Shbabek_Teacher_Profile'))

WebUI.click(findTestObject('Object Repository/Teacher_Profile/Groups_Teacher_Profile'))

WebUI.click(findTestObject('Object Repository/Teacher_Profile/Posts_Teacher_Profile'))

WebUI.click(findTestObject('Object Repository/Teacher_Profile/Files_Teacher_Profile'))

WebUI.click(findTestObject('Object Repository/Teacher_Profile/Events_Teacher_Profile'))

WebUI.click(findTestObject('Object Repository/Teacher_Profile/Exams_Teacher_Profile'))

WebUI.click(findTestObject('Object Repository/Teacher_Profile/Mixed_Videos_Teacher_Profile'))

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

//Unsave File
		WebUI.doubleClick(findTestObject('Favorite_Page/Saved_File_In_Fav_Page'))
		
		//Navigate to Courses, to refresh Teachers tab
		WebUI.click(findTestObject('Object Repository/Favorite_Page/Courses_Fav'))
		
		WebUI.delay(5)
		
		//Navigate back to Files tab
		WebUI.click(findTestObject('Favorite_Page/Files_Tab_In_Fav_Page'))
		
		//Veify Element is not present
		WebUI.verifyElementNotPresent(findTestObject('Favorite_Page/Nothing_Added_to_Fav'), 0)
		
