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

WebUI.click(findTestObject('Main_Menu_List- joacademy.com/Teachers_From_Main_Menu'))

WebUI.click(findTestObject('Object Repository/Filter_Teacher_Obj/Choose_Proram_From_Filters'))

WebUI.click(findTestObject('Object Repository/Filter_Teacher_Obj/Filter_Option__for_Program'))

WebUI.click(findTestObject('Filter_Teacher_Obj/Choose_Section_Filter_'))

WebUI.click(findTestObject('Object Repository/Filter_Teacher_Obj/Filter_Section_Option'))

WebUI.click(findTestObject('Object Repository/Filter_Teacher_Obj/Filter_Subject_Option'))

WebUI.click(findTestObject('Object Repository/Filter_Teacher_Obj/Choose_Subject_Filter'))


WebUI.click(findTestObject('Object Repository/Filter_Teacher_Obj/Button_Reset_Filters'))

