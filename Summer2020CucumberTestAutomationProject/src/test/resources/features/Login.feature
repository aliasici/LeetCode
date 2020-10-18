Feature: As user I want to able to login under different
  # this is a comment

Scenario: Login as a sales manager
  Given user is on the landing
  When user logs in
  Then user should see dashboard page
