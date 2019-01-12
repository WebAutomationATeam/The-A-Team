package search;

import Util.TestLogger;
import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import searchDB.XlsxDataReader;

import java.util.ArrayList;
import java.util.List;

public class SearchFindBy extends CommonAPI {

    //SearchButton
    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]" +
            "/div[1]/form[1]/div[2]/span[1]/input[2]")
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
    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]" +
            "/div[2]/div[1]/form[1]/div[1]/select[1]")
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
    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div" +
            "[3]/ul[1]/li[2]/a[1]")
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
    public WebElement costcologo;
    public void clickOnLogo () { costcologo.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        costcologo.click();}

    //view warehouse savings
    @FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]")
    public WebElement viewwarehousesavings;
    public void clickviewwarehousesavings(){ viewwarehousesavings.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        viewwarehousesavings.click();}

    //Customer Service
    @FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/a[1]")
    public WebElement customerservice;
    public void clickCustomerService () {
        customerservice.sendKeys("Game of Thrones", Keys.ENTER);
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        customerservice.click();}

    //Get email Offer
    @FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[3]/a[1]")
    public WebElement emailoffer;
    public void clickEmailOffer () { emailoffer.sendKeys("Game of Thrones", Keys.ENTER);
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        emailoffer.click();}

    //Grocery
    @FindBy(css = "#Home_Ancillary_0")
    public static WebElement grocery;
    public void clickGrocery(){grocery.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        grocery.click();}

    //Business delivery
    @FindBy(css = "#Home_Ancillary_1")
    public static WebElement businessdelivery;
    public void clickBusinessDelivdery(){businessdelivery.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        businessdelivery.click();}

    //Optical
    @FindBy(css = "#Home_Ancillary_2")
    public static WebElement searchoptical;
    public void clickOptical(){searchoptical.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        searchoptical.click();}

    //Pharmacy
    @FindBy(css = "#Home_Ancillary_3")
    public static WebElement pharmacy;
    public void clickPharmacy(){pharmacy.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        pharmacy.click();}

    //Photo
    @FindBy(css = "#Home_Ancillary_5")
    public static WebElement photo;
    public void clickPhoto(){photo.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        photo.click();}

    //Travel
    @FindBy(css = "#Home_Ancillary_6")
    public static WebElement travel;
    public void clickTravel(){travel.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        travel.click();}

    //slide
    @FindBy(css= "body.en div.genericEspot.container-fluid.fixed-container.WC_ContentAreaESpot_div_1_Home_Hero_Carousel" +
            ":nth-child(91) div.slick-initialized.slick-slider.slick-dotted > button.slick-prev.slick-arrow")
    public static WebElement slide;
    public void clickSlide(){slide.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        slide.click();}

    //slide1
    @FindBy(css = ".body.en div.genericEspot.container-fluid.fixed-container.WC_ContentAreaESpot_div_1_Home_Hero_Carousel" +
            ":nth-child(91) div.slick-initialized.slick-slider.slick-dotted > button.slick-next.slick-arrow")
    public static WebElement slide1;
    public void clickSlide1(){slide1.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        customerservice.click();}

    //Cart
    @FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/ul[1]/li[3]/a[1]")
    public static WebElement cart;
    public void clickCart(){cart.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        cart.click();}

    //Cash Card
    @FindBy(css = "body.en div.container-fluid.fixed-container.small-offer-tiles:nth-child(92) div.row.gutter:" +
            "nth-child(2) a:nth-child(1) div.col-lg-6.col-xs-12 > img.img-responsive")
    public static WebElement cashcard;
    public void clickCashCard(){cashcard.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        cashcard.click();}

    //Appliances
    @FindBy(css = "body.en div.container-fluid.fixed-container.product-list.feature-tiles-container:nth-child(93) " +
            "div.feature-tiles.row.gutter div.col-xs-3.thumb:nth-child(1) a.thumbnail > img.img-responsive")
    public static WebElement appliances;
    public void clickAppliances(){appliances.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        appliances.click();}

    //TV
    @FindBy(css = "body.en div.container-fluid.fixed-container.product-list.feature-tiles-container:nth-child(93) " +
            "div.feature-tiles.row.gutter div.col-xs-3.thumb:nth-child(2) a.thumbnail > img.img-responsive")
    public static WebElement tv;
    public void clickTv(){tv.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        tv.click();}

    //Computer
    @FindBy(css = "body.en div.container-fluid.fixed-container.product-list.feature-tiles-container:nth-child(93) " +
            "div.feature-tiles.row.gutter div.col-xs-3.thumb:nth-child(3) a.thumbnail > img.img-responsive")
    public static WebElement computer;
    public void clickComputer(){computer.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        computer.click();}

    //Matterss
    @FindBy(css = "body.en div.container-fluid.fixed-container.product-list.feature-tiles-container:nth-child(93) " +
            "div.feature-tiles.row.gutter div.col-xs-3.thumb:nth-child(4) a.thumbnail > img.img-responsive")
    public static WebElement mattress;
    public void clickMatterss(){mattress.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        mattress.click();}

    //Members only Savings
    @FindBy(css = "body.en div.container-fluid.fixed-container.product-list.feature-tiles-container:nth-child(94)" +
            "div.feature-tiles.row.gutter:nth-child(1)div.col-xs-3.thumb:nth-child(1)a.thumbnail > img.img-responsive")
    public static WebElement memberonlysavings;
    public void clickMemberOnlySavings(){memberonlysavings.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        memberonlysavings.click();}

    //Google home mini
    @FindBy(css = "body.en div.container-fluid.fixed-container.product-list.feature-tiles-container:nth-child(94)" +
            "div.feature-tiles.row.gutter:nth-child(1)div.col-xs-3.thumb:nth-child(2)a.thumbnail > img.img-responsive")
    public static WebElement googlehomemini;
    public void clickGoogleHomeMini(){googlehomemini.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        googlehomemini.click();}

    //Turbotax
    @FindBy(css = "body.en div.container-fluid.fixed-container.product-list.feature-tiles-container:nth-child(94) " +
            "div.feature-tiles.row.gutter:nth-child(1) div.col-xs-3.thumb:nth-child(3) a.thumbnail > img.img-responsive")
    public static WebElement turbotax;
    public void clickTurboTax(){turbotax.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        turbotax.click();}

    //Murad Serum
    @FindBy(css = "body.en div.container-fluid.fixed-container.product-list.feature-tiles-container:nth-child(94)" +
            " div.row.no-gutter:nth-child(3) a:nth-child(1) > img.img-responsive.hidden-xs.hidden-sm:nth-child(1)")
    public static WebElement muradserum;
    public void clickMuradSerum(){muradserum.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        muradserum.click();}

    //Relax in Style
    @FindBy(css = "body.en div.container-fluid.fixed-container:nth-child(95) div.feature-carousel-container" +
            " div.feature-carousel.slick-initialized.slick-slider.slick-dotted:nth-child(2) > " +
            "button.slick-prev.slick-arrow.slick-disabled")
    public static WebElement rsslide;
    public void clickRsSlide(){rsslide.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        rsslide.click();}

    //Relax in Style 1
    @FindBy(css = "body.en div.container-fluid.fixed-container:nth-child(95) div.feature-carousel-container " +
            "div.feature-carousel.slick-initialized.slick-slider.slick-dotted:nth-child(2)" +
            " > button.slick-next.slick-arrow")
    public static WebElement rsslide1;
    public void clickRsSlide1(){rsslide1.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        rsslide1.click();}

    //Home Saving
    @FindBy(css = "body.en div.container-fluid.fixed-container:nth-child(97) div.feature-carousel-container " +
            "div.feature-carousel.slick-initialized.slick-slider.slick-dotted:nth-child(2) > " +
            "button.slick-prev.slick-arrow.slick-disabled")
    public static WebElement homesavingslide;
    public void clickHomeSavingSlide(){homesavingslide.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
       homesavingslide.click();}

    //Home Saving 1
    @FindBy(css = "body.en div.container-fluid.fixed-container:nth-child(97) div.feature-carousel-container " +
            "div.feature-carousel.slick-initialized.slick-slider.slick-dotted:nth-child(2) >" +
            " button.slick-next.slick-arrow")
    public static WebElement homesavingslide1;
    public void clickHomeSaving1(){homesavingslide1.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        homesavingslide1.click();}

    //Price Reductions
    @FindBy(css = "body.en div.container-fluid.fixed-container:nth-child(97) div.feature-carousel-container " +
            "div.feature-carousel.slick-initialized.slick-slider.slick-dotted:nth-child(2) >" +
            " button.slick-next.slick-arrow")
    public static WebElement pricereduction;
    public void clickPriceReductions(){pricereduction.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        pricereduction.click();}

    //Treasure Hunt
    @FindBy(css = "body.en div.container-fluid.fixed-container.product-list.feature-tiles-container:nth-child(99)" +
        " div.feature-tiles.row.gutter:nth-child(1) div.col-xs-3.thumb:nth-child(2) a.thumbnail > img.img-responsive")
    public static WebElement treasurehunt;
    public void clickTreasureHunt(){treasurehunt.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        treasurehunt.click();}

    //Discover Our Latest Items
    @FindBy(css = "body.en div.container-fluid.fixed-container.product-list.feature-tiles-container:nth-child(99)" +
       " div.feature-tiles.row.gutter:nth-child(1) div.col-xs-3.thumb:nth-child(3) a.thumbnail > img.img-responsive")
    public static WebElement discoverourlatestitem;
    public void clickDiscoverOurLatestItem(){discoverourlatestitem.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        discoverourlatestitem.click();}

    //Exciting Products for a Limited-Time
    @FindBy(css = "body.en div.container-fluid.fixed-container.product-list.feature-tiles-container:nth-child(99)" +
      " div.feature-tiles.row.gutter:nth-child(1) div.col-xs-3.thumb:nth-child(4) a.thumbnail > img.img-responsive")
    public static WebElement excitingproductsforalimitedtime;
    public void clickExcitingProductsForALimitedTime(){excitingproductsforalimitedtime.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        excitingproductsforalimitedtime.click();}

    //Healthy Eating
    @FindBy(css = "body.en div.container-fluid.fixed-container.product-list.feature-tiles-container:nth-child(100)" +
        " div.feature-tiles.row.gutter:nth-child(1) div.col-xs-3.thumb:nth-child(1) a.thumbnail > img.img-responsive")
    public static WebElement healthyeating;
    public void clickHealthyEating(){healthyeating.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        healthyeating.click();}

    //Royal Shredder
    @FindBy(css = "body.en div.container-fluid.fixed-container.product-list.feature-tiles-container:nth-child(100)" +
        " div.feature-tiles.row.gutter:nth-child(1) div.col-xs-3.thumb:nth-child(2) a.thumbnail > img.img-responsive")
    public static WebElement royalshredder;
    public void clickRoyalShredder(){royalshredder.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        royalshredder.click();}

    //Better Health
    @FindBy(css = "body.en div.container-fluid.fixed-container.product-list.feature-tiles-container:nth-child(100)" +
       " div.feature-tiles.row.gutter:nth-child(1) div.col-xs-3.thumb:nth-child(3) a.thumbnail > img.img-responsive")
    public static WebElement betterhealth;
    public void clickBetterHealth(){betterhealth.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        betterhealth.click();}

    //Green Mountain 100ct K-Cups
    @FindBy(css = "body.en div.container-fluid.fixed-container.product-list.feature-tiles-container:nth-child(100)" +
      " div.feature-tiles.row.gutter:nth-child(1) div.col-xs-3.thumb:nth-child(4) a.thumbnail > img.img-responsive")
    public static WebElement gmcups;
    public void clickGMCups(){gmcups.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        gmcups.click();}

    //Same Day Delivery
    @FindBy(xpath = "/html[1]/body[1]/div[13]/div[1]/a[1]/div[1]/img[1]")
    public static WebElement samedaydelivery;
    public void clickSameDayDelivery(){samedaydelivery.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        samedaydelivery.click();}

    //Two Day Delivery
    @FindBy(xpath = "/html[1]/body[1]/div[13]/div[1]/a[2]/div[1]/img[1]")
    public static WebElement twodaydelivery;
    public void clickTwoDayDelivery(){twodaydelivery.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        twodaydelivery.click();}

    //Everyday Purchase Rewards
    @FindBy(xpath = "/html[1]/body[1]/div[13]/div[1]/div[1]/a[1]/div[1]/div[1]/div[1]")
    public static WebElement everydaypurchaserewards;
    public void clickEverydayPurchaseRewards(){everydaypurchaserewards.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        everydaypurchaserewards.click();}

    //The Costco Connection
    @FindBy(xpath = "/html[1]/body[1]/div[13]/div[1]/div[2]/a[1]/div[1]/div[1]")
    public static WebElement costcoconnection;
    public void clickCostcoConnection(){costcoconnection.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        costcoconnection.click();}

    //January Entertainment
    @FindBy(xpath = "/html[1]/body[1]/div[13]/div[1]/div[3]/a[1]/div[1]/div[1]/div[1]")
    public static WebElement januaryentertainment;
    public void clickJanuaryEntertainment(){januaryentertainment.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        januaryentertainment.click();}

    //Join the Club
    @FindBy(xpath = "/html[1]/body[1]/div[13]/div[1]/div[4]/a[1]/div[1]/div[1]")
    public static WebElement jointheclub;
    public void clickJoinTheClub(){jointheclub.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        jointheclub.click();}

    //Sponsored Products slide
    @FindBy(xpath = "/html[1]/body[1]/div[14]/div[1]/div[2]/button[1]")
    public static WebElement sponsoredproductsslide;
    public void clickSponsoredProductsSlide(){sponsoredproductsslide.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        sponsoredproductsslide.click();}

    //Sponsored Products slide 1
    @FindBy(xpath = "/html[1]/body[1]/div[14]/div[1]/div[2]/button[2]")
    public static WebElement sponsoredproductsslide1;
    public void clickSponsoredProductsSlide1(){sponsoredproductsslide1.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        sponsoredproductsslide1.click();}

    //Costco job
    @FindBy(css = "body.en div.container-fluid.fixed-container div.hidden-xs.hidden-sm div." +
        "footer-items.row.gutter div.col-sm-3.col-md-3:nth-child(1) ul.footer-list li:nth-child(7) > a:nth-child(1)")
    public static WebElement jobs;
    public void clickJobs(){jobs.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        jobs.click();}

    //Costco Company Information
    @FindBy(css = "body.en div.container-fluid.fixed-container div.hidden-xs.hidden-sm div." +
      "footer-items.row.gutter div.col-sm-3.col-md-3:nth-child(1) ul.footer-list li:nth-child(4) > a:nth-child(1)")
    public static WebElement companyinfo;
    public void clickCompanyInfo(){companyinfo.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        companyinfo.click();}

    //Costco Credit Card
    @FindBy(xpath = "/html[1]/body[1]/footer[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[6]/a[1]")
    public static WebElement creditcard;
    public void clickCreditCard(){creditcard.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        creditcard.click();}

    //Costco Cash Card Balance
    @FindBy(xpath = "/html[1]/body[1]/footer[1]/div[1]/div[2]/div[1]/div[3]/ul[1]/li[3]/a[1]")
    public static WebElement cashcardbalance;
    public void clickCashCardBalance(){cashcardbalance.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        cashcardbalance.click();}

    //Costco Gasoline
    @FindBy(xpath = "/html[1]/body[1]/footer[1]/div[1]/div[2]/div[1]/div[4]/ul[1]/li[6]/a[1]")
    public static WebElement gasoline;
    public void clickGasoline(){gasoline.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        gasoline.click();}

    //Email offer
    public void costcogetemailoffer(){
        typeOnElementNEnter("#footer-email-offer", "animesh.rahman@gmail.com");
        clickElement("/html[1]/body[1]/footer[1]/div[1]/div[1]/div[1]/div[3]/form[1]/div[1]/span[1]/button[1]");
        navigateBack();
    }

    public List webElementList(){
        List<WebElement> webElements = new ArrayList<>();
        webElements.add(searchButton);
        webElements.add(getCostcoAll);
        webElements.add(signIn);
        webElements.add(costcologo);
        webElements.add(memberonlysavings);
        webElements.add(appliances);
        webElements.add(computer);
        webElements.add(betterhealth);
        webElements.add(turbotax);
        webElements.add(googlehomemini);
        webElements.add(costcoconnection);
        webElements.add(jobs);
        webElements.add(companyinfo);
        webElements.add(creditcard);
        webElements.add(gasoline);

        List<String>list = new ArrayList<>();
        for(int i=0; i<webElements.size();i++){
            list.add(webElements.get(i).getText());
        }
        System.out.println(list);
        return list;
    }

    XlsxDataReader xlData = new XlsxDataReader("/iCloud Drive//Desktop//The-A-Team/CostcoHomePage.xlsx");
    public List expectedWebElement(){
        int rowcount = xlData.getRowCount("Sheet1");
        List<String> expect = new ArrayList<>();
        for(int i = 2; i <= rowcount; i++){
            expect.add(xlData.getCellData("Sheet1","WebElementName",i));
        }
        System.out.println(expect);
        return expect;
    }
}