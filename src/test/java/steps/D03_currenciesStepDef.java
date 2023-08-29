package steps;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.P03_homePage;

public class D03_currenciesStepDef extends TestBase {
    P03_homePage P03_homePageObject = new P03_homePage(driver);

    @Given("user go to home page")
    public void user_go_to_home_page() {

    }
    @Then("select Euro currency from the dropdown list")
    public void select_euro_currency_from_the_dropdown_list() {
        P03_homePageObject.selectEuroCurrency();

    }


    @And("assert that Euro Symbol is shown on the  products displayed in home page")
    public void assertThatEuroSymbolIsShownOnTheProductsDisplayedInHomePage() {
        P03_homePageObject.assertThatEuroSymbolIsDisplayed();
    }
}
