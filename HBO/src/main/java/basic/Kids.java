package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Kids {

    @FindBy (xpath = "/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div/div/ul/li[5]/div/a")
    public WebElement kids;

    @FindBy (xpath = "/html/body/main/div[2]/div/div/div[1]/div[2]/div[2]/section/div/div/div/div[1]/div/a/img")
    public WebElement Esme;


}
