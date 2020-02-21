Feature: Login
  Scenario As an user I want to be able to log in on Facebook App with email

    Given User is in Facebook's main page
    When enters his valid email and password
    And clicks on the Login button
    Then the user is redirected to Facebook's home page

  Scenario As an user I want to be able to log in on Facebook with phone number

    Given User is in Facebook's main page
    When enters his valid phone number and password
    And clicks on the Login button
    Then the user is redirected to Facebook's home page

  Scenario: As an user I cannot login with a valid email and invalid password

    Given User is in Facebook's main page
    When The user enters his valid email and invalid password
    And clicks on the Login button
    Then the user receives a message "Please use a valid email"

  Scenario: As an user I can not log in if the email and password fields are blank
    And clicks on the Login button

    Given User is in Facebook's main page
    When The user leaves the fields in blank
    And clicks on the Login button
    Then the user receives a message "Please fill the required fields"

  Scenario: As an user I can use forgot your password functionality

    Given User is in Facebook's main page
    When The user clicks on "Forgot your password" message
    And The user enters his valid email
    And clicks on "Send"
    Then the user receives a message "Please check your email to reset your password"
    And user receives a confirmation email



