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
WebUI.setText(findTestObject('Object Repository/sehatq/regEmail'), 'rianfati@gmail.com')
WebUI.setText(findTestObject('Object Repository/sehatq/regPassword'), 'E3yhanhi')
WebUI.click(findTestObject('Object Repository/sehatq/submitLoginButton'))
WebUI.verifyElementPresent(findTestObject('Object Repository/sehatq/profileIcon'), 5)
WebUI.click(findTestObject('Object Repository/sehatq/profileIcon'))
WebUI.click(findTestObject('Object Repository/sehatq/profileMenu'))
WebUI.verifyElementPresent(findTestObject('Object Repository/sehatq/editProfileButton'), 5)
WebUI.click(findTestObject('Object Repository/sehatq/editProfileButton'))
WebUI.waitForElementPresent(findTestObject('Object Repository/sehatq/editProfileName'), 3)
Thread.sleep(3000)
WebUI.doubleClick(findTestObject('Object Repository/sehatq/editProfileName'))
WebUI.sendKeys(findTestObject('Object Repository/sehatq/editProfileName'), Keys.chord(Keys.DELETE))
WebUI.doubleClick(findTestObject('Object Repository/sehatq/editProfileName'))
WebUI.sendKeys(findTestObject('Object Repository/sehatq/editProfileName'), Keys.chord(Keys.DELETE))
WebUI.setText(findTestObject('Object Repository/sehatq/editProfileName'), 'Budi')
WebUI.doubleClick(findTestObject('Object Repository/sehatq/editProfileHeight'))
WebUI.sendKeys(findTestObject('Object Repository/sehatq/editProfileHeight'), Keys.chord(Keys.DELETE))
WebUI.setText(findTestObject('Object Repository/sehatq/editProfileHeight'), '170')
WebUI.doubleClick(findTestObject('Object Repository/sehatq/editProfileWeight'))
WebUI.sendKeys(findTestObject('Object Repository/sehatq/editProfileWeight'), Keys.chord(Keys.DELETE))
WebUI.setText(findTestObject('Object Repository/sehatq/editProfileWeight'), '68')
WebUI.doubleClick(findTestObject('Object Repository/sehatq/editProfileAddress'))
WebUI.sendKeys(findTestObject('Object Repository/sehatq/editProfileAddress'), Keys.chord(Keys.DELETE))
WebUI.setText(findTestObject('Object Repository/sehatq/editProfileAddress'), 'Jakarta')
WebUI.verifyElementPresent(findTestObject('Object Repository/sehatq/editProfileSimpanButton'), 5)
WebUI.click(findTestObject('Object Repository/sehatq/editProfileSimpanButton'))
assert WebUI.getText(findTestObject('Object Repository/sehatq/profileName')) == 'Budi'
assert WebUI.getText(findTestObject('Object Repository/sehatq/profileHeight')) == '170'
assert WebUI.getText(findTestObject('Object Repository/sehatq/profileWeight')) == '68'
//WebUI.closeBrowser()
