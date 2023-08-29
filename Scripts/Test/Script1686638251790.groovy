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

WebUI.navigateToUrl('https://www.hancomdocs.com/ko/')

WebUI.click(findTestObject('Object Repository/Page_/span_'))

WebUI.setText(findTestObject('Object Repository/Page_/input__email'), 'hcnewbiz+prdat2@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input__password'), 'IiiKlAiWmeOR474j7JBH5w==')

WebUI.sendKeys(findTestObject('Object Repository/Page_/input__password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('HD_Luncher/Menu/LNB_Menu/Menu_Storage'))

WebUI.click(findTestObject('Object Repository/HD_Luncher/File_Folder Open/Storage/Open_mp3_Account2'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HD_Luncher/Button/button_back_viewer'), FailureHandling.CONTINUE_ON_FAILURE)

'audio객체를 verify element present 일반함수로 사용 불가해서 script작성'
TestObject to = new TestObject()

'audio객체를 verify element present 일반함수로 사용 불가해서 script작성'
to.addProperty('xpath', ConditionType.EQUALS, '/html/body/div[4]/div[3]/div/div[1]/div/audio')

// 웹 요소의 존재 여부 확인
'audio객체를 verify element present 일반함수로 사용 불가해서 script작성'
boolean isElementPresent = WebUI.verifyElementPresent(to, 10, FailureHandling.CONTINUE_ON_FAILURE)

