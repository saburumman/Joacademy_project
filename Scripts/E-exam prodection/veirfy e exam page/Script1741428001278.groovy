import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.joacademy.com/online-exams')

boolean isElementVisible = WebUI.verifyElementVisible(findTestObject('Object Repository/E-exam prodection/Page_joacademy.com/header_'))

if (isElementVisible) {
    println("تم التحقق بنجاح، سيتم إغلاق المتصفح")
    WebUI.closeBrowser()
} else {
    println("التحقق فشل، لن يتم إغلاق المتصفح")
}
