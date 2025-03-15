
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
import java.awt.Robot
import java.util.List
import org.openqa.selenium.By
import internal.GlobalVariable
import org.openqa.selenium.JavascriptExecutor
import java.awt.event.KeyEvent

public class courses extends methods{

	@Keyword
	def myCoursesClick() {

		WebUI.click(findTestObject('Shanab/Courses/CourseButton/my_courses'))
	}

	@Keyword
	// before use this function we need to add this code
	//WebDriver driver = DriverFactory.getWebDriver()
	//List<WebElement> elements = driver.findElements(By.xpath("Xpath"))

	def randomCourseSelector(List<WebElement> elements) {



		// Get the WebDriver instance
		WebDriver driver = DriverFactory.getWebDriver()

		// Select the random element
		Random random = new Random()
		int randomIndex = random.nextInt(elements.size())
		WebElement randomElement = elements.get(randomIndex)
		println("Clicked element at index: ${randomIndex} with text: '${randomElement.getText()}'")

		// Locate the course name element inside the selected cart
		WebElement courseNameElement = randomElement.findElement(By.cssSelector("h2.tw-font-bold"))
		String cartname = courseNameElement.getText()
		println("Name of the selected cart: ${cartname}")

		// Locate the price element inside the selected cart
		WebElement priceElement = randomElement.findElement(By.cssSelector("data"))
		String priceText = priceElement.getText()
		println("Price of the selected cart: ${priceText}")

		//to print the course price
		int coursePriceValue = Integer.parseInt(priceText.replaceAll("[^0-9]", ""));
		println("Price of the selected cart: ${coursePriceValue}")

		// Locate the submit button inside the selected cart

		WebElement submitButton = randomElement.findElement(By.xpath("//button[text()='تفعيل بالبطاقة']"))
		this.hoverToTheButton(submitButton)

		//to apply the cart match with cart price
		switch (coursePriceValue) {
			case 50:
				WebUI.sendKeys(findTestObject('Shanab/Courses/CourseButton/Fill_the_card'),GlobalVariable.Card50)
				break

			case 28:
				WebUI.sendKeys(findTestObject('Shanab/Courses/CourseButton/Fill_the_card'),GlobalVariable.Card28)
				break

			case 10:
				WebUI.sendKeys(findTestObject('Shanab/Courses/CourseButton/Fill_the_card'),GlobalVariable.Card10)
				break

			case 70:
				WebUI.sendKeys(findTestObject('Shanab/Courses/CourseButton/Fill_the_card'),GlobalVariable.Card70)
				break

			case 100:
				WebUI.sendKeys(findTestObject('Shanab/Courses/CourseButton/Fill_the_card'),GlobalVariable.Card100)
				break

			case 0:
				println("This course is free")
				WebUI.closeBrowser()
				assert false : "Test case ended because the course is free." // Ends the test with a message

				break

			default:
				println("No matching card type found for the course price.")
				break
		}

		// Locate and interact with the card submit button
		WebElement cardSubmit = driver.findElement(By.xpath("//button[contains(text(),'أرسل')]"))
		this.hoverToTheButton(cardSubmit)


		//check the successful message
		String validationMessage = "تم تفعيل الدورة عبر البطاقة بنجاح"
		String xpath = "//h4[contains(text(),'تم تفعيل الدورة عبر البطاقة بنجاح')]"
		this.assertValidation(validationMessage, xpath)

		println("mached successfully")
		WebElement okCardSubmit = driver.findElement(By.xpath("//button[contains(text(),'تم')]"))
		this.hoverToTheButton(okCardSubmit)

		WebUI.click(findTestObject('Shanab/Courses/CourseButton/my_courses'))

		//	WebUI.click(findTestObject('Shanab/Courses/CourseButton/mu_courses_button'))
		Robot robot = new Robot()

		robot.keyPress(KeyEvent.VK_ESCAPE)
		robot.keyRelease(KeyEvent.VK_ESCAPE)
		// Locate all course names using the actual XPath
		List<WebElement> allCourseNameElements = driver.findElements(By.xpath("//h2[contains(@class, 'tw-font-bold')]"))
		// Check if the CourseName is present in the list of all course names
		String CourseName = cartname

		boolean isCourseFound = false
		for (WebElement courseElement : allCourseNameElements) {
			if (courseElement.getText().equals(CourseName)) {
				isCourseFound = true
				break
			}
		}
		if (isCourseFound) {
			println("Success: Course name '${CourseName}' found.")
		} else {
			println("Course name '${CourseName}' not found.")
		}
	}

	//This for blocked card
	@Keyword
	def CardCourse(List<WebElement> elements) {
		// Get the WebDriver instance
		WebDriver driver = DriverFactory.getWebDriver()

		// Select the random element
		Random random = new Random()
		int randomIndex = random.nextInt(elements.size())
		WebElement randomElement = elements.get(randomIndex)
		println("Clicked element at index: ${randomIndex}")

		// Locate the course name element inside the selected cart
		WebElement courseNameElement = randomElement.findElement(By.cssSelector("h2.tw-font-bold"))
		String cartname = courseNameElement.getText()
		println("Name of the selected cart: ${cartname}")

		// Locate the price element inside the selected cart
		WebElement priceElement = randomElement.findElement(By.cssSelector("data"))
		String priceText = priceElement.getText()
		println("Price of the selected cart: ${priceText}")

		//to print the course price
		int coursePriceValue = Integer.parseInt(priceText.replaceAll("[^0-9]", ""));
		println("Price of the selected cart: ${coursePriceValue}")

		// Locate the submit button inside the selected cart
		WebElement submitButton = randomElement.findElement(By.xpath(".//button[contains(text(), 'تفعيل بالبطاقة')]"))
		this.hoverToTheButton(submitButton)

		//to apply the cart match with cart price
		switch (coursePriceValue) {
			case 50:
				WebUI.sendKeys(findTestObject('Shanab/Courses/CourseButton/Fill_the_card'),GlobalVariable.Card50Blocked)
				break

			case 28:
				WebUI.sendKeys(findTestObject('Shanab/Courses/CourseButton/Fill_the_card'),GlobalVariable.Card28Blocked)
				break

			case 10:
				WebUI.sendKeys(findTestObject('Shanab/Courses/CourseButton/Fill_the_card'),GlobalVariable.Card10Blocked)
				break

			case 70:
				WebUI.sendKeys(findTestObject('Shanab/Courses/CourseButton/Fill_the_card'),GlobalVariable.Card70Blocked)
				break

			case 100:
				WebUI.sendKeys(findTestObject('Shanab/Courses/CourseButton/Fill_the_card'),GlobalVariable.Card100Blocked)
				break

			case 0:
				println("This course is free")
				break

			default:
				println("No matching card type found for the course price.")
				break
		}

		// Locate and interact with the card submit button
		WebElement cardSubmit = driver.findElement(By.xpath("//button[contains(text(),'أرسل')]"))
		this.hoverToTheButton(cardSubmit)
	}

	@Keyword
	def emptyCardCourse(List<WebElement> elements) {
		// Get the WebDriver instance
		WebDriver driver = DriverFactory.getWebDriver()

		// Select the random element
		Random random = new Random()
		int randomIndex = random.nextInt(elements.size())
		WebElement randomElement = elements.get(randomIndex)
		println("Clicked element at index: ${randomIndex}")

		// Locate the course name element inside the selected cart
		WebElement courseNameElement = randomElement.findElement(By.cssSelector("h2.tw-font-bold"))
		String cartname = courseNameElement.getText()
		println("Name of the selected cart: ${cartname}")

		// Locate the price element inside the selected cart
		WebElement priceElement = randomElement.findElement(By.cssSelector("data"))
		String priceText = priceElement.getText()
		println("Price of the selected cart: ${priceText}")

		//to print the course price
		int coursePriceValue = Integer.parseInt(priceText.replaceAll("[^0-9]", ""));
		println("Price of the selected cart: ${coursePriceValue}")

		// Locate the submit button inside the selected cart
		WebElement submitButton = randomElement.findElement(By.xpath(".//button[contains(text(), 'تفعيل بالبطاقة')]"))
		this.hoverToTheButton(submitButton)

		// Find the button element
		WebElement buttonElement = driver.findElement(By.xpath("//button[contains(text(),'أرسل')]"))

		// Check if the button is disabled
		boolean isDisabled = !buttonElement.isEnabled()

		// Log the result for debugging
		if (isDisabled) {
			println("The button is disabled.")
		} else {
			println("The button is enabled.")
		}
	}




	@Keyword

	//blocked card course details
	def CardCourseDetais(List<WebElement> elements) {
		// Get the WebDriver instance
		WebDriver driver = DriverFactory.getWebDriver()

		// Select the random element
		Random random = new Random()
		int randomIndex = random.nextInt(elements.size())
		WebElement randomElement = elements.get(randomIndex)
		println("Clicked element at index: ${randomIndex}")

		// Locate the course name element inside the selected cart
		WebElement courseNameElement = randomElement.findElement(By.cssSelector("h2.tw-font-bold"))
		String cartname = courseNameElement.getText()
		println("Name of the selected cart: ${cartname}")

		// Locate the price element inside the selected cart
		WebElement priceElement = randomElement.findElement(By.cssSelector("data"))
		String priceText = priceElement.getText()
		println("Price of the selected cart: ${priceText}")

		//to print the course price
		int coursePriceValue = Integer.parseInt(priceText.replaceAll("[^0-9]", ""));
		println("Price of the selected cart: ${coursePriceValue}")

		// Locate the submit button inside the selected cart
		WebElement submitButton = randomElement.findElement(By.xpath("//*[contains(text(), 'تفاصيل الدورة')]"))
		this.hoverToTheButton(submitButton)

		WebUI.click(findTestObject('Shanab/Courses/CourseButton/bu-card-from-course-details'))

		//to apply the cart match with cart price
		switch (coursePriceValue) {
			case 50:
				WebUI.sendKeys(findTestObject('Shanab/Courses/CourseButton/course-details-card-pass'),GlobalVariable.Card50Blocked)
				break

			case 28:
				WebUI.sendKeys(findTestObject('Shanab/Courses/CourseButton/course-details-card-pass'),GlobalVariable.Card28Blocked)
				break

			case 10:
				WebUI.sendKeys(findTestObject('Shanab/Courses/CourseButton/course-details-card-pass'),GlobalVariable.Card10Blocked)
				break

			case 70:
				WebUI.sendKeys(findTestObject('Shanab/Courses/CourseButton/course-details-card-pass'),GlobalVariable.Card70Blocked)
				break

			case 100:
				WebUI.sendKeys(findTestObject('Shanab/Courses/CourseButton/course-details-card-pass'),GlobalVariable.Card100Blocked)
				break

			case 0:
				println("This course is free")
				break

			default:
				println("No matching card type found for the course price.")
				break
		}

		// Locate and interact with the card submit button
		WebElement cardSubmit = driver.findElement(By.xpath("//button/span[text()='أرسل']"))
		this.hoverToTheButton(cardSubmit)
	}


	@Keyword
	def randomCourseSelectorDetails(List<WebElement> elements) {



		// Get the WebDriver instance
		WebDriver driver = DriverFactory.getWebDriver()

		// Select the random element
		Random random = new Random()
		int randomIndex = random.nextInt(elements.size())
		WebElement randomElement = elements.get(randomIndex)
		println("Clicked element at index: ${randomIndex} with text: '${randomElement.getText()}'")

		// Locate the course name element inside the selected cart
		WebElement courseNameElement = randomElement.findElement(By.cssSelector("h2.tw-font-bold"))
		String cartname = courseNameElement.getText()
		println("Name of the selected cart: ${cartname}")

		// Locate the price element inside the selected cart
		WebElement priceElement = randomElement.findElement(By.cssSelector("data"))
		String priceText = priceElement.getText()
		println("Price of the selected cart: ${priceText}")

		//to print the course price
		int coursePriceValue = Integer.parseInt(priceText.replaceAll("[^0-9]", ""));
		println("Price of the selected cart: ${coursePriceValue}")

		// Locate the submit button inside the selected cart

		WebElement submitButton = randomElement.findElement(By.xpath("//*[contains(text(), 'تفاصيل الدورة')]"))
		this.hoverToTheButton(submitButton)

		WebElement corseNameDetails = driver.findElement(By.xpath("//span[@class='bold tw-text-[24px]']"))
		String courseDetailsName = corseNameDetails.getText()

		if (cartname==courseDetailsName) {

			WebUI.click(findTestObject('Shanab/Courses/CourseButton/bu-card-from-course-details'))
			//to apply the cart match with cart price
			switch (coursePriceValue) {
				case 50:
					WebUI.sendKeys(findTestObject('Shanab/Courses/CourseButton/course-details-card-pass'),GlobalVariable.Card50)
					break

				case 28:
					WebUI.sendKeys(findTestObject('Shanab/Courses/CourseButton/course-details-card-pass'),GlobalVariable.Card28)
					break

				case 10:
					WebUI.sendKeys(findTestObject('Shanab/Courses/CourseButton/course-details-card-pass'),GlobalVariable.Card10)
					break

				case 70:
					WebUI.sendKeys(findTestObject('Shanab/Courses/CourseButton/course-details-card-pass'),GlobalVariable.Card70)
					break

				case 100:
					WebUI.sendKeys(findTestObject('Shanab/Courses/CourseButton/course-details-card-pass'),GlobalVariable.Card100)
					break

				case 0:
					println("This course is free")
					WebUI.closeBrowser()
					assert false : "Test case ended because the course is free." // Ends the test with a message

					break

				default:
					println("No matching card type found for the course price.")
					break
			}

			// Locate and interact with the card submit button
			WebElement cardSubmit = driver.findElement(By.xpath("//button/span[text()='أرسل']"))
			this.hoverToTheButton(cardSubmit)


			//check the successful message
			String validationMessage = "تتهانينا! تمت عملية شراء الدورات بنجاح، لتصفح الدورات اذهب الى دوراتي"
			String xpath = "//span[text()='تهانينا! تمت عملية شراء الدورات بنجاح، لتصفح الدورات اذهب الى دوراتي']"
			this.assertValidation(validationMessage, xpath)

			println("mached successfully")

			WebUI.click(findTestObject('Shanab/Courses/CourseButton/By-course-confermation-from-course-details'))


			WebUI.click(findTestObject('Shanab/Courses/CourseButton/my_courses'))

			Robot robot = new Robot()
			robot.keyPress(KeyEvent.VK_ESCAPE)
			robot.keyRelease(KeyEvent.VK_ESCAPE)
			// Locate all course names using the actual XPath
			List<WebElement> allCourseNameElements = driver.findElements(By.xpath("//h2[contains(@class, 'tw-font-bold')]"))
			// Check if the CourseName is present in the list of all course names
			String CourseName = cartname

			boolean isCourseFound = false
			for (WebElement courseElement : allCourseNameElements) {
				if (courseElement.getText().equals(CourseName)) {
					isCourseFound = true
					break
				}
			}
			if (isCourseFound) {
				println("Success: Course name '${CourseName}' found.")
			} else {
				println("Course name '${CourseName}' not found.")
			}
		}else {
			print("The course name not match , the course dwtails name is:${courseDetailsName}")
		}
	}
}

