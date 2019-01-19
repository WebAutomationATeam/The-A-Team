package MainPage;

import Util.TestLogger;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Iterator;
import java.util.Set;
public class SignInUser extends CommonAPI {
    @FindBy(xpath = ("//*[@id=\"gh-ug\"]/a"))
    public static WebElement ViewSignInUser;
    public void ClickViewSignInUser() {
        ViewSignInUser.click();
        }
    @FindBy(id = ("userid"))
    public static WebElement SignInEmailorID;
    public void InputSignInEmailorID() {
        SignInEmailorID.sendKeys("ahmed@gmail.com");
        }
    @FindBy(id = ("pass"))
    public static WebElement SignInPassWord;
    public void InputSignInPassWord() {
        SignInPassWord.sendKeys("ahmed123");
    }
    @FindBy(xpath = ("//*[@id=\"sgnBt\"]"))
    public static WebElement SignInButton;
    public void ClickSignInButton() {
        //ViewSignInUser.click();
        SignInButton.click();
    }
    @FindBy(id = ("signin_fb_btn"))
    public static WebElement FacebookButtonSignInPage;

    public void ClickFacebookButtonSignInPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ClickViewSignInUser();
        FacebookButtonSignInPage.click();
        }
    @FindBy(id = ("signin_ggl_btn"))
    public static WebElement GoogleButtonSignInPage;
    public void ClickGoogleButtonSignInPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ClickViewSignInUser();
        GoogleButtonSignInPage.click();
    }
    public void testSignInAccount(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ClickViewSignInUser();
        InputSignInEmailorID();
        InputSignInPassWord();
        ClickSignInButton();
    }
    /*public void testGoogleWithWindowHandle(){
        ClickViewSignInUser();
        String parent = driver.getWindowHandle();
        ClickGoogleButtonSignInPage();
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> I1 = s1.iterator();
        while (I1.hasNext()) {
            String child_window = I1.next();
            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                driver.close();
            }
        }
    }*/
    /*public void testFacebookWithWindowHandle(){
        ClickViewSignInUser();
        ClickFacebookButtonSignInPage();
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
    }*/
}
