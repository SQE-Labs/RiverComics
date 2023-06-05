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

    @Test(priority = 12, enabled = true, description = "Verify that forget password page opens up")
    public void forgetPasswordPageOpensUp() throws Exception {
        Login login = new Login();
        Thread.sleep(2000);
        login.clickForgotPassword();
        Assertion.assertTrue(login.isSubmitButtonPresent());
        login.closeAppLaunchApp();
    }


    @Test(priority = 13, enabled = true, description = "Verify that when user left email field blank")
    public void EmailField_Blank() throws Exception {
        Login login = new Login();
        Thread.sleep(2000);
        login.clickForgotPassword();
        login.clickSubmitButton();
        Assertion.assertEquals(login.getToastMessage(), ToastMSG);
        login.closeApp();

    }

    @Test(priority = 14, enabled = true, description = "Verify that when user enter spaces in email field")
    public void enterspaces_EmailField() throws Exception {
        Login login = new Login();
        login.launchApp();
        Thread.sleep(2000);
        login.clickForgotPassword();
        login.enterForgetEmail("     ");
        login.clickSubmitButton();
        Assertion.assertEquals(login.getToastMessage(), ToastMSG);
        login.closeAppLaunchApp();
    }

    @Test(priority = 15, enabled = true, description = "Verify that when user enters invalid email")
    public void invalidEmail() throws Exception {
        Login login = new Login();
        Thread.sleep(2000);
        login.clickForgotPassword();
        login.enterForgetEmail("ewafgdsa");
        login.clickSubmitButton();
        Assertion.assertEquals(login.getinvalidToastMessage(), invalidToastMSG);
        login.closeAppLaunchApp();
    }


    @Test(priority = 16, enabled = true, description = "Verify that when user try unregistered email in email field")
    public void unregisteredEmail() throws Exception {
        Login login = new Login();
        Thread.sleep(2000);
        login.clickForgotPassword();
        login.enterForgetEmail("test7613@yopmail.com");
        login.clickSubmitButton();
        Assertion.assertEquals(login.getUserNotFoundToastMSG(), UserNotFoundMSG);
        login.closeAppLaunchApp();

    }

    @Test(priority = 17, enabled = true, description = "Verify that when user try registered email in email field")
    public void registeredEmail() throws Exception {
        Login login = new Login();
        Thread.sleep(2000);
        login.clickForgotPassword();
        login.enterForgetEmail("test0404@yopmail.com");
        login.clickSubmitButton();
        Assertion.assertEquals(login.getPleaseCheckYourEmail(), CheckEMAILMSG);
        login.closeAppLaunchApp();

    }

    //TODO //How to validate email on Appium
    @Test(priority = 18, enabled = true, description = "Verify that user has received email on registered email address")
    public void validateEmailReceived() throws Exception {
        Login login = new Login();
        Thread.sleep(2000);
        login.clickForgotPassword();
        login.enterForgetEmail("test0404@yopmail.com");
        login.clickSubmitButton();
        login.clickOkayPopup();
        login.closeApp();

    }
}
