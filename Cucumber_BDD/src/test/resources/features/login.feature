Feature: check user able to login with valid credentials
Scenario Outline: successful login
Given login page open in browser
When click on username button and enter valid username
And adding the user password
And click on signin button
Then login successful and open home page and close