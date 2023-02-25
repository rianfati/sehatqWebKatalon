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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import groovy.json.JsonSlurper as JsonSlurper
import com.kms.katalon.core.testobject.impl.HttpTextBodyContent as HttpTextBodyContent
import com.kms.katalon.core.testobject.RequestObject as RequestObject
import org.openqa.selenium.Keys as Keys
import org.apache.commons.lang.RandomStringUtils

WebUI.openBrowser('')

WebUI.navigateToUrl('https://account.sehatq.com/login')

WebUI.maximizeWindow()
WebUI.setText(findTestObject('Object Repository/sehatq/regEmail'), 'rianfatigmailcom')
WebUI.setText(findTestObject('Object Repository/sehatq/regPassword'), 'E3yhanhi')
WebUI.click(findTestObject('Object Repository/sehatq/submitLoginButton'))
WebUI.verifyElementPresent(findTestObject('Object Repository/sehatq/alertLoginEmailInvalidFormat'), 5)



//WebUI.closeBrowser()

