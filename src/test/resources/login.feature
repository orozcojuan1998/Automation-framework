Feature: Login
  Scenario: Login with valid credentials
    Given that i am on the facebook login page
    When user enters his email and password
    And clicks the Log in button
    Then user is redirected to Facebook home page