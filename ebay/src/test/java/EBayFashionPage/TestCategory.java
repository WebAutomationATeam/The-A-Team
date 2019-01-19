package EBayFashionPage;
import EBayFashion.Category;
import Util.TestLogger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class TestCategory extends Category {
    Category category;
    @BeforeMethod
    public void initElement() {
        category = PageFactory.initElements(driver, Category.class);
    }
    //User should be able to click on logo
    @Test
    public void testViewLogo() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        category.ClickViewFashion();
    }
    //User should be able to click on mens clothing
    @Test
    public void testViewMensClothing() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        category.ClickViewMensClothing();
    }
    //User should be able to click on shoes
    @Test
    public void testClickViewShoes() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        category.ClickViewShoes();
    }
    //User should be able to click on jewelry
    @Test
    public void testClickViewJewelry() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        category.ClickViewJewelry();
    }
    //User should be able to click on watches
    @Test
    public void testViewWatches() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        category.ClickViewWatches();
    }
    //User should be able to click on handbag accessories
    @Test
    public void testViewHandbagAccessories() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        category.ClickViewHandbagAccessories();
    }
    //User should be able to click on beauty
    @Test
    public void testViewBeauty() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        category.ClickViewBeauty();
    }
    //User should be able to click on health
    @Test
    public void testViewHealth() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        category.ClickViewHealth();
    }
    //User should be able to click on kids and baby
    @Test
    public void testViewKidsBaby() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        category.ClickViewKidsBaby();
    }
    //User should be able to click on vintage
    @Test
    public void testViewVintage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        category.ClickViewVintage();
    }
    //User should be able to click on ethnic clothing
    @Test
    public void testViewCultureEthnicClothing() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        category.ClickViewCultureEthnicClothing();
    }
    //User should be able to click on fan clothing
    @Test
    public void testViewSportsFanClothing() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        category.ClickViewSportsFanClothing();
    }
}
