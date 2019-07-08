package basic;

import base.CommonAPI;
import database.XlsxDataReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.util.ArrayList;
import java.util.List;

public class ReadXlsx extends CommonAPI {

    @FindBy (xpath = "/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div/div/div")
    public  WebElement searchButton;

    @FindBy (xpath = "/html/body/main/div[1]/div/div/header/div[1]/div/div[3]/div/a/span")
    public  WebElement getHBO;

    @FindBy (xpath = "/html/body/main/div[1]/div/div/header/div[1]/div/div[3]/ul/li[3]/div/span")
    public WebElement signIn;

    @FindBy (xpath = "/html/body/main/div[1]/div/div/header/div[1]/div/div[1]/span/a/svg/g/g/path")
    public WebElement HBOLogo;

    @FindBy(xpath = "//div[contains(@class,'bands/MainNavigation--searchIcon')]")
    public WebElement searchlink;

    @FindBy(xpath = "//input[@placeholder='Search']")
    public WebElement searchBox;

    @FindBy(css = ".bands\\/MainNavigation--topBar [href='\\/series']")
    public WebElement series;

    @FindBy(css = ".bands\\/MainNavigation--topBar [href='\\/movies']")
    public WebElement movies;

    @FindBy(css = ".bands\\/MainNavigation--topBar [href='\\/watch-free-episodes']")
    public WebElement searchFreeEpisodes;

    @FindBy (xpath = "//span[contains(text(),'Get It Today')]")
    public WebElement HBOToday;

    @FindBy (xpath = "//*[@class='components/Arrow--large']")
    public WebElement nextSlide;

    @FindBy (xpath = "//a[@title='facebook']")
    public WebElement fbPage;

    @FindBy (xpath = "//a[@title='instagram']")
    public WebElement instaPage;

    @FindBy (xpath = "//a[@title='twitter']")
    public WebElement twitterLogo;

    @FindBy (xpath = "//a[@title='youtube']")
    public WebElement youtubeLogo;

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

    XlsxDataReader xlData = new XlsxDataReader("C:\\Users\\Rob Dos\\Desktop\\Robin\\The-A-Team\\HBO\\src\\test\\HomePageHBO.xlsx");
    public List expectedWebElement(){
        int rowcount = xlData.getRowCount("Home");
        List<String> expect = new ArrayList<>();
        for(int i = 1; i <= rowcount; i++){
            expect.add(xlData.getCellData("Home","searchButton",i));
        }
        System.out.println(expect);
        return expect;
    }

}
