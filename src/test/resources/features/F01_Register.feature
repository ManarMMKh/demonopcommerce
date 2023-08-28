Feature: F01_Register | users could register with new accounts
  @scenario1
  Scenario:verify that user can register using valid data
    Given user go to register page
    When click on register link
    And user select the gender type
    And user enter the first name
    And user enter the last name
    And user select the day of date of birth
    And user select the month of date of birth
    And user select the year of date of birth
    And user enter the email
    And user enter the company name
    And user enter the password
    And user enter confirm password
    Then user click on register button
    Then assert success message appeared