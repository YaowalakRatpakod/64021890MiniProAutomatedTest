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

WebUI.navigateToUrl('http://localhost:3000/')

WebUI.setText(findTestObject('Object Repository/Page_Complain_details/textarea_'), 'ต')

WebUI.setText(findTestObject('Object Repository/Page_Complain_details/textarea__1'), 'ตู')

WebUI.setText(findTestObject('Object Repository/Page_Complain_details/textarea__1_2'), 'ตู้')

WebUI.setText(findTestObject('Object Repository/Page_Complain_details/textarea__1_2_3'), 'ตู้เ')

WebUI.setText(findTestObject('Object Repository/Page_Complain_details/textarea__1_2_3_4'), 'ตู้เส')

WebUI.setText(findTestObject('Object Repository/Page_Complain_details/textarea__1_2_3_4_5'), 'ตู้เสื')

WebUI.setText(findTestObject('Object Repository/Page_Complain_details/textarea__1_2_3_4_5_6'), 'ตู้เสื้')

WebUI.setText(findTestObject('Object Repository/Page_Complain_details/textarea__1_2_3_4_5_6_7'), 'ตู้เสื้อ')

WebUI.setText(findTestObject('Object Repository/Page_Complain_details/textarea__1_2_3_4_5_6_7_8'), 'ตู้เสื้อผ')

WebUI.setText(findTestObject('Object Repository/Page_Complain_details/textarea__1_2_3_4_5_6_7_8_9'), 'ตู้เสื้อผ้')

WebUI.setText(findTestObject('Object Repository/Page_Complain_details/textarea__1_2_3_4_5_6_7_8_9_10'), 'ตู้เสื้อผ้า')

WebUI.setText(findTestObject('Object Repository/Page_Complain_details/textarea__1_2_3_4_5_6_7_8_9_10_11'), 'ตู้เสื้อผ้าช')

WebUI.setText(findTestObject('Object Repository/Page_Complain_details/textarea__1_2_3_4_5_6_7_8_9_10_11_12'), 'ตู้เสื้อผ้าชำ')

WebUI.setText(findTestObject('Object Repository/Page_Complain_details/textarea__1_2_3_4_5_6_7_8_9_10_11_12_13'), 'ตู้เสื้อผ้าชำร')

WebUI.setText(findTestObject('Object Repository/Page_Complain_details/textarea__1_2_3_4_5_6_7_8_9_10_11_12_13_14'), 'ตู้เสื้อผ้าชำรุ')

WebUI.setText(findTestObject('Object Repository/Page_Complain_details/textarea__1_2_3_4_5_6_7_8_9_10_11_12_13_14_15'), 'ตู้เสื้อผ้าชำรุด')

WebUI.click(findTestObject('Object Repository/Page_Complain_details/button_'))

WebUI.closeBrowser()

