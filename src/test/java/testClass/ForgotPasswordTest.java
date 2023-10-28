package testClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pageObjects.GmailPage;
import pageObjects.Hamburger;
import pageObjects.LoginPage;
import pageObjects.PasswordRecoveryPage;
import utilities.Assertion;

public class ForgotPasswordTest extends BaseTest {
	
	String newPassword= "123456";

    String ToastMSG = "Please enter email address";
    String invalidToastMSG = "Invalid Email Format.";
    String UserNotFoundMSG = "User not found.";
    String CheckEMAILMSG = "Please check your email.";

    @Test(priority = 12, enabled = false, description = "Verify that forget password page opens up")
    public void forgetPasswordPageOpensUp() throws Exception {
        LoginPage login = new LoginPage();
        login.launchApp();
        login.clickForgotPassword();
        Assertion.assertTrue(login.isSubmitButtonPresent());
        login.closeApp();
    }


    @Test(priority = 13, enabled = false, description = "Verify that when user left email field blank")
    public void EmailField_Blank() throws Exception {
        LoginPage login = new LoginPage();
        login.launchApp();
        login.clickForgotPassword();
        login.clickSubmitButton();
        Assertion.assertEquals(login.getToastMessage(), ToastMSG);
        login.closeApp();
    }

    @Test(priority = 14, enabled = false, description = "Verify that when user enter spaces in email field")
    public void enterspaces_EmailField() throws Exception {
        LoginPage login = new LoginPage();
        login.launchApp();
        login.clickForgotPassword();
        login.enterForgetEmail("     ");
        login.clickSubmitButton();
        Assertion.assertEquals(login.getToastMessage(), ToastMSG);
        login.closeApp();
    }

    @Test(priority = 15, enabled = false, description = "Verify that when user enters invalid email")
    public void invalidEmail() throws Exception {
        LoginPage login = new LoginPage();
        login.launchApp();
        login.clickForgotPassword();
        login.enterForgetEmail("ewafgdsa");
        login.clickSubmitButton();
        Assertion.assertEquals(login.getinvalidToastMessage(), invalidToastMSG);
        login.closeApp();
    }


    @Test(priority = 16, enabled = false, description = "Verify that when user try unregistered email in email field")
    public void unregisteredEmail() throws Exception {
        LoginPage login = new LoginPage();
        login.launchApp();
        login.clickForgotPassword();
        login.enterForgetEmail("test7613@yopmail.com");
        login.clickSubmitButton();
        Assertion.assertEquals(login.getUserNotFoundToastMSG(), UserNotFoundMSG);
        login.closeApp();

    }

    @Test(priority = 17, enabled = false, description = "Verify that when user try registered email in email field")
    public void registeredEmail() throws Exception {
        LoginPage login = new LoginPage();
        login.launchApp();
        login.clickForgotPassword();
        login.enterForgetEmail("john0404@yopmail.com");
        login.clickSubmitButton();
        Assertion.assertEquals(login.getPleaseCheckYourEmail(), CheckEMAILMSG);
        login.closeApp();
    }

    //TODO --- How to validate email on Appium
    @Test(priority = 18, enabled = false, description = "Verify that user has received email on registered email address")
    public void validateEmailReceived() throws Exception {
        LoginPage login = new LoginPage();
        GmailPage gp=new GmailPage();
        login.launchApp();
        Thread.sleep(2000);
        login.clickForgotPassword();
        login.enterForgetEmail("anuragrana12123@gmail.com");
        login.clickSubmitButton();
        login.clickOkayPopup();
       // OpenChromeBrowser();
        switchToApp();
        Thread.sleep(3000);
        Assert.assertTrue(gp.mailRecieved());
        
        
      
    }
    
    @Test(priority = 19, enabled = false, description = "Verify that 'Recovery Password' page opens up after Taping on 'RESET PASSWORD' button")
    public void validateRecoveryPasswordPage() throws Exception {
        LoginPage login = new LoginPage();
        GmailPage gp=new GmailPage();
        login.launchApp();
        Thread.sleep(2000);
        login.clickForgotPassword();
        login.enterForgetEmail("anuragrana12123@gmail.com");
        login.clickSubmitButton();
        login.clickOkayPopup();
       // OpenChromeBrowser();
        switchToApp();
        gp.clickEmail_passwordReset();
        PasswordRecoveryPage recovery= new PasswordRecoveryPage();
        Thread.sleep(3000);
        Assert.assertTrue(recovery.passwordResetBtnDisplayed());
        
        
      
    }
    
    @Test(priority = 20, enabled = false, description = "Verify that validation message appear after tapping on 'Reset Password' button, when 'Password' blank")
    public void validationMessageBlankPassword() throws Exception {
        LoginPage login = new LoginPage();
        GmailPage gp=new GmailPage();
        PasswordRecoveryPage recovery= new PasswordRecoveryPage();
        login.launchApp();
        Thread.sleep(2000);
        login.clickForgotPassword();
        login.enterForgetEmail("anuragrana12123@gmail.com");
        login.clickSubmitButton();
        login.clickOkayPopup();
       // OpenChromeBrowser();
        switchToApp();
        gp.clickEmail_passwordReset();
        recovery.clickResetPassword();
        recovery.validatePasswordIsMandatory();
        
        
      
    }
    
    @Test(priority = 21, enabled = false, description = "Verify that validation message appear after tapping on 'Reset Password' button, when 'Password' contains spaces")
    public void validationMessageSpacesPassword() throws Exception {
        LoginPage login = new LoginPage();
        GmailPage gp=new GmailPage();
        PasswordRecoveryPage recovery= new PasswordRecoveryPage();
        login.launchApp();
        Thread.sleep(2000);
        login.clickForgotPassword();
        login.enterForgetEmail("anuragrana12123@gmail.com");
        login.clickSubmitButton();
        login.clickOkayPopup();
       // OpenChromeBrowser();
        switchToApp();
        Thread.sleep(3000);
        gp.clickEmail_passwordReset();
        recovery.passwordResetDetails("   ","   ");
       recovery.clickResetPassword();
       recovery.validatePasswordIsMandatory();
        
        
      
    }
    
    @Test(priority = 21, enabled = false, description = " validation message appear after tapping on 'Reset Password' button, when less than 6 characters")
    public void validationMessageLessThanSixPassword() throws Exception {
        LoginPage login = new LoginPage();
        GmailPage gp=new GmailPage();
        PasswordRecoveryPage recovery= new PasswordRecoveryPage();
        login.launchApp();
        Thread.sleep(2000);
        login.clickForgotPassword();
        login.enterForgetEmail("anuragrana12123@gmail.com");
        login.clickSubmitButton();
        login.clickOkayPopup();
       // OpenChromeBrowser();
        switchToApp();
        Thread.sleep(3000);
        gp.clickEmail_passwordReset();
        recovery.passwordResetDetails("12345","12345");
       recovery.clickResetPassword();
       recovery.validatePasswordLessThanSixChar();
        
      
    }
    @Test(priority = 21, enabled = false, description = "Verify that validation message appear after tapping on 'Reset Password' button, when more than 14 characters")
    public void validationMessageMoreThan14Password() throws Exception {
        LoginPage login = new LoginPage();
        GmailPage gp=new GmailPage();
        PasswordRecoveryPage recovery= new PasswordRecoveryPage();
        login.launchApp();
        Thread.sleep(2000);
        login.clickForgotPassword();
        login.enterForgetEmail("anuragrana12123@gmail.com");
        login.clickSubmitButton();
        login.clickOkayPopup();
       // OpenChromeBrowser();
        switchToApp();
        Thread.sleep(3000);
        gp.clickEmail_passwordReset();
        recovery.passwordResetDetails("123451234512345","123451234512345");
       recovery.clickResetPassword();
       recovery.validatePasswordMoreThan14Char();
        
      
    }
    
    @Test(priority = 21, enabled = false, description = "Verify that validation message appear after tapping on 'Reset Password' button, when 'Confirm Password' field is left blank")
    public void validationConfirmPwdBlank() throws Exception {
        LoginPage login = new LoginPage();
        GmailPage gp=new GmailPage();
        PasswordRecoveryPage recovery= new PasswordRecoveryPage();
        login.launchApp();
        Thread.sleep(2000);
        login.clickForgotPassword();
        login.enterForgetEmail("anuragrana12123@gmail.com");
        login.clickSubmitButton();
        login.clickOkayPopup();
       // OpenChromeBrowser();
        switchToApp();
        Thread.sleep(3000);
        gp.clickEmail_passwordReset();
        recovery.passwordResetDetails("123451234512345","");
       recovery.clickResetPassword();
       recovery.validateConfirmPwd();
        
      
    }
    
    @Test(priority = 21, enabled = false, description = "Verify that validation message appear after tapping on 'Reset Password' button, when only spaces are entered in 'Confirm Password' field")
    public void validationConfirmPwdOnlySpaces() throws Exception {
        LoginPage login = new LoginPage();
        GmailPage gp=new GmailPage();
        PasswordRecoveryPage recovery= new PasswordRecoveryPage();
        login.launchApp();
        Thread.sleep(2000);
        login.clickForgotPassword();
        login.enterForgetEmail("anuragrana12123@gmail.com");
        login.clickSubmitButton();
        login.clickOkayPopup();
       // OpenChromeBrowser();
        switchToApp();
        Thread.sleep(3000);
        gp.clickEmail_passwordReset();
        recovery.passwordResetDetails("123451234512345","   ");
       recovery.clickResetPassword();
       recovery.validateConfirmPwd();
        
      
    }
    
    @Test(priority = 21, enabled = false, description = "Verify that validation message appear after tapping on 'Reset Password' button, when  different password entered in 'New Password' & 'Confirm Password' fields")
    public void validateNewAndConfirmPwdDifferent() throws Exception {
        LoginPage login = new LoginPage();
        GmailPage gp=new GmailPage();
        PasswordRecoveryPage recovery= new PasswordRecoveryPage();
        login.launchApp();
        Thread.sleep(2000);
        login.clickForgotPassword();
        login.enterForgetEmail("anuragrana12123@gmail.com");
        login.clickSubmitButton();
        login.clickOkayPopup();
       // OpenChromeBrowser();
        switchToApp();
        Thread.sleep(3000);
        gp.clickEmail_passwordReset();
        recovery.passwordResetDetails("123456","123455");
       recovery.clickResetPassword();
       recovery.validatePwdConfirmPwd();
        
      
    }
    
    @Test(priority = 21, enabled = false, description = "Verify that user is able to reset password after entering valid password in 'New Password' and 'Confirm Password' ")
    public void validatePasswordReset() throws Exception {
        LoginPage login = new LoginPage();
        GmailPage gp=new GmailPage();
        PasswordRecoveryPage recovery= new PasswordRecoveryPage();
        login.launchApp();
        Thread.sleep(2000);
        login.clickForgotPassword();
        login.enterForgetEmail("anuragrana12123@gmail.com");
        login.clickSubmitButton();
        login.clickOkayPopup();
       // OpenChromeBrowser();
        switchToApp();
        Thread.sleep(3000);
        gp.clickEmail_passwordReset();
        recovery.passwordResetDetails(newPassword,newPassword);
       recovery.clickResetPassword();
       recovery.pwdReset();
        
      
    }
    
    @Test(priority = 21, enabled = true, description = "Verify that user is able to login into the application with newly created password")
    public void validateSuccessLoginWithResetPwd() throws Exception {
    	 LoginPage login = new LoginPage();
         GmailPage gp=new GmailPage();
         PasswordRecoveryPage recovery= new PasswordRecoveryPage();
         login.launchApp();
         Thread.sleep(2000);
         login.clickForgotPassword();
         login.enterForgetEmail("anuragrana12123@gmail.com");
         login.clickSubmitButton();
         login.clickOkayPopup();
         switchToApp();
         Thread.sleep(3000);
         gp.clickEmail_passwordReset();
         recovery.passwordResetDetails(newPassword,newPassword);
        recovery.clickResetPassword();
        recovery.pwdReset();
        
        Hamburger hamburger = new Hamburger();
        login.launchApp();
        login.enterUserName("anuragrana12123@gmail.com");
        Thread.sleep(1000);
        login.enterPassword(newPassword);
        login.clickLogin();
        login.acceptAlert();
        //login.closeAppLaunchApp();
        Thread.sleep(2000);
        Assertion.assertTrue(hamburger.hamburgerIconPresent());
       // login.closeApp();
      
    }
    
}
