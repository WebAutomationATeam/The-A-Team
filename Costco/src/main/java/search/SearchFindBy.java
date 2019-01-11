package search;

import Util.TestLogger;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

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
}

