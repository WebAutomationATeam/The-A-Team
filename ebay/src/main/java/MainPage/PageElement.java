package MainPage;
import Util.TestLogger;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class PageElement extends CommonAPI {
    @FindBy(xpath = ("//a[@href='https://www.ebay.com/']"))
    public static WebElement ViewLogo;
    public void ClickViewLogo() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewLogo.click();
    }
    @FindBy(xpath = ("//a[@href='https://www.ebay.com/deals' and @class='gh-p']"))
    public static WebElement ViewDailyDeals;
    public void ClickViewDailyDeals() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewDailyDeals.click();
    }
    @FindBy(xpath = ("//a[@href=' https://www.ebay.com/rpp/gift-cards']"))
    public static WebElement ViewGiftCards;
    public void ClickGiftCards() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewGiftCards.click();
    }
    @FindBy(xpath = ("//a[@href='https://ocsnext.ebay.com/ocs/home' and @class='gh-p']"))
    public static WebElement ViewHelpContact;
    public void ClickHelpContact() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewHelpContact.click();
    }
    @FindBy(xpath = ("//img[@title='Sell What s Hot. Make More Cash.']"))
    public static WebElement ViewSellHot;
    public void ClickSellHot() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewSellHot.click();
    }
    @FindBy(xpath = ("//a[@href='https://www.ebay.com/']"))
    public static WebElement ViewHome;
    public void ClickViewHome() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewHome.click();
    }
    @FindBy(xpath = ("//a[@href='/feed']"))
    public static WebElement ViewSaved;
    public void ClickViewSaved() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewSaved.click();
    }
    @FindBy(xpath = ("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"))
    public static WebElement ViewMotors;
    public void ClickViewMotors() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewMotors.click();
    }
    @FindBy(xpath = ("//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a"))
    public static WebElement ViewFashion;
    public void ClickViewFashion() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewFashion.click();
    }
    @FindBy(xpath = ("//*[@id=\"mainContent\"]/div[1]/ul/li[5]/a"))
    public static WebElement ViewElectronics;
    public void ClickViewElectronics() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewElectronics.click();
    }
    @FindBy(xpath = ("//*[@id=\"mainContent\"]/div[1]/ul/li[6]/a"))
    public static WebElement ViewCollectibles;
    public void ClickViewCollectibles() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewLogo.click();
    }@FindBy(xpath = ("//*[@id=\"mainContent\"]/div[1]/ul/li[7]/a"))
    public static WebElement ViewHomeGarden;
    public void ClickViewHomeGarden() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewHomeGarden.click();
    }
    @FindBy(xpath = ("//*[@id=\"mainContent\"]/div[1]/ul/li[8]/a"))
    public static WebElement ViewSportingGoods;
    public void ClickViewSportingGoods() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewSportingGoods.click();
    }
    @FindBy(xpath = ("//*[@id=\"mainContent\"]/div[1]/ul/li[9]"))
    public static WebElement ViewToys;
    public void ClickViewToys() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewToys.click();
    }
    @FindBy(xpath = ("//*[@id=\"mainContent\"]/div[1]/ul/li[10]/a"))
    public static WebElement ViewBusinessIndustrial;
    public void ClickViewBusinessIndustrial() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewBusinessIndustrial.click();
    }
    @FindBy(xpath = ("//*[@id=\"mainContent\"]/div[1]/ul/li[11]/a"))
    public static WebElement ViewMusic;
    public void ClickViewMusic() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewMusic.click();
    }
    @FindBy(xpath = ("//*[@id=\"mainContent\"]/div[1]/ul/li[12]/a"))
    public static WebElement ViewDeals;
    public void ClickViewDeals() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewDeals.click();
    }
    @FindBy(xpath = ("//*[@id=\"mainContent\"]/div[1]/ul/li[13]/a"))
    public static WebElement ViewUnderTen;
    public void ClickViewUnderTen() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewUnderTen.click();
    }
    @FindBy(xpath = ("//*[@id=\"rtm_list1\"]/div/div/button[2]"))
    public static WebElement ViewPlayPause;
    public void ClickViewPlayPause() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewPlayPause.click();
    }
    @FindBy(xpath = ("//*[@id=\"destinations_list1\"]/ul/li[1]/a/h3"))
    public static WebElement ViewActiveWearMen;
    public void ClickViewActiveWearMen() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewActiveWearMen.click();
    }
    @FindBy(xpath = ("//*[@id=\"destinations_list1\"]/ul/li[2]/a/h3"))
    public static WebElement ViewActiveWearWomen;
    public void ClickViewActiveWearWomen() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewActiveWearWomen.click();
    }
    @FindBy(xpath = ("//*[@id=\"destinations_list1\"]/ul/li[3]/a/h3"))
    public static WebElement ViewFindTheBeat;
    public void ClickViewFindTheBeat() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewFindTheBeat.click();
    }@FindBy(xpath = ("//*[@id=\"destinations_list1\"]/ul/li[4]/a/h3"))
    public static WebElement ViewTrackProgress;
    public void ClickViewTrackProgress() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewTrackProgress.click();
    }@FindBy(xpath = ("//*[@id=\"destinations_list1\"]/ul/li[5]/a/h3"))
    public static WebElement ViewGearUp;
    public void ClickViewGearUp() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewGearUp.click();
    }@FindBy(xpath = ("//*[@id=\"destinations_list1\"]/ul/li[6]/a/h3"))
    public static WebElement ViewJuiceIt;
    public void ClickViewJuiceIt() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewJuiceIt.click();
    }@FindBy(xpath = ("//*[@id=\"destinations_list1\"]/ul/li[7]/a/h3"))
    public static WebElement ViewFuelYourFitness;
    public void ClickViewFuelYourFitness() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewFuelYourFitness.click();
    }@FindBy(xpath = ("//*[@id=\"items_list1\"]/div[1]/div/div[2]/a"))
    public static WebElement ViewDailyDealsAll;
    public void ClickViewDailyDealsAll() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewDailyDealsAll.click();
    }@FindBy(xpath = ("//*[@id=\"topics_list1\"]/div[1]/div/div[2]/a"))
    public static WebElement ViewTrendingOnEbay;
    public void ClickViewTrendingOnEbay() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewTrendingOnEbay.click();
    }
    @FindBy(xpath = ("//*[@id=\"rtm_list3\"]/div/div/div[2]/a/div[2]"))
    public static WebElement ViewTreatYourself;
    public void ClickViewTreatYourself() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewTreatYourself.click();
    }
    @FindBy(xpath = ("//*[@id=\"events_list1\"]/div[1]/div/div[2]/a"))
    public static WebElement ViewFeaturedSale;
    public void ClickViewFeaturedSale() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewFeaturedSale.click();
    }
    @FindBy(xpath = ("//*[@id=\"events_list2\"]/div[1]/div/div[2]/a"))
    public static WebElement ViewEditorsPick;
    public void ClickViewEditorsPick() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewEditorsPick.click();
    }
    @FindBy(xpath = ("//*[@id=\"rtm_list4\"]/div/div[2]/a/div[2]"))
    public static WebElement ViewLoveYourLook;
    public void ClickViewLoveYourLook() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewLoveYourLook.click();
    }
}
