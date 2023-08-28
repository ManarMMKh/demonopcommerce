Feature: F02_Login | users could use login functionality to use their accounts
  @scenario2
  Scenario: user could login with valid email and password
    Given user go to login page
    When click on login link
    And user enter valid mail "test@example.com"
    And user enter valid password "P@ssw0rd"
    And user click on login button
    Then Assert that user login to the system sucessfully

@scenario3
  Scenario:  user could login with invalid email and password
    Given user go to login page
    When click on login link
    And user enter invalid email "wrong@example.com"
    And user enter invalid password "P@ssw0rd"
    And user click on login button
    Then Assert user could not login to the system