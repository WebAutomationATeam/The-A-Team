package basic;

import Util.TestLogger;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends CommonAPI {

@FindBy (how =How.XPATH, using = "/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div/div/div")
public  WebElement searchButton;
public  WebElement getSearchButton() {return searchButton;}
public void clickOnSearchButton () {
    TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    getSearchButton().click();}

@FindBy (how = How.XPATH, using = "/html/body/main/div[1]/div/div/header/div[1]/div/div[3]/div/a/span")
public  WebElement getHBO;
public  WebElement getGetHBO() {return getHBO;}
public void clickonGetHBO () {
    TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    getGetHBO().click();}

@FindBy (how = How.XPATH, using = "//div[@class='bands/MainNavigation--stickyBar']//span[@class='components/Tooltip--label']")
public WebElement signIn;
public WebElement getSignIn() {return signIn;}
public void clickOnSignIn() {
    TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    getSignIn();}
}
