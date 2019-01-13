package basic;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

    public WebElement getHboNowLogo() {
        hboNowLogo.click();
        return hboNowLogo;
    }

    public WebElement getHboNowSignInTab() {
        hboNowSignInTab.click();
        return hboNowSignInTab;
    }

    public WebElement getEnterEmailAddress() {
        enterEmailAddress.sendKeys("john@gmail.com");
        return enterEmailAddress;
    }

    public WebElement getEnterPassword() {
        enterPassword.sendKeys("abcd1234");
        return enterPassword;
    }

    public WebElement getClickOnSignIn() {
        clickOnSignIn.click();
        return clickOnSignIn;
    }


}
