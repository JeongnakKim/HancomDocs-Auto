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

WebUI.click(findTestObject('HD_Luncher/Menu/LNB_Menu/Menu_Home'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.rightClick(findTestObject('HD_Luncher/BodyTable/Home/Body_Home_Recent_12'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_web open'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_favorite add'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_rename'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_delete'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/BodyTable/Home/context_home_1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_web open'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_desktop open'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_share'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_download'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_favorite add'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_rename'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_delete'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_version manage'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_web open'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/HD_Luncher/Text/WebOffice_title_Compare_text'), 'xlsx파일 테스트.xlsx - 한셀', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/BodyTable/Home/context_home_1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_share'), FailureHandling.CONTINUE_ON_FAILURE)

'공유탭 링크 보내기 헤더 텍스트'
WebUI.verifyElementText(findTestObject('Object Repository/HD_Luncher/Text/Title_Sharepopup_Link'), '링크 보내기', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_close_share'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/BodyTable/Home/context_home_1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_favorite add'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/BodyTable/Home/context_home_1'), FailureHandling.CONTINUE_ON_FAILURE)

'즐겨찾게 해제 '
WebUI.click(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_favorite clear'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/BodyTable/Home/context_home_1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_rename'))

'이름바꾸기 팝업 타이틀 '
WebUI.verifyElementText(findTestObject('Object Repository/HD_Luncher/Text/Title_Rename_Dialog'), '이름 바꾸기', FailureHandling.CONTINUE_ON_FAILURE)

'이름바꾸기 팝업 취소 버튼'
WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_renamedialog_cancle'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/BodyTable/Home/context_home_1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_delete'), FailureHandling.CONTINUE_ON_FAILURE)

'스낵바 실행취소 버튼'
WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_snackbar_runcancle'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/BodyTable/Home/context_home_1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_version manage'))

'버전관리 화면 타이틀'
WebUI.verifyElementText(findTestObject('Object Repository/HD_Luncher/Text/Title_version_manage'), '버전 관리', FailureHandling.CONTINUE_ON_FAILURE)

'버전관리 화면 뒤로가기 버튼'
WebUI.click(findTestObject('HD_Luncher/Button/button_back_versionmanage'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/HD_Luncher/BodyTable/Home/context_home_17'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_web open'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_desktop open'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_share'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_download'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_favorite add'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_rename'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_share clear'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Menu/LNB_Menu/Menu_Storage'), FailureHandling.CONTINUE_ON_FAILURE)

'폴더'
WebUI.click(findTestObject('Object Repository/HD_Luncher/BodyTable/Storage/context_storage_1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_share'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_download'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_favorite add'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_rename'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_move'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_copy'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_delete'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_detailinfo'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/File_Folder Open/Storage/Open_Folder_FomatFolder'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'웹오피스(hwp)'
WebUI.click(findTestObject('Object Repository/HD_Luncher/BodyTable/Storage/context_storage_2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_web open'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_desktop open'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_share'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_download'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_favorite add'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_rename'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_move'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_copy'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_delete'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_detailinfo'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_version manage'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'한폼 (라이트 클릭)'
WebUI.rightClick(findTestObject('Object Repository/HD_Luncher/BodyTable/Storage/Body_Storage_All_3'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_web open'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_favorite add'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_rename'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_move'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_copy'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_delete'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_detailinfo'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'뷰어파일(jpg)'
WebUI.click(findTestObject('Object Repository/HD_Luncher/BodyTable/Storage/context_storage_9'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_viewer'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_share'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_download'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_favorite add'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_rename'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_move'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_copy'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_delete'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_detailinfo'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

'기타파일(txt)'
WebUI.rightClick(findTestObject('HD_Luncher/BodyTable/Storage/Body_Storage_All_18'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_share'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_download'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_favorite add'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_rename'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_move'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_copy'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_delete'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_detailinfo'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('HD_Luncher/Text/Title_Storage'), 2000)

WebUI.click(findTestObject('HD_Luncher/Menu/LNB_Menu/Menu_Home'))

WebUI.click(findTestObject('HD_Luncher/Menu/LNB_Menu/Menu_Storage'))

WebUI.click(findTestObject('HD_Luncher/File_Folder Open/Storage/Open_Folder_FomatFolder'))

WebUI.click(findTestObject('Object Repository/HD_Luncher/Checkbox/Storage_Checkbox_1'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Checkbox/Storage_Checkbox_2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.rightClick(findTestObject('Object Repository/HD_Luncher/BodyTable/Storage/Body_Storage_All_2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_download'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_move'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_copy'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_delete'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Menu/LNB_Menu/Menu_Storage'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/File_Folder Open/Storage/Open_Folder_FomatFolder'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/BodyTable/Storage/context_storage_2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HD_Luncher/Menu/Contextmenu/contextmenu_web open'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('HD_Luncher/Text/WebOffice_title_Compare_text'), 'hwp파일 테스트.hwp - 한글', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeWindowIndex(1, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowIndex(0, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/BodyTable/Storage/context_storage_2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HD_Luncher/Menu/Contextmenu/contextmenu_share'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('HD_Luncher/Text/Title_Sharepopup_Link'), '링크 보내기', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HD_Luncher/Button/button_close_share'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/BodyTable/Storage/context_storage_2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HD_Luncher/Menu/Contextmenu/contextmenu_favorite add'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/BodyTable/Storage/context_storage_2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HD_Luncher/Menu/Contextmenu/contextmenu_favorite clear'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/BodyTable/Storage/context_storage_2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_detailinfo'), FailureHandling.CONTINUE_ON_FAILURE)

'세부정보 타이틀 영역'
WebUI.verifyElementText(findTestObject('Object Repository/HD_Luncher/Text/Title_detailinfo'), '세부 정보', FailureHandling.CONTINUE_ON_FAILURE)

'세부정보 닫기 버튼'
WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_close_detailinfo'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/BodyTable/Storage/context_storage_2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HD_Luncher/Menu/Contextmenu/contextmenu_version manage'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('HD_Luncher/Text/Title_version_manage'), '버전 관리', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HD_Luncher/Button/button_back_versionmanage'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HD_Luncher/BodyTable/Storage/context_storage_9'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HD_Luncher/Menu/Contextmenu/contextmenu_viewer'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('HD_Luncher/Check_Object/viewer_image_check'))

WebUI.click(findTestObject('HD_Luncher/Button/button_back_viewer'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HD_Luncher/Menu/LNB_Menu/Menu_Home'), FailureHandling.CONTINUE_ON_FAILURE)

