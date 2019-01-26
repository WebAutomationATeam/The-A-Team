package web;

import basic.AllFreeEpisodes;
import basic.HBONowSignIn;
import database.XlsxDataReader;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;

public class TestHBONowSignIn extends HBONowSignIn {

    XlsxDataReader ex;
    HBONowSignIn hbo;

    @BeforeMethod

    public void initializeElement(){ hbo= PageFactory.initElements(driver, HBONowSignIn.class); }

    @DataProvider(name="DP")
    public Object[][] getTestData() throws Exception{
        File filepath = new File(System.getProperty("C:\\Users\\Rob Dos\\Desktop\\Robin\\The-A-Team\\HBO\\src\\test\\HomePageHBO.xlsx"));
        ex = new XlsxDataReader("");
        ex.setExcelFile(filepath.getAbsolutePath());
        String[][] data = ex.getExcelSheetData("Sheet2");
        return data;
    }
    @Test(dataProvider = "DP")

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
        hbo.getEnterEmailAddress("email");
        hbo.getEnterPassword("password");
        hbo.getClickOnSignIn();
        hbo.errorMessage();

    }

}
