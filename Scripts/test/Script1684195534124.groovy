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
import java.nio.file.Files as Files
import java.nio.file.Path as Path
import java.nio.file.Paths as Paths

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.hancomdocs.com')

WebUI.click(findTestObject('HD_Landing/button_download_dropdown'))

WebUI.click(findTestObject('HD_Landing/button_download_machan'))

WebUI.click(findTestObject('HD_Landing/button_download_dropdown'))

WebUI.click(findTestObject('HD_Landing/button_download_PDF'))

WebUI.setText(findTestObject('HD_Landing/Login_input__email'), 'hcnewbiz+prdat1@gmail.com')

WebUI.setEncryptedText(findTestObject('HD_Landing/Login_input__password'), 'IiiKlAiWmeOR474j7JBH5w==')

WebUI.click(findTestObject('HD_Landing/button_Login'))

WebUI.delay(60)

List<String> fileNames = ['HancomPDFplus_Setup.msi', 'HwpMac_HancomDocs.pkg']

String folderPath = 'C:\\Users\\hancom\\Downloads'

for (String fileName : fileNames) {
    Path filePath = Paths.get(folderPath, fileName)

    if (!(Files.exists(filePath))) {
        throw new RuntimeException("파일 $fileName이(가) 존재하지 않습니다. 경로: $filePath")
    }
}

for (String fileName : fileNames) {
    Path filePath = Paths.get(folderPath, fileName)

    if (Files.exists(filePath)) {
        Files.delete(filePath)

        println("파일 '$fileName'이(가) 성공적으로 삭제되었습니다.")
    } else {
        println("파일 '$fileName'이(가) 이미 존재하지 않습니다.")
    }
}

