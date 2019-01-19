package EBayElectronics;

import Util.TestLogger;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class ShopElectronicsSalesEvents extends CommonAPI {
    @FindBy(xpath = ("//*[@id=\"mainContent\"]/div[1]/ul/li[5]/a"))
    public static WebElement ViewElectronics;
    @FindBy(xpath = ("//*[@id=\"w1-w1\"]/ul/li[1]/a"))
    public static WebElement ViewCertifiedRefurbish;
    @FindBy(xpath = ("//*[@id=\"w1-w1\"]/ul/li[2]/a"))
    public static WebElement ViewHomeInstallation;
    @FindBy(xpath = ("//*[@id=\"w1-w1\"]/ul/li[3]/a"))
    public static WebElement ViewLaptopUnder399;
    @FindBy(xpath = ("//*[@id=\"w1-w1\"]/ul/li[4]/a"))
    public static WebElement ViewAllTechDeals;
    public void ClickViewElectronics() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewElectronics.click();
    }
    public void ClickViewCertifiedRefurbish() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ClickViewElectronics();
        ViewCertifiedRefurbish.getText();
    }
    public void ClickViewHomeInstallation() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ClickViewElectronics();
        ViewHomeInstallation.click();
    }
    public void ClickViewAllTechDeals() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ClickViewElectronics();
        ViewAllTechDeals.click();
    }
    public void ClickViewLaptopUnder399() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ClickViewElectronics();
        ViewLaptopUnder399.click();
    }
}
