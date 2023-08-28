package steps;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.P03_homePage;

import static base.TestBase.driver;

public class D06_homeSlidersStepDef extends TestBase {
    P03_homePage P03_homePageObject = new P03_homePage(driver);


    @Given("users go to home page")
    public void users_go_to_home_page() {

    }
    @Then("click on the first slider")
    public void click_on_the_first_slider() {
        P03_homePageObject.clickOnFirstSlider();
    }
    @Then("Assert that first slider directed to the {string}")
    public void assert_that_first_slider_directed_to_the(String string) {
        P03_homePageObject.assertFirstSliderdirectedtoCorrectlink(string);

    }







    @Then("click on the second slider")
    public void click_on_the_second_slider() {
        P03_homePageObject.clickOnSecondSlider();

    }
    @Then("Assert that second slider directed to the {string}")
    public void assert_that_second_slider_directed_to_the(String link) {
        P03_homePageObject.assertSecondSliderDirectedToCorrectLink(link);

    }

}
