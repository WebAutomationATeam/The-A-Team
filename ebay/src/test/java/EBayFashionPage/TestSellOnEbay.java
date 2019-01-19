package EBayFashionPage;
import EBayFashion.SellOnEbay;
import Util.TestLogger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class TestSellOnEbay extends SellOnEbay  {
    SellOnEbay sellOnEbay;
    @BeforeMethod
    public void initElement() {
        sellOnEbay = PageFactory.initElements(driver, SellOnEbay.class);
    }
    //User should be able to click on consign item
    @Test
    public void testViewConsignItem() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        sellOnEbay.ClickViewConsignItem();
    }
    //User should be able to click on sell direct
    @Test
    public void testViewSellDirect() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        sellOnEbay.ClickViewSellDirect();
    }
}
