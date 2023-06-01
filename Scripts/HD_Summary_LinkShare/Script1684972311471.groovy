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

WebUI.openBrowser('', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl('http://www.hancomdocs.com/', FailureHandling.CONTINUE_ON_FAILURE)

'account2의 hwpx 보기권한 허용 공유링크'
WebUI.navigateToUrl('https://www.hancomdocs.com/open?fileId=m%3A0%3A1234497382', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('HD_Luncher/Text/WebOffice_title_Compare_text'), 'hwpx파일 테스트.hwpx - 한글 (읽기 전용)', 
    FailureHandling.CONTINUE_ON_FAILURE)

'account2의 hwp 편집권한 허용 공유링크'
WebUI.navigateToUrl('https://www.hancomdocs.com/open?fileId=m%3A0%3A1234497385', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HD_etc(Link)/button_editpopup_viewer'))

WebUI.waitForPageLoad(10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('HD_Luncher/Text/WebOffice_title_Compare_text'), 'hwp파일 테스트.hwp - 한글 (읽기 전용)', FailureHandling.CONTINUE_ON_FAILURE)

'account2의 hwp 편집권한 허용 공유링크'
WebUI.navigateToUrl('https://www.hancomdocs.com/open?fileId=m%3A0%3A1234497385', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HD_etc(Link)/button_editpopup_login'))

WebUI.setText(findTestObject('HD_Landing/Login_input__email'), 'hcnewbiz+prdat1@gmail.com', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setEncryptedText(findTestObject('HD_Landing/Login_input__password'), 'IiiKlAiWmeOR474j7JBH5w==', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HD_Landing/button_Login'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('HD_Luncher/Text/WebOffice_title_Compare_text'), 'hwp파일 테스트.hwp - 한글', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

