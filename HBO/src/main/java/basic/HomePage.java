package basic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

@FindBy (how =How.XPATH, using = "/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div/div/div")
public static WebElement searchButton;

public static WebElement getSearchButton() {return searchButton;}

public void clickOnSearchButton () {getSearchButton().click();}

@FindBy (how = How.XPATH, using = "/html/body/main/div[1]/div/div/header/div[1]/div/div[3]/div/a/span")
public static WebElement getHBO;

public static WebElement getGetHBO() {return getHBO;}
public void clickonGetHBO () {getGetHBO().click();}

}
