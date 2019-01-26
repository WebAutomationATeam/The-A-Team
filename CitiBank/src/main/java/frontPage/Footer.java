package frontPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Footer extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"whyCiti\"]/ul/li[1]/a")
    public static WebElement ourStory ;
    @FindBy(xpath = "//*[@id=\"whyCiti\"]/ul/li[2]/a")
    public static WebElement careers;
    @FindBy(xpath = "//*[@id=\"whyCiti\"]/ul/li[3]/a")
    public static WebElement benifitNServices;
    @FindBy(xpath = "//*[@id=\"whyCiti\"]/ul/li[4]/a")
    public static WebElement rewards;
    @FindBy(xpath = "//*[@id=\"whyCiti\"]/ul/li[4]/a")
    public static WebElement citiEasyDeals;
    @FindBy(xpath = "//*[@id=\"whyCiti\"]/ul/li[6]/a")
    public static WebElement citiPrivatePass;
    @FindBy(xpath = "//*[@id=\"whyCiti\"]/ul/li[7]/a")
    public static WebElement socialOffers ;
    @FindBy(xpath = "//*[@id=\"mobileStyle\"]/div[2]/div/div[2]/ul/li[1]/a")
    public static WebElement citiPriority ;
    @FindBy(xpath = "//*[@id=\"mobileStyle\"]/div[2]/div/div[2]/ul/li[2]/a")
    public static WebElement citiGoldFooter;
    @FindBy(xpath = "//*[@id=\"mobileStyle\"]/div[2]/div/div[2]/ul/li[3]/a")
    public static WebElement citiPrivateBank;
    @FindBy(xpath = "//*[@id=\"mobileStyle\"]/div[2]/div/div[3]/ul/li[1]/a")
    public static WebElement smallBusinessAccounts;
    @FindBy(xpath = "//*[@id=\"mobileStyle\"]/div[2]/div/div[3]/ul/li[2]/a")
    public static WebElement commercialAccounts;
    @FindBy(xpath = "//*[@id=\"mobileStyle\"]/div[2]/div/div[4]/ul/li[1]/a")
    public static WebElement personalBanking ;
    @FindBy(xpath = "//*[@id=\"mobileStyle\"]/div[2]/div/div[4]/ul/li[2]/a")
    public static WebElement creditCardsFooter ;
    @FindBy(xpath = "//*[@id=\"mobileStyle\"]/div[2]/div/div[4]/ul/li[3]/a")
    public static WebElement mortgage;
    @FindBy(xpath = "//*[@id=\"mobileStyle\"]/div[2]/div/div[4]/ul/li[4]/a")
    public static WebElement homeEquity;
    @FindBy(xpath = "//*[@id=\"mobileStyle\"]/div[2]/div/div[4]/ul/li[5]/a")
    public static WebElement lendingFooter;
    @FindBy(xpath = "//*[@id=\"mobileStyle\"]/div[2]/div/div[5]/ul/li[1]/a")
    public static WebElement contactUs;
    @FindBy(xpath = "//*[@id=\"mobileStyle\"]/div[2]/div/div[5]/ul/li[2]/a")
    public static WebElement helpNFAQ;
    @FindBy(xpath = "//*[@id=\"mobileStyle\"]/div[2]/div/div[5]/ul/li[3]/a")
    public static WebElement securityCenter ;
    @FindBy(xpath = "/html/body/footer/div/div[3]/ul/li[1]/a")
    public static WebElement termsNCondition;
    @FindBy(xpath = "/html/body/footer/div/div[3]/ul/li[2]/a")
    public static WebElement privacy;
    @FindBy(xpath = "/html/body/footer/div/div[3]/ul/li[3]/a")
    public static WebElement accessibility;
    @FindBy(xpath = "//*[@id=\"countryLink\"]")
    public static WebElement countryNJurisdictions;
    @FindBy(xpath = "//*[@id=\"feedbackLink\"]")
    public static WebElement feedback;

    public void ourStoryOption(){ourStory.click();}
    public void careersOption(){careers.click();}
    public void benifitNServicesOption(){benifitNServices.click();}
    public void rewardsOption(){rewards.click();}
    public void citiEasyDealsOption(){citiEasyDeals.click();}
    public void citiPrivatePassOption(){citiPrivatePass.click();}
    public void socialOffersOption(){socialOffers.click();}
    public void citiPriorityOption(){citiPriority.click();}
    public void citiGoldFooterOption(){citiGoldFooter.click();}
    public void citiPrivateBankOption(){citiPrivateBank.click();}
    public void smallBusinessAccountsOption(){smallBusinessAccounts.click();}
    public void commercialAccountsOption(){commercialAccounts.click();}
    public void personalBankingOption(){personalBanking.click();}
    public void creditCardsFooterOption(){creditCardsFooter.click();}
    public void mortgageOption(){mortgage.click();}
    public void homeEquityOption(){homeEquity.click();}
    public void lendingFooterOption(){lendingFooter.click();}
    public void contactUsOption(){contactUs.click();}
    public void helpNFAQOption(){helpNFAQ.click();}
    public void securityCenterOption(){securityCenter.click();}
    public void termsNConditionOption(){termsNCondition.click();}
    public void privacyOption(){privacy.click();}
    public void accessibilityOption(){accessibility.click();}
    public void countryNJurisdictionsOption(){countryNJurisdictions.click();}
    public void feedbackOption(){feedback.click();}
}