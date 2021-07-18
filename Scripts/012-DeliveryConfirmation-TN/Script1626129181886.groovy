import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.deleteAllCookies()

WebUI.navigateToUrl(GlobalVariable.Fetchr_Url)

WebUI.waitForElementPresent(findTestObject('HomePage/label_Covid-19-ResourcesUpdates'), 30)

WebUI.verifyElementVisible(findTestObject('HomePage/label_Covid-19-ResourcesUpdates'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('HomePage/link_EndCovid'), 30)

WebUI.click(findTestObject('HomePage/link_EndCovid'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('HomePage/textBox_Search'), GlobalVariable.TN4)

WebUI.waitForElementClickable(findTestObject('HomePage/btn_Search'), 30)

WebUI.click(findTestObject('HomePage/btn_Search'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Map/btn_ConfirmSchedule'), 30)

WebUI.verifyElementVisible(findTestObject('Map/btn_ConfirmSchedule'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Map/btn_CurrentLocation'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Map/btn_FullScreen'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Map/btn_Minus'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Map/btn_Plus'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Map/icon_CallUs'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Map/icon_Clear'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Map/img_FetchrLogoEn'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Map/label_CallUs'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Map/label_MovePin'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Map/link_ChangeLangAr'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Map/textBox_WhereToDeliver'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Map/textBox_WhereToDeliver'), GlobalVariable.Location)

WebUI.sendKeys(findTestObject('Map/textBox_WhereToDeliver'), Keys.chord(Keys.BACK_SPACE, Keys.DOWN, Keys.ENTER))

WebUI.verifyElementVisible(findTestObject('Map/label_Adress'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Map/label_Adress'), GlobalVariable.Location)

WebUI.waitForElementClickable(findTestObject('Map/btn_ConfirmSchedule'), 30)

WebUI.click(findTestObject('Map/btn_ConfirmSchedule'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Delivery Location/label_DeliveryLocation'), 30)

WebUI.verifyElementVisible(findTestObject('Delivery Location/label_DeliveryLocation'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Delivery Location/label_DeliveryLocationDesc'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Delivery Location/label_DeliveryLocationDesc'), '11 5th Street')

WebUI.verifyElementVisible(findTestObject('Delivery Location/label_HelpOurDrivers'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Delivery Location/textBox_driverCommentTxt'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Delivery Location/label_SelectDateTime'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Delivery Location/img_dateLeft'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Delivery Location/img_dateRight'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Delivery Location/label_Date'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Delivery Location/label_Time'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Delivery Location/btn_Back'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Delivery Location/btn_ConfirmDetails'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Delivery Location/btn_ConfirmDetails'), 30)

WebUI.click(findTestObject('Delivery Location/btn_ConfirmDetails'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Delivery Location/label_mshHeader'), 30)

WebUI.verifyElementVisible(findTestObject('Delivery Location/label_mshHeader'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Delivery Location/label_mshHeader'), 'Delivery Successfully Scheduled')

WebUI.verifyElementVisible(findTestObject('Delivery Location/label_TNNumber'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Delivery Location/label_TNNumber'), GlobalVariable.TN4)

WebUI.waitForElementClickable(findTestObject('Delivery Location/btn_BacktoHomepage'), 30)

WebUI.click(findTestObject('Delivery Location/btn_BacktoHomepage'), FailureHandling.STOP_ON_FAILURE)

