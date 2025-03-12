package com.ea.utilities

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as Global
import com.kms.katalon.core.testobject.TestObject


public class loginTest {

	/**
	 * Keyword to log in to the JoAcademy application
	 */
	@Keyword
	def loginToJoAcademy() {
		// Open the browser
		WebUI.openBrowser('')

		// Maximize the browser window
		WebUI.maximizeWindow()

		// Navigate to the URL specified in GlobalVariable
		WebUI.navigateToUrl(Global.URL)

		// Click the login button
		WebUI.click(findTestObject('Object Repository/Shanab/login/Page_- joacademy.com/login_by_email'))

		// Enter the user name
		WebUI.setText(findTestObject('Object Repository/Shanab/login/Page_- joacademy.com/input__email'),Global.UserName)

		// Enter the password
		WebUI.setText(findTestObject('Object Repository/Shanab/login/Page_- joacademy.com/input__password'),Global.PassWord)

		// Submit the login form
		WebUI.click(findTestObject('Object Repository/Shanab/login/Page_- joacademy.com/Submit_login'))
	}
}
