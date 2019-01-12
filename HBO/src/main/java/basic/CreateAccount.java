package basic;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.Iterator;
import java.util.Set;

public class CreateAccount extends HomePage {

    @FindBy(xpath = "/html/body/main/div[1]/div/div/header/div[1]/div/div[3]/div/a/span")
    public WebElement getHBO;
    @FindBy(xpath = "/html/body/div[3]/div[1]/div/div/div[2]/div/li/section/div/div/a")
    public WebElement startYourFreeTrial;
    @FindBy(xpath = "//*[@id=\"Viewport\"]/div[1]/div[2]/div[2]/div[2]/div/div[2]/div[2]/div[1]/input")
    public WebElement email;
    @FindBy(xpath = "//*[@id=\"Viewport\"]/div[1]/div[2]/div[2]/div[2]/div/div[2]/div[4]/div[1]/div[2]/input")
    public WebElement passWord;
    @FindBy(xpath = "//*[@id=\"Viewport\"]/div[1]/div[2]/div[2]/div[2]/div/div[2]/div[7]/div[1]/input")
    public WebElement firstName;
    @FindBy(xpath = "//*[@id=\"Viewport\"]/div[1]/div[2]/div[2]/div[2]/div/div[2]/div[9]/div[1]/input")
    public WebElement lastName;
    @FindBy(xpath = "//*[@id=\"Viewport\"]/div[1]/div[2]/div[2]/div[2]/div/div[2]/div[11]/div[1]/input")
    public WebElement zipCode;
    @FindBy(xpath = "//*[@id=\"Viewport\"]/div[1]/div[2]/div[2]/div[2]/div/div[2]/div[12]/div[1]/div")
    public WebElement agreeToTerms;
    @FindBy(xpath = "//*[@id=\"Viewport\"]/div[1]/div[2]/div[2]/div[2]/div/div[3]/div[2]/div")
    public WebElement clickOnCreateAccount;

    public void clickGetHBO() { getHBO.click(); }

    public void getStartYourFreeTrial() { startYourFreeTrial.click(); }

    public void getEmail() {email.sendKeys("roktimrobin@gmail.com"); }

    public void getPassWord() { passWord.sendKeys("Abcd#1234"); }

    public void getFirstName() { firstName.sendKeys("Robin"); }

    public void getLastName() { lastName.sendKeys("Das"); }

    public void getZipCode() { zipCode.sendKeys("11104"); }

    public void getAgreeToTerms() { agreeToTerms.click(); }

    public void getClickOnCreateAccount() { clickOnCreateAccount.click(); }

}