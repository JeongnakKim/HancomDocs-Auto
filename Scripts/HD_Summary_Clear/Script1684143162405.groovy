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

'저장공간이동'
WebUI.click(findTestObject('HD_Luncher/LNB_Menu/Menu_Storage'))

'전체선택 체크박스'
WebUI.click(findTestObject('Object Repository/HD_Luncher/Checkbox/Storage_Checkbox_All'))

WebUI.click(findTestObject('HD_Luncher/Button/button_header_delete'))

WebUI.click(findTestObject('HD_Luncher/LNB_Menu/Menu_Trashbin'))

WebUI.click(findTestObject('HD_Luncher/Button/button_trashbinclear'))

WebUI.click(findTestObject('HD_Luncher/Button/button_trashbinclear_OK'))

