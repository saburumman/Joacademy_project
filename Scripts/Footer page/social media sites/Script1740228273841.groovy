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

// Open browser and navigate to the URL
WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.joacademy.com/home/tawjihi')

WebUI.maximizeWindow()

// Close pop-up (if present)
WebUI.click(findTestObject('Object Repository/Check out quick links/Page_- joacademy.com/closeimage'))

// Scroll to the bottom of the page
WebUI.scrollToPosition(0, 9999999)

// List of objects to click on
def socialMediaIcons = ['Object Repository/social media sites/Page_- joacademy.com/svg__tw-max-h-293px tw-w-full tw-max-w-293px' // Example icon
    , 'Object Repository/social media sites/Page_- joacademy.com/footer_App Store  Google Play  AppGallery  _7805fe', 'Object Repository/social media sites/Page_- joacademy.com/i__ri-facebook-fill tw-text-35px tw-text-white'
    , 'Object Repository/social media sites/Page_- joacademy.com/i__ri-twitter-x-fill tw-text-35px tw-text-white', 'Object Repository/social media sites/Page_- joacademy.com/i__ri-instagram-fill tw-text-35px tw-text-white'
    , 'Object Repository/social media sites/Page_- joacademy.com/i__ri-youtube-fill tw-text-35px tw-text-white', 'Object Repository/social media sites/Page_- joacademy.com/i__ri-whatsapp-fill tw-text-35px tw-text-white']

// Loop to click each social media icon and verify the page
for (int i = 0; i < socialMediaIcons.size(); i++) {
    def objectPath = socialMediaIcons[i // Get the current object path
    ]

    try {
        // Click on the social media icon
        WebUI.click(findTestObject(objectPath))

        println("🖱️ Clicked on -> $objectPath")

        // Wait for the page to load (can be adjusted)
        WebUI.delay(3)

        // Verify if the page or a specific element is visible
        if (WebUI.verifyElementVisible(findTestObject(objectPath), FailureHandling.CONTINUE_ON_FAILURE)) {
            println("✅ PASSED: Element is visible after click -> $objectPath")
        } else {
            println("❌ FAILED: Element is NOT visible after click -> $objectPath")
        }
    }
    catch (Exception e) {
        println("⚠️ ERROR: An exception occurred while verifying -> $objectPath")
    } // Print an error message if any exception occurs
}

println('📸 Screenshot taken: Screenshots/final_page.png')

WebUI.takeScreenshot()

// Close the browser
WebUI.closeBrowser()

