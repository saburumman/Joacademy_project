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

//Navigate to Teachers Page
WebUI.click(findTestObject('Object Repository/Login_Objects/Main_Menu_List- joacademy.com/Teachers_From_Main_Menu'))

WebUI.setText(findTestObject('Object Repository/Login_Objects/Teachers_Page- joacademy.com/Search_Box_for_Teacher'), 'اسامة العكور')

//WebUI.verifyTextPresent(findTestObject('Object Repository/Teacher_Profile/Page_- joacademy.com/Teachers_Name_on_Teachers_Card'),'اسامة العكور')

WebUI.click(findTestObject('Object Repository/Teacher_Profile/Page_- joacademy.com/Teachers_Name_on_Teachers_Card'))

WebUI.click(findTestObject('Object Repository/Teacher_Profile/Page_- joacademy.com/Office_Hours_Teacher_Profile'))

WebUI.click(findTestObject('Object Repository/Teacher_Profile/Page_-   - joacademy.com/span_'))

WebUI.click(findTestObject('Object Repository/Teacher_Profile/Page_- joacademy.com/Groups_Teacher_Profile'))

WebUI.click(findTestObject('Object Repository/Teacher_Profile/Page_- joacademy.com/Posts_Teacher_Profile'))

WebUI.click(findTestObject('Object Repository/Teacher_Profile/Page_- joacademy.com/Files_Teacher_Profile'))

WebUI.click(findTestObject('Object Repository/Teacher_Profile/Page_- joacademy.com/Events_Teacher_Profile'))

WebUI.click(findTestObject('Object Repository/Teacher_Profile/Page_- joacademy.com/Exams_Teacher_Profile'))

WebUI.click(findTestObject('Object Repository/Teacher_Profile/Page_- joacademy.com/Mixed_Videos_Teacher_Profile'))

WebUI.click(findTestObject('Object Repository/Teacher_Profile/Page_- joacademy.com/Files_Teacher_Profile'))

WebUI.click(findTestObject('Object Repository/Teacher_Profile/Page_- joacademy.com/span__ant-select-selection-item'))

WebUI.click(findTestObject('Object Repository/Teacher_Profile/Page_- joacademy.com/span__1_2_3_4_5_6_7_8'))

WebUI.click(findTestObject('Object Repository/Teacher_Profile/Page_- joacademy.com/div__1'))

WebUI.click(findTestObject('Object Repository/Teacher_Profile/Page_- joacademy.com/i__ri-download-2-line tw-text-16px hovertw-_12563d'))

WebUI.click(findTestObject('Object Repository/Teacher_Profile/Page_- joacademy.com/Share_File_Teacher_Profile'))

WebUI.click(findTestObject('Object Repository/Teacher_Profile/Page_- joacademy.com/File_Link_Copied_Success_Msg'))

WebUI.click(findTestObject('Object Repository/Teacher_Profile/Page_- joacademy.com/i__ri-heart-3-fill actions_font-size-24px__cZD_q'))

WebUI.click(findTestObject('Object Repository/Teacher_Profile/Page_- joacademy.com/span__1_2_3_4_5_6_7_8_9'))

WebUI.click(findTestObject('Object Repository/Teacher_Profile/Page_- joacademy.com/h2__1'))

WebUI.click(findTestObject('Object Repository/Teacher_Profile/Page_- joacademy.com/h2__1'))

WebUI.click(findTestObject('Object Repository/Teacher_Profile/Page_- joacademy.com/p_'))

