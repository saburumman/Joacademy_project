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

// Define the expected text
String favExpectedText = 'اضافة للمفضلة'
String unfavExpectedText = 'ازالة من المفضلة'

//Find unFav Button
boolean unFavTeacherActualText = WebUI.verifyElementPresent(findTestObject('Object Repository/Actions_on_Teacher_Profile/Unfav_Teacher_on_Teacher_Profile'), 5, FailureHandling.OPTIONAL)

// Check if the "UnFav" button is present in the DOM
if (unFavTeacherActualText) {
	// If "UnFav" button exists, click it
	WebUI.click(findTestObject('Object Repository/Actions_on_Teacher_Profile/Unfav_Teacher_on_Teacher_Profile'))
	WebUI.comment('Action performed: Remove from Fav action completed')
	WebUI.takeScreenshot('Screenshots/Targets/Unfav_Teacher')
	
} else {
	// If "UnFav" button does not exist, click "Fav" button
	WebUI.click(findTestObject('Object Repository/Actions_on_Teacher_Profile/Add_Teacher_to_Fav_Teacher_Profile'))
	WebUI.comment('Action performed: Adding to Fav action completed')
	WebUI.takeScreenshot('Screenshots/Targets/Fav_Teacher')
	
}