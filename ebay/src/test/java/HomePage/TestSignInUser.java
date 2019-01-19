package HomePage;

import MainPage.SignInUser;
import Util.TestLogger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.Set;
public class TestSignInUser extends SignInUser {
    SignInUser signIn;
    @BeforeMethod
    public void initialization() {
        signIn = PageFactory.initElements(driver, SignInUser.class);
    }

    @Test
    //User should be able to click on sign in button
    public void testSignIn() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        signIn.ClickViewSignInUser();
    }

    //User should be able to sign in using personal information
    @Test
    public void testSignInAccount() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        signIn.testSignInAccount();
    }

    //User should be able to click on sign in by google button
    @Test
    public void testGoogleButtonFromSignIn() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        signIn.ClickGoogleButtonSignInPage();
        String parent = driver.getWindowHandle();
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> I1 = s1.iterator();
        while (I1.hasNext()) {
            String child_window = I1.next();
            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                driver.close();
            }
        }
    }

    //User should be able to click on sign in by facebook button
    @Test
    public void testFacebookButtonFromSignIn() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        signIn.ClickFacebookButtonSignInPage();
        String parent = driver.getWindowHandle();
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> I1 = s1.iterator();
        while (I1.hasNext()) {
            String child_window = I1.next();
            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                driver.close();
            }
        }
    }
}
