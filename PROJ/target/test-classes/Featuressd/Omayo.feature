
Feature: login functionality of clarity application
Scenario Outline: User should be able to login with valid credentials 
Given when user enters the application URL
When user enters username credentials "<username>" and password "<password>" into the fields
And click on the login button  
Then  should be able to login with "<expected>" conditions

Examples:
|username|password|expected|
| channu| 1234xyz|Failure|
|siddu |2398asf|Failure|
|CADEPPA|WTM3yh!777|Success|