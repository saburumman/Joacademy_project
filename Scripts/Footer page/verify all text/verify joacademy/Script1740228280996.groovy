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

// Open browser and navigate to URL
WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.joacademy.com/home/tawjihi')

WebUI.maximizeWindow()
WebUI.click(findTestObject('Object Repository/Check out quick links/Page_- joacademy.com/closeimage'))

WebUI.waitForPageLoad(10)

WebUI.delay(2)

scrollToBottom()


def scrollToBottom() {
    try {
        println('🔄 Scrolling to the bottom of the page...')

        WebUI.scrollToPosition(0, 9999999)

        WebUI.executeJavaScript('window.scrollTo(0, document.body.scrollHeight);', null)

        WebUI.delay(2)
    }
    catch (Exception e) {
        println('⚠️ Failed to scroll to the bottom: ' + e.getMessage())
    } 
}

boolean verify =WebUI.verifyElementText(findTestObject('verify support/Page_- joacademy.com/Jo Academy'), 'جميع الحقوق محفوظة © لجواكاديمي 2024')
if(verify) {
	print("PASSED")
	WebUI.takeScreenshot()
	WebUI.closeBrowser()
}else {
	print("filed")
	WebUI.closeBrowser()

}

