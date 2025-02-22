import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')
WebUI.navigateToUrl('https://www.joacademy.com/home/tawjihi')
WebUI.maximizeWindow()

WebUI.waitForPageLoad(10)

def scrollToBottom() {
    try {
        println("🔄 Scrolling to the bottom of the page...")

        int maxAttempts = 5 // الحد الأقصى لمحاولات التمرير
        int attempt = 0

        while (attempt < maxAttempts) {
            attempt++
            println("Attempt ${attempt}: Scrolling...")

            WebUI.executeJavaScript("window.scrollBy(0, 1000);", null)

            WebUI.delay(1)

            Boolean isAtBottom = WebUI.executeJavaScript("return (window.innerHeight + window.scrollY) >= document.body.scrollHeight;", null)
            if (isAtBottom) {
                println("✅ Successfully scrolled to the bottom.")
                break
            }
        }

        if (attempt == maxAttempts) {
            println("⚠️ Reached max scroll attempts but page may not be fully scrolled.")
        }
    } catch (Exception e) {
        println("⚠️ Failed to scroll to the bottom: " + e.getMessage())
    }
}

def verifyAndClickButton(buttonObject, pageTitleObject, expectedTitle, testName) {
    WebUI.delay(2)
    scrollToBottom()

    if (WebUI.verifyElementPresent(buttonObject, 5)) {
        WebUI.click(buttonObject)

        if (WebUI.verifyElementText(pageTitleObject, expectedTitle)) {
            println("✅ PASSED: '${testName}' page title is correct.")
            WebUI.takeScreenshot()
        } else {
            println("❌ FAILED: '${testName}' page title is incorrect.")
        }

        WebUI.back()
    } else {
        println("❌ FAILED: '${testName}' button not found.")
    }
}

// ** close image {if} **
if (WebUI.verifyElementPresent(findTestObject('Object Repository/Check out quick links/Page_- joacademy.com/closeimage'), 5)) {
    WebUI.click(findTestObject('Object Repository/Check out quick links/Page_- joacademy.com/closeimage'))
}

// **verify all buton and verify tittle page  **

verifyAndClickButton(
    findTestObject('Object Repository/verify all button suport/Page_- joacademy.com/Help button'),
    findTestObject('Object Repository/verify all button suport/Page_- joacademy.com/verify tittle Help page'),
    'مركز مساعدة جو اكاديمي كيف يمكننا مساعدتك؟',
    'Help Center'
)

verifyAndClickButton(
    findTestObject('Object Repository/verify all button suport/Page_- joacademy.com/news button'),
    findTestObject('Object Repository/verify all button suport/Page_- joacademy.com/verify tittle news page'),
    'أخبار جو أكاديمي',
    'News'
)

verifyAndClickButton(
    findTestObject('Object Repository/verify all button suport/Page_- joacademy.com/button Who we are'),
    findTestObject('Object Repository/verify all button suport/Page_Jo Academy - joacademy.com/who we are tittle'),
    'من نحن',
    'About Us'
)

verifyAndClickButton(
    findTestObject('Object Repository/verify all button suport/Page_- joacademy.com/button maktabat'),
    findTestObject('Object Repository/verify all button suport/Page_Jo Academy - joacademy.com/verify maktabat tittle'),
    'المكتبات',
    'Libraries'
)

verifyAndClickButton(
    findTestObject('Object Repository/verify all button suport/Page_Jo Academy - joacademy.com/button privacy policy'),
findTestObject('Object Repository/verify all button suport/Page_Jo Academy - joacademy.com/verify tittle privacy'),
    'سياسة الخصوصية',
    'Privacy Policy'
)
verifyAndClickButton(
	findTestObject('Object Repository/verify all button suport/Page_Jo Academy - joacademy.com/button Terms and Conditions'),
findTestObject('Object Repository/verify all button suport/Page_Jo Academy - joacademy.com/verify titte Terms and Conditions'),
	'الشروط والأحكام',
	'Terms and Conditions'
)

WebUI.closeBrowser()
