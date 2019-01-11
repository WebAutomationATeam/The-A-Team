package basic;

import Util.TestLogger;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;
import java.util.List;

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
   getGetHBO().click(); }

@FindBy (how = How.XPATH, using = "//div[@class='bands/MainNavigation--stickyBar']//span[@class='components/Tooltip--label']")
public WebElement signIn;
public WebElement getSignIn() {return signIn;}
public void clickOnSignIn() {
    TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    getSignIn();}

@FindBy (css="body > main > div.navigationband.basecomponent > div > div > header > div.components\\2f Band--maxWidth > div > div.bands\\2f MainNavigation--leftSlot > span > a > svg > g > g > path")
public WebElement HBOLogo;
public void clickOnLogo () {
    HBOLogo.click(); }

    @FindBy(xpath = "//div[contains(@class,'bands/MainNavigation--searchIcon')]")
    public WebElement searchlink;
    public void clicksearchlink(){
        searchlink.click();
    }

    @FindBy(xpath = "//input[@placeholder='Search']")
    public WebElement searchBox;
    public void sendInput () {
        searchBox.sendKeys("Game of Thrones", Keys.ENTER);
    }

    @FindBy(css = ".bands\\/MainNavigation--topBar [href='\\/series']")
    public static WebElement series;
    public void findSeries(){series.click();}

    @FindBy(css = ".bands\\/MainNavigation--topBar [href='\\/movies']")
    public static WebElement movies;
    public void findMovies(){movies.click();}

    @FindBy(css = ".bands\\/MainNavigation--topBar [href='\\/watch-free-episodes']")
    public static WebElement searchFreeEpisodes;
    public void getFreeEpisodes(){searchFreeEpisodes.click();}

    @FindBy(css = ".wrapperMain .basecomponent:nth-of-type(4) .components\\/CarouselButton--next [points]")
    public static WebElement slide;

    @FindBy(css = ".wrapperMain .basecomponent:nth-of-type(4) .components\\/CarouselButton--previous [viewBox]")
    public static WebElement slide1;

    @FindBy(css = ".modules\\/cards\\/BasicCard--flexContainer [src='\\/content\\/dam\\/hbodata\\/series\\/camping\\/camping-ka-1920\\.jpg\\/_jcr_content\\/renditions\\/cq5dam\\.web\\.1200\\.675\\.jpeg']")
    public static WebElement image;

    @FindBy(css = ".modules\\/InlineVideoHero--right .__player-playpause")
    public static WebElement playPause;

    @FindBy(css = ".bands\\/MainNavigation--topBar .components\\/BasicButton--children")
    public static WebElement service;

    @FindBy(css = "[href='http\\:\\/\\/www\\.facebook\\.com\\/HBO']")
    public static WebElement link;

    @FindBy(partialLinkText = "[href='http\\:\\/\\/www\\.hbogo\\.com\\/\\?icid\\=hbo_edu_go_start\\&_ga\\=2\\.177753701\\.1329746051\\.1539388045-417017646\\.1537570844'] .components\\/Cta--label")
    public static WebElement getStartedLink;

    @FindBy(xpath = "//div[@id=\"J_SC_header\"]/header/div[2]/div[1]/div/div/h3")
    public static WebElement categories;

    @FindBy(partialLinkText = "Machinery")
    private WebElement machinery;

    @FindBy(partialLinkText = "Hand Tools")
    private WebElement handTools;

    @FindBy(xpath = "//a[@class='more' and @href='javascript:;']")
    private WebElement seeMore;

    @FindBy(css = ".bands\\/MainNavigation--topBar g:nth-of-type(1) g .components\\/Logo--black")
    private WebElement lebel;

    @FindBy(xpath = "//a[@data-val='ordericon']")
    private WebElement orderProtectionButton;

    //After sign under MyAccount this location shall be available
    @FindBy(css = ".sc-hd-ms-name")
    public static WebElement greetingsToAccountHolder;

    @FindBy(partialLinkText = "My HBO")
    public static WebElement myHBO;

    @FindBy(css = ".J-search-text")
    public static WebElement emailBoxToSubscribeForTradeAlert;

    @FindBy(css = ".J-btn-search")
    public static WebElement tradeAlertSubscriptionButton;

    //Footer
    @FindBy(xpath = "//*[@id=\"ui-footer\"]//div[1]/dl/dd[1]/a")
    public static WebElement helpCenterLink;

    @FindBy(xpath = "//*[@id=\"J_SC_header\"]/header/div[2]/div[1]/div[1]/a")
    public static WebElement verificationPointHelpCenter;

    @FindBy(xpath = "//dd/a[contains (text(), 'About Alibaba.com')]")
    public static WebElement aboutAlibabaLink;

    @FindBy(xpath = "//h2[contains (text(), 'About Alibaba.com')]")
    public static WebElement verificationPointAboutAlibaba;

    @FindBy(xpath = "//dd/a[contains (text(),'Wholesaler Market')]")
    public static WebElement wholesalerMarket;

    @FindBy(linkText = "Wholesaler Market")
    public static WebElement verificationPointAWholesaleMarket;

    @FindBy(xpath = "/html/body/div[5]/div/div/i")
    public static WebElement moveToTopButton;

    @FindBy(xpath = "//input[@name='rfqName']")
    public static WebElement productNameForQuotes;

    @FindBy(xpath = "//input[@name='quantity']")
    public static WebElement quantity;

    @FindBy(xpath = "//form/div[3]/div")
    public static WebElement clickUnit;

    @FindBy(xpath = "/html/body/main/div[1]/div/div/header/div[1]/div/div[1]/span/a/svg")
    public static WebElement selectUnit;

    @FindBy(css = ".ui2-tag-body")
    public static WebElement requestPrice;

    @FindBy(css = ".rfq-submit")
    public static WebElement requestForQuotation;

    @FindBy(css = ".control-detail")
    public static WebElement productDetailedSpecifications;

    @FindBy(xpath = "//div[@id='post-wrap']//form//button")
    public static WebElement submitRFQ;

    @FindBy(css = "#xjoinFirstName")
    public static WebElement fNamePoPUpSignInWindow;

    @FindBy(xpath = "//div[@id='thirdPartLogin']/a[2]")
    public static WebElement googleIconOnPoPUpSignInWindow;

    @FindBy(tagName = "a")
    public List<WebElement> anchorTag = new ArrayList<>();

    @FindBy(xpath = "//*[@id=\"post-wrap\"]/div/form/div[4]/div/div[1]/div/div[3]/div/div/div[2]/div[2]/div[2]")
    public static WebElement uploadFile;

    @FindBy(xpath = "//div[2]/div[1]/div[2]/div[2]/a[1]")
    public static WebElement downloadAPK;

    @FindBy(xpath = "//*[@id=\"top\"]/div[2]/div/div[3]//div[2]/a")
    public static WebElement downloadWhatsApp;






}
