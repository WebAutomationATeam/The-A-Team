package basic;

import Util.TestLogger;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import search.XlsxDataReader;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends CommonAPI {

    public static void sendKeys(WebElement webElement, String elementName, String keys){
        webElement.clear();
        TestLogger.log("Send keys to "+ elementName);
        webElement.sendKeys(keys);
        TestLogger.log("Keys sent to " + elementName);
    }
    public static String getText(WebElement webElement, String webElementName){
        TestLogger.log("getting Text from " + webElementName);
        String actualText = webElement.getText();
        TestLogger.log("Actual text : " + webElementName);
        return actualText;
    }

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
    TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    HBOLogo.click(); }

    @FindBy(xpath = "//div[contains(@class,'bands/MainNavigation--searchIcon')]")
    public WebElement searchlink;
    public void clicksearchlink(){
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchlink.click();
    }

    @FindBy(xpath = "//input[@placeholder='Search']")
    public WebElement searchBox;
    public void sendInput () {
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchBox.sendKeys("Game of Thrones", Keys.ENTER);
    }

    @FindBy(css = ".bands\\/MainNavigation--topBar [href='\\/series']")
    public WebElement series;
    public void findSeries(){
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        series.click();}

    @FindBy(css = ".bands\\/MainNavigation--topBar [href='\\/movies']")
    public WebElement movies;
    public String findMovies(){
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        movies.click();
        String title = driver.getTitle();
        System.out.println("Movies page Title: " + title);
        return title;
    }
    @FindBy(css = ".bands\\/MainNavigation--topBar [href='\\/watch-free-episodes']")
    public WebElement searchFreeEpisodes;
    public void getFreeEpisodes(){
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchFreeEpisodes.click();}

    @FindBy (css = "body > main > div.producteducationband.basecomponent > div > div > div.components\\2f Band--maxWidth > div > div.bands\\2f ProductEducation--pane1 > div.bands\\2f ProductEducation--ctaContainer > div > a > span")
    public static WebElement HBOToday;
    public void clickHBOToday(){
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        HBOToday.click();}

    @FindBy (css = "body > main > div:nth-child(4) > div > div > div.components\\2f Band--maxWidth > div.modules\\2f cards\\2f BasicCard--containers > div.modules\\2f cards\\2f BasicCard--tabletContainer > section > div > button.components\\2f CarouselButton--container.components\\2f CarouselButton--next > div > span > span > svg")
    public static WebElement nextSlide;
    public void clickNextSlide(){nextSlide.click();}

    @FindBy (css = "body > main > div.footerband.basecomponent > div > div > footer > div.modules\\2f FollowHbo--darkGray > div > div > ul > li:nth-child(1) > a")
    public static WebElement fbPage;
    public void getFbPage(){
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        fbPage.click();}

    @FindBy (xpath = "//a[@title='instagram']")
    public static WebElement instaPage;
    public void getInstaPage(){
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        instaPage.click();}

    @FindBy (xpath = "//a[@title='twitter']")
    public static WebElement twitterLogo;
    public void getTwitterPage(){
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        twitterLogo.click();}

    @FindBy (xpath = "//a[@title='youtube']")
    public static WebElement youtubeLogo;
    public void navigateToYoutubePage(){
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        youtubeLogo.click();}

    public List webElementList(){
        List<WebElement> webElements = new ArrayList<>();
        webElements.add(searchButton);
        webElements.add(getHBO);
        webElements.add(signIn);
        webElements.add(HBOLogo);
        webElements.add(searchlink);
        webElements.add(searchBox);
        webElements.add(series);
        webElements.add(movies);
        webElements.add(searchFreeEpisodes);
        webElements.add(HBOToday);
        webElements.add(nextSlide);
        webElements.add(fbPage);
        webElements.add(instaPage);
        webElements.add(twitterLogo);
        webElements.add(youtubeLogo);

        List<String>list = new ArrayList<>();
        for(int i=0; i<webElements.size();i++){
            list.add(webElements.get(i).getText());
        }
        System.out.println(list);
        return list;
    }

   XlsxDataReader xlData = new XlsxDataReader("C:\\Users\\Rob Dos\\Documents\\JAVA\\HomePageHBO.xlsx");
    public List expectedWebElement(){
        int rowcount = xlData.getRowCount("Sheet1");
        List<String> expect = new ArrayList<>();
        for(int i = 2; i <= rowcount; i++){
            expect.add(xlData.getCellData("Sheet1","WebElementName",i));
        }
        System.out.println(expect);
        return expect;
    }

}
