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


//Copy Teacher Profile Link
WebUI.click(findTestObject('Object Repository/Saraa/Actions_on_Teacher_Profile/Share_Teacher_Profile'))


//Make sure URL Link is Copied
// Define the expected text
String shareExpectedText = 'تم نسخ الرابط'

def shareTeacherActualText = findTestObject('Object Repository/Saraa/Actions_on_Teacher_Profile/Success_msg_Teacher_Profile_Copied')

// Check if the text exists within the specified <h1> element
boolean shareTeachertextExists = WebUI.verifyElementText(findTestObject('Object Repository/Saraa/Actions_on_Teacher_Profile/Success_msg_Teacher_Profile_Copied'), shareExpectedText)

// Assert the result
if (shareTeachertextExists) {
	WebUI.comment('The text exists: ' + shareExpectedText)
} else {
	WebUI.comment('The text does not exist: ' + shareExpectedText)
}

WebUI.takeScreenshot('Screenshots/Targets/Share_Teacher_Profile_Link')

