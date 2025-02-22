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
WebUI.scrollToPosition(0, 9999999)
WebUI.click(findTestObject('Object Repository/Check out quick links/Page_- joacademy.com/closeimage'))

def verifyDawrat = 'الدورات'

def verifyShababeek = 'شبابيك'

def verifyMadrasatna = 'مدرستنا'

def verifyMoalimoon = 'معلمون'

def verifyMalafaat = 'الملفات'

def verifyMonah = 'منح جواكاديمي'

def verifyKoonMandobna = 'كن مندوبنا'

def verifyPakajatWaOrod = 'بكجات وعروض'

WebUI.verifyElementText(findTestObject('Object Repository/Check out quick links/Page_- joacademy.com/a_'), verifyDawrat)

println("تم التحقق من العنصر: $verifyDawrat")

WebUI.verifyElementText(findTestObject('Object Repository/Check out quick links/Page_- joacademy.com/a__1'), verifyShababeek)

println("تم التحقق من العنصر: $verifyShababeek")

WebUI.verifyElementText(findTestObject('Object Repository/Check out quick links/Page_- joacademy.com/a__1_2'), verifyMadrasatna)

println("تم التحقق من العنصر: $verifyMadrasatna")

WebUI.verifyElementText(findTestObject('Object Repository/Check out quick links/Page_- joacademy.com/a__1_2_3'), verifyMoalimoon)

println("تم التحقق من العنصر: $verifyMoalimoon")

WebUI.verifyElementText(findTestObject('Object Repository/Check out quick links/Page_- joacademy.com/a__1_2_3_4'), verifyMalafaat)

println("تم التحقق من العنصر: $verifyMalafaat")

WebUI.verifyElementText(findTestObject('Object Repository/Check out quick links/Page_- joacademy.com/div_'), verifyMonah)

println("تم التحقق من العنصر: $verifyMonah")

WebUI.verifyElementText(findTestObject('Object Repository/Check out quick links/Page_- joacademy.com/a__1_2_3_4_5'), verifyKoonMandobna)

println("تم التحقق من العنصر: $verifyKoonMandobna")

WebUI.verifyElementText(findTestObject('Object Repository/Check out quick links/Page_- joacademy.com/a__1_2_3_4_5_6'), verifyPakajatWaOrod)

println("تم التحقق من العنصر: $verifyPakajatWaOrod")

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

