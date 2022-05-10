$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Users/DELL/eclipse-workspace/Adactin_project/src/test/java/com/Adactin_project/login.feature/automation.feature");
formatter.feature({
  "name": "Adactin cucumber project feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "login function",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is launching the application",
  "keyword": "Given "
});
formatter.step({
  "name": "user is click on build 2",
  "keyword": "When "
});
formatter.step({
  "name": "user is enter \"\u003cusername\u003e\" in username field",
  "keyword": "When "
});
formatter.step({
  "name": "user is enter \"\u003cpassword\u003e\" in password field",
  "keyword": "And "
});
formatter.step({
  "name": "user is click on login button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "kalpanavenkat",
        "jarshitha"
      ]
    }
  ]
});
formatter.scenario({
  "name": "login function",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is launching the application",
  "keyword": "Given "
});
formatter.match({
  "location": "Step_definition_automation.user_is_launching_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is click on build 2",
  "keyword": "When "
});
formatter.match({
  "location": "Step_definition_automation.user_is_click_on_build()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is enter \"kalpanavenkat\" in username field",
  "keyword": "When "
});
formatter.match({
  "location": "Step_definition_automation.user_is_enter_in_username_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is enter \"jarshitha\" in password field",
  "keyword": "And "
});
formatter.match({
  "location": "Step_definition_automation.user_is_enter_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is click on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_definition_automation.user_is_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "hotel search",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is select location",
  "keyword": "Given "
});
formatter.match({
  "location": "Step_definition_automation.user_is_select_location()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is select hotel",
  "keyword": "When "
});
formatter.match({
  "location": "Step_definition_automation.user_is_select_hotel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is select room type",
  "keyword": "And "
});
formatter.match({
  "location": "Step_definition_automation.user_is_select_room_type()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is select number of room",
  "keyword": "And "
});
formatter.match({
  "location": "Step_definition_automation.user_is_select_number_of_room()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is select check in date",
  "keyword": "And "
});
formatter.match({
  "location": "Step_definition_automation.user_is_select_check_in_date()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is select check out date",
  "keyword": "And "
});
formatter.match({
  "location": "Step_definition_automation.user_is_select_check_out_date()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is select the adult per room",
  "keyword": "And "
});
formatter.match({
  "location": "Step_definition_automation.user_is_select_the_adult_per_room()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is select the child per room",
  "keyword": "And "
});
formatter.match({
  "location": "Step_definition_automation.user_is_select_the_child_per_room()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is click on search",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_definition_automation.user_is_click_on_search()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "select hotel",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is click the select button",
  "keyword": "Given "
});
formatter.match({
  "location": "Step_definition_automation.user_is_click_the_select_button()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#radiobutton_0\"}\n  (Session info: chrome\u003d99.0.4844.82)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-9RRA1UP\u0027, ip: \u0027192.168.43.184\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_281\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 99.0.4844.82, chrome: {chromedriverVersion: 98.0.4758.102 (273bf7ac8c90..., userDataDir: C:\\Users\\DELL\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:63376}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: b437003ce76c32fe3e3160e44cbb4ad3\n*** Element info: {Using\u003did, value\u003dradiobutton_0}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.click(Unknown Source)\r\n\tat step.Step_definition_automation.user_is_click_the_select_button(Step_definition_automation.java:98)\r\n\tat ✽.user is click the select button(file:/C:/Users/DELL/eclipse-workspace/Adactin_project/src/test/java/com/Adactin_project/login.feature/automation.feature:27)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user is click on continue button",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_definition_automation.user_is_click_on_continue_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "user is redirect to payment page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is enter the enter the firstname",
  "keyword": "Given "
});
formatter.match({
  "location": "Step_definition_automation.user_is_enter_the_enter_the_firstname()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#first_name\"}\n  (Session info: chrome\u003d99.0.4844.82)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-9RRA1UP\u0027, ip: \u0027192.168.43.184\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_281\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 99.0.4844.82, chrome: {chromedriverVersion: 98.0.4758.102 (273bf7ac8c90..., userDataDir: C:\\Users\\DELL\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:63376}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: b437003ce76c32fe3e3160e44cbb4ad3\n*** Element info: {Using\u003did, value\u003dfirst_name}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.sendKeys(Unknown Source)\r\n\tat com.Adactin_project.Baseclass.inputText(Baseclass.java:25)\r\n\tat step.Step_definition_automation.user_is_enter_the_enter_the_firstname(Step_definition_automation.java:108)\r\n\tat ✽.user is enter the enter the firstname(file:/C:/Users/DELL/eclipse-workspace/Adactin_project/src/test/java/com/Adactin_project/login.feature/automation.feature:33)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user is enter the lastname",
  "keyword": "When "
});
formatter.match({
  "location": "Step_definition_automation.user_is_enter_the_lastname()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user is enter the billing address",
  "keyword": "And "
});
formatter.match({
  "location": "Step_definition_automation.user_is_enter_the_billing_address()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user is enter the credit card number",
  "keyword": "And "
});
formatter.match({
  "location": "Step_definition_automation.user_is_enter_the_credit_card_number()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user is enter the credit card type",
  "keyword": "And "
});
formatter.match({
  "location": "Step_definition_automation.user_is_enter_the_credit_card_type()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user is select the exp month",
  "keyword": "And "
});
formatter.match({
  "location": "Step_definition_automation.user_is_select_the_exp_month()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user is select the exp year",
  "keyword": "And "
});
formatter.match({
  "location": "Step_definition_automation.user_is_select_the_exp_year()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user is click on book now",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_definition_automation.user_is_click_on_book_now()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "takes screenshot",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is taking screenshot",
  "keyword": "Given "
});
formatter.match({
  "location": "Step_definition_automation.user_is_taking_screenshot()"
});
formatter.result({
  "status": "passed"
});
});