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

String charset = (('A'..'Z') + ('0'..'9')).join()
Integer length = 9
String randomString = RandomStringUtils.random(length, charset.toCharArray())
System.out.println(randomString)

String charset2 = (('0'..'9')).join()
Integer length2 = 6
String randomNumber = RandomStringUtils.random(length2, charset2.toCharArray())
System.out.println(randomNumber)

String email = randomString + '@mail.com'
String phone = '0812' + randomNumber



WebUI.openBrowser('')

WebUI.navigateToUrl('https://account.sehatq.com/daftar/email')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/sehatq/regName'), 'Budi')
WebUI.setText(findTestObject('Object Repository/sehatq/regEmail'), 'budi123mailcom')
WebUI.setText(findTestObject('Object Repository/sehatq/regPassword'), 'Qwerty123!')
//if (WebUI.verifyElementPresent(findTestObject('Object Repository/sehatq/regTncMandatoryMessage'), 2, FailureHandling.OPTIONAL)){
//	WebUI.click(findTestObject('Object Repository/sehatq/regTncCheckBox'))
//}
WebUI.verifyElementPresent(findTestObject('Object Repository/sehatq/regTncCheckBox'),3)
WebUI.click(findTestObject('Object Repository/sehatq/regTncCheckBox'))
WebUI.verifyElementPresent(findTestObject('Object Repository/sehatq/regTncLink'), 0)
WebUI.verifyElementPresent(findTestObject('Object Repository/sehatq/regTncPrivacyPolicyLink'), 0)
WebUI.verifyElementPresent(findTestObject('Object Repository/sehatq/registerButton'),2)
WebUI.click(findTestObject('Object Repository/sehatq/registerButton'))
WebUI.verifyElementPresent(findTestObject('Object Repository/sehatq/alertEmailInvalidFormat'), 0)



//WebUI.closeBrowser()

