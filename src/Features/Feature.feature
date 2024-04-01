Feature: Verify login scenarios

Background: 
Given I open Web URL as "https://www.saucedemo.com/v1/"

@Login
Scenario Outline: Verify login with invalid password
And I enter username as "<username>"
And I enter password as "<password>"
When I click on login button
Then I verify error message as "Epic sadface: Username and password do not match any user in this service"
And I close driver

Examples:
|username|password|
|standard_user|Test1|
|standard_user|Test2|


@Login
Scenario: Verify login with valid useraname and password
And I enter username as "standard_user"
And I enter password as "secret_sauce"
When I click on login button
Then I verify page title
And I close driver

