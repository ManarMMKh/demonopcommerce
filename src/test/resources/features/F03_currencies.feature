Feature: F03_currencies.feature | verify Euro Symbol is shown
  @scenario12
  Scenario:  verify Euro Symbol (€) is shown on the 4 products displayed in Home page
    Given user go to home page
    Then select Euro currency from the dropdown list
    And assert that Euro Symbol is shown on the  products displayed in home page
