package base;

import Util.ExtentManager;
import Util.ExtentTestManager;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.server.SpecialCommand.captureScreenshot;

public class CommonAPI {
    public WebDriver driver=null;
    public Logger logger = Logger.getLogger(CommonAPI.class);
    public static WebDriverWait wait;
    public static Actions builder = null;

    @Parameters({"url", "OS", "browser", "browserversion"})
    @BeforeMethod
    public void setUp (@Optional("url") String url, @Optional ("browser") String browser, @Optional ("browservVersion") String browserVersion,
                       @Optional ("OS") String OS) {
        //change the path of chrome driver for your own module
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Rob Dos\\Desktop\\Robin\\The-A-Team\\driver\\chromedriver.exe");

        getLocalDriver(OS, browser,browserVersion);
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.navigate().to(url);
        wait = new WebDriverWait(driver,5);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    public WebDriver getLocalDriver(String OS, String browser, String browserVersion){
        if(browser.equalsIgnoreCase("chrome")){
            if(OS.equalsIgnoreCase("Mac")){
                System.setProperty("webdriver.chrome.driver", "../Generic/driver/chromedriver");
            }else if(OS.equalsIgnoreCase("Windows"))
            {
                System.setProperty("webdriver.chrome.driver", "../Generic/driver/chromedriver.exe");
            }
            driver = new ChromeDriver();}
        return driver;
    }
    //type
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
    public void typeOnElementNEnter(String locator, String value) {
        try {
            driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
        } catch (Exception ex1) {
            try {
                System.out.println("First Attempt was not successful");
                driver.findElement(By.name(locator)).sendKeys(value, Keys.ENTER);
            } catch (Exception ex2) {
                try {
                    System.out.println("Second Attempt was not successful");
                    driver.findElement(By.xpath(locator)).sendKeys(value, Keys.ENTER);
                } catch (Exception ex3) {
                    System.out.println("Third Attempt was not successful");
                    driver.findElement(By.id(locator)).sendKeys(value, Keys.ENTER);
                }
            }
        }
    }
    public void clickElement(String locator) {
        try {
            driver.findElement(By.cssSelector(locator)).click();
        } catch (Exception ex1) {
            try {
                System.out.println("First Attempt was not successful");
                driver.findElement(By.id(locator)).click();
            } catch (Exception ex2) {
                try {
                    System.out.println("Second Attempt was not successful");
                    driver.findElement(By.name(locator)).click();
                } catch (Exception ex3) {
                    System.out.println("Third Attempt was not successful");
                    driver.findElement(By.xpath(locator)).click();
                }
            }
        }
    }
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
    public void typeOnCss(String locator, String value){
        driver.findElement(By.cssSelector(locator)).sendKeys(value);
    }
    public void typeOnID(String locator, String value){
        driver.findElement(By.id(locator)).sendKeys(value);
    }
    public void mouseHoverByCSS(String locator) {
        try {
            WebElement element = driver.findElement(By.cssSelector(locator));
            Actions action = new Actions(driver);
            Actions hover = action.moveToElement(element);
        } catch (Exception ex) {
            System.out.println("First attempt has been done, This is second try");
            WebElement element = driver.findElement(By.cssSelector(locator));
            Actions action = new Actions(driver);
            action.moveToElement(element).perform();
        }
    }
    public static ExtentReports extent;
    @BeforeSuite
    public void extentSetup(ITestContext context) { extent = ExtentManager.getInstance();}
    @BeforeMethod
    public void startExtent(Method method) {
        String className = method.getDeclaringClass().getSimpleName();
        String methodName = method.getName().toLowerCase();
        ExtentTestManager.startTest(method.getName());
        ExtentTestManager.getTest().assignCategory(className);
    }
    protected String getStackTrace (Throwable t) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        t.printStackTrace(pw);
        return sw.toString();
    }
    @AfterMethod
    public void afterEachTestMethod(ITestResult result) {
        ExtentTestManager.getTest().getTest().setStartedTime(getTime(result.getStartMillis()));
        ExtentTestManager.getTest().getTest().setEndedTime(getTime(result.getStartMillis()));

        for (String group: result.getMethod().getGroups()) {
            ExtentTestManager.getTest().assignCategory(group);
        }
        if (result.getStatus() == 1) {
            ExtentTestManager.getTest().log(LogStatus.PASS, "Test Passes");
        } else if (result.getStatus() == 2) {
            ExtentTestManager.getTest().log(LogStatus.SKIP, "Test Skipped");
        }
        ExtentTestManager.endTest();
        extent.flush();
        if (result.getStatus() == ITestResult.FAILURE) {
            captureScreenshot(driver, result.getName());
        }
        driver.close();
    }
    public void captureScreenshot(WebDriver driver, String screenshotName) {
        DateFormat df = new SimpleDateFormat("MM.dd.yyyy-HH:mma");
        Date date = new Date();
        df.format(date);
    }
    public void waitToBeVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void waitToBeVisible(String xpathLocator){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathLocator)));
    }
    @AfterSuite
    public void generateReport() { extent.close();}
    private Date getTime(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar.getTime();
    }
    public static String convertToString (String string) {
        String str;
        str= StringUtils.join(StringUtils.splitByCharacterTypeCamelCase(string)," ");
        return str;
    }
    /*@AfterMethod
    public void cleanUp() {
        driver.close();
    }*/

}

