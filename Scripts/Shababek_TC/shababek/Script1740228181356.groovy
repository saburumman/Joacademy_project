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
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebElement as WebElement
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent


WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.joacademy.com/')

WebUI.click(findTestObject('Object Repository/Alqaisy/shababek/Page_- joacademy.com/select_ program-tawjihi'))

WebUI.click(findTestObject('Object Repository/Alqaisy/add favorite/CLOSE ads/Page_- joacademy.com/close-ads'))

WebUI.click(findTestObject('Object Repository/Alqaisy/shababek/Page_- joacademy.com/login'))

WebUI.click(findTestObject('Object Repository/Alqaisy/shababek/Page_- joacademy.com/login_by_email'))

WebUI.setText(findTestObject('Object Repository/Alqaisy/shababek/Page_- joacademy.com/input__email'), 'mohannadqaisy343@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Alqaisy/shababek/Page_- joacademy.com/input__password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Alqaisy/shababek/Page_- joacademy.com/submit'))

WebUI.click(findTestObject('Object Repository/Alqaisy/shababek/Page_UserView Page - joacademy.com/logo_joacademy'))

WebUI.click(findTestObject('Object Repository/Alqaisy/add favorite/CLOSE ads/Page_- joacademy.com/close-ads'))

//Enter a group, create a post in it, do all the scenarios for the post, and then delete it
WebUI.click(findTestObject('Object Repository/Alqaisy/shababek/shababek2/Page_2007 - joacademy.com/click on shababek'))

WebUI.click(findTestObject('Object Repository/Alqaisy/shababek/shababek2/Page_- joacademy.com/group'))

WebElement element = WebUI.findWebElement(findTestObject('Object Repository/Alqaisy/shababek/shababek2/Page_- joacademy.com/my group'))

// Use JavascriptExecutor to scroll to the element
JavascriptExecutor js = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

js.executeScript('arguments[0].scrollIntoView({block: \'center\', inline: \'nearest\'});', element)

WebUI.click(findTestObject('Object Repository/Alqaisy/shababek/shababek2/Page_- joacademy.com/my group'))

//create post in my group and verify that it has been create success]
WebUI.waitForPageLoad(30)
WebUI.scrollToElement(findTestObject('Object Repository/Alqaisy/shababek/shababek2/Page_- joacademy.com/textarea_jo'), 0)

WebUI.setText(findTestObject('Object Repository/Alqaisy/shababek/shababek2/Page_- joacademy.com/textarea_jo'), 'jo')


WebElement sc = WebUI.findWebElement(findTestObject('Object Repository/Alqaisy/shababek/shababek2/Page_- joacademy.com/submit'))


js.executeScript('arguments[0].scrollIntoView({block: \'center\', inline: \'nearest\'});', sc)

WebUI.click(findTestObject('Object Repository/Alqaisy/shababek/shababek2/Page_- joacademy.com/submit'))

boolean isPopupVisible = WebUI.waitForElementVisible(findTestObject('Object Repository/Alqaisy/shababek/shababek2/Page_- joacademy.com/create sucess'), 
    5)

if (isPopupVisible) {
    println('Popup is visible.')
} else {
    println('Popup did not appear.')
}

WebUI.delay(2)

//Like the post in group
WebElement li = WebUI.findWebElement(findTestObject('Object Repository/Alqaisy/shab2/Page_- joacademy.com/like'))

JavascriptExecutor sb = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

sb.executeScript('arguments[0].scrollIntoView({block: \'center\', inline: \'nearest\'});', li)

WebUI.click(findTestObject('Object Repository/Alqaisy/shab2/Page_- joacademy.com/like'))

//scroll to commant
WebElement y = WebUI.findWebElement(findTestObject('Object Repository/Alqaisy/shab2/Page_- joacademy.com/textarea_joj'))

JavascriptExecutor b = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

b.executeScript('arguments[0].scrollIntoView({block: \'center\', inline: \'nearest\'});', y)

//create comment in post in group
WebUI.setText(findTestObject('Object Repository/Alqaisy/shab2/Page_- joacademy.com/textarea_joj'), 'joj')

WebUI.click(findTestObject('Object Repository/Alqaisy/shab2/Page_- joacademy.com/submit-commant'))

WebUI.delay(2)

WebUI.refresh()

//create reply in post in group
WebUI.click(findTestObject('Object Repository/Alqaisy/shab2/Page_- joacademy.com/reply'))

WebUI.setText(findTestObject('Object Repository/Alqaisy/shab2/Page_- joacademy.com/textarea_j_1'), 'j')

WebUI.click(findTestObject('Object Repository/Alqaisy/shab2/Page_- joacademy.com/submit-reply'))

WebUI.delay(2)

//Like the comment for post in group
WebUI.click(findTestObject('Object Repository/Alqaisy/shab2/Page_- joacademy.com/like-commant'))

//Edit the comment in post and verify that it has been edited.
WebUI.click(findTestObject('Object Repository/Alqaisy/edit/Page_- joacademy.com/button__edit_delete'))

WebUI.click(findTestObject('Object Repository/Alqaisy/shab44/Page_- joacademy.com/editt'))

WebUI.setText(findTestObject('Object Repository/Alqaisy/shababek/shababek2/Page_UserView Page - joacademy.com/Page_- joacademy.com/textarea_joo'), 
    'joo')

//WebUI.click(findTestObject('Object Repository/Alqaisy/shab2/Page_- joacademy.com/save_edit'))
WebUI.click(findTestObject('Object Repository/Alqaisy/shab44/Page_- joacademy.com/Page_- joacademy.com/save edite'))
boolean isPopupVisiblee = WebUI.waitForElementVisible(findTestObject('Object Repository/Alqaisy/shab2/Page_- joacademy.com/Updated successfully'), 
    5)

if (isPopupVisiblee) {
    println('Popup is visible.')
} else {
    println('Popup did not appear.')
}

WebUI.delay(3)

//delete comment in post in group 
WebUI.click(findTestObject('Object Repository/Alqaisy/edit/Page_- joacademy.com/button__edit_delete'))

WebUI.click(findTestObject('Object Repository/Alqaisy/shababek/shababek2/Page_UserView Page - joacademy.com/Page_UserView Page - joacademy.com/Page_- joacademy.com/delet-commant'))

WebUI.click(findTestObject('Object Repository/Alqaisy/shab44/Page_- joacademy.com/button_'))

boolean isPopupVisibleee = WebUI.waitForElementVisible(findTestObject('Object Repository/Alqaisy/shababek/shababek2/Page_UserView Page - joacademy.com/Page_UserView Page - joacademy.com/Page_- joacademy.com/deleted_commant'), 
    5)

if (isPopupVisibleee) {
    println('Popup is visible.')
} else {
    println('Popup did not appear.')
}

WebUI.delay(3)

//Edit the post in group and verify that it has been edited.

WebUI.click(findTestObject('Object Repository/Alqaisy/edit/Page_- joacademy.com/delet and edit'))

WebUI.click(findTestObject('Object Repository/Alqaisy/shab44/Page_- joacademy.com/edit post'))

WebUI.setText(findTestObject('Object Repository/Alqaisy/shab44/Page_- joacademy.com/textarea_jooo'), 'jooo')

WebUI.click(findTestObject('Object Repository/Alqaisy/shab44/Page_- joacademy.com/button_post'))

boolean isPopupVisibl = WebUI.waitForElementVisible(findTestObject('Object Repository/Alqaisy/shab44/Page_- joacademy.com/Updated successfully'), 
    5)

if (isPopupVisibl) {
    println('Popup is visible.')
} else {
    println('Popup did not appear.')
}
WebUI.delay(3)

////Delete the post in group and verify that it has been deleted
WebUI.click(findTestObject('Object Repository/Alqaisy/edit/Page_- joacademy.com/delet and edit'))

WebUI.click(findTestObject('Object Repository/Alqaisy/shab44/Page_- joacademy.com/Page_- joacademy.com/delete post'))


WebUI.click(findTestObject('Object Repository/Alqaisy/shab44/Page_- joacademy.com/Page_UserView Page - joacademy.com/Page_- joacademy.com/DELET-POST'))

boolean isPopupVisibll = WebUI.waitForElementVisible(findTestObject('Object Repository/Alqaisy/shab44/Page_- joacademy.com/Page_- joacademy.com/Delete successfully'), 
    5)

if (isPopupVisibll) {
    println('Popup is visible.')
} else {
    println('Popup did not appear.')
}
WebUI.delay(3)

WebUI.back()

//Create a post in the general post and make sure it is published in the general post
WebUI.setText(findTestObject('Object Repository/Alqaisy/post/Page_- joacademy.com/textarea_jo academy'), 'jo academy')

WebElement scs = WebUI.findWebElement(findTestObject('Object Repository/Alqaisy/post/Page_- joacademy.com/button_post'))

// Use JavascriptExecutor to scroll to the element
JavascriptExecutor jsss = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

jsss.executeScript('arguments[0].scrollIntoView({block: \'center\', inline: \'nearest\'});', scs)

WebUI.click(findTestObject('Object Repository/Alqaisy/post/Page_- joacademy.com/button_post'))

WebUI.delay(3)

boolean isPopupVisiblll = WebUI.waitForElementVisible(findTestObject('Object Repository/Alqaisy/post/Page_- joacademy.com/Updated successfully'), 
    5)

if (isPopupVisiblll) {
    println('Popup is visible.')
} else {
    println('Popup did not appear.')
}
WebUI.delay(3)

WebUI.refresh()

//Make sure the post in general posts is the same as the post in my posts
WebElement scss = WebUI.findWebElement(findTestObject('Object Repository/Alqaisy/post/Page_- joacademy.com/my post'))

JavascriptExecutor jssss = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

jssss.executeScript('arguments[0].scrollIntoView({block: \'center\', inline: \'nearest\'});', scss)

WebUI.click(findTestObject('Object Repository/Alqaisy/post/Page_- joacademy.com/my post'))

String elem1 = findTestObject('Object Repository/Alqaisy/post/Page_- joacademy.com/span_jo academy')

String elem2 = findTestObject('Object Repository/Alqaisy/post/Page_- joacademy.com/span_jo academy_1')

if (elem1 == elem2) {
    WebUI.comment('Both elements match on the two pages.' // Additional actions if elements match
        // Additional actions if elements do not match
        )
} else {
    WebUI.comment('Elements do not match between the two pages.')
}
WebUI.delay(3)

//Verify group joining
WebElement scssx = WebUI.findWebElement(findTestObject('Object Repository/Alqaisy/shababek/join group/Page_- joacademy.com/groups'))

JavascriptExecutor jso = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

jso.executeScript('arguments[0].scrollIntoView({block: \'center\', inline: \'nearest\'});', scssx)

WebUI.click(findTestObject('Object Repository/Alqaisy/shababek/join group/Page_- joacademy.com/groups'))

WebElement scssc = WebUI.findWebElement(findTestObject('Object Repository/Alqaisy/shababek/join group/Page_- joacademy.com/group'))

JavascriptExecutor jsj = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

jsj.executeScript('arguments[0].scrollIntoView({block: \'center\', inline: \'nearest\'});', scssc)

WebUI.click(findTestObject('Object Repository/Alqaisy/shababek/join group/Page_- joacademy.com/group'))

WebUI.click(findTestObject('Object Repository/Alqaisy/shababek/join group/Page_- joacademy.com/join'))

WebElement ss = WebUI.findWebElement(findTestObject('Object Repository/Alqaisy/shababek/join group/Page_- joacademy.com/add-image-video'))

JavascriptExecutor jo = ((DriverFactory.getWebDriver()) as JavascriptExecutor)

jo.executeScript('arguments[0].scrollIntoView({block: \'center\', inline: \'nearest\'});', ss)

boolean isVisiblee = WebUI.waitForElementVisible(findTestObject('Object Repository/Alqaisy/shababek/join group/Page_- joacademy.com/add-image-video'), 
    5 // Wait up to 10 seconds
    )

if (isVisiblee) {
    println('User has joined the group.')
} else {
    println('User has not joined the group.')
}
WebUI.delay(3)

WebUI.closeBrowser()

