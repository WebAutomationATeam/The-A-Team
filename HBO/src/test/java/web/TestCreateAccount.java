package web;

import basic.CreateAccount;
import basic.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sun.jvm.hotspot.debugger.Page;

import java.util.Iterator;
import java.util.Set;

public class TestCreateAccount extends CreateAccount {
    CreateAccount ca;

    @BeforeMethod
    public void initializeElement() {

        ca = PageFactory.initElements(driver, CreateAccount.class);
        //String ParentWindow = driver.getWindowHandle();
    }
    @Test
    public void test()throws Exception{
        ca.clickGetHBO();
        ca.getStartYourFreeTrial();

        String parent = driver.getWindowHandle();
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> I1 = s1.iterator();

        while (I1.hasNext()) {
            String child_window = I1.next();
            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                Thread.sleep(3000);
                ca.getEmail();
                //email.getText();
                ca.getPassWord();
                //passWord.getText();
                ca.getFirstName();
                //firstName.getText();
                ca.getLastName();
                //lastName.getText();
                ca.getZipCode();
                //zipCode.getText();
                ca.getAgreeToTerms();
                Thread.sleep(3000);
                ca.getClickOnCreateAccount();
            }

        }
    }
    @Test
    public void test1()throws Exception{
        ca.clickGetHBO();
        ca.getStartYourFreeTrial();

        String parent = driver.getWindowHandle();
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> I1 = s1.iterator();

        while (I1.hasNext()) {
            String child_window = I1.next();
            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                Thread.sleep(3000);
                ca.invalidEmail();
                //email.getText();
                ca.getPassWord();
                //passWord.getText();
                ca.getFirstName();
                //firstName.getText();
                ca.getLastName();
                //lastName.getText();
                ca.getZipCode();
                //zipCode.getText();
                ca.getAgreeToTerms();
                Thread.sleep(3000);
                ca.getClickOnCreateAccount();
            }
        }
    }
    @Test
    public void test2()throws Exception{
        ca.clickGetHBO();
        ca.getStartYourFreeTrial();

        String parent = driver.getWindowHandle();
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> I1 = s1.iterator();

        while (I1.hasNext()) {
            String child_window = I1.next();
            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                Thread.sleep(3000);
                ca.getEmail();
                //email.getText();
                ca.invalidPassword();
                //passWord.getText();
                ca.getFirstName();
                //firstName.getText();
                ca.getLastName();
                //lastName.getText();
                ca.getZipCode();
                //zipCode.getText();
                ca.getAgreeToTerms();
                Thread.sleep(3000);
                ca.getClickOnCreateAccount();
            }
        }
    }
    @Test
    public void test4()throws Exception{
        ca.clickGetHBO();
        ca.getStartYourFreeTrial();

        String parent = driver.getWindowHandle();
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> I1 = s1.iterator();

        while (I1.hasNext()) {
            String child_window = I1.next();
            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                Thread.sleep(3000);
                ca.getEmail();
                //email.getText();
                ca.getPassWord();
                //passWord.getText();
                ca.emptyFirstName();
                //firstName.getText();
                ca.getLastName();
                //lastName.getText();
                ca.getZipCode();
                //zipCode.getText();
                ca.getAgreeToTerms();
                Thread.sleep(3000);
                ca.getClickOnCreateAccount();
            }
        }
    }
    @Test
    public void test5()throws Exception{
        ca.clickGetHBO();
        ca.getStartYourFreeTrial();

        String parent = driver.getWindowHandle();
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> I1 = s1.iterator();

        while (I1.hasNext()) {
            String child_window = I1.next();
            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                Thread.sleep(3000);
                ca.getEmail();
                //email.getText();
                ca.getPassWord();
                //passWord.getText();
                ca.getFirstName();
                //firstName.getText();
                ca.emptyLastName();
                //lastName.getText();
                ca.getZipCode();
                //zipCode.getText();
                ca.getAgreeToTerms();
                Thread.sleep(3000);
                ca.getClickOnCreateAccount();
            }
        }
    }
}