Feature:  F07_followUs.feature | check that links in follow us feature works correctly
  @scenario6
  Scenario: user opens facebook link correctly in new tab
    Given users go to home page
    When click on facebook icon
    Then Assert that the facebook link  "https://www.facebook.com/nopCommerce" opened in new tab
    Then close the current tab
  @scenario7
  Scenario: user opens twitter link correctly in new tab
    Given users go to home page
    When click on twitter icon
    Then Assert that the twitter link  "https://twitter.com/nopCommerce" opened in new tab
    Then close the current tab


  @scenario8
  Scenario: user opens rss link correctly in new tab
    Given users go to home page
    When click on rss icon
    Then Assert that the rss link "https://demo.nopcommerce.com/new-online-store-is-open" opened in new tab
    Then close the current tab

  @scenario9
  Scenario:user opens youtube link correctly in new tab
    Given users go to home page
    When click on youtube icon
    Then Assert that the youtube link "https://www.youtube.com/user/nopCommerce" opened in new tab
    Then close the current tab


