Feature: F03_currencies.feature | verify Euro Symbol is shown
  Scenario:  verify Euro Symbol (€) is shown on the 4 products displayed in Home page
    Given user go to home page

    Then select Euro currency from the dropdown list
    And  assert that Euro Symbol shown on the  first product displayed in Home page
    And  assert that Euro Symbol shown on the  second product displayed in Home page
    And  assert that Euro Symbol shown on the  third product displayed in Home page
    And  assert that Euro Symbol shown on the  fourth product displayed in Home page
