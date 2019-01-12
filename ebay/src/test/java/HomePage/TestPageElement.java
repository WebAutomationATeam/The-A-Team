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
         @Test
        public void testViewDailyDeals() {
            PageElement firstPage = PageFactory.initElements(driver, PageElement.class);
            firstPage.ClickViewDailyDeals();
        }
        @Test
        public void testGiftCards() {
        PageElement firstPage = PageFactory.initElements(driver, PageElement.class);
        firstPage.ClickGiftCards();
        }
        @Test
        public void testHelpContact() {
            PageElement firstPage = PageFactory.initElements(driver, PageElement.class);
            firstPage.ClickHelpContact();
        }
        @Test
        public void testSellHot() {
            PageElement firstPage = PageFactory.initElements(driver, PageElement.class);
            firstPage.ClickSellHot();
        }
        @Test
        public void testViewHome() {
            PageElement firstPage = PageFactory.initElements(driver, PageElement.class);
            firstPage.ClickViewHome();
        }
        @Test
        public void testViewSaved() {
            PageElement firstPage = PageFactory.initElements(driver, PageElement.class);
            firstPage.ClickViewSaved();
        }
        @Test
        public void testViewMotors() {
            PageElement firstPage = PageFactory.initElements(driver, PageElement.class);
            firstPage.ClickViewMotors();
        }
        @Test
        public void testViewFashion() {
            PageElement firstPage = PageFactory.initElements(driver, PageElement.class);
            firstPage.ClickViewFashion();
            driver.navigate().back();
            driver.close();
        }@Test
        public void testElectronics() {
            PageElement firstPage = PageFactory.initElements(driver, PageElement.class);
            firstPage.ClickViewElectronics();
            driver.navigate().back();
            driver.close();
        }@Test
        public void testCollectible() {
            PageElement firstPage = PageFactory.initElements(driver, PageElement.class);
            firstPage.ClickViewCollectibles();
            driver.navigate().back();
            driver.close();
        }@Test
        public void testViewHomeGarden() {
            PageElement firstPage = PageFactory.initElements(driver, PageElement.class);
            firstPage.ClickViewHomeGarden();
            driver.navigate().back();
            driver.close();
        }@Test
        public void testViewToys() {
            PageElement firstPage = PageFactory.initElements(driver, PageElement.class);
            firstPage.ClickViewToys();
            driver.navigate().back();
            driver.close();
        }@Test
        public void testBusinessIndustrial() {
            PageElement firstPage = PageFactory.initElements(driver, PageElement.class);
            firstPage.ClickViewBusinessIndustrial();
            driver.navigate().back();
            driver.close();
        }@Test
        public void testMusic() {
            PageElement firstPage = PageFactory.initElements(driver, PageElement.class);
            firstPage.ClickViewMusic();
            driver.navigate().back();
            driver.close();
        }@Test
        public void testDeals() {
            PageElement firstPage = PageFactory.initElements(driver, PageElement.class);
            firstPage.ClickViewDeals();
            driver.navigate().back();
            driver.close();
        }@Test
        public void testUnderTen() {
            PageElement firstPage = PageFactory.initElements(driver, PageElement.class);
            firstPage.ClickViewUnderTen();
            driver.navigate().back();
            driver.close();
        }@Test
        public void testPlayPause() {
            PageElement firstPage = PageFactory.initElements(driver, PageElement.class);
            firstPage.ClickViewPlayPause();
            driver.navigate().back();
            driver.close();
        }@Test
        public void testActiveWearMen() {
            PageElement firstPage = PageFactory.initElements(driver, PageElement.class);
            firstPage.ClickViewActiveWearMen();
            driver.navigate().back();
            driver.close();
        }
        @Test
        public void testActiveWearWomen() {
            PageElement firstPage = PageFactory.initElements(driver, PageElement.class);
            firstPage.ClickViewActiveWearWomen();
            driver.navigate().back();
            driver.close();
        }
        @Test
        public void testFindTheBeat() {
            PageElement firstPage = PageFactory.initElements(driver, PageElement.class);
            firstPage.ClickViewFindTheBeat();
            driver.navigate().back();
            driver.close();
        }
        @Test
        public void testTrackProgress() {
            PageElement firstPage = PageFactory.initElements(driver, PageElement.class);
            firstPage.ClickViewTrackProgress();
            driver.navigate().back();
            driver.close();
        }@Test
        public void testGearUp() {
            PageElement firstPage = PageFactory.initElements(driver, PageElement.class);
            firstPage.ClickViewGearUp();
            driver.navigate().back();
            driver.close();
        }@Test
        public void testJuiceIt() {
            PageElement firstPage = PageFactory.initElements(driver, PageElement.class);
            firstPage.ClickViewJuiceIt();
            driver.navigate().back();
            driver.close();
        }@Test
        public void testFuelYourFitness() {
            PageElement firstPage = PageFactory.initElements(driver, PageElement.class);
            firstPage.ClickViewFuelYourFitness();
            driver.navigate().back();
            driver.close();
        }@Test
        public void testDailyDealsAll() {
            PageElement firstPage = PageFactory.initElements(driver, PageElement.class);
            firstPage.ClickViewDailyDealsAll();
            driver.navigate().back();
            driver.close();
        }@Test
        public void testTrendingOnEbay() {
            PageElement firstPage = PageFactory.initElements(driver, PageElement.class);
            firstPage.ClickViewTrendingOnEbay();
            driver.navigate().back();
            driver.close();
        }@Test
        public void testTreatYourself() {
            PageElement firstPage = PageFactory.initElements(driver, PageElement.class);
            firstPage.ClickViewTreatYourself();
            driver.navigate().back();
            driver.close();
        }@Test
        public void testFeaturedSale() {
            PageElement firstPage = PageFactory.initElements(driver, PageElement.class);
            firstPage.ClickViewFeaturedSale();
            driver.navigate().back();
            driver.close();
        }@Test
        public void testEditorsPick() {
            PageElement firstPage = PageFactory.initElements(driver, PageElement.class);
            firstPage.ClickViewEditorsPick();
            driver.navigate().back();
            driver.close();
        }@Test
        public void testLoveYourLook() {
            PageElement firstPage = PageFactory.initElements(driver, PageElement.class);
            firstPage.ClickViewLoveYourLook();
            driver.navigate().back();
            driver.close();
        }
    }
