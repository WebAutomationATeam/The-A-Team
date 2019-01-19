package HomePage;

import MainPage.RegisterUser;
import Util.TestLogger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;
public class TestRegisterUser extends RegisterUser {
    RegisterUser register;
    @BeforeMethod
    public void initElement() {
        register = PageFactory.initElements(driver, RegisterUser.class);
    }
    //User should be able to click on register user button
    @Test
    public void testViewRegister() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        register.ClickViewRegisterUser();
        driver.navigate().back();
    }
    //User should be able to create account with proper information
    @Test
    public void testCreateAccount() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        register.TestRegisterUserAccount();
        driver.navigate().back();
    }
    ////User should be able to click on click on continue facebook button
    @Test
    public void testFacebookContinueButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        register.ClickFacebookContinueButton();
        String parent = driver.getWindowHandle();
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> I1 = s1.iterator();
        while (I1.hasNext()) {
            String child_window = I1.next();
            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
            }
        }
    }
    //User should be able to click on continue to google button
    @Test
    public void testGoogleContinueButton () {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        register.ClickGoogleContinueButton();
        String parent = driver.getWindowHandle();
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> I1 = s1.iterator();
        while (I1.hasNext()) {
               String child_window = I1.next();
               if (!parent.equals(child_window)) {
                   driver.switchTo().window(child_window);
               }
         }
     }
}

