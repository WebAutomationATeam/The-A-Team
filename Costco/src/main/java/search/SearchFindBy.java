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
    @FindBy(how = How.XPATH, using = "//input[@id='search-field']")
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
    @FindBy(how = How.XPATH, using = "//select[@id='search-dropdown-select']")
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
    @FindBy(how = How.XPATH, using = "#header_sign_in")
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
    @FindBy (xpath ="//div[@class='logo-small hidden-xl']//img[@class='bc-logo logo-us']")
    public WebElement costcologo;
    public void clickCostcoLogo () { costcologo.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        costcologo.click();}

    //Costco Find A Warehouse
    @FindBy (xpath ="//*[@id=\"warehouse-locations-dropdown\"]")
    public WebElement costcofindawarehouse;
    public void clickFindaWareHouse () { costcofindawarehouse.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        costcofindawarehouse.click();}

    //Costco Shop Button
    @FindBy (xpath ="//*[@id=\"navigation-dropdown\"]")
    public WebElement costcoshop;
    public void clickCostcoShop () { costcoshop.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        costcoshop.click();}

    //view warehouse savings
    @FindBy(xpath = "//a[@id='warehouse-savings']")
    public WebElement viewwarehousesavings;
    public void clickViewWareHouSesavings(){ viewwarehousesavings.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        viewwarehousesavings.click();}

    //Costco My Home
    @FindBy(xpath = "/html/body/div[6]/div[1]/a/img[1]")
    public WebElement costcomyhome;
    public void clickCostcoMyHome(){ costcomyhome.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        costcomyhome.click();}

    //Costco Relax in Style
    @FindBy(xpath = "//*[@id=\"search-results\"]/div[2]/div/div[2]/div[1]/a/div")
    public WebElement costcrelaxinstyle;
    public void clickcostcRelaxInStyle(){ costcrelaxinstyle.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        costcrelaxinstyle.click();}

    //Costco Dining Entertaining
    @FindBy(xpath = "//*[@id=\"search-results\"]/div[2]/div/div[2]/div[2]/a/div")
    public WebElement costcodiningentertaining;
    public void clickDiningEntertaining(){ costcodiningentertaining.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        costcodiningentertaining.click();}

    //Costco Best Night's Rest
    @FindBy(xpath = "//*[@id=\"search-results\"]/div[2]/div/div[2]/div[3]/a/img")
    public WebElement costcobestnightsrest;
    public void clickBestNightsRest(){ costcobestnightsrest.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        costcobestnightsrest.click();}

    //Costco Update your Bath
    @FindBy(xpath = "//*[@id=\"search-results\"]/div[2]/div/div[2]/div[4]/a/div")
    public WebElement costcoupdateyourbath;
    public void clickUpdateYourBath(){ costcoupdateyourbath.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        costcoupdateyourbath.click();}

    //Costco Light Up Your Space
    @FindBy(xpath = "//*[@id=\"search-results\"]/div[2]/div/div[2]/div[5]/a/div")
    public WebElement costlightupyourspace;
    public void clickLightUpYourSpace(){ costlightupyourspace.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        costlightupyourspace.click();}

    //Costco Backyard Oasis
    @FindBy(xpath = "//*[@id=\"search-results\"]/div[2]/div/div[2]/div[6]/a/div")
    public WebElement costcobackyardoasis;
    public void clickBackyardOasis(){ costcobackyardoasis.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        costcobackyardoasis.click();}

    //Costco Make Your Home Smart
    @FindBy(xpath = "///*[@id=\"search-results\"]/div[2]/div/div[2]/div[7]/a/div")
    public WebElement costcomakeyourhomesmart;
    public void clickMakeYourHomeSmart(){ costcomakeyourhomesmart.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        costcomakeyourhomesmart.click();}

    //Costco Work Space
    @FindBy(xpath = "//*[@id=\"search-results\"]/div[2]/div/div[2]/div[8]/a/div")
    public WebElement costcoworkspace;
    public void clickWorkSpace(){ costcoworkspace.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        costcoworkspace.click();}

    //Costco Maximize Your Space
    @FindBy(xpath = "//*[@id=\"search-results\"]/div[2]/div/div[2]/div[9]/a/div")
    public WebElement costcomaximizeyourspace;
    public void clickMaximizeYourSpace(){ costcomaximizeyourspace.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        costcomaximizeyourspace.click();}

    //Costco American Heritage Billiards
    @FindBy(xpath = "//*[@id=\"slick-slide40\"]/a/img")
    public WebElement costcoamericanheritagebilliards;
    public void clickAmericanHeritageBilliards(){ costcoamericanheritagebilliards.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        costcoamericanheritagebilliards.click();}

    //Costco Follow Us Social Media Facebook
    @FindBy(xpath = "//*[@id=\"footer-widget\"]/div/div[1]/div/div[4]/ul/li[1]/a/i")
    public WebElement costcofollowussocialmediafacebook;
    public void clickFollowUsSocialMediaFacebook(){ costcofollowussocialmediafacebook.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        costcofollowussocialmediafacebook.click();}

    //Costco Follow Us Social Media Pinterest
    @FindBy(xpath = "//*[@id=\"footer-widget\"]/div/div[1]/div/div[4]/ul/li[2]/a/i")
    public WebElement costcofollowussocialmediapinterest;
    public void clickFollowUsSocialMediaPinterest(){ costcofollowussocialmediapinterest.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        costcofollowussocialmediapinterest.click();}

    //Customer Service
    @FindBy(xpath = "//a[@id='customer-service-link']")
    public WebElement customerservice;
    public void clickCustomerService () {
        customerservice.sendKeys("Cookies", Keys.ENTER);
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        customerservice.click();}

    //Get email Offer
    @FindBy(xpath = "//a[@id='email-signup-dropdown']")
    public WebElement emailoffer;
    public void clickEmailOffer () { emailoffer.sendKeys("animesh.rahman@gmail.com", Keys.ENTER);
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
    @FindBy(css= "//*[@id=\"hero-carousel\"]/button[1]")
    public static WebElement slide;
    public void clickSlide(){slide.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        slide.click();}

    //slide1
    @FindBy(css = "//*[@id=\"hero-carousel\"]/button[2]")
    public static WebElement slide1;
    public void clickSlide1(){slide1.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        customerservice.click();}

    //Cart
    @FindBy(xpath = "//*[@id=\"cart-t\"]/i")
    public static WebElement cart;
    public void clickCart(){cart.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        cart.click();}

    //Costco Fitbit
    @FindBy(css = "/html/body/div[6]/div/div/a[2]/div/img")
    public static WebElement fitbit;
    public void clickFitbit(){fitbit.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        fitbit.click();}

    //Appliances
    @FindBy(css = "//*[@id=\"slick-slide10\"]/a/img")
    public static WebElement appliances;
    public void clickAppliances(){appliances.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        appliances.click();}

    //TCL
    @FindBy(css = "//*[@id=\"slick-slide11\"]/a/img")
    public static WebElement tcl;
    public void clickTcl(){tcl.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        tcl.click();}

    //TV
    @FindBy(css = "//*[@id=\"slick-slide11\"]/a/img")
    public static WebElement tv;
    public void clickTv(){tv.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        tv.click();}

    //Computer
    @FindBy(css = "//*[@id=\"slick-slide12\"]/a/img")
    public static WebElement computer;
    public void clickComputer(){computer.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        computer.click();}

    //Matterss
    @FindBy(css = "//*[@id=\"slick-slide13\"]")
    public static WebElement mattress;
    public void clickMatterss(){mattress.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        mattress.click();}

    //Valentines Day
    @FindBy(css = "/html/body/div[10]/div/a/img[1]")
    public static WebElement valentinesday;
    public void clickValentinesDay(){valentinesday.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        valentinesday.click();}

    //Members only Savings
    @FindBy(css = "//*[@id=\"slick-slide20\"]/a/img")
    public static WebElement memberonlysavings;
    public void clickMemberOnlySavings(){memberonlysavings.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        memberonlysavings.click();}

    //Vizio
    @FindBy(css = "//*[@id=\"100424390_tile_desc\"]/a")
    public static WebElement vizio;
    public void clickVizio(){vizio.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        vizio.click();}

    //Vizio Channel
    @FindBy(css = "//*[@id=\"100367294_tile_desc\"]/a")
    public static WebElement viziochannel;
    public void clickVizioChannel(){viziochannel.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        viziochannel.click();}

    //LG 75 inch TV
    @FindBy(css = "//*[@id=\"100410396_tile_desc\"]/a")
    public static WebElement lg75inchtv;
    public void clickLg75InchTv(){lg75inchtv.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        lg75inchtv.click();}

    //Hisense TV
    @FindBy(css = "//*[@id=\"100404993_tile_desc\"]/a")
    public static WebElement hisensetv;
    public void clickHisenseTv(){hisensetv.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        hisensetv.click();}

    //Samsung UHD TV
    @FindBy(css = "//*[@id=\"100416069_tile_desc\"]/a")
    public static WebElement samsunguhdtv;
    public void clickSamsungUhdTv(){samsunguhdtv.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        samsunguhdtv.click();}

    //TCL TV
    @FindBy(css = "//*[@id=\"100463477_tile_desc\"]/a")
    public static WebElement tcltv;
    public void clickTclTv(){tcltv.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        tcltv.click();}

    //XBox One
    @FindBy(css = "//*[@id=\"100460585_tile_desc\"]/a")
    public static WebElement xboxone;
    public void clickXboxOne(){xboxone.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        xboxone.click();}

    //Google home mini
    @FindBy(css = "//*[@id=\"slick-slide21\"]/a/img")
    public static WebElement googlehomemini;
    public void clickGoogleHomeMini(){googlehomemini.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        googlehomemini.click();}

    //Turbotax
    @FindBy(css = "//*[@id=\"slick-slide22\"]/a/img")
    public static WebElement turbotax;
    public void clickTurboTax(){turbotax.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        turbotax.click();}

    //Murad Serum
    @FindBy(css = "/html/body/div[8]/div[2]/a/img[1]")
    public static WebElement muradserum;
    public void clickMuradSerum(){muradserum.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        muradserum.click();}

    //Relax in Style
    @FindBy(css = "//*[@id=\"Home_Product_Carousel_1_content\"]/div/button[1]")
    public static WebElement rsslide;
    public void clickRsSlide(){rsslide.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        rsslide.click();}

    //Relax in Style 1
    @FindBy(css = "//*[@id=\"Home_Product_Carousel_1_content\"]/div/button[2]")
    public static WebElement rsslide1;
    public void clickRsSlide1(){rsslide1.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        rsslide1.click();}

    //Home Saving
    @FindBy(css = "//*[@id=\"Home_Product_Carousel_2_content\"]/div/button[2]")
    public static WebElement homesavingslide;
    public void clickHomeSavingSlide(){homesavingslide.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
       homesavingslide.click();}

    //Home Saving 1
    @FindBy(css = "//*[@id=\"Home_Product_Carousel_2_content\"]/div/button[1]")
    public static WebElement homesavingslide1;
    public void clickHomeSaving1(){homesavingslide1.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        homesavingslide1.click();}

    //Price Reductions
    @FindBy(css = "//*[@id=\"slick-slide30\"]/a/img")
    public static WebElement pricereduction;
    public void clickPriceReductions(){pricereduction.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        pricereduction.click();}

    //Treasure Hunt
    @FindBy(css = "//*[@id=\"slick-slide31\"]/a/img")
    public static WebElement treasurehunt;
    public void clickTreasureHunt(){treasurehunt.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        treasurehunt.click();}

    //Discover Our Latest Items
    @FindBy(css = "//*[@id=\"slick-slide32\"]/a/img")
    public static WebElement discoverourlatestitem;
    public void clickDiscoverOurLatestItem(){discoverourlatestitem.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        discoverourlatestitem.click();}

    //Exciting Products for a Limited-Time
    @FindBy(css = "//*[@id=\"slick-slide33\"]/a/img")
    public static WebElement excitingproductsforalimitedtime;
    public void clickExcitingProductsForALimitedTime(){excitingproductsforalimitedtime.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        excitingproductsforalimitedtime.click();}

    //Healthy Eating
    @FindBy(css = "//*[@id=\"slick-slide40\"]/a/img")
    public static WebElement healthyeating;
    public void clickHealthyEating(){healthyeating.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        healthyeating.click();}

    //Royal Shredder
    @FindBy(css = "//*[@id=\"slick-slide41\"]/a/img")
    public static WebElement royalshredder;
    public void clickRoyalShredder(){royalshredder.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        royalshredder.click();}

    //Better Health
    @FindBy(css = "//*[@id=\"slick-slide42\"]/a/img")
    public static WebElement betterhealth;
    public void clickBetterHealth(){betterhealth.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        betterhealth.click();}

    //Green Mountain 100ct K-Cups
    @FindBy(css = "//*[@id=\"slick-slide43\"]/a/img")
    public static WebElement gmcups;
    public void clickGMCups(){gmcups.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        gmcups.click();}

    //Same Day Delivery
    @FindBy(xpath = "/html/body/div[13]/div/a[1]/div/img")
    public static WebElement samedaydelivery;
    public void clickSameDayDelivery(){samedaydelivery.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        samedaydelivery.click();}

    //Two Day Delivery
    @FindBy(xpath = "/html/body/div[13]/div/a[2]/div/img")
    public static WebElement twodaydelivery;
    public void clickTwoDayDelivery(){twodaydelivery.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        twodaydelivery.click();}

    //Everyday Purchase Rewards
    @FindBy(xpath = "/html/body/div[13]/div/div[1]/a/div/div/div")
    public static WebElement everydaypurchaserewards;
    public void clickEverydayPurchaseRewards(){everydaypurchaserewards.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        everydaypurchaserewards.click();}

    //The Costco Connection
    @FindBy(xpath = "/html/body/div[13]/div/div[2]/a/div/div")
    public static WebElement costcoconnection;
    public void clickCostcoConnection(){costcoconnection.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        costcoconnection.click();}

    //January Entertainment
    @FindBy(xpath = "/html/body/div[13]/div/div[3]/a/div/div")
    public static WebElement januaryentertainment;
    public void clickJanuaryEntertainment(){januaryentertainment.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        januaryentertainment.click();}

    //Join the Club
    @FindBy(xpath = "/html/body/div[13]/div/div[4]/a/div/div/p[1]")
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
    @FindBy(css = "//*[@id=\"footer-list\"]/div/div[1]/ul/li[7]/a")
    public static WebElement jobs;
    public void clickJobs(){jobs.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        jobs.click();}

    //Costco Company Information
    @FindBy(css = "//*[@id=\"footer-list\"]/div/div[1]/ul/li[4]/a")
    public static WebElement recalls;
    public void clickRecalls(){recalls.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        recalls.click();}

    //Costco Cash Card Balance
    @FindBy(xpath = "//*[@id=\"footer-list\"]/div/div[3]/ul/li[3]/a")
    public static WebElement cashcardbalance;
    public void clickCashCardBalance(){cashcardbalance.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        cashcardbalance.click();}

    //Costco Credit Card
    @FindBy(xpath = "//*[@id=\"footer-list\"]/div/div[2]/ul[1]/li[6]/a")
    public static WebElement hoursandholidayclosures;
    public void clickHoursAndHolidayClosures(){hoursandholidayclosures.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        hoursandholidayclosures.click();}

    //Costco Gasoline
    @FindBy(xpath = "//*[@id=\"footer-list\"]/div/div[4]/ul/li[6]/a")
    public static WebElement gasoline;
    public void clickGasoline(){gasoline.click();
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().
                getName()));
        gasoline.click();}

    //Email offer
    public void costcogetemailoffer(){
        typeOnElementNEnter("#footer-email-offer", "animesh.rahman@gmail.com");
        clickElement("//*[@id=\"email-signup-dropdown\"]");
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
