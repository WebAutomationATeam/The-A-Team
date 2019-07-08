package basic;

import Util.TestLogger;
import base.CommonAPI;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HBONowSignIn extends CommonAPI {

    @FindBy (xpath = "/html/body/main/div[1]/div/div/header/div[1]/div/div[3]/ul/li[3]/div/span")
    public WebElement signInTab;

    @FindBy (xpath = "//span[@class='components/BasicButton--children']")
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
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signInTab.click();
        return signInTab;
    }
    public WebElement getHboNowLogo() {
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        hboNowLogo.click();
        return hboNowLogo;
    }
    public WebElement getHboNowSignInTab() {
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        hboNowSignInTab.click();
        return hboNowSignInTab;
    }
    public WebElement getEnterEmailAddress(String email) {
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        enterEmailAddress.sendKeys("email",email);
        return enterEmailAddress;
    }
    public WebElement getEnterPassword(String password) {
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        enterPassword.sendKeys("password",password);
        return enterPassword;
    }
    public WebElement getClickOnSignIn() {
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnSignIn.click();
        return clickOnSignIn;
    }
    public void errorMessage() {
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String actualText = driver.findElement(By.xpath("//*[@id=\"Viewport\"]/div[1]/div[5]/div/div[1]/div[2]/span/span")).getText();
        String expectedText = "The email address or password is incorrect. Please try again.";
        Assert.assertEquals(actualText,expectedText);
    }
}
