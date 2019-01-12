package search;

import Util.TestLogger;
import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;
import java.util.List;

public class SearchFindBy extends CommonAPI {

    //SearchButton
    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/form[1]/div[2]/span[1]/input[2]")
    public WebElement searchButton;
    public WebElement getSearchButton() {
        return searchButton;
    }
    public void clickOnSearchButton() {
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getSearchButton().click();
    }

    //Costco All Button
    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/select[1]")
    public WebElement getCostcoAll;
    public WebElement getGetCostcoAll() {
        return getCostcoAll;
    }
    public void clickonGetCostcoAll() {
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getGetCostcoAll().click();
    }

    //Signin
    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/ul[1]/li[2]/a[1]")
    public WebElement signIn;
    public WebElement getSignIn() {
        return signIn;
    }
    public void clickOnSignIn() {
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getSignIn();
    }

    //Costco Logo
    @FindBy (css="body.en div.container-fluid.fixed-container div.table-container.parent div.table-row div." +
            "table-cell.logo.hidden-xs.hidden-sm.hidden-md.hidden-lg:nth-child(1) a:nth-child(1) > img.bc-logo.logo-us")
    public WebElement CostcoLogo;
    public void clickOnLogo () {
        CostcoLogo.click(); }

    //view warehouse savings
    @FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]")
    public WebElement viewwarehousesavings;
    public void clickviewwarehousesavings(){
        viewwarehousesavings.click();
    }

    //Customer Service
    @FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/a[1]")
    public WebElement customerservice;
    public void clickCustomerService () {
        customerservice.sendKeys("Game of Thrones", Keys.ENTER);
    }

    //Get email Offer
    @FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[3]/a[1]")
    public WebElement emailoffer;
    public void clickEmailOffer () { emailoffer.sendKeys("Game of Thrones", Keys.ENTER); }

    //Grocery
    @FindBy(css = "#Home_Ancillary_0")
    public static WebElement grocery;
    public void clickGrocery(){grocery.click();}

    //Business delivery
    @FindBy(css = "#Home_Ancillary_1")
    public static WebElement businessdelivery;
    public void clickBusinessDelivdery(){businessdelivery.click();}

    //Optical
    @FindBy(css = "#Home_Ancillary_2")
    public static WebElement searchoptical;
    public void clickOptical(){searchoptical.click();}

    //Pharmacy
    @FindBy(css = "#Home_Ancillary_3")
    public static WebElement pharmacy;
    public void clickPharmacy(){pharmacy.click();}

    //Photo
    @FindBy(css = "#Home_Ancillary_5")
    public static WebElement photo;
    public void clickPhoto(){photo.click();}

    //Travel
    @FindBy(css = "#Home_Ancillary_6")
    public static WebElement travel;
    public void clickTravel(){travel.click();}

    //slide
    @FindBy(css = "body.en div.genericEspot.container-fluid.fixed-container.WC_ContentAreaESpot_div_1_Home_Hero_Carousel" +
            ":nth-child(91) div.slick-initialized.slick-slider.slick-dotted > button.slick-prev.slick-arrow")
    public static WebElement slide;
    public void clickSlide(){slide.click();}

    //slide1
    @FindBy(css = ".body.en div.genericEspot.container-fluid.fixed-container.WC_ContentAreaESpot_div_1_Home_Hero_Carousel" +
            ":nth-child(91) div.slick-initialized.slick-slider.slick-dotted > button.slick-next.slick-arrow")
    public static WebElement slide1;
    public void clickSlide1(){slide1.click();}

    //Cart
    @FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/ul[1]/li[3]/a[1]")
    public static WebElement cart;
    public void clickCart(){cart.click();}

    //Cash Card
    @FindBy(css = "body.en div.container-fluid.fixed-container.small-offer-tiles:nth-child(92) div.row.gutter:" +
            "nth-child(2) a:nth-child(1) div.col-lg-6.col-xs-12 > img.img-responsive")
    public static WebElement cashcard;
    public void clickCashCard(){cashcard.click();}

    //Appliances
    @FindBy(css = "body.en div.container-fluid.fixed-container.product-list.feature-tiles-container:nth-child(93) " +
            "div.feature-tiles.row.gutter div.col-xs-3.thumb:nth-child(1) a.thumbnail > img.img-responsive")
    public static WebElement appliances;
    public void clickAppliances(){appliances.click();}

    //TV
    @FindBy(css = "body.en div.container-fluid.fixed-container.product-list.feature-tiles-container:nth-child(93) " +
            "div.feature-tiles.row.gutter div.col-xs-3.thumb:nth-child(2) a.thumbnail > img.img-responsive")
    public static WebElement tv;
    public void clickTv(){tv.click();}

    //Computer
    @FindBy(css = "body.en div.container-fluid.fixed-container.product-list.feature-tiles-container:nth-child(93) " +
            "div.feature-tiles.row.gutter div.col-xs-3.thumb:nth-child(3) a.thumbnail > img.img-responsive")
    public static WebElement computer;
    public void clickComputer(){computer.click();}

    //Matterss
    @FindBy(css = "body.en div.container-fluid.fixed-container.product-list.feature-tiles-container:nth-child(93) " +
            "div.feature-tiles.row.gutter div.col-xs-3.thumb:nth-child(4) a.thumbnail > img.img-responsive")
    public static WebElement mattress;
    public void clickMatterss(){mattress.click();}

    //Members only Savings
    @FindBy(css = "body.en div.container-fluid.fixed-container.product-list.feature-tiles-container:nth-child(94)" +
            "div.feature-tiles.row.gutter:nth-child(1)div.col-xs-3.thumb:nth-child(1)a.thumbnail > img.img-responsive")
    public static WebElement memberonlysavings;
    public void clickMemberOnlySavings(){memberonlysavings.click();}

    //Google home mini
    @FindBy(css = "body.en div.container-fluid.fixed-container.product-list.feature-tiles-container:nth-child(94)" +
            "div.feature-tiles.row.gutter:nth-child(1)div.col-xs-3.thumb:nth-child(2)a.thumbnail > img.img-responsive")
    public static WebElement googlehomemini;
    public void clickGoogleHomeMini(){googlehomemini.click();}

    //Turbotax
    @FindBy(css = "body.en div.container-fluid.fixed-container.product-list.feature-tiles-container:nth-child(94) " +
            "div.feature-tiles.row.gutter:nth-child(1) div.col-xs-3.thumb:nth-child(3) a.thumbnail > img.img-responsive")
    public static WebElement turbotax;
    public void clickTurboTax(){turbotax.click();}

    //Murad Serum
    @FindBy(css = "body.en div.container-fluid.fixed-container.product-list.feature-tiles-container:nth-child(94)" +
            " div.row.no-gutter:nth-child(3) a:nth-child(1) > img.img-responsive.hidden-xs.hidden-sm:nth-child(1)")
    public static WebElement muradserum;
    public void clickMuradSerum(){muradserum.click();}

    //Relax in Style
    @FindBy(css = "body.en div.container-fluid.fixed-container:nth-child(95) div.feature-carousel-container" +
            " div.feature-carousel.slick-initialized.slick-slider.slick-dotted:nth-child(2) > " +
            "button.slick-prev.slick-arrow.slick-disabled")
    public static WebElement rsslide;
    public void clickRsSlide(){rsslide.click();}

    //Relax in Style 1
    @FindBy(css = "body.en div.container-fluid.fixed-container:nth-child(95) div.feature-carousel-container " +
            "div.feature-carousel.slick-initialized.slick-slider.slick-dotted:nth-child(2)" +
            " > button.slick-next.slick-arrow")
    public static WebElement rsslide1;
    public void clickRsSlide1(){rsslide1.click();}

    //Home Saving
    @FindBy(css = "body.en div.container-fluid.fixed-container:nth-child(97) div.feature-carousel-container " +
            "div.feature-carousel.slick-initialized.slick-slider.slick-dotted:nth-child(2) > " +
            "button.slick-prev.slick-arrow.slick-disabled")
    public static WebElement homesavingslide;
    public void clickHomeSavingSlide(){homesavingslide.click();}

    //Home Saving 1
    @FindBy(css = "body.en div.container-fluid.fixed-container:nth-child(97) div.feature-carousel-container " +
            "div.feature-carousel.slick-initialized.slick-slider.slick-dotted:nth-child(2) >" +
            " button.slick-next.slick-arrow")
    public static WebElement homesavingslide1;
    public void clickHomeSaving1(){homesavingslide1.click();}

    //Price Reductions
    @FindBy(css = "body.en div.container-fluid.fixed-container:nth-child(97) div.feature-carousel-container " +
            "div.feature-carousel.slick-initialized.slick-slider.slick-dotted:nth-child(2) >" +
            " button.slick-next.slick-arrow")
    public static WebElement pricereduction;
    public void clickPriceReductions(){pricereduction.click();}

    //Treasure Hunt
    @FindBy(css = "body.en div.container-fluid.fixed-container.product-list.feature-tiles-container:nth-child(99)" +
        " div.feature-tiles.row.gutter:nth-child(1) div.col-xs-3.thumb:nth-child(2) a.thumbnail > img.img-responsive")
    public static WebElement treasurehunt;
    public void clickTreasureHunt(){treasurehunt.click();}

    //Discover Our Latest Items
    @FindBy(css = "body.en div.container-fluid.fixed-container.product-list.feature-tiles-container:nth-child(99)" +
       " div.feature-tiles.row.gutter:nth-child(1) div.col-xs-3.thumb:nth-child(3) a.thumbnail > img.img-responsive")
    public static WebElement discoverourlatestitem;
    public void clickDiscoverOurLatestItem(){discoverourlatestitem.click();}

    //Exciting Products for a Limited-Time
    @FindBy(css = "body.en div.container-fluid.fixed-container.product-list.feature-tiles-container:nth-child(99)" +
      " div.feature-tiles.row.gutter:nth-child(1) div.col-xs-3.thumb:nth-child(4) a.thumbnail > img.img-responsive")
    public static WebElement excitingproductsforalimitedtime;
    public void clickExcitingProductsForALimitedTime(){excitingproductsforalimitedtime.click();}

    //Healthy Eating
    @FindBy(css = "body.en div.container-fluid.fixed-container.product-list.feature-tiles-container:nth-child(100)" +
        " div.feature-tiles.row.gutter:nth-child(1) div.col-xs-3.thumb:nth-child(1) a.thumbnail > img.img-responsive")
    public static WebElement healthyeating;
    public void clickHealthyEating(){healthyeating.click();}

    //Royal Shredder
    @FindBy(css = "body.en div.container-fluid.fixed-container.product-list.feature-tiles-container:nth-child(100)" +
        " div.feature-tiles.row.gutter:nth-child(1) div.col-xs-3.thumb:nth-child(2) a.thumbnail > img.img-responsive")
    public static WebElement royalshredder;
    public void clickRoyalShredder(){royalshredder.click();}

    //Better Health
    @FindBy(css = "body.en div.container-fluid.fixed-container.product-list.feature-tiles-container:nth-child(100)" +
       " div.feature-tiles.row.gutter:nth-child(1) div.col-xs-3.thumb:nth-child(3) a.thumbnail > img.img-responsive")
    public static WebElement betterhealth;
    public void clickBetterHealth(){betterhealth.click();}

    //Green Mountain 100ct K-Cups
    @FindBy(css = "body.en div.container-fluid.fixed-container.product-list.feature-tiles-container:nth-child(100)" +
      " div.feature-tiles.row.gutter:nth-child(1) div.col-xs-3.thumb:nth-child(4) a.thumbnail > img.img-responsive")
    public static WebElement gmcups;
    public void clickGMCups(){gmcups.click();}

    //Same Day Delivery
    @FindBy(xpath = "/html[1]/body[1]/div[13]/div[1]/a[1]/div[1]/img[1]")
    public static WebElement samedaydelivery;
    public void clickSameDayDelivery(){samedaydelivery.click();}

    //Two Day Delivery
    @FindBy(xpath = "/html[1]/body[1]/div[13]/div[1]/a[2]/div[1]/img[1]")
    public static WebElement twodaydelivery;
    public void clickTwoDayDelivery(){twodaydelivery.click();}






}