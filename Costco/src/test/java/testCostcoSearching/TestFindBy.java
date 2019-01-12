package testCostcoSearching;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import search.SearchFindBy;
public class TestFindBy extends SearchFindBy {

    SearchFindBy sfb = null;
    @BeforeMethod
    public void initializeElement () { sfb=PageFactory.initElements(driver,SearchFindBy.class); }


    @Test
    public void Test () {
    sfb = PageFactory.initElements(driver, SearchFindBy.class);
       //TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    sfb.clickOnSearchButton(); }

    @Test
    public void clickonGetCostcoAll() {
    sfb = PageFactory.initElements(driver,SearchFindBy.class);
    sfb.clickonGetCostcoAll(); }

    @Test
    public void clickOnSignIn() {
    sfb = PageFactory.initElements(driver,SearchFindBy.class);
    sfb.clickOnSignIn();}

    @Test
    public void clickCostcologo () {sfb.clickCostcoLogo();}

    @Test
    public void clickViewWareHouSesavings(){viewwarehousesavings.click();}

    @Test
    public void clickCustomerService(){customerservice.click();}

    @Test
    public void clickEmailOffer(){emailoffer.click();}

    @Test
    public void clickGrocery(){grocery.click();}

    @Test
    public void clickBusinessDelivdery(){businessdelivery.click();}

    @Test
    public void clickOptical(){searchoptical.click();}

    @Test
    public void clickPharmacy(){pharmacy.click();}

    @Test
    public void clickPhoto(){photo.click();}

    @Test
    public void clickTravel(){travel.click();}

    @Test
    public void clickSlide(){slide.click();}

    @Test
    public void clickSlide1(){slide1.click();}

    @Test
    public void clickCart(){cart.click();}

    @Test
    public void clickCashCard(){cashcard.click();}

    @Test
    public void clickAppliances(){appliances.click();}

    @Test
    public void clickTv(){tv.click();}

    @Test
    public void clickComputer(){computer.click();}

    @Test
    public void clickMatterss(){mattress.click();}

    @Test
    public void clickMemberOnlySavings(){memberonlysavings.click();}

    @Test
    public void clickGoogleHomeMini(){googlehomemini.click();}

    @Test
    public void clickTurboTax(){turbotax.click();}

    @Test
    public void clickMuradSerum(){muradserum.click();}

    @Test
    public void clickRsSlide(){rsslide.click();}

    @Test
    public void clickRsSlide1(){rsslide1.click();}

    @Test
    public void clickHomeSavingSlide(){homesavingslide.click();}

    @Test
    public void clickHomeSavingSlide1(){homesavingslide1.click();}

    @Test
    public void clickPriceReductions(){pricereduction.click();}

    @Test
    public void clickTreasureHunt(){treasurehunt.click();}

    @Test
    public void clickDiscoverOurLatestItem(){discoverourlatestitem.click();}

    @Test
    public void clickExcitingProductsForALimitedTime(){excitingproductsforalimitedtime.click();}

    @Test
    public void clickHealthyEating(){healthyeating.click();}

    @Test
    public void clickRoyalShredder(){royalshredder.click();}

    @Test
    public void clickBetterHealth(){betterhealth.click();}

    @Test
    public void clickGMCups(){gmcups.click();}

    @Test
    public void clickSameDayDelivery(){samedaydelivery.click();}

    @Test
    public void clickTwoDayDelivery(){twodaydelivery.click();}

    @Test
    public void clickEverydayPurchaseRewards(){everydaypurchaserewards.click();}

    @Test
    public void clickCostcoConnection(){costcoconnection.click();}

    @Test
    public void clickJanuaryEntertainment(){januaryentertainment.click();}

    @Test
    public void clickJoinTheClub(){jointheclub.click();}

    @Test
    public void clickSponsoredProductsSlide(){sponsoredproductsslide.click();}

    @Test
    public void clickSponsoredProductsSlide1(){sponsoredproductsslide1.click();}

    @Test
    public void clickJobs(){jobs.click();}

    @Test
    public void clickCompanyInfo(){companyinfo.click();}

    @Test
    public void clickCreditCard(){creditcard.click();}

    @Test
    public void clickCashCardBalance(){cashcard.click();}

    @Test
    public void clickGasoline(){gasoline.click();}

    @Test
    public void costcogetemailoffer(){costcogetemailoffer();}













}