Feature: Login
  Scenario: Login with valid credentials
    Given that i am on the facebook login page
    When user enter his email
    And user enter his password
    Then user is redirected to Facebook home page