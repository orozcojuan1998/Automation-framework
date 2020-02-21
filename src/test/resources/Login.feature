Feature:  Log in
  Scenario: As an user I want to be able to log in on Facebook with email

    Given As an user I want to be able to log in on Facebook with email
    When The user enters his valid email and password
    And clicks on the Login button
    Then the user is redirected to Facebook's home page

  Scenario: As an user I want to be able to log in on Facebook with phone number

    Given User is in Facebook's main page
    When The user enters his valid phone number and password
    And clicks on the Login button
    Then the user is redirected to Facebook's home page





