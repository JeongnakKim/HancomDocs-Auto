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

WebUI.navigateToUrl('https://www.hancomdocs.com/')

WebUI.click(findTestObject('HD_Landing/Landing_Appbar_Login'))

WebUI.setText(findTestObject('HD_Landing/Login_input__email'), 'hcnewbiz+prdat1@gmail.com')

WebUI.setEncryptedText(findTestObject('HD_Landing/Login_input__password'), 'IiiKlAiWmeOR474j7JBH5w==')

WebUI.click(findTestObject('HD_Landing/button_Login'))

'새로만들기 버튼'
WebUI.click(findTestObject('Object Repository/HD_Luncher/Menu/LNB_Menu/Menu_NewCreate'), FailureHandling.CONTINUE_ON_FAILURE)

'새로만들기->한글'
WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_LNB_new_hangeul'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Menu/LNB_Menu/Menu_NewCreate'), FailureHandling.CONTINUE_ON_FAILURE)

'새로만들기->셀\r\n'
WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_LNB_new_hancell'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Menu/LNB_Menu/Menu_NewCreate'), FailureHandling.CONTINUE_ON_FAILURE)

'새로만들기->쇼'
WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_LNB_new_hanshow'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Menu/LNB_Menu/Menu_NewCreate'), FailureHandling.CONTINUE_ON_FAILURE)

'새로만들기->워드'
WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_LNB_new_hanword'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(15, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Menu/LNB_Menu/Menu_NewCreate'), FailureHandling.CONTINUE_ON_FAILURE)

'새로만들기->폼'
WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_LNB_new_hanform'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(0, FailureHandling.CONTINUE_ON_FAILURE)

'햔글메뉴2\r\n'
WebUI.click(findTestObject('Object Repository/HD_Luncher/Menu/LNB_Menu/Menu_Hangeul'), FailureHandling.CONTINUE_ON_FAILURE)

'보고서'
WebUI.click(findTestObject('Object Repository/HD_Luncher/Template/Template_hangeul_1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(0, FailureHandling.CONTINUE_ON_FAILURE)

'주간 업무 보고'
WebUI.click(findTestObject('Object Repository/HD_Luncher/Template/Template_hangeul_2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(0, FailureHandling.CONTINUE_ON_FAILURE)

'이력서\r\n'
WebUI.click(findTestObject('Object Repository/HD_Luncher/Template/Template_hangeul_3'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(0, FailureHandling.CONTINUE_ON_FAILURE)

'회의록'
WebUI.click(findTestObject('Object Repository/HD_Luncher/Template/Template_hangeul_4'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(15, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(0, FailureHandling.CONTINUE_ON_FAILURE)

'한셀메뉴\r\n'
WebUI.click(findTestObject('Object Repository/HD_Luncher/Menu/LNB_Menu/Menu_Hancell'), FailureHandling.CONTINUE_ON_FAILURE)

'자기자본명세서'
WebUI.click(findTestObject('Object Repository/HD_Luncher/Template/Template_hancell_1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(0, FailureHandling.CONTINUE_ON_FAILURE)

'현금 흐름 민감도 분석'
WebUI.click(findTestObject('Object Repository/HD_Luncher/Template/Template_hancell_2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(0, FailureHandling.CONTINUE_ON_FAILURE)

'포트폴리오 배분'
WebUI.click(findTestObject('Object Repository/HD_Luncher/Template/Template_hancell_3'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(0, FailureHandling.CONTINUE_ON_FAILURE)

'대학 월간 예산'
WebUI.click(findTestObject('Object Repository/HD_Luncher/Template/Template_hancell_4'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Menu/LNB_Menu/Menu_Hanshow'), FailureHandling.CONTINUE_ON_FAILURE)

'도시'
WebUI.click(findTestObject('Object Repository/HD_Luncher/Template/Template_hanshow_1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(0, FailureHandling.CONTINUE_ON_FAILURE)

'오피스'
WebUI.click(findTestObject('Object Repository/HD_Luncher/Template/Template_hanshow_2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(0, FailureHandling.CONTINUE_ON_FAILURE)

'그라디언트'
WebUI.click(findTestObject('Object Repository/HD_Luncher/Template/Template_hanshow_3'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(0, FailureHandling.CONTINUE_ON_FAILURE)

'심플한 원형'
WebUI.click(findTestObject('Object Repository/HD_Luncher/Template/Template_hanshow_4'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Menu/LNB_Menu/Menu_Hanword'), FailureHandling.CONTINUE_ON_FAILURE)

'이력서'
WebUI.click(findTestObject('Object Repository/HD_Luncher/Template/Template_hanword_1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(0, FailureHandling.CONTINUE_ON_FAILURE)

'비용보고서'
WebUI.click(findTestObject('Object Repository/HD_Luncher/Template/Template_hanword_2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(0, FailureHandling.CONTINUE_ON_FAILURE)

'구매주문서'
WebUI.click(findTestObject('Object Repository/HD_Luncher/Template/Template_hanword_3'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(0, FailureHandling.CONTINUE_ON_FAILURE)

'보고서'
WebUI.click(findTestObject('Object Repository/HD_Luncher/Template/Template_hanword4'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HD_Luncher/Menu/LNB_Menu/Menu_Storage'), FailureHandling.CONTINUE_ON_FAILURE)

