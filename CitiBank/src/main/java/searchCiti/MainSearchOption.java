package searchCiti;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class MainSearchOption extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"headerLoka ogoLink\"]/div")
    public static WebElement leftHeaderLogo;
    @FindBy(xpath = "//*[@id=\"searchicon\"]")
    public static WebElement rightSearchTab;
    @FindBy(xpath = "//*[@id=\"citi-autocomplete-content-searchbox-livesearch\"]")
    public static WebElement searchBox;
    @FindBy(xpath = "//*[@id=\"citi-autocomplete-content\"]/div[1]/button[2]")
    public static WebElement searchButton;
    @FindBy(xpath = "//*[@id=\"citi-full-search-content\"]")
    public static WebElement helpNSupport;
    @FindBy(xpath = "//*[@id=\"citi-full-search-content\"]")
    public static WebElement navigateCiti;
    @FindBy(xpath = "//*[@id=\"SummaryRecentTransactions-label\"]")
    public static WebElement question1;
    @FindBy(xpath = "//*[@id=\"DownloadAcountActivity-label\"]")
    public static WebElement question2;
    @FindBy(xpath = "//*[@id=\"DownloadingAccountActivityMicrosoftMoney-label\"]")
    public static WebElement question3;
    @FindBy(xpath = "//*[@id=\"ChecksEligibleDirectDeposit-label\"]")
    public static WebElement question4;
    @FindBy(xpath = "//*[@id=\"DownloadCreditCardTransactionsStartingQuicken-label\"]")
    public static WebElement question5;
    @FindBy(xpath = "//*[@id=\"RWD_ElegibleTransactions-label\"]")
    public static WebElement question6;
    @FindBy(xpath = "//*[@id=\"DisputeCreditCardAccountCharge-label\"]")
    public static WebElement question7;
    @FindBy(xpath = "//*[@id=\"ManageDisputeCreditCardAccount-label\"]")
    public static WebElement question8;
    @FindBy(xpath = "//*[@id=\"FindInfoAboutUnrecognizedChargeCrdtCrd-label\"]")
    public static WebElement question9;
    @FindBy(xpath = "//*[@id=\"AuthorizationCodeDefined-label\"]")
    public static WebElement question10;
    @FindBy(xpath = "//*[@id=\"citi-full-search-content\"]/div[3]/nav/ul/li[4]/a")
    public static WebElement page2;
    @FindBy(xpath = "//*[@id=\"GettingInformationAboutChecksYouveWritten-label\"]")
    public static WebElement question11;
    @FindBy(xpath = "//*[@id=\"CancelOnlinePymt-label\"]")
    public static WebElement question12;
    @FindBy(xpath = "//*[@id=\"ChangingCancellingScheduledPayment-label\"]")
    public static WebElement question13;
    @FindBy(xpath = "//*[@id=\"citi-full-search-content\"]")
    public static WebElement page1;

    public void searchOpt(){
        leftHeaderLogo.click();
        rightSearchTab.click();
        searchBox.sendKeys("My Transactions");
        searchButton.click();
        helpNSupport.click();
        helpNSupport.click();
        navigateCiti.click();
        navigateCiti.click();
        question1.click();
        question1.click();
        question2.click();
        question2.click();
        question3.click();
        question3.click();
        question4.click();
        question4.click();
        question5.click();
        question5.click();
        question6.click();
        question6.click();
        question7.click();
        question7.click();
        question8.click();
        question8.click();
        question9.click();
        question9.click();
        question10.click();
        question10.click();
        page2.click();
        question11.click();
        question11.click();
        question12.click();
        question12.click();
        question13.click();
        question13.click();
        page1.click();
        leftHeaderLogo.click();
    }
}