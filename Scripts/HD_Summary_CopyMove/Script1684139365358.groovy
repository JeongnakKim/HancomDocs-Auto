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

WebUI.click(findTestObject('Object Repository/HD_Luncher/Menu/LNB_Menu/Menu_Storage'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_NewCreate'), FailureHandling.CONTINUE_ON_FAILURE)

'폴더'
WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_NewCreate_Folder'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/HD_Luncher/InPutBox/input_foldername'), Keys.chord(Keys.BACK_SPACE), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/InPutBox/input_foldername'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/HD_Luncher/InPutBox/input_foldername'), '복사 테스트', FailureHandling.CONTINUE_ON_FAILURE)

'만들기'
WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_NewFolder_Make'), FailureHandling.CONTINUE_ON_FAILURE)

'체크박스1'
WebUI.click(findTestObject('Object Repository/HD_Luncher/Checkbox/Storage_Checkbox_2'), FailureHandling.CONTINUE_ON_FAILURE)

'체크박스2\r\n'
WebUI.click(findTestObject('Object Repository/HD_Luncher/Checkbox/Storage_Checkbox_3'), FailureHandling.CONTINUE_ON_FAILURE)

'컨텍스트메뉴'
WebUI.click(findTestObject('HD_Luncher/variable object/vo2'), FailureHandling.CONTINUE_ON_FAILURE)

'복사'
WebUI.click(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_copy'), FailureHandling.CONTINUE_ON_FAILURE)

'복사폴더 선택'
WebUI.click(findTestObject('HD_Luncher/variable object/vo1'), FailureHandling.CONTINUE_ON_FAILURE)

'여기로 복사 클릭'
WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_copy_herecopy'), FailureHandling.CONTINUE_ON_FAILURE)

'복사 테스트 폴더 진입'
WebUI.click(findTestObject('HD_Luncher/variable object/vo3'), FailureHandling.CONTINUE_ON_FAILURE)

'저장공간'
WebUI.click(findTestObject('HD_Luncher/Menu/LNB_Menu/Menu_Storage'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_NewCreate'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_NewCreate_Folder'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/HD_Luncher/InPutBox/input_foldername'), Keys.chord(Keys.BACK_SPACE), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/InPutBox/input_foldername'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/HD_Luncher/InPutBox/input_foldername'), '이동 테스트', FailureHandling.CONTINUE_ON_FAILURE)

'만들기'
WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_NewFolder_Make'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HD_Luncher/Checkbox/Storage_Checkbox_3'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HD_Luncher/Checkbox/Storage_Checkbox_4'), FailureHandling.CONTINUE_ON_FAILURE)

'컨텍스트메뉴'
WebUI.click(findTestObject('HD_Luncher/variable object/vo2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/HD_Luncher/Menu/Contextmenu/contextmenu_move'), FailureHandling.CONTINUE_ON_FAILURE)

'이동폴더 선택'
WebUI.click(findTestObject('Object Repository/HD_Luncher/variable object/vo5'), FailureHandling.CONTINUE_ON_FAILURE)

'여기로 이동 클릭'
WebUI.click(findTestObject('Object Repository/HD_Luncher/Button/button_move_heremove'), FailureHandling.CONTINUE_ON_FAILURE)

'이동 테스트 폴더 진입'
WebUI.click(findTestObject('Object Repository/HD_Luncher/variable object/vo6'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HD_Luncher/Menu/LNB_Menu/Menu_Storage'), FailureHandling.CONTINUE_ON_FAILURE)

