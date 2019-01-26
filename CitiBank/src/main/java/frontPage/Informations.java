package frontPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Informations extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"mm-container\"]/section[1]/div/h3/a")
    public static WebElement lowRate;
    @FindBy(xpath = "//*[@id=\"mm-container\"]/section[2]/div/h3/a")
    public static WebElement newCitiRewards ;
    @FindBy(xpath = "//*[@id=\"mm-container\"]/section[3]/div/h3/a")
    public static WebElement advantageOfCards;
    @FindBy(xpath = "//*[@id=\"mm-container\"]/section[1]/div/div[2]/a")
    public static WebElement learnLowRate;
    @FindBy(xpath = "//*[@id=\"mm-container\"]/section[2]/div/div[2]/a")
    public static WebElement learnNewCitiRewards;
    @FindBy(xpath = "//*[@id=\"mm-container\"]/section[3]/div/div[2]/a")
    public static WebElement learnAdvantageOfCards ;
    @FindBy(xpath = "//*[@id=\"module-container\"]/section[1]/div/div/div/div/div[1]/div/a/img")
    public static WebElement experienceMore  ;
    @FindBy(xpath = "//a[@type='button']")
    public static WebElement learnExperienceMore ;
    @FindBy(xpath = "//*[@id=\"module-container\"]/section[2]/div/div/div/div/div[1]/div/a/img")
    public static WebElement financialCheckUp;
    @FindBy(xpath = "//a[@class='btn btn-primary'][contains(text(),'Learn More')]")
    public static WebElement learnFinancialCheckUp;
    @FindBy(xpath = "//*[@id=\"module-container\"]/section[3]/div/div/div/div/div[1]/a/div")
    public static WebElement familyCyberSafty;
    @FindBy(xpath = "//*[@id=\"module-container\"]/section[3]/div/div/div/div/div[2]/div/a/p")
    public static WebElement learnFamilyCyberSafty;

    public void lowRateOption(){lowRate.click();}
    public void newCitiRewardsOption(){newCitiRewards.click();}
    public void advantageOfCardsOption(){advantageOfCards.click();}
    public void learnLowRateOption(){learnLowRate.click();}
    public void learnNewCitiRewardsOption(){learnNewCitiRewards.click();}
    public void learnAdvantageOfCardsOption(){learnAdvantageOfCards.click();}
    public void experienceMoreOption(){experienceMore.click();}
    public void learnExperienceMoreOption(){learnExperienceMore.click();}
    public void financialCheckUpOption(){financialCheckUp.click();}
    public void learnFinancialCheckUpOption(){learnFinancialCheckUp.click();}
    public void familyCyberSaftyOption(){familyCyberSafty.click();}
    public void learnFamilyCyberSaftyOption(){learnFamilyCyberSafty.click();}
}
