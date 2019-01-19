package MainPage;

import Util.TestLogger;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class RegisterUser extends CommonAPI {
    @FindBy(xpath = ("//*[@id=\"gh-ug-flex\"]/a"))
    public static WebElement ViewRegisterUser;
    @FindBy(id = ("firstname"))
    public static WebElement RegisterFirstName;
    @FindBy(id = ("lastname"))
    public static WebElement RegisterLastName;
    @FindBy(id = ("email"))
    public static WebElement RegisterEmail;
    @FindBy(id = ("lastname"))
    public static WebElement RegisterPassWord;
    @FindBy(id = ("ppaFormSbtBtn"))
    public static WebElement CreateAccountButton;
    @FindBy(id = ("reg_sfk_btn_fb"))
    public static WebElement FacebookContinueButton;
    @FindBy(id = ("reg_sfk_btn_ggl"))
    public static WebElement GoogleContinueButton;
    public void ClickViewRegisterUser() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ViewRegisterUser.click();
    }
    public void InputRegisterFirstName() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        RegisterFirstName.sendKeys("Shafayat");
    }
    public void InputRegisterLastName() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        RegisterLastName.sendKeys("Ahmed");
    }
    public void InputRegisterEmail() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        RegisterEmail.sendKeys("ahmed@gmail.com");
    }
    public void InputRegisterPassWord() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        RegisterPassWord.sendKeys("ahmed123");
    }
    public void ClickCreateAccountButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        CreateAccountButton.click();
    }
    public void ClickFacebookContinueButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ClickViewRegisterUser();
        FacebookContinueButton.click();
    }
    public void ClickGoogleContinueButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ClickViewRegisterUser();
        GoogleContinueButton.click();
    }
    public void TestRegisterUserAccount(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ClickViewRegisterUser();
        InputRegisterFirstName();
        InputRegisterLastName();
        InputRegisterEmail();
        ClickCreateAccountButton();
    }


}
