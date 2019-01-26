package searchCiti;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class BankingOption extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"banking\"]/a")
    public static WebElement banking;
    @FindBy(xpath = "//*[@id=\"stateSelectorSelectId\"]")
    public static WebElement state;
    @FindBy(xpath = "//*[@id=\"modal-dialog__e-2\"]/div/div[3]/div/button[1]")
    public static WebElement select;
    @FindBy(xpath = "//*[@id=\"modal-dialog__e-2\"]/div/button")
    public static WebElement close;
    @FindBy(xpath = "//*[@id=\"inpagenav-1-1-a-Tab\"]/span")
    public static WebElement checking;


    @FindBy(xpath = "//strong[contains(text(),'Find your best fit')]")
    public static WebElement findBtn;
    @FindBy(xpath = "//*[@id=\"e-1-0-tool-select\"]")
    public static WebElement amountBtn;
    @FindBy(xpath = "//*[@id=\"e-1-0-tool-checkbox-aLabel\"]")
    public static WebElement paperChecksBtn;
    @FindBy(xpath = "//*[@id=\"e-1-0-tool-a\"]/div/form/div[4]/div/div/button[2]")
    public static WebElement amountClearBtn;
    @FindBy(xpath = "//*[@id=\"e-1-0-tool-a\"]/div/form/div[4]/div/div/button[1]")
    public static WebElement seeResult;
    @FindBy(xpath = "//*[@id=\"packageAccessAccount\"]/section/div/div/div/div[3]/div/div/a")
    public static WebElement seeDetailsBtn;
    @FindBy(xpath = "//*[@id=\"applyonline\"]")
    public static WebElement applyOnLineBtn;
    @FindBy(xpath = "//*[@id=\"acs-963\"]")
    public static WebElement titelBtn;
    @FindBy(xpath = "//*[@id=\"acs-965\"]")
    public static WebElement firstNameBtn;
    @FindBy(xpath = "//*[@id=\"acs-967\"]")
    public static WebElement middleNameBtn;
    @FindBy(xpath = "//*[@id=\"acs-969\"]")
    public static WebElement lastNameBtn;
    @FindBy(xpath = "//*[@id=\"acs-972\"]")
    public static WebElement suffixBtn;
    @FindBy(xpath = "//*[@id=\"acs-974\"]")
    public static WebElement emailAddressBtn;
    @FindBy(xpath = "//*[@id=\"acs-979\"]")
    public static WebElement phoneNumBtn;
    @FindBy(xpath = "//*[@id=\"acs-991\"]")
    public static WebElement addressBtn;
    @FindBy(xpath = "//*[@id=\"acs-1010\"]")
    public static WebElement unitNumBtn;

    public void bankingOpt() {
        banking.click();
    }
    public void stateOpt() {
        bankingOpt();
        state.sendKeys("NY");
    }
    public void selectOpt() {
        bankingOpt();
        select.click();
    }
    public void closeOpt() {
        bankingOpt();
        close.click();
    }
    public void checkingOpt() {
        stateOpt();
        close.click();
    }
}
//        checkingBtn.click();
//        findBtn.click();
//        amountBtn.sendKeys("$0-9999");
//        paperChecksBtn.click();
//        amountClearBtn.click();
//        amountBtn.sendKeys("$0-9999");
//        seeResult.click();
//        seeDetailsBtn.click();
//        applyOnLineBtn.click();
//        titelBtn.sendKeys("Mr.");
//        firstNameBtn.sendKeys("Sayed");
//        middleNameBtn.sendKeys("Mohammad");
//        lastNameBtn.sendKeys("Hasanul Karim");
//        suffixBtn.click();
//        suffixBtn.click();
//        emailAddressBtn.sendKeys("m.hasanulkarim@gmail.com");
//        phoneNumBtn.sendKeys("646-875-6302");
//        addressBtn.sendKeys("Dawson lane, Jericho,NY");
//        unitNumBtn.sendKeys("132");
//        navigateBack();
//    }


