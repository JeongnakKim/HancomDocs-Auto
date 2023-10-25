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

import java.net.HttpURLConnection
import java.net.URL

def webhookUrl = "https://hooks.slack.com/services/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"
def message = "한컴독스 Summary 테스트 결과"

try {
	URL url = new URL(webhookUrl)
	HttpURLConnection connection = (HttpURLConnection) url.openConnection()
	connection.setDoOutput(true)
	connection.setRequestMethod("POST")
	connection.setRequestProperty("Content-Type", "application/json")

	def jsonMessage = "{\"text\":\"" + message + "\"}"

	connection.withStream { os ->
		os.write(jsonMessage.getBytes("utf-8"))
	}

	int responseCode = connection.getResponseCode()
	println("Slack response code: " + responseCode)

	connection.disconnect()
} catch (Exception e) {
	e.printStackTrace()
}
