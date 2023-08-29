package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class P01_register extends PageBase{

    By registerLink = By.linkText("Register");
    By genderButton = By.id("gender-male");
    By firstNameField = By.id("FirstName");
    By lastNameField = By.id("LastName");
    By dateOfBirthDay = By.name("DateOfBirthDay");
    By dateOfBirthMonth = By.name("DateOfBirthMonth");
    By dateOfBirthYear = By.name("DateOfBirthYear");
    By emailField = By.id("Email");
    By companyField = By.id("Company");
    By passwordField = By.id("Password");
    By confirmPasswordField = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");
    By assertRegisterSuccessMessage = By.xpath("//div[@class='result']");


    public P01_register(WebDriver driver) {
        super(driver);
    }

    public void clickOnRegisterLink()
    {
        clickOnElement(registerLink);
    }
    public void selectGender()
    {
        clickOnElement(genderButton);
    }
    public void enterFirstName()
    {
        setElementText(firstNameField , "Ahmad");
    }
    public void enterLastName()
    {
        setElementText(lastNameField , "khalil");
    }
    public void selectDateOfBirthDay()
    {
        Select day = new Select(driver.findElement(dateOfBirthDay));
        day.selectByIndex(1);
    }
    public void selectDateOfBirthMonth()
    {
        Select month = new Select(driver.findElement(dateOfBirthMonth));
        month.selectByIndex(2);
    }
    public void selectDateOfBirthYear()
    {
        Select year = new Select(driver.findElement(dateOfBirthYear));
        year.selectByIndex(1);
    }
    public void enterEmail()
    {
        setElementText(emailField , "test@example.com");
    }
    public void enterCompany()
    {
        setElementText(companyField , "New Horizon");
    }
    public void enterPassw0rd()
    {
        setElementText(passwordField , "P@ssw0rd");
    }
    public void enterConfirmPassword()
    {
        setElementText(confirmPasswordField , "P@ssw0rd");
    }
    public void clickOnRegisterButton()
    {
        clickOnElement(registerButton);
    }
    public void assertRegisterSuccessMessage()
    {
        String successMessageText = driver.findElement(assertRegisterSuccessMessage).getText();
        Assert.assertEquals( successMessageText, "Your registration completed");
        System.out.println(successMessageText);
    }



}
