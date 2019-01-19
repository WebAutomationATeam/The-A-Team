package EBayFashion;
import Util.TestLogger;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class SalesEvents extends CommonAPI {
    @FindBy(xpath = ("//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a"))
    public static WebElement ViewFashion;
    @FindBy(xpath = "//*[@id=\"w1-w2\"]/ul/li[1]/a")
    public static WebElement ViewSalesEvents;
    @FindBy(xpath = ("//*[@id=\"w1-w2\"]/ul/li[2]/a"))
    public static WebElement ViewFashionDeals;
    @FindBy(xpath = ("//*[@id=\"w1-w2\"]/ul/li[3]/a"))
    public static WebElement ViewFashionFIxSignUp;
    public void ClickViewSalesEvents() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewFashion.click();
        ViewSalesEvents.click();
    }
    public void ClickViewFashionDeals() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewFashion.click();
        ViewFashionDeals.click();
    }
    public void ClickViewFashionFIxSignUp() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewFashion.click();
        ViewFashionFIxSignUp.click();
    }
}
