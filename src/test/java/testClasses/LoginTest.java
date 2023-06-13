package testClasses;

import org.testng.annotations.Test;
import base.BaseTest;
import pageObjects.Hamburger;
import pageObjects.Login;
import utilities.Assertion;
import utilities.DriverManager;

public class LoginTest extends BaseTest {
    String ValidationMSG = "Invalid Username/Password";
    String DeletedAccountMSG = "Your account has been deleted. Please contact support@rivercomics.com to learn more";
    String ShowPWD = "1234567";
    String HidePWD = "1234567";
    String BLANKUSER_TOASTMSG = "Please enter email address";
    String BLANKPASS_TOASTMSG = "Please enter password";


    @Test(priority = 1, enabled = true, description = "Verify that no user is logged into the application")
    public void NoUser_Login() throws Exception {
        Login login = new Login();
        login.launchApp();
        Assertion.assertTrue(login.isLoginButtonPresent());
        login.closeApp();
    }

    @Test(priority = 2, enabled = true, description = "Verify that user is able to login successfully")
    public void valid_Login() throws Exception {
        Login login = new Login();
        Hamburger hamburger = new Hamburger();
        login.launchApp();
        Thread.sleep(2000);
        login.enterUserName("john0404@yopmail.com");
        login.enterPassword("123456");
        login.clickLogin();
        login.acceptAlert();
        login.closeAppLaunchApp();
        Thread.sleep(2000);
       // Assertion.assertTrue(login.isLoginButtonPresent());
        login.closeApp();

    }

    @Test(priority = 3, enabled = true, description = "Verify that 'Home' page opens up, when user has already logged into the application.")
    public void launchApp_already_LoggedIn_User() throws InterruptedException {
        Login login = new Login();
        Assertion ass = new Assertion();
        login.launchApp();
        Thread.sleep(2000);
        login.enterUserName("john0404@yopmail.com");
        login.enterPassword("123456");
        login.clickLogin();
        login.closeAppLaunchApp();
        Assertion.assertTrue(login.isLoginButtonPresent());
        login.closeApp();

    }

    @Test(priority = 4, enabled = true, description = "Verify that validation message appears,when 'Email' field is left blank")
    public void userName_Field_Blank() throws InterruptedException {
        Login login = new Login();
        login.launchApp();
        Thread.sleep(2000);
        login.enterPassword("123456");
        login.clickLogin();
        Assertion.assertEquals(login.getUserBlank_ValidationMessage(),BLANKUSER_TOASTMSG);
        login.closeApp();

    }

    @Test(priority = 5, enabled = true, description = "Verify that validation message appears, when 'Password' field is left blank")
    public void password_Field_Blank() throws Exception {
        Login login = new Login();
        login.launchApp();
        Thread.sleep(2000);
        login.enterUserName("john0404@yopmail.com");
        login.clickLogin();
        Assertion.assertEquals(login.getPassBlank_ValidationMessage(),BLANKPASS_TOASTMSG);
        login.closeApp();

    }

    @Test(priority = 6, enabled = true, description = "Verify that validation message appears on entering invalid email address")
    public void invalid_Username_Login() throws InterruptedException {
        Assertion ass = new Assertion();
        Login login = new Login();
        login.launchApp();
        Thread.sleep(2000);
        login.enterUserName("testeyeud04@yopmail.com");
        login.enterPassword("123456");
        login.clickLogin();
        Assertion.assertEquals(login.getValidationMessage(),ValidationMSG);
        login.closeApp();
    }

    @Test(priority = 7, enabled = true, description = "Verify that validation message appears on entering invalid password")
    public void invalid_Password_Login() throws Exception {
        Login login = new Login();
        login.launchApp();
        Thread.sleep(2000);
        login.enterUserName("john0404@yopmail.com");
        login.enterPassword("12456");
        login.clickLogin();
        Assertion.assertEquals(login.getValidationMessage(),ValidationMSG);
        login.closeApp();

    }

    @Test(priority = 8, enabled = true, description = "Verify that unmasking show password")
    public void decrypted_Password() throws Exception {
        Login login = new Login();
        login.launchApp();
        Thread.sleep(2000);
        login.enterUserName("john0404@yopmail.com");
        login.enterPassword("1234567");
        login.clickShowPassword();
        Assertion.assertEquals(login.getValidationPWD(),ShowPWD);
        login.closeApp();
    }



    @Test(priority = 9, enabled = true, description = "Verify that masking show password")
    public void encrypted_Password() throws Exception {
        Login login = new Login();
        login.launchApp();
        Thread.sleep(2000);
        login.enterUserName("john0404@yopmail.com");
        login.enterPassword("1234567");
        login.clickShowPassword();
        Thread.sleep(2000);
        login.clickShowPassword();
        Assertion.assertEquals(login.getValidationPWD(),HidePWD);
        login.closeApp();
    }

    @Test(priority = 10, enabled = true, description = "Verify that user try to login with non registered user")
    public void non_Registered_Email() throws Exception {
        Login login = new Login();
        login.launchApp();
        Thread.sleep(2000);
        login.enterUserName("test7613@yopmail.com");
        login.enterPassword("1234567");
        login.clickLogin();
        Assertion.assertEquals(login.getValidationMessage(),ValidationMSG);
        login.closeApp();

    }

    @Test(priority = 11, enabled = true, description = "Verify that user try to login with deleted account")
    public void deleted_Account_Login() throws Exception {
        Login login = new Login();
        login.launchApp();
        Thread.sleep(2000);
        login.enterUserName("Ella@yopmail.com");
        login.enterPassword("123456");
        login.clickLogin();
        Assertion.assertEquals(login.getDeletedAccount(),DeletedAccountMSG);
        login.closeApp();

    }
}
