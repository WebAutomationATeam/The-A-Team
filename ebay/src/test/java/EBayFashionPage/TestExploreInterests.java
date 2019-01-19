package EBayFashionPage;

import EBayFashion.ExploreInterests;
import Util.TestLogger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class TestExploreInterests extends ExploreInterests {
    ExploreInterests exploreInterests;
    @BeforeMethod
    public void initElement() {
        exploreInterests = PageFactory.initElements(driver, ExploreInterests.class);
    }
    //User should be able to click on view thrends
    @Test
    public void testViewWomensTrends() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        exploreInterests.ClickViewWomensTrends();
    }
    //User should be able to click on womens head to denim
    @Test
    public void testViewWomensHeadToToeDenim() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        exploreInterests.ClickViewWomensHeadToToeDenim();
    }
    //User should be able to click on womens luxe bags
    @Test
    public void testViewWomensLuxeBags() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        exploreInterests.ClickViewWomensLuxeBags();
    }
    //User should be able to click on womens basic
    @Test
    public void testViewWomensBasic() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        exploreInterests.ClickViewWomensBasic();
    }
    //User should be able to click on mens street style
    @Test
    public void testViewMensStreetStyle() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        exploreInterests.ClickViewMensStreetStyle();
    }
    //User should be able to click on mens basics
    @Test
    public void testViewMensBasics() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        exploreInterests.ClickViewMensBasics();
    }
    //User should be able to click on mens grooming
    @Test
    public void testViewMensGrooming() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        exploreInterests.ClickViewMensGrooming();
    }
}
