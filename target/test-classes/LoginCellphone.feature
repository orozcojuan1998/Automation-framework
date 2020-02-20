Feature: Login
  Scenario As an user I want to be able to log in on Facebook App

    Given User is on Facebook app
    When enters his valid email and password
    And tap on the login button
    Then the user is redirected to Facebook's app home


