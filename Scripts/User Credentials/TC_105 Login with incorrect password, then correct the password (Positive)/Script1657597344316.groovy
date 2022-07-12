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

WebUI.click(findTestObject('Navigation Bar/span_Login'))

WebUI.verifyElementPresent(findTestObject('Login page/text_h1_Login'), 0)

WebUI.setText(findTestObject('Login page/input_text_Username or E-mail'), GlobalVariable.username)

WebUI.setText(findTestObject('Login page/input_text_Password'), GlobalVariable.invalidPassword)

WebUI.click(findTestObject('Login page/button_Login'))

// if password is incorrect, correct the password, 
// else verify already logged in
if(WebUI.verifyElementPresent(findTestObject('Login page/text_alert_Password is incorrect. Please try again (top of username)'), 
    5)) {
	WebUI.verifyElementPresent(findTestObject('Login page/text_alert_Password is incorrect. Please try again'), 0)
	
	WebUI.click(findTestObject('Login page/close_alert_Password is incorrect (top of username)'))
	
	WebUI.setText(findTestObject('Login page/input_text_Username or E-mail'), GlobalVariable.username)
	
	WebUI.setText(findTestObject('Login page/input_text_Password'), GlobalVariable.password)
	
	WebUI.click(findTestObject('Login page/button_Login'))
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/Navigation Bar/span_My account'), 5)

} else {
	
	WebUI.verifyElementPresent(findTestObject('Object Repository/Navigation Bar/span_My account'), 5)
}





WebUI.closeBrowser()

