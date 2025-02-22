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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.joacademy.com/home/tawjihi')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Check out quick links/Page_- joacademy.com/closeimage'))
WebUI.scrollToPosition(0, 9999999)

// Variables for the text of each element
def verifyMosa3ada = 'المساعدة'
def verifyTawasolMa3D3m = 'تواصل مع الدعم الفني'
def verifyA5barona = 'أخبارنا'
def verifyManNa7n = 'من نحن'
def verifyMaktabat = 'مكتبات'
def verifyShorotWaA7kam = 'الشروط والاحكام'
def verifySiyastAlKhosoosya = 'سياسة الخصوصية'

// Verification using the variables with print statements for each element
WebUI.verifyElementText(findTestObject('Object Repository/verify support/Page_- joacademy.com/a_'), verifyMosa3ada)
println("✅ Verified element successfully: ${verifyMosa3ada}")

WebUI.verifyElementText(findTestObject('Object Repository/verify support/Page_- joacademy.com/a__1'), verifyTawasolMa3D3m)
println("✅ Verified element successfully: ${verifyTawasolMa3D3m}")

WebUI.verifyElementText(findTestObject('Object Repository/verify support/Page_- joacademy.com/a__1_2'), verifyA5barona)
println("✅ Verified element successfully: ${verifyA5barona}")

WebUI.verifyElementText(findTestObject('Object Repository/verify support/Page_- joacademy.com/a__1_2_3'), verifyManNa7n)
println("✅ Verified element successfully: ${verifyManNa7n}")

WebUI.verifyElementText(findTestObject('Object Repository/verify support/Page_- joacademy.com/a__1_2_3_4'), verifyMaktabat)
println("✅ Verified element successfully: ${verifyMaktabat}")

WebUI.verifyElementText(findTestObject('Object Repository/verify support/Page_- joacademy.com/a__1_2_3_4_5'), verifyShorotWaA7kam)
println("✅ Verified element successfully: ${verifyShorotWaA7kam}")

WebUI.verifyElementText(findTestObject('Object Repository/verify support/Page_- joacademy.com/a__1_2_3_4_5_6'), verifySiyastAlKhosoosya)
println("✅ Verified element successfully: ${verifySiyastAlKhosoosya}")
WebUI.takeScreenshot()

WebUI.closeBrowser()

