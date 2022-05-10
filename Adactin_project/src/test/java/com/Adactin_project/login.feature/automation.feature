Feature: Adactin cucumber project feature

Scenario Outline: login function
Given user is launching the application
When user is click on build 2
When user is enter "<username>" in username field
And user is enter "<password>" in password field
Then user is click on login button

Examples:
|username|password|
|kalpanavenkat|jarshitha| 

Scenario: hotel search

Given user is select location
When user is select hotel
And user is select room type
And user is select number of room
And user is select check in date
And user is select check out date 
And user is select the adult per room 
And user is select the child per room 
Then user is click on search

Scenario: select hotel
Given user is click the select button
Then user is click on continue button


Scenario: user is redirect to payment page

Given user is enter the enter the firstname
When user is enter the lastname
And user is enter the billing address
And user is enter the credit card number
And user is enter the credit card type
And user is select the exp month
And user is select the exp year
Then user is click on book now 


Scenario: takes screenshot
Given user is taking screenshot


