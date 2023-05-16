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

WebUI.navigateToUrl('http://www.hancomdocs.com/')

WebUI.click(findTestObject('HD_Landing/Landing_Appbar_Login'))

WebUI.setText(findTestObject('HD_Landing/Login_input__email'), 'hcnewbiz+prdat1@gmail.com')

WebUI.setEncryptedText(findTestObject('HD_Landing/Login_input__password'), 'IiiKlAiWmeOR474j7JBH5w==')

WebUI.click(findTestObject('HD_Landing/button_Login'))

WebUI.click(findTestObject('HD_Luncher/LNB_Menu/Menu_Storage'))

WebUI.click(findTestObject('HD_Luncher/Button/button_NewCreate'))

WebUI.click(findTestObject('HD_Luncher/Button/button_NewCreate_hangeul'))

WebUI.switchToWindowIndex(1)

WebUI.waitForPageLoad(10)

WebUI.delay(5)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('HD_Luncher/Button/button_NewCreate'))

WebUI.click(findTestObject('HD_Luncher/Button/button_NewCreate_hancell'))

WebUI.switchToWindowIndex(1)

WebUI.waitForPageLoad(10)

WebUI.delay(5)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('HD_Luncher/Button/button_NewCreate'))

WebUI.click(findTestObject('HD_Luncher/Button/button_NewCreate_hanshow'))

WebUI.switchToWindowIndex(1)

WebUI.waitForPageLoad(10)

WebUI.delay(5)

WebUI.closeWindowIndex(1)

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('HD_Luncher/Checkbox/Storage_Checkbox_1'))

WebUI.click(findTestObject('HD_Luncher/Checkbox/Storage_Checkbox_2'))

WebUI.click(findTestObject('HD_Luncher/Checkbox/Storage_Checkbox_3'))

WebUI.click(findTestObject('HD_Luncher/Button/button_header_delete'))

WebUI.click(findTestObject('HD_Luncher/LNB_Menu/Menu_Trashbin'))

WebUI.click(findTestObject('HD_Luncher/variable object/svg (1)'))

WebUI.click(findTestObject('HD_Luncher/Contextmenu/contextmenu_restoration'))

WebUI.click(findTestObject('HD_Luncher/variable object/svg (2)'))

WebUI.click(findTestObject('HD_Luncher/Contextmenu/contextmenu_complete delete'))

WebUI.click(findTestObject('HD_Luncher/Button/button_trashbinclear_OK'))

WebUI.click(findTestObject('HD_Luncher/LNB_Menu/Menu_Storage'))

WebUI.click(findTestObject('HD_Luncher/variable object/svg'))

WebUI.click(findTestObject('HD_Luncher/Contextmenu/contextmenu_delete'))

WebUI.click(findTestObject('HD_Luncher/LNB_Menu/Menu_Trashbin'))

WebUI.click(findTestObject('HD_Luncher/Button/button_trashbinclear'))

WebUI.click(findTestObject('HD_Luncher/Button/button_trashbinclear_OK'))

WebUI.verifyElementText(findTestObject('HD_Luncher/Compare text/Nodata_Trashbin'), '항목 없음')

