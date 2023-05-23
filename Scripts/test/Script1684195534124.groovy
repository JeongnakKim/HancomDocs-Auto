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
import com.kms.katalon.core.testobject.ConditionType as ConditionType

WebUI.openBrowser('', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl('https://www.hancomdocs.com/', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Landing/Landing_Appbar_Login'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/HD_Landing/Login_input__email'), 'hcnewbiz+prdat2@gmail.com', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setEncryptedText(findTestObject('Object Repository/HD_Landing/Login_input__password'), 'IiiKlAiWmeOR474j7JBH5w==', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Landing/button_Login'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Menu/LNB_Menu/Menu_Hancell'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_app_template_close'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('HD_Luncher/Button/Buotton_App_hancell_new'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_app_tamplate_open'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('HD_Luncher/Template/Template_hancell_1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Menu/Tab/Home_Share_Tab'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Text/Nodata_share'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Menu/Tab/Home_Favorite_Tab'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('HD_Luncher/BodyTable/Home/Body_Home_Favorite_1'), 'ods파일 테스트', FailureHandling.CONTINUE_ON_FAILURE)

