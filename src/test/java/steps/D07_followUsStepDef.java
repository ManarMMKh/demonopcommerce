package steps;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.P03_homePage;

import static base.TestBase.driver;

public class D07_followUsStepDef extends TestBase {
    P03_homePage P03_homePageObject = new P03_homePage(driver);


    @When("click on facebook icon")
    public void click_on_facebook_icon() {
        P03_homePageObject.clickOnFacebookLink();

    }

    @Then("Assert that the facebook link  {string} opened in new tab")
    public void assert_that_the_facebook_link_opened_in_new_tab(String link) {
        P03_homePageObject.assertFacebookLinkOpenCorrectly(link);

    }



    @When("click on twitter icon")
    public void click_on_twitter_icon() {
        P03_homePageObject.clickOnTwitterLink();
    }

    @Then("Assert that the twitter link  {string} opened in new tab")
    public void assert_that_the_twitter_link_opened_in_new_tab(String string) {
        P03_homePageObject.assertTwitterLinkOpenCorrectly(string);
    }


    @When("click on rss icon")
    public void click_on_rss_icon() {
        P03_homePageObject.clickOnRSSLink();

    }

    @Then("Assert that the rss link {string} opened in new tab")
    public void assert_that_the_rss_link_opened_in_new_tab(String string) {
        P03_homePageObject.assertRSSLinkOpenCorrectly(string);

    }


    @When("click on youtube icon")
    public void click_on_youtube_icon() {
        P03_homePageObject.clickOnYoutubeLink();
    }

    @Then("Assert that the youtube link {string} opened in new tab")
    public void assert_that_the_youtube_link_opened_in_new_tab(String string) {
        P03_homePageObject.assertYoutubeLinkOpenCorrectly(string);

    }


    @Then("close the current tab")
    public void closeTheCurrentTab() {
       P03_homePageObject.closeTheCurrentTab();
    }
}
