Feature: Application Login

Scenario: Home page default login

Given User is on facebook landing page
When User login into application with username and password
Then User clicks on login
And Cards are displayed 