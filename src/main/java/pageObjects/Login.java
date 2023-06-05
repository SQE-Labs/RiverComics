package pageObjects;

import org.openqa.selenium.By;

import base.BasePage;
import org.testng.annotations.Test;
import utilities.Assertion;
import utilities.DriverManager;


public class Login extends BasePage {

    String RESULT_MSG = "Successfully added new penalty.";

    private By userName = By.id("com.river.comics.us:id/etEmail");

    private By password = By.id("com.river.comics.us:id/etPassword");

    private By loginBtn = By.id("com.river.comics.us:id/btnLogin");

    private By toolBar = By.id("com.river.comics.us:id/ivToolbarLogo");

    private By validationMessage = By.id("android:id/message");

    private By deleted_UserMessage = By.id("android:id/message");

    private By showPassword = By.id("com.river.comics.us:id/text_input_end_icon");

    private By forgotPassword = By.id("com.river.comics.us:id/tvForgotPassword");

    private By email = By.id("com.river.comics.us:id/etEmail");

    private By submitButton = By.id("com.river.comics.us:id/btnSubmit");

    private By okayButton = By.id("android:id/button1");

    private By validate_LoginButton = By.id("com.river.comics.us:id/btnLogin");

    private By enterEmail = By.id("com.river.comics.us:id/etEmail");

    private By validateToast = By.xpath("/hierarchy/android.widget.Toast");

    private By invalidToastMessage = By.xpath("/hierarchy/android.widget.Toast");

    private By userNotFoundToastMSG = By.xpath("/hierarchy/android.widget.Toast");

    private By pleaseCheckYourEmail = By.id("android:id/message");

    private By userblankToastMsg = By.xpath("/hierarchy/android.widget.Toast");

    private By passblankToastMsg = By.xpath("/hierarchy/android.widget.Toast");



    public void enterUserName(String usernameTxt) throws InterruptedException {
        sendKeys(userName, usernameTxt);
        Thread.sleep(2000);
    }

    public void enterForgetEmail(String emailTxt) throws InterruptedException {
        sendKeys(enterEmail, emailTxt);
        Thread.sleep(2000);
    }

    public void enterPassword(String passwordTxt) throws InterruptedException {
        sendKeys(password, passwordTxt);
        Thread.sleep(2000);
    }

    public void clickLogin() throws InterruptedException {
        click(loginBtn);
        Thread.sleep(2000);
    }

    public void clickOkayPopup() throws InterruptedException {
        click(okayButton);
    }

    public void validate_Login(String userNameTxt, String passWordTxt) throws Exception {
        Login login = new Login();
        Thread.sleep(2000);
        login.enterUserName(userNameTxt);
        login.enterPassword(passWordTxt);
        login.clickLogin();
        Thread.sleep(3000);
        login.acceptAlert();
        Thread.sleep(2000);
    }

    public boolean isSubmitButtonPresent() throws InterruptedException {
        Thread.sleep(5000);
       return isElementPresent(submitButton);
    }



    public boolean isLoginButtonPresent() throws InterruptedException {
        Thread.sleep(4000);
        return isElementPresent(validate_LoginButton);
    }

    public boolean validate_SumitButton() throws InterruptedException {
        Thread.sleep(2000);
       return isElementPresent(submitButton);
    }
    public void closeAppLaunchApp() {
        DriverManager.getDriver().closeApp();
        DriverManager.getDriver().launchApp();
    }

    public void closeApp() {
        DriverManager.getDriver().closeApp();
    }

    public void launchApp() {
        DriverManager.getDriver().launchApp();
    }

    public boolean validate_NoUser() throws InterruptedException {
        Thread.sleep(2000);
       return isElementPresent(validate_LoginButton);
    }

    public void clickForgotPassword() throws InterruptedException {
        click(forgotPassword);
        Thread.sleep(2000);
    }

    public void clickSubmitButton() throws InterruptedException {
        click(submitButton);
        Thread.sleep(2000);
    }

    public void enterEmail(String emailText) throws InterruptedException {
        sendKeys(email, emailText);
        Thread.sleep(2000);
    }

    public void clickShowPassword() throws InterruptedException {
        click(showPassword);
        Thread.sleep(2000);
    }

    public String getDeletedAccount() {
        return getText(deleted_UserMessage);
    }

    public String getValidationMessage() {
        return getText(validationMessage);
    }

    public String getUserBlank_ValidationMessage(){
        return getText(userblankToastMsg);
    }

    public String getPassBlank_ValidationMessage()  {
        return getText(passblankToastMsg);
    }

    public String getToastMessage() {
        return getText(validateToast);
    }

    public String getinvalidToastMessage() {
        return getText(invalidToastMessage);
    }
    public String getUserNotFoundToastMSG() {
        return getText(userNotFoundToastMSG);
    }

    public String getValidationPWD() {
        return getText(password);
    }
    public String getPleaseCheckYourEmail() {
        return getText(pleaseCheckYourEmail);
    }


    public void LoginUser() throws Exception {
        Login login = new Login();
        Hamburger hamburger = new Hamburger();
        Thread.sleep(2000);
        login.enterUserName("test0404@yopmail.com");
        login.enterPassword("1234567");
        login.clickLogin();
        login.acceptAlert();
    }

    public void NoAlertLoginUser() throws Exception {
        Login login = new Login();
        Hamburger hamburger = new Hamburger();
        Thread.sleep(2000);
        login.enterUserName("test0404@yopmail.com");
        login.enterPassword("1234567");
        login.clickLogin();
    }

}
