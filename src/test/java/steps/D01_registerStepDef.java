package steps;

import base.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.P01_register;

public class D01_registerStepDef extends TestBase {
    P01_register P01_registerobject = new P01_register(driver);;


    @Given("user go to register page")
    public void user_go_to_register_page() {

    }
    @When("click on register link")
    public void click_on_register_link() {

        P01_registerobject.clickOnRegisterLink();

    }
    @When("user select the gender type")
    public void user_select_the_gender_type() {
        P01_registerobject.selectGender();

    }
    @When("user enter the first name")
    public void user_enter_the_first_name() {
        P01_registerobject.enterFirstName();

    }
    @When("user enter the last name")
    public void user_enter_the_last_name() {
        P01_registerobject.enterLastName();

    }
    @When("user select the day of date of birth")
    public void user_select_the_day_of_date_of_birth() {
        P01_registerobject.selectDateOfBirthDay();

    }
    @When("user select the month of date of birth")
    public void user_select_the_month_of_date_of_birth() {
        P01_registerobject.selectDateOfBirthMonth();

    }
    @And("user select the year of date of birth")
    public void userSelectTheYearOfDateOfBirth() {
        P01_registerobject.selectDateOfBirthYear();
    }
    @When("user enter the email")
    public void user_enter_the_email() {
        P01_registerobject.enterEmail();

    }
    @When("user enter the company name")
    public void user_enter_the_company_name() {
        P01_registerobject.enterCompany();

    }
    @When("user enter the password")
    public void user_enter_the_password() {
        P01_registerobject.enterPassw0rd();

    }
    @When("user enter confirm password")
    public void user_enter_confirm_password() {
        P01_registerobject.enterConfirmPassword();

    }
    @Then("user click on register button")
    public void user_click_on_register_button() {
        P01_registerobject.clickOnRegisterButton();

    }
    @Then("assert success message appeared")
    public void assert_success_message_appeared() {
        P01_registerobject.assertRegisterSuccessMessage();

    }



}
