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

WebUI.callTestCase(findTestCase('CALL TC/Add a product'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('CartFullPage/button_Proceed to checkout'))

WebUI.setText(findTestObject('Checkout/BillingDetails/input__billing_first_name'), GlobalVariable.firstName)

WebUI.setText(findTestObject('Checkout/BillingDetails/input__billing_last_name'), GlobalVariable.lastName)

WebUI.setText(findTestObject('Checkout/BillingDetails/input__billing_email'), GlobalVariable.email)

WebUI.setText(findTestObject('Checkout/BillingDetails/input__billing_address_1'), GlobalVariable.streetAddress1)

WebUI.setText(findTestObject('Checkout/BillingDetails/input__billing_city'), GlobalVariable.townCity)

WebUI.setText(findTestObject('Checkout/BillingDetails/input__billing_phone'), GlobalVariable.phoneNumber)

WebUI.setText(findTestObject('Checkout/BillingDetails/input__billing_postcode'), GlobalVariable.postCode)

WebUI.scrollToElement(findTestObject('Checkout/Payment/text_subtotal'), 0)

WebUI.waitForElementClickable(findTestObject('Checkout/Payment/input_radio_BCAVA'), 15)

WebUI.click(findTestObject('Checkout/Payment/input_radio_BCAVA'))

WebUI.scrollToElement(findTestObject('Checkout/Payment/input_radio_QRIS'), 0)

WebUI.waitForElementClickable(findTestObject('Checkout/Payment/button_Place order'), 15)

WebUI.click(findTestObject('Checkout/Payment/button_Place order'))

WebUI.verifyElementPresent(findTestObject('Xendit/text_IDLC'), 15)

WebUI.closeBrowser()

