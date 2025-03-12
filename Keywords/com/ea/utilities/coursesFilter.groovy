package com.ea.utilities

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.By
import java.util.List


// Extending methods class
public class coursesFilter extends methods {

	@Keyword
	def category() {

		// Click on category filter
		WebUI.click(findTestObject('Shanab/Courses/Filter/category_drop_down'))

		// Get the list of categories
		WebDriver driver = DriverFactory.getWebDriver()
		List<WebElement> categoryElements = driver.findElements(By.cssSelector("div[aria-disabled='false'][role='option']"))

		// Use inherited randomSelector method
		randomSelector(categoryElements)
	}

	@Keyword
	def subcategory() {
		WebDriver driver = DriverFactory.getWebDriver()


		// Click on sub-category filter drop-down
		WebUI.click(findTestObject('Shanab/Courses/Filter/sub_category_drop_down'))

		List<WebElement> subCategoryElement = driver.findElements(By.cssSelector("div[role='option']"))

		if (subCategoryElement.size() == 0) {

			println("Sub-category dropdown is empty. Selecting a different category.")

			WebUI.click(findTestObject('Shanab/Courses/Filter/clear_filter_options'))

			category()
			subcategory()
		} else {
			// Get the list of sub-categories
			randomSelector(subCategoryElement)
		}
	}

	@Keyword
	def subject() {

		// Click on sub-category filter drop-down
		WebUI.click(findTestObject('Shanab/Courses/Filter/subject_drop_down'))

		// Get the list of sub-categories
		WebDriver driver = DriverFactory.getWebDriver()
		List<WebElement> subjectElements = driver.findElements(By.cssSelector("div[role='option']"))

		if(subjectElements.size()==0) {
			println("Subject dropdown is empty. Selecting a different category.")
			subcategory()
			subject()
		}else {
			randomSelector(subjectElements)
		}


		if (!driver.findElements(By.xpath("//*[text()='لا يوجد بيانات']")).isEmpty()) {

			println("no data")

			WebElement cleartButton = driver.findElement(By.xpath("//button[contains(text(),'حذف التعيينات')]"))
			this.hoverToTheButton(cleartButton)

			category()
			subcategory()
			subject()
		}
	}



	@Keyword
	def teacher() {
		// Click on sub-category filter drop-down
		WebUI.click(findTestObject('Shanab/Courses/Filter/teacher_drop_down'))

		// Get the list of sub-categories
		WebDriver driver = DriverFactory.getWebDriver()
		List<WebElement> teacherElement = driver.findElements(By.cssSelector("div[role='option']"))

		if(teacherElement.size()==0) {
			println("Teacher is empty. Selecting a different category.")
			subject()
			teacher()
		}
		randomSelector(teacherElement)
	}
	//test
	//	@Keyword
	//	def staticTest() {
	//		// Initialize WebDriver instance
	//		WebDriver driver = DriverFactory.getWebDriver()
	//
	//		// Click on the category filter drop-down
	//		WebUI.click(findTestObject('Shanab/Courses/Filter/category_drop_down'))
	//
	//		// Locate the specific element by XPath
	//		WebElement element = driver.findElement(By.xpath('//*[@id="react-select-2-option-1"]'))
	//
	//		// Perform action on the located element using Actions class
	//		Actions actions = new Actions(driver)
	//		actions.moveToElement(element).click().perform()
	//
	//		// Log success message
	//		println("The static code run successfully")
	//	}
}
