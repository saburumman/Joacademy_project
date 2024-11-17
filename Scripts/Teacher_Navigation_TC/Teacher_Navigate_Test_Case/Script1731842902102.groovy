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
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import loginCase.Login_Test_Case as Login_Test_Case

		//Navigate to Teachers Page
		WebUI.click(findTestObject('Object Repository/Main_Menu_List- joacademy.com/Teachers_From_Main_Menu'))

		WebUI.takeScreenshot('Screenshots/Teachers_Page.png')

		// Define the expected text
		String expectedText = 'المعلمون - الثانوية العامة'

		def findActualText = findTestObject('Object Repository/Teachers_Page- joacademy.com/Teacher_Page_Title')

		String actualText = WebUI.getText(findActualText)

		// Check if the text exists within the specified <h1> element
		boolean textExists = WebUI.verifyElementText(findTestObject('Object Repository/Teachers_Page- joacademy.com/Teacher_Page_Title'), expectedText)

		// Assert the result
		if (textExists) {
			WebUI.comment('The text exists: ' + expectedText)
		} else {
			WebUI.comment('The text does not exist: ' + expectedText)
		}

		WebUI.verifyElementPresent(findTestObject('Teachers_Page- joacademy.com/First_Teacher_In_The_Page'), 0)

		//Pagenation Test
		// I added Wait untill element is present to make sure it will scroll down to it.
		WebUI.waitForPageLoad(10)

		// Find the element
		TestObject rightArrow = findTestObject('Teachers_Page- joacademy.com/Navigate_With_Right_Arrow')

		// Scroll to the element
		WebUI.scrollToElement(rightArrow, 5)

		// Use JavaScript to center the element on the screen
		JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getWebDriver()
		js.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'});", WebUI.findWebElement(rightArrow))
		WebUI.click(findTestObject('Teachers_Page- joacademy.com/Navigate_With_Right_Arrow'))

		WebUI.takeScreenshot('Screenshots/Navigate_to_Right.png')

		WebUI.waitForPageLoad(5)
		// Find the element
		TestObject leftArrow = findTestObject('Teachers_Page- joacademy.com/Navigate_With_Left_Arrow')

		// Scroll to the element
		WebUI.scrollToElement(leftArrow, 5)

		// Use JavaScript to center the element on the screen
		js.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'});", WebUI.findWebElement(leftArrow))

		WebUI.click(findTestObject('Teachers_Page- joacademy.com/Navigate_With_Left_Arrow'))

		WebUI.takeScreenshot('Screenshots/Navigate_to_Left.png')

		WebUI.waitForPageLoad(5)
		TestObject secondPage = findTestObject('Object Repository/Teachers_Page- joacademy.com/Teachers_Page_2')

		// Scroll to the element
		WebUI.scrollToElement(secondPage, 5)

		// Use JavaScript to center the element on the screen
		js.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'});", WebUI.findWebElement(secondPage))

		WebUI.click(findTestObject('Object Repository/Teachers_Page- joacademy.com/Teachers_Page_2'))

		WebUI.takeScreenshot('Screenshots/Page2.png')

		WebUI.waitForPageLoad(5)
		TestObject lastPage = findTestObject('Object Repository/Teachers_Page- joacademy.com/Teachers_Page_28')

		// Scroll to the element
		WebUI.scrollToElement(lastPage, 5)

		// Use JavaScript to center the element on the screen
		js.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'});", WebUI.findWebElement(lastPage))

		WebUI.click(findTestObject('Object Repository/Teachers_Page- joacademy.com/Teachers_Page_28'))

		WebUI.takeScreenshot('Screenshots/Page28.png')

		WebUI.waitForPageLoad(5)
		TestObject fisrtPage = findTestObject('Object Repository/Teachers_Page- joacademy.com/Teachers_Page_1')

		// Scroll to the element
		WebUI.scrollToElement(fisrtPage, 5)

		// Use JavaScript to center the element on the screen
		js.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'});", WebUI.findWebElement(fisrtPage))
		WebUI.click(findTestObject('Object Repository/Teachers_Page- joacademy.com/Teachers_Page_1'))

		WebUI.takeScreenshot('Screenshots/Page1.png')

		//No Results Test Case
		WebUI.setText(findTestObject('Object Repository/Teachers_Page- joacademy.com/Search_Box_for_Teacher'), 'حسام باسل ع')

		WebUI.verifyElementPresent(findTestObject('Object Repository/Teachers_Page- joacademy.com/No_Search_Results'), 0)

		WebUI.takeScreenshot('Screenshots/Teachers_No_Results.png')

		WebUI.click(findTestObject('Teachers_Page- joacademy.com/Reset_Filters'))


