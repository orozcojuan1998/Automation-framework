Feature: Login
  Scenario: Login with valid credentials
    Given User is in Facebook's main page
    When The user enters their email and password
    And clicks the Login button
    Then the user is redirected to Facebook's home page