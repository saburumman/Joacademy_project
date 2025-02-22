package filterTeachers

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

public class Filter_Teacher {
	
	@Keyword
	def filterTeacher() {

	WebUI.click(findTestObject('Saraa/Main_Menu_List- joacademy.com/Teachers_From_Main_Menu'))

    WebUI.click(findTestObject('Object Repository/Saraa/Filter_Teacher_Obj/Choose_Proram_From_Filters'))

    WebUI.click(findTestObject('Object Repository/Saraa/Filter_Teacher_Obj/Filter_Option__for_Program'))

    WebUI.click(findTestObject('Saraa/Filter_Teacher_Obj/Choose_Section_Filter_'))

    WebUI.click(findTestObject('Object Repository/Saraa/Filter_Teacher_Obj/Filter_Section_Option'))

    WebUI.click(findTestObject('Object Repository/Saraa/Filter_Teacher_Obj/Filter_Subject_Option'))

    WebUI.click(findTestObject('Object Repository/Saraa/Filter_Teacher_Obj/Choose_Subject_Filter'))


    WebUI.click(findTestObject('Object Repository/Saraa/Filter_Teacher_Obj/Button_Reset_Filters'))

	}
}
