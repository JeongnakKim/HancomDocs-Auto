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

WebUI.navigateToUrl('https://www.stg.hancomdocs.com/', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Landing/Landing_Appbar_Login'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/HD_Landing/Login_input__email'), 'hcnewbiz+stgat2@gmail.com', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setEncryptedText(findTestObject('Object Repository/HD_Landing/Login_input__password'), 'IiiKlAiWmeOR474j7JBH5w==', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Landing/button_Login'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Profile_icon'), FailureHandling.CONTINUE_ON_FAILURE)

'등급 아이콘 (무료)'
WebUI.verifyElementText(findTestObject('Object Repository/HD_Luncher/Text/account_grade'), '무료', FailureHandling.CONTINUE_ON_FAILURE)

'닉네임 영역'
WebUI.verifyElementText(findTestObject('Object Repository/HD_Luncher/Text/accuont_nickname_txt'), '자동화테스트 STG 2번', FailureHandling.CONTINUE_ON_FAILURE)

'이메일 영역'
WebUI.verifyElementText(findTestObject('Object Repository/HD_Luncher/Text/account_email_txt'), 'hcnewbiz+stgat2@gmail.com', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Button/button_accountmanage'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Button/button_subscribe_accountmenu'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Button/button_setting_accountmenu'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Button/button_download_Ho_accountmenu'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Button/button_help_accountmenu'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Button/button_conteatus_accountmenu'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_accountmanage'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_etc(Link)/account_mypage_title_txt'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Profile_icon'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_help_accountmenu'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_etc(Link)/FAQ_title_txt'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Profile_icon'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_conteatus_accountmenu'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_etc(Link)/contactus_title_txt'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Profile_icon'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_subscribe_accountmenu'), FailureHandling.CONTINUE_ON_FAILURE)

'요금제 title'
WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Text/plantable_title_txt'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Profile_icon'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_setting_accountmenu'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Text/connectdevice_free_txt'), FailureHandling.CONTINUE_ON_FAILURE)

'구독및 결제 탭'
WebUI.click(findTestObject('Object Repository/HD_Luncher/Menu/Tab/Setting_subscribe payment_tab'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Text/setting_subscribe_title'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Text/setting_coupon_title'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Text/setting_gradearea_free'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_setting_free_upgrade'), FailureHandling.CONTINUE_ON_FAILURE)

'요금제 title'
WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Text/plantable_title_txt'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_plantable_back'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Profile_icon'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_Logout'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Landing/Landing_Appbar_Login'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/HD_Landing/Login_input__email'), 'hcnewbiz+stgat1@gmail.com', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setEncryptedText(findTestObject('Object Repository/HD_Landing/Login_input__password'), 'IiiKlAiWmeOR474j7JBH5w==', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Landing/button_Login'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Profile_icon'), FailureHandling.CONTINUE_ON_FAILURE)

'등급 아이콘'
WebUI.verifyElementText(findTestObject('Object Repository/HD_Luncher/Text/account_grade'), '개인용', FailureHandling.CONTINUE_ON_FAILURE)

'닉네임 영역'
WebUI.verifyElementText(findTestObject('Object Repository/HD_Luncher/Text/accuont_nickname_txt'), '자동화테스트 STG 1번', FailureHandling.CONTINUE_ON_FAILURE)

'이메일 영역'
WebUI.verifyElementText(findTestObject('Object Repository/HD_Luncher/Text/account_email_txt'), 'hcnewbiz+stgat1@gmail.com', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Button/button_accountmanage'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Button/button_subscrib_payment_accountmenu'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Button/button_setting_accountmenu'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Button/button_download_Ho_accountmenu'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Button/button_help_accountmenu'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Button/button_conteatus_accountmenu'), FailureHandling.CONTINUE_ON_FAILURE)

'구독 및 결제 활동'
WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_subscrib_payment_accountmenu'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Text/subscribeinfo_txt'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/HD_Luncher/Text/subscribeinfo_grade_area'), '개인용', FailureHandling.CONTINUE_ON_FAILURE)

'구독정보 뒤로가기 버튼'
WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_back_setting'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/HD_Luncher/Text/setting_subscribe_grade_area'), '개인용 서비스 이용 중', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Text/setting_subscribe_grade_area'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Text/subscribeinfo_txt'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/HD_Luncher/Text/subscribeinfo_grade_area'), '개인용', FailureHandling.CONTINUE_ON_FAILURE)

'구독정보 뒤로가기 버튼'
WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_back_setting'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_paymenthistory'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Text/paymenthistory_txt'), FailureHandling.CONTINUE_ON_FAILURE)

'결제내역 뒤로가기'
WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_back_setting'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_subscribehistory'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Text/subscribehistory_txt'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Text/subscribehistory_update to admin_txt'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Text/subscribehistory_joinus_txt'), FailureHandling.CONTINUE_ON_FAILURE)

'구독 변경 기록 뒤로가기'
WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_back_setting'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Profile_icon'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_Logout'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Landing/Landing_Appbar_Login'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/HD_Landing/Login_input__email'), 'hcnewbiz+stgat3@gmail.com', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setEncryptedText(findTestObject('Object Repository/HD_Landing/Login_input__password'), 'IiiKlAiWmeOR474j7JBH5w==', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Landing/button_Login'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Profile_icon'), FailureHandling.CONTINUE_ON_FAILURE)

'등급 아이콘'
WebUI.verifyElementText(findTestObject('Object Repository/HD_Luncher/Text/account_grade'), '기업용', FailureHandling.CONTINUE_ON_FAILURE)

'닉네임 영역'
WebUI.verifyElementText(findTestObject('Object Repository/HD_Luncher/Text/accuont_nickname_txt'), '자동화테스트 STG 3번', FailureHandling.CONTINUE_ON_FAILURE)

'이메일 영역'
WebUI.verifyElementText(findTestObject('Object Repository/HD_Luncher/Text/account_email_txt'), 'hcnewbiz+stgat3@gmail.com', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Button/button_accountmanage'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Button/button_subscrib_payment_accountmenu'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Button/button_setting_accountmenu'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Button/button_manage organization'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Button/button_download_Ho_accountmenu'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Button/button_help_accountmenu'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Button/button_conteatus_accountmenu'), FailureHandling.CONTINUE_ON_FAILURE)

'설정'
WebUI.click(findTestObject('HD_Luncher/Button/button_setting_accountmenu'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/HD_Luncher/Text/connectdevice_name_area'), 'DESKTOP-PTKT1R2', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Profile_icon'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_manage organization'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Text/manage organiztion_member_txt'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl('https://www.stg.hancomdocs.com/home', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Profile_icon'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_Logout'), FailureHandling.CONTINUE_ON_FAILURE)

