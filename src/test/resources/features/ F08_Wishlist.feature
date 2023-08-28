Feature:  F08_Wishlist.feature | Check that wishlist work correctly
  @scenario10
  Scenario: user click on wishlist button on HTC One M8 Android product and success message appeared
    Given click on wishlist button
    Then assert that success message appeared
    And assert that background message is green

    @scenario11
    Scenario: check that the selected item has been added to the wishlist
      Given click on wishlist button
      Then wait until success message to disappear then click on wishlist Tab
      And check that the item has been added and the qty bigger than zero


