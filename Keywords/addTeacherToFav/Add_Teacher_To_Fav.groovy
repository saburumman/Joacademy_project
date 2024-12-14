package addTeacherToFav

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

import internal.GlobalVariable

public class Add_Teacher_To_Fav {


	@Keyword
	def favTeacher() {


		//Search for a teacher to Save
		WebUI.setText(findTestObject('Object Repository/Teachers_Page- joacademy.com/Search_Box_for_Teacher'), 'معلم جو اكاديمي')

		//Save the photo name of the targeted teacher to check if the same teacher is saved
		def savedTeacher = findTestObject('Object Repository/Teachers_Page- joacademy.com/Saved_Teacher_Photo')
		String teacherImageAlt = WebUI.getAttribute(savedTeacher, 'alt')

		//Click on heart icon to save teacher
		WebUI.click(findTestObject('Object Repository/Teachers_Page- joacademy.com/Add_Teacher_to_Fav_Heart'))

		TestObject FavSideMenu = findTestObject('Object Repository/Favorite_Page/Fav_From_Side_Menu')

		// Scroll to the element
		WebUI.scrollToElement(FavSideMenu, 5)

		// Use JavaScript to center the element on the screen
		JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getWebDriver()
		js.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'});", WebUI.findWebElement(FavSideMenu))
		//Go to Favorite Page
		WebUI.click(findTestObject('Object Repository/Favorite_Page/Fav_From_Side_Menu'))

		//Navigate to teachers tab in favorite page
		WebUI.click(findTestObject('Object Repository/Favorite_Page/Teacher_Tab_In_Fav_Page'))
		//Go to Favorite Page
		WebUI.click(findTestObject('Object Repository/Favorite_Page/Fav_From_Side_Menu'))

		//Navigate to teachers tab in favorite page
		WebUI.click(findTestObject('Object Repository/Favorite_Page/Teacher_Tab_In_Fav_Page'))

		//Check if the saved teacher is the same one I saved in the teachers list
		def dynamicImageObject = findTestObject('Object Repository/Teachers_Page- joacademy.com/Saved_Teacher_Photo', [('altValue') : teacherImageAlt])

		boolean isTeacherPresent = WebUI.verifyElementPresent(dynamicImageObject, 10)

		if (isTeacherPresent) {
			WebUI.comment('The same saved teacher is present on the new page.')
		} else {
			WebUI.comment('The same saved teacher is not found on the new page.')
		}
	}
}
