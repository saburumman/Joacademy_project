package loginCase

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

import internal.GlobalVariable

public class Login_Test_Case {

	@Keyword
	def login(String username, String password) {
		WebUI.openBrowser('https://www.joacademy.com/')

		//Navigate to JO Academy site
		WebUI.navigateToUrl('https://www.joacademy.com/')

		WebUI.maximizeWindow()

		WebUI.takeScreenshot('Screenshots/Targets/Navigate_to_Jo_academy.png')

		//Choose a Program
		WebUI.click(findTestObject('Object Repository/Saraa/Login- joacademy.com/Select_Program_From_Landing_Page'))

		WebUI.takeScreenshot('Screenshots/Targets/Choose_Program_From_landing_page.png')


		// Verify if the AD Is Appearing
		if (WebUI.verifyElementPresent(findTestObject('Object Repository/Saraa/Login- joacademy.com/Close_AD_popup'), 10)) {
			// If there is an AD, then Close it
			WebUI.click(findTestObject('Object Repository/Saraa/Login- joacademy.com/Close_AD_popup'))
		}

		//Navigate to Login Page
		WebUI.click(findTestObject('Object Repository/Saraa/Login- joacademy.com/Login_From_Top_Bar'))

		//Choose Login using Email
		WebUI.click(findTestObject('Object Repository/Saraa/Login- joacademy.com/Login_Using_Email'))

		//Fill Email
		WebUI.setText(findTestObject('Object Repository/Saraa/Login- joacademy.com/input__email'), username)

		//Fill Password
		WebUI.setEncryptedText(findTestObject('Object Repository/Saraa/Login- joacademy.com/input__password'), password)

		//Click Login button
		WebUI.click(findTestObject('Saraa/Login- joacademy.com/Login_Button'))

		WebUI.takeScreenshot('Screenshots/Targets/screenshot.png')

		//Verify I am Logged in
		WebUI.verifyElementPresent(findTestObject('Saraa/Login- joacademy.com/Cart_Icon'), 5)

		WebUI.takeScreenshot('Screenshots/Targets/screenshot1.png')
	}
}
