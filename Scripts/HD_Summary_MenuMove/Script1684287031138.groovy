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

WebUI.click(findTestObject('Object Repository/HD_Luncher/Menu/Tab/Home_Share_Tab'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/HD_Luncher/BodyTable/Home/Body_Home_Share_1'), 'hwpx 편집권한', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/HD_Luncher/BodyTable/Home/Body_Home_Share_2'), 'hwpx 보기권한', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/File_Folder Open/Home/Open_hwpx_edit_Account2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/HD_Luncher/Text/WebOffice_title_Compare_text'), 'hwpx 편집권한.hwpx - 한글', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/File_Folder Open/Home/Open_hwpx_view_Account2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/HD_Luncher/Text/WebOffice_title_Compare_text'), 'hwpx 보기권한.hwpx - 한글 (읽기 전용)', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Menu/Tab/Home_Favorite_Tab'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/HD_Luncher/BodyTable/Home/Body_Home_Favorite_1'), 'odp파일 테스트', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/HD_Luncher/BodyTable/Home/Body_Home_Favorite_2'), 'ods파일 테스트', FailureHandling.CONTINUE_ON_FAILURE)

'기존 저장된 파일이름 오픈 객체 불러옴'
WebUI.click(findTestObject('Object Repository/HD_Luncher/File_Folder Open/Home/Open_ods_Accout2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/HD_Luncher/Text/WebOffice_title_Compare_text'), 'ods파일 테스트.ods - 한셀', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Menu/LNB_Menu/Menu_9'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Text/LNB_makedocs_txt'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Text/LNB_makedocs_txt'))

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Text/LNB_makedos_dropdown_hwp_txt'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Text/LNB_makedocs_txt'))

'닫기'
WebUI.click(findTestObject('Object Repository/HD_Luncher/Menu/LNB_Menu/Menu_9_close'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Menu/LNB_Menu/Menu_Hangeul'), FailureHandling.CONTINUE_ON_FAILURE)

'한글템플릿 접기'
WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_app_template_close'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Button/Buotton_App_hangeul_new'))

'한글템플릿 펴기'
WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_app_tamplate_open'), FailureHandling.CONTINUE_ON_FAILURE)

'템플릿 사진 추가 필요\r\n'
WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Template/Template_hangeul_1'))

WebUI.click(findTestObject('Object Repository/HD_Luncher/File_Folder Open/Home/Open_hwp_Account2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/HD_Luncher/Text/WebOffice_title_Compare_text'), 'hwp파일 테스트.hwp - 한글', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Menu/Tab/Home_Share_Tab'), FailureHandling.CONTINUE_ON_FAILURE)

'공유 1번항목'
WebUI.verifyElementText(findTestObject('Object Repository/HD_Luncher/BodyTable/Home/Body_Home_Share_1'), 'hwpx 편집권한', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Menu/Tab/Home_Favorite_Tab'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Text/Nodata_favorite'))

WebUI.click(findTestObject('Object Repository/HD_Luncher/Menu/LNB_Menu/Menu_Hancell'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_app_template_close'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Button/Buotton_App_hancell_new'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_app_tamplate_open'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Template/Template_hancell_1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/File_Folder Open/Home/Open_xlsx_Account2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/HD_Luncher/Text/WebOffice_title_Compare_text'), 'xlsx파일 테스트.xlsx - 한셀', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Menu/Tab/Home_Share_Tab'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Text/Nodata_share'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Menu/Tab/Home_Favorite_Tab'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/HD_Luncher/BodyTable/Home/Body_Home_Favorite_1'), 'ods파일 테스트', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Menu/LNB_Menu/Menu_Hanshow'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_app_template_close'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Button/Buotton_App_hanshow_new'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_app_tamplate_open'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Template/Template_hanshow_1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/File_Folder Open/Home/Open_pptx_Account2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/HD_Luncher/Text/WebOffice_title_Compare_text'), 'pptx파일 테스트.pptx - 한쇼', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Menu/Tab/Home_Share_Tab'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Text/Nodata_share'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Menu/Tab/Home_Favorite_Tab'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/HD_Luncher/BodyTable/Home/Body_Home_Favorite_1'), 'odp파일 테스트', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Menu/LNB_Menu/Menu_Hanword'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_app_template_close'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Button/Buotton_App_hanword_new'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_app_tamplate_open'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Template/Template_hanword_1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/File_Folder Open/Home/Open_docx_Account2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/HD_Luncher/Text/WebOffice_title_Compare_text'), 'docx파일 테스트.docx - 한워드', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Menu/Tab/Home_Share_Tab'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Text/Nodata_share'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Menu/Tab/Home_Favorite_Tab'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Text/Nodata_favorite'))

WebUI.click(findTestObject('Object Repository/HD_Luncher/Menu/LNB_Menu/Menu_Hanform'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_app_template_close'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Button/Buotton_App_hanform_new'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_app_tamplate_open'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/File_Folder Open/Home/Open_hfrm_Account2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/HD_Luncher/Menu/Tab/hfrm_question_tab'), '질문', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Menu/Tab/Home_Favorite_Tab'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Text/Nodata_favorite'))

WebUI.click(findTestObject('HD_Luncher/Menu/LNB_Menu/Menu_Storage'))

WebUI.click(findTestObject('Object Repository/HD_Luncher/Menu/Tab/Home_Share_Tab'))

WebUI.click(findTestObject('HD_Luncher/File_Folder Open/Storage/Open_hwpx_edit_Account2'))

WebUI.switchToWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/HD_Luncher/Text/WebOffice_title_Compare_text'), 'hwpx 편집권한.hwpx - 한글', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HD_Luncher/File_Folder Open/Storage/Open_hwpx_view_Account2'))

WebUI.switchToWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/HD_Luncher/Text/WebOffice_title_Compare_text'), 'hwpx 보기권한.hwpx - 한글 (읽기 전용)', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HD_Luncher/BodyTable/Storage/context_storage_2'))

WebUI.verifyElementClickable(findTestObject('HD_Luncher/Menu/Contextmenu/contextmenu_web open'))

WebUI.verifyElementClickable(findTestObject('HD_Luncher/Menu/Contextmenu/contextmenu_desktop open'))

WebUI.verifyElementClickable(findTestObject('HD_Luncher/Menu/Contextmenu/contextmenu_share'))

WebUI.verifyElementClickable(findTestObject('HD_Luncher/Menu/Contextmenu/contextmenu_download'))

WebUI.verifyElementClickable(findTestObject('HD_Luncher/Menu/Contextmenu/contextmenu_favorite add'))

WebUI.verifyElementClickable(findTestObject('HD_Luncher/Menu/Contextmenu/contextmenu_rename'))

WebUI.verifyElementClickable(findTestObject('HD_Luncher/Menu/Contextmenu/contextmenu_copy'))

WebUI.verifyElementClickable(findTestObject('HD_Luncher/Menu/Contextmenu/contextmenu_share clear'))

WebUI.verifyElementClickable(findTestObject('HD_Luncher/Menu/Contextmenu/contextmenu_detailinfo'))

WebUI.click(findTestObject('HD_Luncher/BodyTable/Storage/context_storage_1'))

WebUI.verifyElementClickable(findTestObject('HD_Luncher/Menu/Contextmenu/contextmenu_share'))

WebUI.verifyElementClickable(findTestObject('HD_Luncher/Menu/Contextmenu/contextmenu_download'))

WebUI.verifyElementClickable(findTestObject('HD_Luncher/Menu/Contextmenu/contextmenu_favorite add'))

WebUI.verifyElementClickable(findTestObject('HD_Luncher/Menu/Contextmenu/contextmenu_rename'))

WebUI.verifyElementClickable(findTestObject('HD_Luncher/Menu/Contextmenu/contextmenu_copy'))

WebUI.verifyElementClickable(findTestObject('HD_Luncher/Menu/Contextmenu/contextmenu_share clear'))

WebUI.verifyElementClickable(findTestObject('HD_Luncher/Menu/Contextmenu/contextmenu_detailinfo'))

WebUI.click(findTestObject('HD_Luncher/File_Folder Open/Storage/Open_Folder_sharefolder'))

WebUI.click(findTestObject('HD_Luncher/BodyTable/Storage/context_storage_1'))

WebUI.verifyElementClickable(findTestObject('HD_Luncher/Menu/Contextmenu/contextmenu_viewer'))

WebUI.verifyElementClickable(findTestObject('HD_Luncher/Menu/Contextmenu/contextmenu_share'))

WebUI.verifyElementClickable(findTestObject('HD_Luncher/Menu/Contextmenu/contextmenu_download'))

WebUI.verifyElementClickable(findTestObject('HD_Luncher/Menu/Contextmenu/contextmenu_favorite add'))

WebUI.verifyElementClickable(findTestObject('HD_Luncher/Menu/Contextmenu/contextmenu_rename'))

WebUI.verifyElementClickable(findTestObject('HD_Luncher/Menu/Contextmenu/contextmenu_copy'))

WebUI.verifyElementClickable(findTestObject('HD_Luncher/Menu/Contextmenu/contextmenu_share clear'))

WebUI.verifyElementClickable(findTestObject('HD_Luncher/Menu/Contextmenu/contextmenu_detailinfo'))

WebUI.click(findTestObject('HD_Luncher/Checkbox/Storage_Checkbox_1'))

WebUI.click(findTestObject('HD_Luncher/Checkbox/Storage_Checkbox_2'))

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Button/button_tableheader_download'))

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Button/button_tableheader_copy'))

WebUI.click(findTestObject('HD_Luncher/Menu/LNB_Menu/Menu_Storage'))

WebUI.click(findTestObject('Object Repository/HD_Luncher/Menu/Tab/Home_Favorite_Tab'))

WebUI.verifyElementText(findTestObject('HD_Luncher/BodyTable/Storage/Body_Storage_All_1'), 'odp파일 테스트.odp')

WebUI.click(findTestObject('HD_Luncher/Menu/LNB_Menu/Menu_Storage'))

