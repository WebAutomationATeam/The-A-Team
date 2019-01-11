package HomePage;

import MainPage.PageElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
    public class TestPageElement extends PageElement {
        PageElement firstPage;
        @Test
        public void testViewLogo() {
            firstPage = PageFactory.initElements(driver, PageElement.class);
            firstPage.ClickViewLogo();
        }
        @Test
        public void testDailyDeals() {
            firstPage = PageFactory.initElements(driver, PageElement.class);
            firstPage.ClickViewDailyDeals();
        }
    }
