package steps;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.P03_homePage;
import pages.PageBase;

import static base.TestBase.driver;

public class D08_WishlistStepDef extends TestBase{
     P03_homePage P03_homePageObject = new P03_homePage(driver);



    @Given("click on wishlist button")
    public void click_on_wishlist_button() {
        P03_homePageObject.clickOnWishListButton();

    }
    @Then("assert that success message appeared")
    public void assert_that_success_message_appeared() {
        P03_homePageObject.assertSuccessMessageOfWishListAppeared();

    }
    @Then("assert that background message is green")
    public void assert_that_background_message_is_green() {
        P03_homePageObject.assertSuccessMessageBackgroundColorIsGreen();

    }
    

    @Then("wait until success message to disappear then click on wishlist Tab")
    public void waitUntilSuccessMessageToDisappearThenClickOnWishlistTab() {
        P03_homePageObject.clickOnWishListTab();
    }


    @And("check that the item has been added and the qty bigger than zero")
    public void checkThatTheItemHasBeenAddedAndTheQtyBiggerThanZero() {
        P03_homePageObject.checkThatItemAddedSucessfullyToTheWishlistTab();
    }
}
