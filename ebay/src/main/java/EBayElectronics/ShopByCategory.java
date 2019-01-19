package EBayElectronics;
import Util.TestLogger;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class ShopByCategory extends CommonAPI {
    @FindBy(xpath = ("//*[@id=\"mainContent\"]/div[1]/ul/li[5]/a"))
    public static WebElement ViewElectronics;
    @FindBy(xpath = ("//*[@id=\"w1-w0-w0-toggle-button\"]/span"))
    public static WebElement ViewCameraPhoto;
    @FindBy(xpath = ("//*[@id=\"w1-w0-w1-toggle-button\"]/span"))
    public static WebElement ViewCellPhone;
    @FindBy(xpath = ("//*[@id=\"w1-w0-w2-toggle-button\"]/span"))
    public static WebElement ViewComputerTablet;
    @FindBy(xpath = ("//*[@id=\"w1-w0-w3-toggle-button\"]/span"))
    public static WebElement ViewTvVideo;
    @FindBy(xpath = ("//*[@id=\"w1-w0-w0-toggle-button\"]/span"))
    public static WebElement ViewVideoGames;
    public void ClickViewElectronics() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewElectronics.click();
    }
    public void ClickViewCameraPhoto() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ClickViewElectronics();
        ViewCameraPhoto.click();
    }
    public void ClickViewCellPhone() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ClickViewElectronics();
        ViewCellPhone.click();
    }
    public void ClickViewComputerTablet() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ClickViewElectronics();
        ViewComputerTablet.click();
    }
    public void ClickViewTvVideo() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ClickViewElectronics();
        ViewTvVideo.click();
    }
    public void ClickViewVideoGames() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ClickViewElectronics();
        ViewVideoGames.click();
    }
}

