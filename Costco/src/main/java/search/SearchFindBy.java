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

}


