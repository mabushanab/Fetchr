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

WebUI.waitForElementClickable(findTestObject('HomePage/link_EndCovid'), 30)

WebUI.click(findTestObject('HomePage/link_EndCovid'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('HomePage/textBox_Search'), GlobalVariable.TN1)

WebUI.waitForElementClickable(findTestObject('HomePage/btn_Search'), 30)

WebUI.click(findTestObject('HomePage/btn_Search'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('HomePage/label-CurrentStatusEn'), 30)

WebUI.verifyElementVisible(findTestObject('HomePage/label-CurrentStatusEn'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('HomePage/label-CurrentStatusDescEn'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('HomePage/label-CurrentStatusDescEn'), GlobalVariable.RECEIVEDCANCELLEDmsg)

