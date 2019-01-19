package HomePage;

import MainPage.PageElement;
import Util.TestLogger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class TestPageElement extends PageElement {
    PageElement firstPage;
    @BeforeMethod
    public void initElement() {
        firstPage = PageFactory.initElements(driver, PageElement.class);
    }
    //User should be able to click on logo
    @Test
    public void testViewLogo() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        firstPage.ClickViewLogo();
    }
    //User should be able to click on daily deals
    @Test
    public void testDailyDeals() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        firstPage.ClickViewDailyDeals();
    }
    //User should be able to click on gift cards
    @Test
    public void testGiftCards() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        firstPage.ClickGiftCards();
    }
    //User should be able to click on help and contacts
    @Test
    public void testHelpContact() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        firstPage.ClickHelpContact();
    }
    //User should be able to click on hot seller
    @Test
    public void testSellHot() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        firstPage.ClickSellHot();
    }
    ////User should be able to click on home button
    @Test
    public void testViewHome() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        firstPage.ClickViewHome();
    }
    //User should be able to click on saved button
    @Test
    public void testViewSaved() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        firstPage.ClickViewSaved();
    }
    //User should be able to click on motors button
    @Test
    public void testViewMotors() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        firstPage.ClickViewMotors();
    }
    //User should be able to click on fashion button
    @Test
    public void testViewFashion() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        firstPage.ClickViewFashion();
        driver.navigate().back();
    }
    //User should be able to click on electronics button
    @Test
    public void testElectronics() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        firstPage.ClickViewElectronics();
        driver.navigate().back();
    }
    //User should be able to click on collectible button
    @Test
    public void testCollectible() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        firstPage.ClickViewCollectibles();
        driver.navigate().back();
    }
    //User should be able to click on home garden button
    @Test
    public void testViewHomeGarden() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        firstPage.ClickViewHomeGarden();
        driver.navigate().back();
        driver.close();
    }
    //User should be able to click on toys button
    @Test
    public void testViewToys() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        firstPage.ClickViewToys();
        driver.navigate().back();
    }
    //User should be able to click on business industrial button
    @Test
    public void testBusinessIndustrial() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        firstPage.ClickViewBusinessIndustrial();
        driver.navigate().back();
    }
    //User should be able to click on music button
    @Test
    public void testMusic() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        firstPage.ClickViewMusic();
        driver.navigate().back();
    }
    //User should be able to click on deals button
    @Test
    public void testDeals() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        firstPage.ClickViewDeals();
        driver.navigate().back();
    }
    //User should be able to click on under ten button
    @Test
    public void testUnderTen() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        firstPage.ClickViewUnderTen();
        driver.navigate().back();
    }
    //User should be able to click on play pause button
    @Test
    public void testPlayPause() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        firstPage.ClickViewPlayPause();
        driver.navigate().back();
    }
    //User should be able to click on active wear men button
    @Test
    public void testActiveWearMen() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        firstPage.ClickViewActiveWearMen();
        driver.navigate().back();
    }
    //User should be able to click on active wear women button
    @Test
    public void testActiveWearWomen() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        firstPage.ClickViewActiveWearWomen();
        driver.navigate().back();
    }
    //User should be able to click on find the beat button
    @Test
    public void testFindTheBeat() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        firstPage.ClickViewFindTheBeat();
        driver.navigate().back();
    }
    //User should be able to click on track your progress button
    @Test
    public void testTrackProgress() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        firstPage.ClickViewTrackProgress();
        driver.navigate().back();
        driver.close();
    }
    //User should be able to click on gear up button
    @Test
    public void testGearUp() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        firstPage.ClickViewGearUp();
        driver.navigate().back();
    }
    //User should be able to click on juice it button
    @Test
    public void testJuiceIt() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        firstPage.ClickViewJuiceIt();
        driver.navigate().back();
    }
    //User should be able to click on fuel your fitness button
    @Test
    public void testFuelYourFitness() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        firstPage.ClickViewFuelYourFitness();
        driver.navigate().back();
    }
    //User should be able to click on daily deals
    @Test
    public void testDailyDealsAll() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        firstPage.ClickViewDailyDealsAll();
        driver.navigate().back();
    }
    //User should be able to click on trending on ebay button
    @Test
    public void testTrendingOnEbay() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        firstPage.ClickViewTrendingOnEbay();
        driver.navigate().back();
    }
    //User should be able to click on treat yourself button
    @Test
    public void testTreatYourself() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        firstPage.ClickViewTreatYourself();
        driver.navigate().back();
    }
    //User should be able to click on featured sale button
    @Test
    public void testFeaturedSale() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        firstPage.ClickViewFeaturedSale();
        driver.navigate().back();
    }
    //User should be able to click on editors pick button
    @Test
    public void testEditorsPick() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        firstPage.ClickViewEditorsPick();
        driver.navigate().back();
    }
    //User should be able to click on love your look button
    @Test
    public void testLoveYourLook() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        firstPage.ClickViewLoveYourLook();
        driver.navigate().back();
    }
}
