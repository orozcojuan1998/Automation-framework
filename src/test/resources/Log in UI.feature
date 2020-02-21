
Feature: Log in UI
  Scenario: As an user I want to be able to see all required fields on the Facebook page
    Email/phone text box
    Password text box
    Log in button

    Given User is on chrome web browser
    And search for facebook
    When User clicks on www.facebook.com
    Then the user is redirected to Facebook's home page
    And can check that email/phone,password text box and log in button exist

  Scenario: As an user I want to be able to type on the username and password field

    Given User is on Facebook page
    When User tap on username and password field
    Then the user can see the cursor blinking
    And can type any letters
