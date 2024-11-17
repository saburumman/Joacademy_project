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
