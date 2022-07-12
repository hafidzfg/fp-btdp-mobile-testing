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

WebUI.navigateToUrl('http://kotakoki.wijaysali.my.id/')

WebUI.click(findTestObject('Navigation Bar/span_Register Now'))

WebUI.verifyElementPresent(findTestObject('Register Page/text_h1_Register Now'), 0)

WebUI.setText(findTestObject('Register Page/input_text_Username'), 'lakeimtom3')

WebUI.setText(findTestObject('Register Page/input_text_Email'), 'lakeimtom+3@gmail.com')

WebUI.setText(findTestObject('Register Page/input_text_Phone Number'), '12345678901')

WebUI.setText(findTestObject('Register Page/input_text_Address'), 'Bangladesh')

'A valid password is minimum 8 digits and contains at least 1 small and capital letters, as well as a number or special characters'
WebUI.setText(findTestObject('Register Page/input_text_Password'), 'ThisIsASecret33')

WebUI.setText(findTestObject('Register Page/input_text_Confirm Password'), 'ThisIsASecret33')

WebUI.click(findTestObject('Register Page/button_Submit'))

WebUI.verifyElementPresent(findTestObject('My Account/text_AccountName'), 0)

WebUI.verifyElementText(findTestObject('My Account/text_AccountName'), 'lakeimtom3')

WebUI.closeBrowser()

