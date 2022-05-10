Feature: Booking a hotel in adactin application

Scenario Outline: login page

Given user Is Launch The Application
When user Enter The "<username>" In Username Field
And user Enter The "<password>" In Password Field
Then user Is Click On The Login Button

Examples:
|username|password|
|srinivas009|4748933|


Scenario: Search Hotel

When user Is Select The Location From Dropdown
And user Is select The Hotel
And user Is Select The Roomtype
And user Is Select The Number Of Rooms
And user Is Enter The Check In Date
And user Is Enter The Checkout Date
And user Enter The Number of adults per room
And user Is Enter The Number Of Child Per Room  
Then user Is Click On Search Button And it Navigates to The Select Hotel Page

Scenario: Select Hotel
Then user Is click The Radiobutton
Then user Is Click The Continue Button And It Navigates To The Book A Hotel Page

Scenario: Book a Hotel 
And user Is Enter The Firstname In Firstname Field
And user Is Enter The Lastname In Lastname Field
And use Is Enter The Address In Address Field
And user Enter The Creditcard Number In Creditcard Number Field
And user Is Eenter The Cvv Number On Cvv Field 
Then user Is Click On The Book Now Button 
