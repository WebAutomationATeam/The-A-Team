package HomePage;

import MainPage.PageElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import HomePage .*;

//import static base.CommonAPI.convertToString;

    public class TestPageElement extends PageElement {
        PageElement firstPage;
        @BeforeMethod
        //public void initElements() {
            //firstPage = PageFactory.initElements(driver, MainPage.PageElement);

        @Test
        public void testAtmBranch() {
            firstPage.ClickViewLogo();
            driver.navigate().back();
            driver.close();
        }
        @Test
        public void testExploProducts() {
            firstPage.ClickViewDailyDeals();
            driver.navigate().back();
            driver.close();
        }
    }
