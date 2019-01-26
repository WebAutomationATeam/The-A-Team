package frontPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class SignOn extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"username\"]")
    WebElement useId;
    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement password;
    @FindBy(xpath = "//*[@id=\"signInBtn\"]")
    WebElement signOn;
    @FindBy(xpath = "//*[@id=\"emptyUidError\"]")
    WebElement errorUserId;
    @FindBy(xpath = "//*[@id=\"emptyPasswordError\"]")
    WebElement errorPassword;
    @FindBy(xpath = "//*[@id=\"RequestUserIDReminder\"]")
    WebElement forgetUserId;
    @FindBy(xpath = "//*[@id=\"RequestUserIDReminder-mobile\"]")
    WebElement forgetPassword;
    @FindBy(xpath = "//*[@id=\"activate_card\"]")
    WebElement activeCard;
    @FindBy(xpath = "//*[@id=\"register_acc\"]")
    WebElement registerAccount;
    @FindBy(xpath = "//*[@id=\"lessUidChaError\"]")
    WebElement erronInvalisUser;

    public List signOnWithoutInfo(){
        List<String> list = new ArrayList<>();
        signOn.click();
        list.add(errorUserId.getText());
        System.out.println(errorUserId.getText());
        return list;
    }
    public List expectedTextwithoutInfo(){
        List<String> list = new ArrayList<>();
        list.add("Enter a User ID");
        System.out.println(list);
        return list;
    }

    public List signOnWithoutPass() {
        List<String> list = new ArrayList<>();
        useId.sendKeys("Hasanul");
        signOn.click();
        list.add(errorPassword.getText());
        System.out.println(list);
        return list;
    }
    public List expectedSignOnWithoutPass(){
        List<String> list = new ArrayList<>();
        list.add("Enter a Password");
        System.out.println(list);
        return list;
    }

    public String signOnWithoutUseId() {
        useId.click();
        password.sendKeys("12345678");
        signOn.click();
        String text = errorUserId.getText();
        return text;
    }
    public void signOnInvalidUser() {
        useId.sendKeys("a");
        password.sendKeys("12345678");
        signOn.click();
        String text = erronInvalisUser.getText();
    }

    }


    /*public List WithoutInfo() {
        List<String> list = new ArrayList<>();
        createAccount.click();
        nextSumbit.click();
        list.add(firstNameErrorMessage.getText());
        System.out.println(firstNameErrorMessage.getText());
        list.add(lastNameErrorMessage.getText());
        System.out.println(lastNameErrorMessage.getText());
        list.add(usernameErrorMessage.getText());
        System.out.println(usernameErrorMessage.getText());
        list.add(passwordErrorMessage.getText());
        System.out.println(passwordErrorMessage.getText());

        return list;
    }

    public List expectedMessagewithoutInfo() {
        List<String> list = new ArrayList<>();
        list.add("Enter first name");
        list.add("Enter last name");
        list.add("Choose a Gmail address");
        list.add("Enter a password");
        return list;
    }*/
//
//    public String invalidPasswordSignUp() {
//        createAccount.click();
//        passwordInput.sendKeys("oooo");
//        nextSumbit.click();
//        String text = invalidPasswordErrorMessage.getText();
//        return text;
//    }
//
//    public String invalidEmailSignUp() {
//        createAccount.click();
//        firstNameInput.sendKeys("Naz");
//        lastNameInput.sendKeys("Far");
//        usernameInput.sendKeys("$$$$$$");
//        passwordInput.sendKeys("nazibahfariha");
//        confirmPasswordInput.sendKeys("nazibahfariha");
//        nextSumbit.click();
//        String text = invalidEmailErrorMessage.getText();
//        return text;
//    }
//    public String existingEmailSignUp() {
//        createAccount.click();
//        firstNameInput.sendKeys("Naz");
//        lastNameInput.sendKeys("Far");
//        usernameInput.sendKeys("Nazibah95");
//        passwordInput.sendKeys("nazibahfariha");
//        confirmPasswordInput.sendKeys("nazibahfariha");
//        nextSumbit.click();
//        String text = invalidEmailErrorMessage.getText();
//        return text;
//    }
//    public String invalidConfirmPasswordInput() {
//        createAccount.click();
//        firstNameInput.sendKeys("Naz");
//        lastNameInput.sendKeys("Far");
//        usernameInput.sendKeys("Nazibah95");
//        passwordInput.sendKeys("nazibahfariha");
//        confirmPasswordInput.sendKeys("nazibah");
//        nextSumbit.click();
//        String text = invalidConfirmPasswordInput.getText();
//        return text;
//    }
//    public String missingLastNameSignUP() {
//        createAccount.click();
//        firstNameInput.sendKeys("Naz");
//        usernameInput.sendKeys("Nazibah95");
//        passwordInput.sendKeys("nazibahfariha");
//        confirmPasswordInput.sendKeys("nazibah");
//        nextSumbit.click();
//        String text = lastNameErrorMessage.getText();
//        return text;
//    }
//    public String missingFirstNameSignUP() {
//        createAccount.click();
//        lastNameInput.sendKeys("Far");
//        usernameInput.sendKeys("Nazibah95");
//        passwordInput.sendKeys("nazibahfariha");
//        confirmPasswordInput.sendKeys("nazibah");
//        nextSumbit.click();
//        String text = firstNameErrorMessage.getText();
//        return text;
//    }
//    public String missingUserNameSignUP() {
//        createAccount.click();
//        firstNameInput.sendKeys("Naz");
//        lastNameInput.sendKeys("Far");
//        passwordInput.sendKeys("nazibahfariha");
//        confirmPasswordInput.sendKeys("nazibah");
//        nextSumbit.click();
//        String text = usernameErrorMessage.getText();
//        return text;
//    }
//    public String missingPasswordSignUP() {
//        createAccount.click();
//        firstNameInput.sendKeys("Naz");
//        lastNameInput.sendKeys("Far");
//        usernameInput.sendKeys("Nazibah95");
//        confirmPasswordInput.sendKeys("nazibah");
//        nextSumbit.click();
//        String text = passwordErrorMessage.getText();
//        return text;
//    }
//    public String missingConfirmPasswordSignUP() {
//        createAccount.click();
//        firstNameInput.sendKeys("Naz");
//        lastNameInput.sendKeys("Far");
//        usernameInput.sendKeys("Nazibah95");
//        passwordInput.sendKeys("nazibahfariha");
//        nextSumbit.click();
//        String text = confirmEmailErrorMessage.getText();
//        return text;
//    }
