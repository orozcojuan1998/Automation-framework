
Feature: Log in UI
  Scenario: As an user I want to be able to see all required fields on the Facebook page
    Email/phone text box
    Password text box
    Log in button

    Given User is on google home page
    And search for facebook home page
    When User clicks on www.facebook.com
    Then the user is redirected to Facebook's home page
    And can check that email/phone,password text box and log in button exist

  Scenario: As an user I want to be able to type on the email and password field

    Given User is in Facebook's main page
    When User taps on email and password field
    Then the user can see the cursor blinking
    And can type any letters

  Scenario: As an user I want to be able to see the email and password fields aligned

    Given User is on google home page
    And search for facebook home page
    When User clicks on Facebook link
    Then the user is redirected to Facebook's home page
    And can check that email/phone,password text box and log in button are aligned


