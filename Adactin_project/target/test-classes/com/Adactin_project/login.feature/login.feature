Feature: Adactin practice

Scenario: login to adactin
Given user is launching the application
When user is enter the username in username field
And  user is enter the password in password field
Then user is click on login button


Scenario: mail box

Given user redirect to "mailbox"
When the page title is 'mail box'


Scenario: payment
Given user is Redirect to "transaction page"