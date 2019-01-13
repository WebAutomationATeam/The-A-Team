package basic;

import base.CommonAPI;
<<<<<<< HEAD
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
=======
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
>>>>>>> 01e18172936f8ceefb041d3702bec46faf7e9d33

public class HBONowSignIn extends CommonAPI {

    @FindBy (xpath = "/html/body/main/div[1]/div/div/header/div[1]/div/div[3]/ul/li[3]/div/span")
    public WebElement signInTab;

    @FindBy (xpath = "/html/body/main/div[1]/div/div/header/div[1]/div/div[3]/ul/li[3]/div/div/div[4]/div/div[1]/div[1]/div/a/span")
    public WebElement hboNowLogo;

    @FindBy (xpath = "//*[@id=\"Viewport\"]/div[1]/div[4]/div/div[7]/div/div[2]")
    public WebElement hboNowSignInTab;

    @FindBy (xpath = "//*[@id=\"Viewport\"]/div[1]/div[5]/div/div[1]/div[3]/div/input")
    public WebElement enterEmailAddress;

    @FindBy (xpath = "//*[@id=\"Viewport\"]/div[1]/div[5]/div/div[1]/div[5]/div[1]/input")
    public WebElement enterPassword;

    @FindBy (xpath = "//*[@id=\"Viewport\"]/div[1]/div[5]/div/div[1]/div[6]/div")
    public WebElement clickOnSignIn;

    public WebElement getSignInTab() {
        signInTab.click();
        return signInTab;
    }
<<<<<<< HEAD

=======
>>>>>>> 01e18172936f8ceefb041d3702bec46faf7e9d33
    public WebElement getHboNowLogo() {
        hboNowLogo.click();
        return hboNowLogo;
    }
<<<<<<< HEAD

=======
>>>>>>> 01e18172936f8ceefb041d3702bec46faf7e9d33
    public WebElement getHboNowSignInTab() {
        hboNowSignInTab.click();
        return hboNowSignInTab;
    }
<<<<<<< HEAD

    public WebElement getEnterEmailAddress() {
        enterEmailAddress.sendKeys("john@gmail.com");
        return enterEmailAddress;
    }

    public WebElement getEnterPassword() {
        enterPassword.sendKeys("abcd1234");
        return enterPassword;
    }

=======
    public WebElement getEnterEmailAddress(String email) {
        enterEmailAddress.sendKeys("email",email);
        return enterEmailAddress;
    }
    public WebElement getEnterPassword(String password) {
        enterPassword.sendKeys("password",password);
        return enterPassword;
    }
>>>>>>> 01e18172936f8ceefb041d3702bec46faf7e9d33
    public WebElement getClickOnSignIn() {
        clickOnSignIn.click();
        return clickOnSignIn;
    }
<<<<<<< HEAD


=======
    public void errorMessage() {
        String actualText = driver.findElement(By.xpath("//*[@id=\"Viewport\"]/div[1]/div[5]/div/div[1]/div[2]/span/span")).getText();
        String expectedText = "The email address or password is incorrect. Please try again.";
        Assert.assertEquals(actualText,expectedText);
    }
>>>>>>> 01e18172936f8ceefb041d3702bec46faf7e9d33
}
