Feature: login to orange hml feature

Scenario Outline: login to orangehml website
Given user is launching the browser
When user is navigate to orange website
And user is enter the "<username>" in username field
And user is enter the "<password>" in password field
Then user is click the login button




Examples:

   |username|password|
   |ameri|jkh|
   |ameros|rtyuuy|
   |Admin|admin123|