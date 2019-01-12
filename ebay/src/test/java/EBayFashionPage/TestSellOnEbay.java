package EBayFashionPage;
import EBayFashion.SellOnEbay;
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
        sellOnEbay.ClickViewConsignItem();
    }
    //User should be able to click on sell direct
    @Test
    public void testViewSellDirect() {
        sellOnEbay.ClickViewSellDirect();
    }
}
