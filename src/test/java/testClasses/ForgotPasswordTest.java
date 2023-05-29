package testClasses;

import base.BaseTest;
import org.testng.annotations.Test;
import pageObjects.Login;
import utilities.Assertion;
import utilities.DriverManager;

public class ForgotPasswordTest extends BaseTest {

    String ToastMSG = "Please enter email address";
    String invalidToastMSG = "Invalid Email Format.";
    String UserNotFoundMSG = "User not found.";
    String CheckEMAILMSG = "Please check your email.";

    @Test(priority = 1, enabled = true, description = "Verify that forget password page opens up")
    public void forgetPasswordPageOpensUp() throws Exception {
        Login login = new Login();
        Thread.sleep(2000);
        login.clickForgotPassword();
        login.validate_SumitButton();
    }


    @Test(priority = 2, enabled = true, description = "Verify that when user left email field blank")
    public void EmailField_Blank() throws Exception {
        Login login = new Login();
        Thread.sleep(2000);
        login.clickForgotPassword();
        login.clickSubmitButton();
        Assertion.assertEquals(login.getToastMessage(), ToastMSG);

    }

    @Test(priority = 3, enabled = true, description = "Verify that when user enter spaces in email field")
    public void enterspaces_EmailField() throws Exception {
        Login login = new Login();
        Thread.sleep(2000);
        login.clickForgotPassword();
        login.enterForgetEmail("     ");
        login.clickSubmitButton();
        Assertion.assertEquals(login.getToastMessage(), ToastMSG);
    }

    @Test(priority = 4, enabled = true, description = "Verify that when user enters invalid email")
    public void invalidEmail() throws Exception {
        Login login = new Login();
        Thread.sleep(2000);
        login.clickForgotPassword();
        login.enterForgetEmail("ewafgdsa");
        login.clickSubmitButton();
        Assertion.assertEquals(login.getinvalidToastMessage(), invalidToastMSG);
    }


    @Test(priority = 5, enabled = true, description = "Verify that when user try unregistered email in email field")
    public void unregisteredEmail() throws Exception {
        Login login = new Login();
        Thread.sleep(2000);
        login.clickForgotPassword();
        login.enterForgetEmail("test7613@yopmail.com");
        login.clickSubmitButton();
        Assertion.assertEquals(login.getUserNotFoundToastMSG(), UserNotFoundMSG);

    }

    @Test(priority = 6, enabled = true, description = "Verify that when user try registered email in email field")
    public void registeredEmail() throws Exception {
        Login login = new Login();
        Thread.sleep(2000);
        login.clickForgotPassword();
        login.enterForgetEmail("test0404@yopmail.com");
        login.clickSubmitButton();
        Assertion.assertEquals(login.getPleaseCheckYourEmail(), CheckEMAILMSG);

    }

    @Test(priority = 7, enabled = true, description = "Verify that user has received email on registered email address")
    public void validateEmailReceived() throws Exception {
        Login login = new Login();
        Thread.sleep(2000);
        login.clickForgotPassword();
        login.enterForgetEmail("test0404@yopmail.com");
        login.clickSubmitButton();
        login.clickOkayPopup();
        DriverManager.getDriver().closeApp();
        Thread.sleep(10000);
        driver.get("www.yopmail.com");


    }
}
