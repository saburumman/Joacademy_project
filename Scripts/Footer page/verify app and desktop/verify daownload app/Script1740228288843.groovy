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

// Close pop-up (if present)
if (WebUI.verifyElementPresent(findTestObject('Object Repository/Check out quick links/Page_- joacademy.com/closeimage'), 5)) {
    WebUI.click(findTestObject('Object Repository/Check out quick links/Page_- joacademy.com/closeimage'))
}

// Scroll to the bottom of the page
WebUI.scrollToPosition(0, 9999999)

// Verify and click "App Store" link
if (WebUI.verifyElementPresent(findTestObject('Object Repository/verify app and desktop mac and android/Page_- joacademy.com/daownload app/Page_- joacademy.com/div_App Store'), 5)) {
    WebUI.click(findTestObject('Object Repository/verify app and desktop mac and android/Page_- joacademy.com/daownload app/Page_- joacademy.com/div_App Store'))

    WebUI.switchToWindowTitle('JO_Academy on the App Store')

    if (WebUI.verifyElementText(findTestObject('Object Repository/verify app and desktop mac and android/Page_- joacademy.com/daownload app/Page_JO_Academy on the AppStore/p_Open the Mac App Store to buy and download apps'), 
        'Open the Mac App Store to buy and download apps.')) {
        println('App Store text verified successfully.')
    } else {
        println('App Store text verification failed.')
    }

    WebUI.back()
    WebUI.switchToWindowTitle('موقع جو اكاديمي | رواد التعليم الإلكتروني دوسيات ودروس مصورة - joacademy.com')
}

// Verify and click "Google Play" link
if (WebUI.verifyElementPresent(findTestObject('Object Repository/verify app and desktop mac and android/Page_- joacademy.com/daownload app/Page_- joacademy.com/div_Google Play'), 5)) {
    WebUI.click(findTestObject('Object Repository/verify app and desktop mac and android/Page_- joacademy.com/daownload app/Page_- joacademy.com/div_Google Play'))

    WebUI.switchToWindowTitle('JOACADEMY - Apps on Google Play')

    if (WebUI.verifyElementText(findTestObject('Object Repository/verify app and desktop mac and android/Page_- joacademy.com/daownload app/Page_JOACADEMY - Apps on Google Play/span_JOACADEMY'), 
        'JOACADEMY')) {
        println('Google Play text verified successfully.')
    } else {
        println('Google Play text verification failed.')
    }

    WebUI.back()
    WebUI.switchToWindowTitle('موقع جو اكاديمي | رواد التعليم الإلكتروني دوسيات ودروس مصورة - joacademy.com')
}

// Verify and click "AppGallery" link
if (WebUI.verifyElementPresent(findTestObject('Object Repository/verify app and desktop mac and android/Page_- joacademy.com/daownload app/Page_- joacademy.com/div_AppGallery'), 5)) {
    WebUI.click(findTestObject('Object Repository/verify app and desktop mac and android/Page_- joacademy.com/daownload app/Page_- joacademy.com/div_AppGallery'))

    WebUI.switchToWindowTitle('AppGallery')

    if (WebUI.verifyElementText(findTestObject('Object Repository/verify app and desktop mac and android/Page_- joacademy.com/daownload app/Page_AppGallery/body_This website needs to use some cookies_275c3c'), 
        'JOACADEMY')) {
        println('AppGallery text verified successfully.')
    } else {
        println('AppGallery text verification failed.')
    }

    WebUI.takeScreenshot()
}

WebUI.closeBrowser()
