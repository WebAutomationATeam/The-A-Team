package searchCiti;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreditCardOption extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"creditCards\"]/a")
    WebElement creditCards;
    @FindBy(xpath = "//*[@id=\"globalSearchTool\"]/a")
    WebElement searchCiti;
    @FindBy(xpath = "//*[@id=\"banking\"]")
    WebElement banking;
    @FindBy(xpath = "//*[@id=\"creditcards\"]")
    WebElement creditcards;
    @FindBy(xpath = "//*[@id=\"lending\"]")
    WebElement lending;
    @FindBy(xpath = "//*[@id=\"investing\"]")
    WebElement investing;
    @FindBy(xpath = "//*[@id=\"business\"]")
    WebElement business;
    @FindBy(xpath = "//*[@id=\"rewards\"]")
    WebElement rewardsNOffers;
    @FindBy(xpath = "//*[@id=\"services\"]")
    WebElement services;
    @FindBy(xpath = "//*[@id=\"citigold\"]")
    WebElement citiGold;
    @FindBy(xpath = "//*[@id=\"OutMsgtxt0\"]/u/a")
    WebElement helpToHelp;
    @FindBy(xpath = "//*[@id=\"cA-DD-taskbarMenu\"]/div[1]/div[1]/div/a")
    WebElement viewAllCreditCards;
    @FindBy(xpath = "//*[@id=\"cA-DD-taskbarMenu\"]/div[1]/div[1]/div/a")
    WebElement selectCardCategory;
    @FindBy(xpath = "//*[@id=\"cA-DD-searchLabelText\"]/a")
    WebElement searchCards;
    @FindBy(xpath = "//*[@id=\"compareWidget\"]/div[1]/a")
    WebElement compareCards;
    @FindBy(xpath = "//*[@id=\"cA-DD-simp-banner-2014\"]/div/div[1]/a")
    WebElement learnMore;
    @FindBy(xpath = "//*[@id=\"cA-DD-simp-banner-2014\"]/div/a/img")
    WebElement citiSimplicityCard;
    @FindBy(xpath = "//*[@id=\"cmlink_Prequalified_DD\"]")
    WebElement preQualify;
    @FindBy(xpath = "//*[@id=\"cmlink_OfferbyMail_DD\"]")
    WebElement creditCardOfferByMail;
    @FindBy(xpath = "//*[@id=\"cmlink_ApplicationStatus_DD\"]")
    WebElement creditCardApplicationStatus;
    @FindBy(xpath = "//*[@id=\"cA-DD-homeCarouselPrev\"]")
    WebElement prevSlidingArrow;
    @FindBy(xpath = "//*[@id=\"cA-DD-homeCarouselNext\"]")
    WebElement nextSlidingArrow;

    public void creditCardsOpt(){
        creditCards.click();}
    public void searchCitiOpt(){
        creditCardsOpt();
        searchCiti.click();}
    public void bankingOpt(){
        creditCardsOpt();
        banking.click();}
    public void creditcardsOpt(){
        creditCardsOpt();
        creditcards.click();}
    public void lendingOpt(){
        creditCardsOpt();
        lending.click();}
    public void investingOpt(){
        creditCardsOpt();
        investing.click();}
    public void businessOpt(){
        creditCardsOpt();
        business.click();}
    public void rewardsNOffersOpt(){
        creditCardsOpt();
        rewardsNOffers.click();}
    public void servicesOpt(){
        creditCardsOpt();
        services.click();}
    public void citiGoldOpt(){
        creditCardsOpt();
        citiGold.click();}
    public void helpToHelpOpt(){
        creditCardsOpt();
        helpToHelp.click();}
    public void viewAllCreditCardsOpt(){
        creditCardsOpt();
        viewAllCreditCards.click();}
    public void selectCardCategoryOpt(){
        creditCardsOpt();
        selectCardCategory.click();}
    public void searchCardsOpt(){
        creditCardsOpt();
        searchCards.click();}
    public void compareCardsOpt(){
        creditCardsOpt();
        compareCards.click();}
//    public void learnMoreOpt() throws Exception{
//        creditCardsOpt();
//        waitToBeVisible("//*[@id=\"cA-DD-simp-banner-2014\"]/div/div[1]/a");
//        learnMore.click();}
//    public void citiSimplicityCardOpt() throws Exception{
//        creditCardsOpt();
//       waitToBeVisible("//*[@id=\"cA-DD-simp-banner-2014\"]/div/a/img");
//        citiSimplicityCard.click();}
    public void preQualifyOpt(){
        creditCardsOpt();
        preQualify.click();}
    public void creditCardOfferByMailOpt(){
        creditCardsOpt();
        creditCardOfferByMail.click();}
    public void creditCardApplicationStatusOpt(){
        creditCardsOpt();
        creditCardApplicationStatus.click();}
//    public void prevSlidingArrowOpt(){
//        creditCardsOpt();
//        waitToBeVisible(prevSlidingArrow);
//        prevSlidingArrow.click();}
//    public void nextSlidingArrowOpt(){
//        creditCardsOpt();
//        waitToBeVisible(nextSlidingArrow);
//        nextSlidingArrow.click();}
}