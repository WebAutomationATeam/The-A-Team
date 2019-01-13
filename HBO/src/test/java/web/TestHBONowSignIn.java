package web;

import basic.AllFreeEpisodes;
import basic.HBONowSignIn;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestHBONowSignIn extends HBONowSignIn {

    HBONowSignIn hbo;

    @BeforeMethod
    public void initializeElement(){ hbo= PageFactory.initElements(driver, HBONowSignIn.class); }

    @Test
    public void LogIn(){
        hbo.getSignInTab();
        hbo.getHboNowLogo();
        hbo.getHboNowSignInTab();
        hbo.getEnterEmailAddress();
        hbo.getEnterPassword();
        hbo.getClickOnSignIn();

        String actualText = driver.findElement(By.xpath("//*[@id=\"Viewport\"]/div[1]/div[5]/div/div[1]/div[2]/span/span")).getText();
        String expectedText = "The email address or password is incorrect. Please try again.";
        Assert.assertEquals(actualText, expectedText);
    }

}
