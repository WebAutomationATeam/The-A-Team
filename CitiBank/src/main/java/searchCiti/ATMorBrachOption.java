package searchCiti;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ATMorBrachOption extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"navUtility\"]/div/div/ul/li[1]/a")
    WebElement atmBranch;
    @FindBy(xpath ="//button[@id='personetics-citi-menu']")
    WebElement search;
    @FindBy(xpath ="//*[@id=\"search\"]")
    WebElement addressBox;
    @FindBy(xpath ="//*[@id=\"search\"]")
    WebElement searchAddress;
    @FindBy(xpath ="//*[@id=\"null-label\"]")
    WebElement filter;
    @FindBy(xpath = "//button[@id='personetics-citi-menu']")
    WebElement signOn;
    @FindBy(xpath = "//*[@id=\"locateMeButton\"]/button")
    WebElement locateMe;
    @FindBy(xpath = "//*[@id=\"id_30880\"]/citi-cta[1]/button")
    WebElement viewDetails;
    @FindBy(xpath = "//*[@id=\"id_30880\"]/citi-cta[2]/button")
    WebElement getDirections;
    @FindBy(xpath ="//label[@id='atms-label']")
    WebElement atms;
    @FindBy(xpath ="//label[@id='branches-label']")
    WebElement branch;
    @FindBy(xpath ="//label[@id='rm-label']")
    WebElement relationshipManager;
    @FindBy(xpath ="//label[@id='hlo-label']")
    WebElement homelending;
    @FindBy(xpath ="//label[@id='ibc-label']")
    WebElement internationalBanking;
    @FindBy(xpath ="//label[@id='fa-label']")
    WebElement financialAdvisor;
    @FindBy(xpath ="//label[@id='fullservice-label']")
    WebElement fullService;
    @FindBy(xpath ="//label[@id='cdatms-label']")
    WebElement checkDepositeATM;
    @FindBy(xpath ="//label[@id='duatms-label']")
    WebElement driveUp;
    @FindBy(xpath ="//button[contains(text(),'Apply Filters')]")
    WebElement apply;

    public void atmBranchOpt(){
        atmBranch.click();}
    public void searchATMBranchOpt(){
        atmBranchOpt();
        search.click();}
    public void inserAddressBoxOpt(){
        atmBranchOpt();
        addressBox.sendKeys("132 Dawson Lane Jericho,NY,USA");}
    public void searchAddressOpt(){
        inserAddressBoxOpt();
        searchAddress.click();}
    public void filterOpt(){
        searchAddressOpt();
        filter.click();}
    public void signOnOpt(){
        atmBranchOpt();
        signOn.click();}
    public void locateMeOpt(){
        inserAddressBoxOpt();
        locateMe.click();}
    public void viewDetailsOpt(){
        inserAddressBoxOpt();
        viewDetails.click();}
    public void getDirectionsOpt(){
        inserAddressBoxOpt();
        getDirections.click();}
    public void atmsOpt(){
        filterOpt();
        atms.click();}
    public void branchOpt(){
        filterOpt();
        branch.click();}
    public void relationshipManagerOpt(){
        filterOpt();
        relationshipManager.click();}
    public void homelendingOpt(){
        filterOpt();
        homelending.click();}
    public void internationalBankingOpt(){
        filterOpt();
        internationalBanking.click();}
    public void financialAdvisorOpt(){
        filterOpt();
        financialAdvisor.click();}
    public void fullServiceOpt(){
        filterOpt();
        fullService.click();}
    public void checkDepositeATMOpt(){
        filterOpt();
        checkDepositeATM.click();}
    public void driveUpOpt(){
        filterOpt();
        driveUp.click();}
    public void applyOpt(){
        filterOpt();
        apply.click();}
}
