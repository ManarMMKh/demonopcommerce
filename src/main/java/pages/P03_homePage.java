package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class P03_homePage extends PageBase{

    public P03_homePage(WebDriver driver) {
        super(driver);
    }
    By currencyField = By.id("customerCurrency");
    By firstSlider = By.linkText("1");
    By secondSlider = By.linkText("2");
    By facebookLink = By.linkText("Facebook");
    By twitterLink = By.linkText("Twitter");
    By rssLink = By.linkText("RSS");
    By youtubeLink = By.linkText("YouTube");
    By wishListButton = By.cssSelector("button.add-to-wishlist-button");
    By wishListSuccessMessage = By.cssSelector("div.success>p.content");
    By successMessageBackgroundColor = By.cssSelector("div.bar-notification");
    By wishListTab = By.linkText("Wishlist");
    By wishListQtyItem = By.cssSelector("input.qty-input");
    By euroItems = By.cssSelector("span.price.actual-price");


    public void selectEuroCurrency()
    {
        Select euroSign = new Select(driver.findElement(currencyField));
        euroSign.selectByIndex(1);

    }
    public void assertThatEuroSymbolIsDisplayed()
    {
        int size = new ArrayList<>(driver.findElements(euroItems)).size();
        for(int i=0; i<size; i++)
        {
            String euroSign = driver.findElements(euroItems).get(i).getText();
            Assert.assertTrue(euroSign.contains("€"));
            System.out.println(euroSign);
        }


    }

    public void clickOnFirstSlider()
    {
        clickOnElement(firstSlider);
    }
    public void clickOnSecondSlider()
    {
        clickOnElement(secondSlider);
    }
    public void assertFirstSliderdirectedtoCorrectlink(String link)
    {

        Assert.assertEquals(driver.getCurrentUrl(), link);
    }
    public void assertSecondSliderDirectedToCorrectLink(String link)
    {

        Assert.assertEquals(driver.getCurrentUrl() , link);
    }
    public void clickOnFacebookLink()
    {
        clickOnElement(facebookLink);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        List<String> tabHandles = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabHandles.get(1));
        System.out.println(tabHandles.size());

    }
    public void clickOnTwitterLink()
    {
        clickOnElement(twitterLink);
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(7));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        List<String> tabHandles = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabHandles.get(1));
    }
    public void clickOnRSSLink()
    {
        clickOnElement(rssLink);
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(7));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        List<String> tabHandles = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabHandles.get(1));
    }
    public void clickOnYoutubeLink()
    {
        clickOnElement(youtubeLink);
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(7));
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        List<String> tabHandles = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabHandles.get(1));
    }

    public void assertFacebookLinkOpenCorrectly(String link)
    {
        Assert.assertEquals(driver.getCurrentUrl() , link);
        System.out.println(driver.getCurrentUrl());
    }
    public void assertTwitterLinkOpenCorrectly(String link)
    {
        Assert.assertEquals(driver.getCurrentUrl() , link);
        System.out.println(driver.getCurrentUrl());
    }
    public void assertRSSLinkOpenCorrectly(String link)
    {
        Assert.assertEquals(driver.getCurrentUrl() , link);
        System.out.println(driver.getCurrentUrl());
    }
    public void assertYoutubeLinkOpenCorrectly(String link)
    {
        Assert.assertEquals(driver.getCurrentUrl() , link);
        System.out.println(driver.getCurrentUrl());
    }
    public void closeTheCurrentTab()
    {
        List<String> tabHandles = new ArrayList<>(driver.getWindowHandles());
        driver.close();
        System.out.println(tabHandles.size());
        driver.switchTo().window(tabHandles.get(0));
    }
    public void clickOnWishListButton()
    {
        driver.findElements(wishListButton).get(2).click();
    }
    public void assertSuccessMessageOfWishListAppeared()
    {
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(wishListSuccessMessage));
        driver.findElement(wishListSuccessMessage).click();
        String successMessage = driver.findElement(wishListSuccessMessage).getText();
        Assert.assertTrue(successMessage.contains("The product has been added"), "The product has been added");
        System.out.println(successMessage);



    }
    public void assertSuccessMessageBackgroundColorIsGreen()
    {
        String color = driver.findElement(successMessageBackgroundColor).getCssValue("background-color");
        String hexColor = Color.fromString(color).asHex();
        System.out.println(hexColor);
        Assert.assertEquals(hexColor , "#4bb07a");
    }
    public void clickOnWishListTab()
    {
        WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(wishListSuccessMessage));
        wait.until(ExpectedConditions.elementToBeClickable(wishListTab));
        clickOnElement(wishListTab);
    }
    public void checkThatItemAddedSucessfullyToTheWishlistTab()
    {


       String text =  driver.findElement(wishListQtyItem).getAttribute("value");
       int quantity = Integer.parseInt(text);
        System.out.println(quantity);
        Assert.assertNotEquals(quantity , 0);
        if (quantity>0)
            System.out.println("The item has been added successfully");
        else
            System.out.println("The Item has not been added successfully");

    }

}
