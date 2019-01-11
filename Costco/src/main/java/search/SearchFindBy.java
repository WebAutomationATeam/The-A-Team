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

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
    public WebElement getCostco;

    public WebElement getGetCostco() {
        return getCostco;
    }
    public void clickonGetCostco() {
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getGetCostco().click();
    }

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

    @FindBy (css="body.en div.container-fluid.fixed-container div.table-container.parent div.table-row div.table-cell.logo.hidden-xs.hidden-sm.hidden-md.hidden-lg:nth-child(1) a:nth-child(1) > img.bc-logo.logo-us")
    public WebElement CostcoLogo;                                                                                       // Costco Logo
    public void clickOnLogo () {
        CostcoLogo.click(); }

        @FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]")                      //view warehouse savings
    public WebElement viewwarehousesavings;
    public void clickviewwarehousesavings(){
        viewwarehousesavings.click();
    }

    @FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[4]/a[1]")                          //Customer Service
    public WebElement customerservice;
    public void clickCustomerService () {
        customerservice.sendKeys("Game of Thrones", Keys.ENTER);
    }

    @FindBy(xpath = "/html[1]/body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[3]/a[1]")                          //Get email Offer
    public WebElement emailoffer;
    public void clickEmailOffer () { emailoffer.sendKeys("Game of Thrones", Keys.ENTER); }

    @FindBy(css = "#Home_Ancillary_0")                                                                                  //click grocery
    public static WebElement grocery;
    public void clickGrocery(){grocery.click();}



}


