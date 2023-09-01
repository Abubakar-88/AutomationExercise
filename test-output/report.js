$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/ShoppingAndCheckout.feature");
formatter.feature({
  "name": "Online Shopping and Checkout",
  "description": "As a Customer \nI want to buy a product\nSo that I can experience a succesful checkout process",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Customer purches a product and completes checkout succesfully",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am on the homepage",
  "keyword": "Given "
});
formatter.step({
  "name": "Verify that homepage is visible",
  "keyword": "When "
});
formatter.step({
  "name": "I add products to the cart",
  "keyword": "When "
});
formatter.step({
  "name": "I click the Cart button",
  "keyword": "And "
});
formatter.step({
  "name": "Verify Cart Page is Displayed",
  "keyword": "And "
});
formatter.step({
  "name": "I click Proceed To Checkout",
  "keyword": "And "
});
formatter.step({
  "name": "I am Taking data from excel \"\u003cSheetName\u003e\" and \u003cRowNumber\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "I click Register / Login button",
  "keyword": "And "
});
formatter.step({
  "name": "I enter name",
  "keyword": "Then "
});
formatter.step({
  "name": "I enter email",
  "keyword": "And "
});
formatter.step({
  "name": "I click signup button",
  "keyword": "And "
});
formatter.step({
  "name": "I click Title of name",
  "keyword": "And "
});
formatter.step({
  "name": "I fill password",
  "keyword": "And "
});
formatter.step({
  "name": "I select date of birth",
  "keyword": "And "
});
formatter.step({
  "name": "I fill first name",
  "keyword": "And "
});
formatter.step({
  "name": "I fill last name",
  "keyword": "And "
});
formatter.step({
  "name": "I fill company name",
  "keyword": "And "
});
formatter.step({
  "name": "I fill address1",
  "keyword": "And "
});
formatter.step({
  "name": "I fill address2",
  "keyword": "And "
});
formatter.step({
  "name": "I select country name",
  "keyword": "And "
});
formatter.step({
  "name": "I fill state name",
  "keyword": "And "
});
formatter.step({
  "name": "I fill city name",
  "keyword": "And "
});
formatter.step({
  "name": "I fill zipcode",
  "keyword": "And "
});
formatter.step({
  "name": "I fill mobile number",
  "keyword": "And "
});
formatter.step({
  "name": "I click create account button",
  "keyword": "Then "
});
formatter.step({
  "name": "I verify ACCOUNT CREATED! message",
  "keyword": "Then "
});
formatter.step({
  "name": "I click the continue button",
  "keyword": "Then "
});
formatter.step({
  "name": "the username is displayed as \"Logged in as David\"",
  "keyword": "Then "
});
formatter.step({
  "name": "I click the cart menu",
  "keyword": "Then "
});
formatter.step({
  "name": "I click Proceed to Checkout of cart page",
  "keyword": "Then "
});
formatter.step({
  "name": "the delivery address is displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "the cart information is displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "I enter description \"Thank you for the great service!\" in comment text area and click Place Order",
  "keyword": "Then "
});
formatter.step({
  "name": "I enter Name on Card",
  "keyword": "Then "
});
formatter.step({
  "name": "I enter card number",
  "keyword": "Then "
});
formatter.step({
  "name": "I enter CVC number",
  "keyword": "Then "
});
formatter.step({
  "name": "I enter expiration \"12\" and \"25\"",
  "keyword": "Then "
});
formatter.step({
  "name": "I click pay and confirm order",
  "keyword": "Then "
});
formatter.step({
  "name": "Verify order confirmation",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "SheetName",
        "RowNumber"
      ]
    },
    {
      "cells": [
        "automation",
        "0"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Customer purches a product and completes checkout succesfully",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on the homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.Shopping_and_checkout.i_am_on_the_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that homepage is visible",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Shopping_and_checkout.verify_that_homepage_is_visible()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add products to the cart",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Shopping_and_checkout.i_add_products_to_the_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the Cart button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Shopping_and_checkout.i_click_the_Cart_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify Cart Page is Displayed",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Shopping_and_checkout.verify_Cart_Page_is_Displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Proceed To Checkout",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Shopping_and_checkout.i_click_Proceed_To_Checkout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am Taking data from excel \"automation\" and 0",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Shopping_and_checkout.i_am_Taking_data_from_excel_and(java.lang.String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Register / Login button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Shopping_and_checkout.i_click_Register_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter name",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Shopping_and_checkout.i_enter_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter email",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Shopping_and_checkout.i_enter_email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click signup button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Shopping_and_checkout.i_click_signup_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Title of name",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Shopping_and_checkout.i_click_title_of_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill password",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Shopping_and_checkout.i_fills_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select date of birth",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Shopping_and_checkout.i_select_date_of_birth()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill first name",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Shopping_and_checkout.i_fills_first_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill last name",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Shopping_and_checkout.i_fills_last_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill company name",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Shopping_and_checkout.i_fills_company_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill address1",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Shopping_and_checkout.i_fills_address1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill address2",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Shopping_and_checkout.i_fills_address2()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select country name",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Shopping_and_checkout.i_select_country_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill state name",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Shopping_and_checkout.i_fills_state_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill city name",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Shopping_and_checkout.i_fills_city_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill zipcode",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Shopping_and_checkout.i_fills_zipcode()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill mobile number",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Shopping_and_checkout.i_fills_mobile_number()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click create account button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Shopping_and_checkout.i_click_create_account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify ACCOUNT CREATED! message",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Shopping_and_checkout.i_verify_ACCOUNT_CREATED_message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the continue button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Shopping_and_checkout.i_click_the_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the username is displayed as \"Logged in as David\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Shopping_and_checkout.usernameIsDisplayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the cart menu",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Shopping_and_checkout.I_click_the_cart_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Proceed to Checkout of cart page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Shopping_and_checkout.proceedToCheckoutPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the delivery address is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Shopping_and_checkout.verifyDeliveryAddress()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the cart information is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Shopping_and_checkout.verifyCartInfo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter description \"Thank you for the great service!\" in comment text area and click Place Order",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Shopping_and_checkout.enterDescriptionAndPlaceOrder(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter Name on Card",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Shopping_and_checkout.enterNameOnCard()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter card number",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Shopping_and_checkout.enterCardNumber()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter CVC number",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Shopping_and_checkout.enterCvcNumber()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter expiration \"12\" and \"25\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Shopping_and_checkout.enterExpiration(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click pay and confirm order",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Shopping_and_checkout.clickPayAndConfirmOrder()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify order confirmation",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Shopping_and_checkout.verifyOrderConfirmation()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#success_message\"}\n  (Session info: chrome\u003d116.0.5845.141)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-L2IPGEE\u0027, ip: \u0027192.168.1.104\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.11\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 116.0.5845.141, chrome: {chromedriverVersion: 116.0.5845.96 (1a3918166880..., userDataDir: C:\\Users\\siddi\\AppData\\Loca...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:53109}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 2c67be237c5ef29c8b54bb2009f2e680\n*** Element info: {Using\u003did, value\u003dsuccess_message}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy19.isDisplayed(Unknown Source)\r\n\tat pages.PaymentPage.isSuccessMessageDisplayed(PaymentPage.java:62)\r\n\tat stepDefinitions.Shopping_and_checkout.verifyOrderConfirmation(Shopping_and_checkout.java:368)\r\n\tat ✽.Verify order confirmation(file:///C:/Users/siddi/eclipse-workspace/MyWorkspace/AutomationExerciseKinetik/src/test/resources/features/ShoppingAndCheckout.feature:46)\r\n",
  "status": "failed"
});
formatter.write("this is my failure message");
formatter.embedding("image/png", "embedded0.png", "Customer purches a product and completes checkout succesfully");
formatter.after({
  "status": "passed"
});
});