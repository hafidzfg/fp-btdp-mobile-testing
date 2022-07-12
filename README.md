# Final Project Web Automation Test with Katalon
Web Automation Test as a submission for Hacktiv8's QA Automation with Katalon Final Project. <br>
This repository is (1/3) of a 3-part final project. <br>

Be sure to check out my other submissions: <br>
- [API Test Automation](https://github.com/hafidzfg/fp-btdp-api-testing) 
- [Mobile Demo Bank App Test Automation](https://github.com/hafidzfg/fp-btdp-web-test)

## Made by:

Name: **Hafidz Firmansyah Ghufara** <br>
ParticipantID: **KSAT006ONL008**

## Resources:
- [Mock Ecommerce Web](https://kotakoki.wijaysali.my.id/) **Proceed with caution!, don't put any of your real payment details there!**
- Tools: Katalon Studio/Groovy

## Documentation
For detailed documentation, please access the following test plan document: [Test Plan Web Automation Test](.\documentation\Web_Automation_Test_Plan.docx)

## Requirements
- Katalon Studio
- Java 1.8

## Concepts implemented
- Manual & script test case creation
- Web UI Testing
- Conditional (if-else) statement (TC 105, TC 303)
- String to integer parsing
- Data driven test (TC 303)
- Parallel test execution (TS Collection)

## Test Cases
Here are several functionalities that are tested
- User Credentials: Registration (1 test case), Login (4 test cases)
- Add to Cart: Adding and updating products to cart (3 test cases)
- Checkout: 3 individual test cases, 11 test cases when iterated (TC 303 has 9 iteration)

## Test Suites
- TS 01 Login <br>
Consists of all login related test cases
- TS 02 Add to cart <br>
Consists of all add to cart related test cases
- TS 03 Checkout <br>
Consists of all checkout related test cases

## Test Suites Collection
- TS Collection - All Test Suites
Consists of all test suites for ease of execution. <br>
Note that it is set to 2 parallel test case execution. Set it to 1 first if you are using a lower end machine.