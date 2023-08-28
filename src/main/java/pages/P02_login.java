package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class P02_login extends PageBase{
    public P02_login(WebDriver driver) {
        super(driver);
    }
    By loginLink = By.linkText("Log in");
    By emailLoginField = By.id("Email");
    By passLoginField = By.id("Password");
    By logInButton = By.xpath("//button[@class='button-1 login-button']");
    By myAccountTab = By.className("ico-account");
    public void clickOnLoginLink()
    {
        clickOnElement(loginLink);
    }

    public void enterValidEmailLogin(String validMail)
    {
        setElementText(emailLoginField , validMail);
    }
    public void enterValidPassLogin(String validPass)
    {
        setElementText(passLoginField , validPass);
    }
    public void clickOnLoginButton()
    {
        clickOnElement(logInButton);
    }
    public void enterInvalidMail(String invalidMail)
    {
        setElementText(emailLoginField , invalidMail);
    }
    public void enterInvalidPass(String invalidPass)
    {
        setElementText(passLoginField , invalidPass);
    }

    public void assertLoginPageSuccess()
    {
        Assert.assertEquals(driver.getCurrentUrl() , "https://demo.nopcommerce.com/");
        boolean myAccountIsDisplayed = driver.findElement(By.className("ico-account")).isDisplayed();
        System.out.println(myAccountIsDisplayed);
      // Assert.assertEquals(driver.findElement(By.className("ico-account")).isDisplayed() ,"true" );
        Assert.assertEquals(myAccountIsDisplayed , true);

    }
    public void assertLoginPageUnseccess()
    {
        String errorMessage = driver.findElement(By.className("message-error")).getText();
        Assert.assertEquals(errorMessage , "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found");

    }
}
