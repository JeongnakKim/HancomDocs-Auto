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

WebUI.click(findTestObject('HD_Luncher/Menu/LNB_Menu/Menu_Home'))

WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_filter'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_filter_hangeul'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_filter_Ok'), FailureHandling.CONTINUE_ON_FAILURE)

'5번 owpml파일 테스트 텍스트 비교 -> 5번 hwpx파일로 변경해봄'
WebUI.verifyElementText(findTestObject('Object Repository/HD_Luncher/BodyTable/Home/Body_Home_Recent_5'), 'hwpx파일 테스트', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_filter'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_filter_reset'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_filter_Ok'), FailureHandling.CONTINUE_ON_FAILURE)

'5번pptxl파일 테스트 텍스트 비교'
WebUI.verifyElementText(findTestObject('Object Repository/HD_Luncher/BodyTable/Home/Body_Home_Recent_5'), 'pptx파일 테스트', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HD_Luncher/Menu/LNB_Menu/Menu_Hangeul'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_filter'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_filter_mine'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_filter_Ok'), FailureHandling.CONTINUE_ON_FAILURE)

'1번 hwp파일 테스트 텍스트 비교'
WebUI.verifyElementText(findTestObject('Object Repository/HD_Luncher/BodyTable/Home/Body_Home_Recent_1'), 'hwp파일 테스트', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HD_Luncher/Menu/LNB_Menu/Menu_Storage'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/File_Folder Open/Storage/Open_Folder_FomatFolder'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_filter'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_filter_hangeul'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_filter_Ok'), FailureHandling.CONTINUE_ON_FAILURE)

'3번 hwpx 파일 테스트 텍스트 비교'
WebUI.verifyElementText(findTestObject('Object Repository/HD_Luncher/BodyTable/Storage/Body_Storage_All_3'), 'hwpx파일 테스트.hwpx', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_filter'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_filter_reset'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_filter_Ok'), FailureHandling.CONTINUE_ON_FAILURE)

'3번 hfrm 파일 테스트 텍스트 비교'
WebUI.verifyElementText(findTestObject('Object Repository/HD_Luncher/BodyTable/Storage/Body_Storage_All_3'), 'hfrm파일 테스트.hfrm', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HD_Luncher/Menu/LNB_Menu/Menu_Storage'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Checkbox/Storage_Checkbox_3'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Button/button_tableheader_download'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Button/button_tableheader_copy'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Button/button_tableheader_move'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Button/button_tableheader_delete'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HD_Luncher/Menu/LNB_Menu/Menu_Home'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/InPutBox/input_searchbox'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/HD_Luncher/InPutBox/input_searchbox'), Keys.chord(Keys.BACK_SPACE), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/InPutBox/input_searchbox'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/HD_Luncher/InPutBox/input_searchbox'), '한', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HD_Luncher/Button/Button_searchbox_ok'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Text/searchbox_under_txt'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HD_Luncher/Button/Button_searchbox_close'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/InPutBox/input_searchbox'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/HD_Luncher/InPutBox/input_searchbox'), Keys.chord(Keys.BACK_SPACE), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/InPutBox/input_searchbox'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/HD_Luncher/InPutBox/input_searchbox'), 'xl', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HD_Luncher/Button/Button_searchbox_ok'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Text/searchresult_txt_title'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/HD_Luncher/BodyTable/Home/body_seachresult_1'), 'xls파일 테스트.xls', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/HD_Luncher/BodyTable/Home/body_seachresult_2'), 'xlsx파일 테스트.xlsx', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/InPutBox/input_searchbox'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/HD_Luncher/InPutBox/input_searchbox'), Keys.chord(Keys.BACK_SPACE), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/InPutBox/input_searchbox'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/HD_Luncher/InPutBox/input_searchbox'), 'asdfg', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HD_Luncher/Button/Button_searchbox_ok'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/HD_Luncher/Text/Nodata_searchresult'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HD_Luncher/Menu/LNB_Menu/Menu_Home'), FailureHandling.CONTINUE_ON_FAILURE)

