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

WebUI.click(findTestObject('Homepage/Product/anchor_Product1_AlbumAdd to cart'))

WebUI.verifyElementText(findTestObject('Navigation Bar/CartMini/text_counter_Cart'), '1')

WebUI.click(findTestObject('Navigation Bar/CartMini/icon_Cart'))

WebUI.verifyElementText(findTestObject('CartFullPage/text_ProductName_item1'), 'Album')

WebUI.verifyElementAttributeValue(findTestObject('CartFullPage/input_text_qty_item1'), 'value', '1', 5)

String priceItem1 = WebUI.getText(findTestObject('CartFullPage/text_individualPrice_item1'))
 
// convert string to int
price1 = priceItem1.substring(2, priceItem1.size())

int price1 = Integer.parseInt(price1.replace('.', ''))

// get new subtotal string for item1
String subtotal1 = WebUI.getText(findTestObject('CartFullPage/text_subtotalPrice_item1'))

// convert subtotal item 1 to int
subtotalItem1 = subtotal1.substring(2, subtotal1.size())

int subtotalItem1 = Integer.parseInt(subtotalItem1.replace('.', ''))

// verify new subtotal is correct
WebUI.verifyEqual(subtotalItem1, price1)

