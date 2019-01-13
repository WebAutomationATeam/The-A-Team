package web;
<<<<<<< HEAD

=======
>>>>>>> 01e18172936f8ceefb041d3702bec46faf7e9d33
import basic.AllFreeEpisodes;
import basic.HBONowSignIn;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
<<<<<<< HEAD
import org.testng.annotations.Test;

public class TestHBONowSignIn extends HBONowSignIn {

    HBONowSignIn hbo;

    @BeforeMethod
    public void initializeElement(){ hbo= PageFactory.initElements(driver, HBONowSignIn.class); }

    @Test
=======
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import search.XlsxDataReader;
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
>>>>>>> 01e18172936f8ceefb041d3702bec46faf7e9d33
    public void LogIn(){
        hbo.getSignInTab();
        hbo.getHboNowLogo();
        hbo.getHboNowSignInTab();
<<<<<<< HEAD
        hbo.getEnterEmailAddress();
        hbo.getEnterPassword();
        hbo.getClickOnSignIn();

        String actualText = driver.findElement(By.xpath("//*[@id=\"Viewport\"]/div[1]/div[5]/div/div[1]/div[2]/span/span")).getText();
        String expectedText = "The email address or password is incorrect. Please try again.";
        Assert.assertEquals(actualText, expectedText);
=======
        hbo.getEnterEmailAddress("email");
        hbo.getEnterPassword("password");
        hbo.getClickOnSignIn();
        hbo.errorMessage();
>>>>>>> 01e18172936f8ceefb041d3702bec46faf7e9d33
    }

}
