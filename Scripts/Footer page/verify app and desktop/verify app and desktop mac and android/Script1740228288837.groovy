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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.joacademy.com/home/tawjihi')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Check out quick links/Page_- joacademy.com/closeimage'))

WebUI.scrollToPosition(0, 9999999)

def objectsToVerify = [
    'Object Repository/verify app and desktop mac and android/Page_- joacademy.com/div_App Store',
    'Object Repository/verify app and desktop mac and android/Page_- joacademy.com/div_Google Play',
    'Object Repository/verify app and desktop mac and android/Page_- joacademy.com/div_AppGallery',
    'Object Repository/verify app and desktop mac and android/Page_- joacademy.com/div_MAC',
    'Object Repository/verify app and desktop mac and android/Page_- joacademy.com/div_WINDOWS'
]

// Loop to verify the visibility of each element
for (int i = 0; i < objectsToVerify.size(); i++) {
    def objectPath = objectsToVerify[i] // Path of the current object
    try {
        // Verify if the element is visible
        if (WebUI.verifyElementVisible(findTestObject(objectPath), FailureHandling.CONTINUE_ON_FAILURE)) {
            println("✅ PASSED: Element is visible -> ${objectPath}")
        } else {
            println("❌ FAILED: Element is NOT visible -> ${objectPath}")
        }
    } catch (Exception e) {
        // Handle any errors that occur during execution
        println("⚠️ ERROR: An exception occurred while verifying -> ${objectPath}")
    }
}

// Close the browser after finishing
WebUI.closeBrowser()


