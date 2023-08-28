package steps;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.P02_login;

public class D02_loginStepDef extends TestBase {
    P02_login P02_loginObject = new P02_login(driver);



    @Given("user go to login page")
    public void user_go_to_login_page() {

    }
    @When("click on login link")
    public void click_on_login_link() {
        P02_loginObject.clickOnLoginLink();

    }
    @And("user enter valid mail {string}")
    public void userEnterValidMail(String validMail) {
        P02_loginObject.enterValidEmailLogin(validMail);

    }

    @And("user enter valid password {string}")
    public void userEnterValidPassword(String validPass) {
        P02_loginObject.enterValidPassLogin(validPass);

    }
    @When("user click on login button")
    public void user_click_on_login_button() {
        P02_loginObject.clickOnLoginButton();

    }
    @Then("Assert that user login to the system sucessfully")
    public void assert_that_user_login_to_the_system_sucessfully() {
        P02_loginObject.assertLoginPageSuccess();

    }


    @Then("Assert user could not login to the system")
    public void assert_user_could_not_login_to_the_system() {
        P02_loginObject.assertLoginPageUnseccess();

    }

    @And("user enter invalid email {string}")
    public void userEnterInvalidEmail(String invalidMail) {
        P02_loginObject.enterInvalidMail(invalidMail);

    }

    @And("user enter invalid password {string}")
    public void userEnterInvalidPassword(String invalidPass) {
        P02_loginObject.enterInvalidPass(invalidPass);
    }
}
