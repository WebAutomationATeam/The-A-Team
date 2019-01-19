package EBayFashion;

import Util.TestLogger;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class Category extends CommonAPI {
    @FindBy(xpath = ("//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a"))
    public static WebElement ViewFashion;
    @FindBy(xpath = "//*[@id=\"w1-w0-w0-toggle-button\"]/span")
    public static WebElement ViewWomensClothing;
    @FindBy(xpath = "//*[@id=\"w1-w0-w1-toggle-button\"]/span")
    public static WebElement ViewMensClothing;
    @FindBy(xpath = "//*[@id=\"w1-w0-w2-toggle-button\"]/span")
    public static WebElement ViewShoes;
    @FindBy(xpath = "//*[@id=\"w1-w0-w3-toggle-button\"]/span")
    public static WebElement ViewJewelry;
    @FindBy(xpath = "//*[@id=\"w1-w0-w4-toggle-button\"]/span")
    public static WebElement ViewWatches;
    @FindBy(xpath = "//*[@id=\"w1-w0-w5-toggle-button\"]/span")
    public static WebElement ViewHandbagAccessories;
    @FindBy(xpath = "//*[@id=\"w1-w0-w6-toggle-button\"]/span")
    public static WebElement ViewBeauty;
    @FindBy(xpath = "//*[@id=\"w1-w0-w7-toggle-button\"]/span")
    public static WebElement ViewHealth;
    @FindBy(xpath = "//*[@id=\"w1-w0-w8-toggle-button\"]/span")
    public static WebElement ViewKidsBaby;
    @FindBy(xpath = "//*[@id=\"w1-w0-w9-toggle-button\"]/span")
    public static WebElement ViewVintage;
    @FindBy(xpath = "//*[@id=\"w1-w0\"]/ul/li[11]/a")
    public static WebElement ViewCultureEthnicClothing;
    @FindBy(xpath = "//*[@id=\"w1-w0\"]/ul/li[12]/a")
    public static WebElement ViewSportsFanClothing;
    public void ClickViewFashion() {
        ViewFashion.click();
    }
    public void ClickViewWomensClothing() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewFashion.click();
        ViewWomensClothing.click();
    }
    public void ClickViewMensClothing() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewFashion.click();
        ViewMensClothing.click();
    }
    public void ClickViewShoes() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewFashion.click();
        ViewShoes.click();
    }
    public void ClickViewJewelry() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewFashion.click();
        ViewJewelry.click();
    }
    public void ClickViewWatches() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewFashion.click();
        ViewWatches.click();
    }
    public void ClickViewHandbagAccessories() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewFashion.click();
        ViewHandbagAccessories.click();
    }
    public void ClickViewBeauty() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewFashion.click();
        ViewBeauty.click();
    }
    public void ClickViewHealth() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewFashion.click();
        ViewHealth.click();
    }
    public void ClickViewKidsBaby() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewFashion.click();
        ViewKidsBaby.click();
    }
    public void ClickViewVintage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewFashion.click();
        ViewVintage.click();
    }
    public void ClickViewCultureEthnicClothing() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewFashion.click();
        ViewCultureEthnicClothing.click();
    }
    public void ClickViewSportsFanClothing() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewFashion.click();
        ViewSportsFanClothing.click();
    }
}

