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

WebUI.maximizeWindow()

WebUI.deleteAllCookies()

WebUI.navigateToUrl(GlobalVariable.Fetchr_Url)

WebUI.waitForElementPresent(findTestObject('HomePage/label_Covid-19-ResourcesUpdates'), 30)

WebUI.verifyElementVisible(findTestObject('HomePage/label_Covid-19-ResourcesUpdates'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('HomePage/link_TandC'), 30)

WebUI.click(findTestObject('HomePage/link_TandC'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('TandC/label_TermsandConditions'), 30)

WebUI.verifyElementVisible(findTestObject('TandC/label_TermsandConditions'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('TandC/img_FetchrLogoEn'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('TandC/icon_CallUs'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('TandC/link_ChangeLangAr'), FailureHandling.STOP_ON_FAILURE)

temp = WebUI.getUrl()

if (!(temp.equals('http://track.fetchr.us/terms'))) {
    assert false
}

WebUI.verifyElementAttributeValue(findTestObject('TandC/label_CallUs'), 'href', 'tel:+97148018100', 30)

WebUI.waitForElementClickable(findTestObject('TandC/link_ChangeLangAr'), 30, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('TandC/link_ChangeLangAr'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('TandC/link_ChangeLangEn'), 10, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('TandC/link_ChangeLangEn'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('TandC/img_FetchrLogoAr'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('TandC/link_ChangeLangEn'), 10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TandC/link_ChangeLangEn'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('TandC/link_ChangeLangAr'), 30, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('TandC/link_ChangeLangAr'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('TandC/img_FetchrLogoEn'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('TandC/img_FetchrLogoEn'), 30)

WebUI.click(findTestObject('TandC/img_FetchrLogoEn'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('HomePage/btn_Search'), 30)

temp = WebUI.getUrl()

if (!(temp.equals('http://track.fetchr.us'))) {
    assert false
}

