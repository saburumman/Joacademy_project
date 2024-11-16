package teacherNavigation

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.kms.katalon.core.webui.driver.DriverFactory;
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI;

import internal.GlobalVariable

public class Teacher_Navigate {


	@Keyword
	def teacherNav() {

		//Navigate to Teachers Page
		WebUI.click(findTestObject('Object Repository/Login_Objects/Main_Menu_List- joacademy.com/Teachers_From_Main_Menu'))

		WebUI.takeScreenshot('Screenshots/Teachers_Page.png')

		// Define the test object for the <title
		String TeacherPageTitle = 'Object Repository/Login_Objects/Teachers_Page- joacademy.com/Teacher_Page_Title'

		// Get the text from the object
		String actualText = WebUI.getText(findTestObject(TeacherPageTitle))

		// Define the expected text
		String expectedText = 'تعرف على جميع معلمين جو اكاديمي من هنا ويمكنك متابعتهم ومشاهدة حصص التاسيس وحصص مجانية -  الثانوية العامة'

		// Verify if the expected text is present
		if (actualText.equals(expectedText)) {
			WebUI.comment('The text matches: ' + expectedText)
		} else {
			WebUI.comment((('The text does not match. Expected: ' + expectedText) + ', but got: ') + actualText)
		}

		WebUI.verifyElementPresent(findTestObject('Login_Objects/Teachers_Page- joacademy.com/First_Teacher_In_The_Page'), 0)

		//Pagenation Test
// I added Wait untill element is present to make sure it will scroll down to it.
WebUI.waitForPageLoad(10)

// Find the element
TestObject rightArrow = findTestObject('Login_Objects/Teachers_Page- joacademy.com/Navigate_With_Right_Arrow')

// Scroll to the element
WebUI.scrollToElement(rightArrow, 5)

// Use JavaScript to center the element on the screen
JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getWebDriver()
js.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'});", WebUI.findWebElement(rightArrow))
WebUI.click(findTestObject('Login_Objects/Teachers_Page- joacademy.com/Navigate_With_Right_Arrow'))

WebUI.takeScreenshot('Screenshots/Navigate_to_Right.png')

WebUI.waitForPageLoad(5)
// Find the element
TestObject leftArrow = findTestObject('Login_Objects/Teachers_Page- joacademy.com/Navigate_With_Left_Arrow')

// Scroll to the element
WebUI.scrollToElement(leftArrow, 5)

// Use JavaScript to center the element on the screen
js.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'});", WebUI.findWebElement(leftArrow))

WebUI.click(findTestObject('Login_Objects/Teachers_Page- joacademy.com/Navigate_With_Left_Arrow'))

WebUI.takeScreenshot('Screenshots/Navigate_to_Left.png')

WebUI.waitForPageLoad(5)
TestObject secondPage = findTestObject('Object Repository/Login_Objects/Teachers_Page- joacademy.com/Teachers_Page_2')

// Scroll to the element
WebUI.scrollToElement(secondPage, 5)

// Use JavaScript to center the element on the screen
js.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'});", WebUI.findWebElement(secondPage))

WebUI.click(findTestObject('Object Repository/Login_Objects/Teachers_Page- joacademy.com/Teachers_Page_2'))

WebUI.takeScreenshot('Screenshots/Page2.png')

WebUI.waitForPageLoad(5)
TestObject lastPage = findTestObject('Object Repository/Login_Objects/Teachers_Page- joacademy.com/Teachers_Page_28')

// Scroll to the element
WebUI.scrollToElement(lastPage, 5)

// Use JavaScript to center the element on the screen
js.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'});", WebUI.findWebElement(lastPage))

WebUI.click(findTestObject('Object Repository/Login_Objects/Teachers_Page- joacademy.com/Teachers_Page_28'))

WebUI.takeScreenshot('Screenshots/Page28.png')

WebUI.waitForPageLoad(5)
TestObject fisrtPage = findTestObject('Object Repository/Login_Objects/Teachers_Page- joacademy.com/Teachers_Page_1')

// Scroll to the element
WebUI.scrollToElement(fisrtPage, 5)

// Use JavaScript to center the element on the screen
js.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'});", WebUI.findWebElement(fisrtPage))
WebUI.click(findTestObject('Object Repository/Login_Objects/Teachers_Page- joacademy.com/Teachers_Page_1'))

WebUI.takeScreenshot('Screenshots/Page1.png')

		WebUI.takeScreenshot('Screenshots/Page1.png')
	}
}