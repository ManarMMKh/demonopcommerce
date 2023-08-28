Feature:F06_homeSliders.feature | Check if the first slider is clickable
  @scenario4
  Scenario: Verify that the first slider is clickable
  Given users go to home page
    Then click on the first slider
    And Assert that first slider directed to the "https://demo.nopcommerce.com/nokia-lumia-1020"

  @scenario5
  Scenario: Verify that the second slider is clickable
    Given users go to home page
    Then click on the second slider
    And Assert that second slider directed to the " https://demo.nopcommerce.com/iphone-6"