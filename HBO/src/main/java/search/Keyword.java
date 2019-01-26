package search;

import Util.TestLogger;
import base.CommonAPI;
import database.XlsxDataReader;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class Keyword extends CommonAPI {

    @FindBy(xpath = "/html/body/main/div[1]/div/div/header/div[1]/div/div[3]/ul/li[3]/div/span")
    public WebElement signInTab;
    @FindBy(xpath = "//span[@class='components/BasicButton--children']")
    public WebElement hboNowLogo;
    @FindBy(xpath = "//*[@id=\"Viewport\"]/div[1]/div[4]/div/div[7]/div/div[2]")
    public WebElement hboNowSignInTab;
    @FindBy (xpath = "//input[@type='text']")
    public WebElement enterEmail;
    @FindBy (xpath = "//input[@type='password']")
    public WebElement enterPassword;
    @FindBy (xpath = "//div[@class='default class1 class14']//div[@class='default']//div[8]//div[1]")
    public WebElement clickLoginButton;

    public WebElement getSignInTab() {
        signInTab.click();
        return signInTab;
    }
    public WebElement getHboNowLogo() {
        hboNowLogo.click();
        return hboNowLogo;
    }
    public WebElement getHboNowSignInTab() {
        hboNowSignInTab.click();
        return hboNowSignInTab;
    }
    public WebElement inputEmail() {
        enterEmail.sendKeys("abcd1234@gmail.com");
        return enterEmail;
    }
    public WebElement inputPassword() {
        enterPassword.sendKeys("abcd1234");
        return enterPassword;
    }
    public WebElement clickOnLogin() {
        clickLoginButton.click();
        return clickLoginButton;
    }
public void keywordWebElement() throws Exception {
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    Keyword Actions = new Keyword();
    String sPath = "C:\\Users\\Rob Dos\\Desktop\\Robin\\The-A-Team\\HBO\\src\\test\\HomePageHBO.xlsx";
    XlsxDataReader.setExcelFile(sPath, "login2");
    for (int i = 1; i <= 3; i++) {
        String sActions = XlsxDataReader.getCellData(i, 1);
        System.out.println(sActions);
        switch (sActions) {
            case "getSignInTab":
                getSignInTab();
                break;
            case "getHboNowLogo":
                getHboNowLogo();
                break;
            case "getHboNowSignInTab":
                getHboNowSignInTab();
                break;
            case "inputEmail":
                inputEmail();
                break;
            case "inputPassword":
                inputPassword();
                break;
            case "clickOnLogin":
                clickOnLogin();
                break;
            default:
                throw new InvalidArgumentException("Invalid login");
        }
        System.out.println(sActions);
        }
    }
}

