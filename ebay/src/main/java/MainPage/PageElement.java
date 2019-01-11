package MainPage;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageElement extends CommonAPI {
    @FindBy(xpath = ("//a[@href='https://www.ebay.com/']"))
    public static WebElement ViewLogo;
    public void ClickViewLogo() {
        ViewLogo.click();
    }
    @FindBy(xpath = ("//a[@href='https://www.ebay.com/deals' and @class='gh-p']"))
    public static WebElement ViewDailyDeals;
    public void ClickViewDailyDeals() {
        ViewDailyDeals.click();
    }
}