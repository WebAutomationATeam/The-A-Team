package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public static WebDriver driver = null;

    @Parameters({"url"})
    @BeforeMethod
    public void setUp (String url) {
        //chnage the path of chromedriver for your own module
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ahmed\\Desktop\\The-A-Team\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    //type
    public void typeOnCss(String locator, String value){
        driver.findElement(By.cssSelector(locator)).sendKeys(value);
    }

    public void typeOnID(String locator, String value){
        driver.findElement(By.id(locator)).sendKeys(value);
    }
    public void typeOnElement(String locator, String value){
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value);
        }catch(Exception ex1) {
            try{
                System.out.println("First Attempt was not successful");
                driver.findElement(By.name(locator)).sendKeys(value);
            }catch(Exception ex2) {
                try {
                    System.out.println("Second Attempt was not successful");
                    driver.findElement(By.xpath(locator)).sendKeys(value);
                } catch (Exception ex3) {
                    System.out.println("Third Attempt was not successful");
                    driver.findElement(By.id(locator)).sendKeys(value);
                }
            }
        }
    }
    public void typeOnElementNEnter(String locator, String value){
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
        }catch(Exception ex1) {
            try{
                System.out.println("First Attempt was not successful");
                driver.findElement(By.name(locator)).sendKeys(value, Keys.ENTER);
            }catch(Exception ex2) {
                try {
                    System.out.println("Second Attempt was not successful");
                    driver.findElement(By.xpath(locator)).sendKeys(value, Keys.ENTER);
                } catch (Exception ex3) {
                    System.out.println("Third Attempt was not successful");
                    driver.findElement(By.id(locator)).sendKeys(value, Keys.ENTER);
                }
            }
        }}

    public void clearField(String locator){
        driver.findElement(By.id(locator)).clear();
    }

    public void navigateBack(){
        driver.navigate().back();
    }

    public void typeCSSLocator (String locator, String value) {
        driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
        //driver.findElement(By.cssSelector(locator)).click();
    }
    public void typeId (String locator, String value){
        driver.findElement(By.id(locator)).sendKeys(value);
    }
    public void typeText (String name, String value){
        driver.findElement(By.name(name)).sendKeys(value, Keys.ENTER);
    }
    public void clickXPath (String path, String value) {
        driver.findElement(By.xpath(path)).sendKeys(value, Keys.ENTER);
    }
    public void xPath (String path) {
        driver.findElement(By.xpath(path)).click();
    }
    public void link (String link, String value) {
        driver.findElement(By.linkText(link)).sendKeys(value, Keys.ENTER);
    }

    public List<WebElement> cssSelector (String locator){ //for drop down list options (multiple elements)
        List <WebElement> list = new ArrayList<WebElement>();
        list = driver.findElements(By.cssSelector(locator));
        return list; //return as a list of web elements
    }
    public List<WebElement>useXPath (String locator){ //for drop down list options (multiple elements)
        List <WebElement> list = new ArrayList<WebElement>();
        list = driver.findElements(By.xpath(locator));
        return list;
    }
    @AfterMethod
    public void cleanUp() {
        driver.close();
    }

}

