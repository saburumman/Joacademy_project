
package com.ea.utilities

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Actions
import java.util.Random
import java.util.List
import org.openqa.selenium.JavascriptExecutor




public class methods {


	@Keyword

	// before use this function we need to add this code
	//WebDriver driver = DriverFactory.getWebDriver()
	//List<WebElement> elements = driver.findElements(By.xpath("Xpath"))

	def randomSelector(List<WebElement> elements) {
		Random random = new Random()
		int randomIndex = random.nextInt(elements.size())


		// Get the WebDriver instance
		WebDriver driver = DriverFactory.getWebDriver()

		// Select the random element
		WebElement randomElement = elements.get(randomIndex)

		// Extract the text of the selected element
		String selectedText = randomElement.getText()

		// Perform hover action and click the random element
		Actions actions = new Actions(driver)
		actions.moveToElement(randomElement).perform()
		randomElement.click()
		// Log the chosen index for verification
		println("Clicked element at index: ${randomIndex} with text: '${selectedText}'")
	}

	@Keyword
	//to compare the actual result with expected result
	def assertValidation(String validationMessage, String xpath) {
		// Convert XPath to a TestObject dynamically
		TestObject validationObject = new TestObject().addProperty("xpath", com.kms.katalon.core.testobject.ConditionType.EQUALS, xpath)

		// Get the actual validation message
		String actualResult = WebUI.getText(validationObject)

		// Log the actual result for debugging
		println("Actual result: ${actualResult}")

		// Verify that the actual result matches the expected validation message
		WebUI.verifyMatch(actualResult, validationMessage, false)
	}

	@Keyword
	//to compare the actual result with expected result for the second time
	def assertValidation2(String validationMessage2, String xpath2) {
		// Convert XPath to a TestObject dynamically
		TestObject validationObject = new TestObject().addProperty("xpath", com.kms.katalon.core.testobject.ConditionType.EQUALS, xpath2)

		// Get the actual validation message
		String actualResult = WebUI.getText(validationObject)

		// Log the actual result for debugging
		println("Actual result: ${actualResult}")

		// Verify that the actual result matches the expected validation message
		WebUI.verifyMatch(actualResult, validationMessage2, false)
	}

	@Keyword

	def hoverToTheButton(WebElement element) {

		WebDriver driver = DriverFactory.getWebDriver()

		// Ensure the element is visible and scroll into view
		//	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element)
		//	WebUI.delay(1) // Give time for the scroll action

		// Perform a hover action and click the button
		Actions actions = new Actions(driver)
		actions.moveToElement(element).click().perform()
		println("Card submit button clicked successfully.")

		println(element.getText())
	}
}
