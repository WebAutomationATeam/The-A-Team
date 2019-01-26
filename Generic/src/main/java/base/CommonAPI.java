package base;

import Util.ExtentManager;
import Util.ExtentTestManager;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public String saucelabs_username = "rdas91";
    public String saucelabs_accesskey = "118d3467-a8af-4a02-85f6-e46667550259";
    public String browserstack_username= "";
    public String browserstack_accesskey = "";
    public static WebDriver driver=null;
    public Logger logger = Logger.getLogger(CommonAPI.class);
    public static WebDriverWait wait;
    public static Actions builder = null;
    public static ExtentReports extent;
    public String URL=null;

    @Parameters({"useCloudEnv","cloudEnvName","url", "OS", "os_version","browser", "browserversion"})
    @BeforeMethod
    public void setUp (@Optional ("useCloudEnv")boolean useCloudEnv, @Optional ("cloudEnvName") String cloudEnvName,@Optional("url") String url, @Optional ("key") String key, @Optional ("browser") String browser, @Optional ("browservVersion") String browserVersion,
                       @Optional ("OS") String OS, @Optional ("os_version") String os_version) throws IOException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Rob Dos\\Desktop\\Robin\\The-A-Team\\driver\\chromedriver.exe");
        if(useCloudEnv==true){
            logger.setLevel(Level.INFO);
            if(cloudEnvName.equalsIgnoreCase("browserstack")) {
                getCloudDriver(cloudEnvName,browserstack_username,browserstack_accesskey,OS,os_version, browser, browserVersion);
            }else if (cloudEnvName.equalsIgnoreCase("saucelabs")){
                getCloudDriver(cloudEnvName,saucelabs_username, saucelabs_accesskey,OS,os_version, browser, browserVersion);
            }
        }else{
            getLocalDriver(OS, browser,browserVersion);
        }
        driver = new ChromeDriver();
        logger.setLevel(Level.INFO);
        logger.info("Test is running on local env");
        logger.error("mine error");
        //driver.manage().deleteAllCookies();
        driver.navigate().to(url);
        wait = new WebDriverWait(driver,5);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    //@Parameters
    public void setURL (String URL) {
        this.URL=URL;
        driver.get(URL);
    }

    public WebDriver getLocalDriver(String OS, String browser, String browserVersion){
        if(browser.equalsIgnoreCase("chrome")){
            if(OS.equalsIgnoreCase("Mac")){
                System.setProperty("webdriver.chrome.driver", "../The-A-Team/driver/chromedriver");
            }else if(OS.equalsIgnoreCase("Windows"))
            {
                System.setProperty("webdriver.chrome.driver", "..\\The-A-Team\\driver\\chromedriver.exe");
            }
            driver = new ChromeDriver();}
        return driver;
    }

    public WebDriver getCloudDriver(String envName,String envUsername, String envAccessKey,String OS, String os_version,String browser,
                                    String browserVersion)throws IOException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("browser",browser);
        cap.setCapability("browser_version",browserVersion);
        cap.setCapability("OS", OS);
        cap.setCapability("os_version", os_version);
        if(envName.equalsIgnoreCase("Saucelabs")){
            //resolution for Saucelabs
            driver = new RemoteWebDriver(new URL("http://"+envUsername+":"+envAccessKey+
                    "@ondemand.saucelabs.com:80/wd/hub"), cap);
        }else if(envName.equalsIgnoreCase("Browserstack")) {
            cap.setCapability("resolution", "1024x768");
            driver = new RemoteWebDriver(new URL("http://" + envUsername + ":" + envAccessKey +
                    "@hub-cloud.browserstack.com/wd/hub"), cap);
        }
        return driver;
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
    public void navigateForward() {
        driver.navigate().forward();
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
    public List<String> getTextFromWebElements(String locator) {
        List<WebElement> element = new ArrayList<WebElement>();
        List<String> text = new ArrayList<String>();
        element = driver.findElements(By.cssSelector(locator));
        for (WebElement web : element) {
            text.add(web.getText());
        }
        return text;
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
    public void mouseHoverByXpath(String locator) {
        try {
            WebElement element = driver.findElement(By.xpath(locator));
            Actions action = new Actions(driver);
            Actions hover = action.moveToElement(element);
        } catch (Exception ex) {
            System.out.println("First attempt has been done, This is second try");
            WebElement element = driver.findElement(By.cssSelector(locator));
            Actions action = new Actions(driver);
            action.moveToElement(element).perform();
        }
    }
    @BeforeSuite
    public void extentSetup(ITestContext context) {
        extent = ExtentManager.getInstance();
    }

    @BeforeMethod
    public void startExtent(Method method) {
        String className = method.getDeclaringClass().getSimpleName();
        String methodName = method.getName().toLowerCase();
        ExtentTestManager.startTest(method.getName());
        ExtentTestManager.getTest().assignCategory(className);
    }
    protected String getStackTrace(Throwable t) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        t.printStackTrace(pw);
        return sw.toString();
    }
    @AfterMethod
    public void afterEachTestMethod(ITestResult result) {
        ExtentTestManager.getTest().getTest().setStartedTime(getTime(result.getStartMillis()));
        ExtentTestManager.getTest().getTest().setEndedTime(getTime(result.getEndMillis()));

        for (String group : result.getMethod().getGroups()) {
            ExtentTestManager.getTest().assignCategory(group);
        }

        if (result.getStatus() == 1) {
            ExtentTestManager.getTest().log(LogStatus.PASS, "Test Passed");
        } else if (result.getStatus() == 2) {
            ExtentTestManager.getTest().log(LogStatus.FAIL, getStackTrace(result.getThrowable()));
        } else if (result.getStatus() == 3) {
            ExtentTestManager.getTest().log(LogStatus.SKIP, "Test Skipped");
        }
        ExtentTestManager.endTest();
        extent.flush();
       if (result.getStatus() == ITestResult.FAILURE) {
            captureScreenshot(driver, result.getName());
       }
    }
    @AfterSuite
    public void generateReport() {
        extent.close();
    }
    private Date getTime(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar.getTime();
    }
    public static void captureScreenshot(WebDriver driver, String screenshotName)  {

        DateFormat df = new SimpleDateFormat("(MM.dd.yyyy-HH:mma)");
        Date date = new Date();
        df.format(date);

        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       try {
            FileUtils.copyFile(file, new File(System.getProperty("C:\\Users\\Rob Dos\\Desktop\\Robin\\The-A-Team\\HBO\\screenshots\\") +screenshotName+" "+df.format(date)+".png"));
            System.out.println("Screenshot captured");
        } catch (Exception e) {
            System.out.println("Exception while taking screenshot "+e.getMessage());;
        }
        driver.quit();
    }
    /*public void waitToBeVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void waitToBeVisible(String xpathLocator){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathLocator)));
    }*/
    public static String convertToString(String st){
        String splitString ;
        splitString = StringUtils.join(StringUtils.splitByCharacterTypeCamelCase(st), ' ');
        return splitString;
    }
    public void inputValueInTextBoxByWebElement(WebElement webElement, String value){
        webElement.sendKeys(value + Keys.ENTER);
    }
    public void typeOnInputField(String locator, String value) {
        driver.findElement(By.xpath(locator)).sendKeys(value, Keys.ENTER);
    }
    public void clearInputBox(WebElement webElement){
        webElement.clear();
    }
    public static void sleepFor(int sec)throws InterruptedException {
        Thread.sleep(sec * 1000);
    }
    public void iframeHandle(WebElement element) {
        driver.switchTo().frame(element);
    }
    // Handling Alert
    public void okAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public void cancelAlert() {
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }
    public List<String> getTextFromWebElements(WebElement element){
        List<WebElement> elements = new ArrayList<WebElement>();
        List<String> text = new ArrayList<String>();
        for(WebElement e:elements){
            text.add(e.getText());
        }
        return text;
    }
    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}
