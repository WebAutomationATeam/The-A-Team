package MainPage;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageElement extends CommonAPI {
    @FindBy(xpath = ("//img[@role='presentation' and @id='gh-logo']"))
    public static WebElement ViewLogo;
    public void ClickViewLogo() {
        ViewLogo.click();
    }
    @FindBy(xpath = ("//li[@class='gh-t gh-spr' and @id='gh-eb-u']"))
    public static WebElement ViewDailyDeals;
    public void ClickViewDailyDeals() {
        ViewDailyDeals.click();
    }
}