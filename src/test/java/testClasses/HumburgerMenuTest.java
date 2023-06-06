package testClasses;

import base.BaseTest;
import org.testng.annotations.Test;
import pageObjects.Hamburger;
import pageObjects.HomePage;
import pageObjects.Login;
import utilities.Assertion;
import utilities.DriverManager;

public class HumburgerMenuTest extends BaseTest {


    String DeletedAccountMSG = "Your account has been deleted. Please contact support@rivercomics.com to learn more";
    String SUB_USERNAME = "clover@yopmail.com";
    String UNSUB_USERNAME = "test0404@yopmail.com";
    String PREMIUM = "PREMIUM";
    String BLANKEMAIL_MESSAGE = "Please enter current email address";
    String NONEXISTING_EMAIL_MESSAGE = "You have entered wrong email address";
    String NEW_EMAIL_MESSAGE = "Please enter new email address";
    String SAME_EMAIL_MESSAGE = "You have entered wrong email address";
    String CURRENTPASSWORD_TOAST_MSG = "Please enter current password";
    String DIFF_NEW_EMAIL = "Email addresses do not match";

    //115
    @Test(priority = 19, enabled = true, description = "Verify that username logo appear below the rivercomics logo")
    public void validateUnsubscribe_UsernameLogo() throws Exception {
        Hamburger hamburger = new Hamburger();
        Login login = new Login();
        login.launchApp();
        login.LoginUser();
        hamburger.clickHumburgerIcon();
        Assertion.assertEquals(hamburger.getUserNameTXT(), UNSUB_USERNAME);
        login.closeApp();
    }

    //116
    @Test(priority = 20, enabled = true, description = "Verify that username logo appear with Premium")
    public void validateSubscribe_UsernameLogo() throws Exception {
        Hamburger hamburger = new Hamburger();
        Login login = new Login();
        login.launchApp();
        Thread.sleep(2000);
        login.enterUserName("clover@yopmail.com");
        login.enterPassword("123456");
        login.clickLogin();
        login.acceptAlert();
        hamburger.clickHumburgerIcon();
        Assertion.assertEquals(hamburger.getPrenium(), PREMIUM);
        Assertion.assertEquals(hamburger.getUserNameTXT(), SUB_USERNAME);
        login.closeApp();
    }

    //117
    @Test(priority = 21, enabled = true, description = "Verify that page refreshes on tapping home icon")
    public void refreshPageOnTap() throws Exception {
        HomePage homepage = new HomePage();
        Login login = new Login();
        Hamburger Hamburger = new Hamburger();
        login.launchApp();
        login.LoginUser();
        homepage.clickRiverComicsLOGO();
        Assertion.assertTrue(Hamburger.isProgressBarPresent());
        login.closeApp();
    }

    //118
    @Test(priority = 22, enabled = true, description = "Verify Subscribe , Search and Favourite tabs")
    public void validateTabs_SubscribeSearchFavourite() throws Exception {
        HomePage homepage = new HomePage();
        Hamburger Hamburger = new Hamburger();
        Login login = new Login();
        login.launchApp();
        login.LoginUser();
        Hamburger.clickHumburgerIcon();
        Assertion.assertTrue(Hamburger.isSubscribeButtonPresent());
        Assertion.assertTrue(Hamburger.isSearchButtonPresent());
        Assertion.assertTrue(Hamburger.isFavouriteButtonPresent());
        login.closeApp();

    }

    //119
    @Test(priority = 23, enabled = true, description = "Verify that plan detail page opens up")
    public void planDetailPage_OpensUp() throws Exception {
        HomePage homepage = new HomePage();
        Hamburger Hamburger = new Hamburger();
        Login login = new Login();
        login.launchApp();
        login.LoginUser();
        Hamburger.clickHumburgerIcon();
        Hamburger.clickSubscribe();
        Assertion.assertTrue(Hamburger.isPlanDetailPagePresent());
        login.closeApp();
    }

    //120
    @Test(priority = 24, enabled = true, description = "Verify that search tab opens up")
    public void searchTab_OpensUp() throws Exception {
        HomePage homepage = new HomePage();
        Hamburger Hamburger = new Hamburger();
        Login login = new Login();
        login.launchApp();
        login.LoginUser();
        Hamburger.clickHumburgerIcon();
        Hamburger.clickSearch();
        Assertion.assertTrue(Hamburger.isSearchPagePresent());
        login.closeApp();
    }

    //121
    @Test(priority = 25, enabled = true, description = "Validation message should appear when non-existing data entered")
    public void nonExistingDataEnteredIn_HamburgerMenu() throws Exception {
        Hamburger Hamburger = new Hamburger();
        Login login = new Login();
        login.launchApp();
        login.LoginUser();
        Hamburger.clickHumburgerIcon();
        Hamburger.clickSearch();
        Hamburger.enterDataSearchField("32456");
        Assertion.assertTrue(Hamburger.isNoRecordFoundMsgPresent());
        login.closeApp();

    }


    //122
    @Test(priority = 26, enabled = true, description = "Favorite page should opens up along with 'SERIES' and 'EPISODE' section tab")
    public void SeriesEpisodeTabOpensUp() throws Exception {
        Hamburger Hamburger = new Hamburger();
        Login login = new Login();
        login.launchApp();
        login.LoginUser();
        Hamburger.clickHumburgerIcon();
        Hamburger.clickFavourite();
        Assertion.assertTrue(Hamburger.isSeriesPresent());
        login.closeApp();

    }
    //123
    @Test(priority = 27, enabled = true, description = "Verify that a popup appears after tapping on 'Share' tab under 'Hamburger'menu.")
    public void sharePage_PopUpOpensUp() throws Exception {
        Hamburger Hamburger = new Hamburger();
        Login login = new Login();
        login.launchApp();
        login.LoginUser();
        Hamburger.clickHumburgerIcon();
        Hamburger.clickShare();
       // Assertion.assertTrue(Hamburger.isUserOnSharePage());
        login.closeApp();

    }

    //124
    @Test(priority = 28, enabled = true, description = "Verify that 'Settings page' opens up after tapping on 'Settings' tab  under 'Hamburger' menu.")
    public void settingPage_OpensUp() throws Exception {
        Hamburger Hamburger = new Hamburger();
        Login login = new Login();
        login.launchApp();
        login.LoginUser();
        Hamburger.clickHumburgerIcon();
        Hamburger.clickSettingsTab();
        Assertion.assertTrue(Hamburger.isSettingsPagePresent());
        login.closeApp();

    }
    //125
    @Test(priority = 29, enabled = true, description = "Verify that 'Select language' popup opens up after tapping on 'Language' sub-tab")
    public void selectLanugauge_OpensUp() throws Exception {
        Hamburger Hamburger = new Hamburger();
        Login login = new Login();
        login.launchApp();
        login.LoginUser();
        Hamburger.clickHumburgerIcon();
        Hamburger.clickSettingsTab();
        Hamburger.clickLanguageSubTab();
        Assertion.assertTrue(Hamburger.isLanguageTabPresent());
        login.closeApp();
    }
    //126 / 127
    @Test(priority = 30, enabled = true, description = "Verify that user should be able to change language")
    public void selectedLanguage_Appears() throws Exception {
        Hamburger Hamburger = new Hamburger();
        Login login = new Login();
        login.launchApp();
        login.LoginUser();
        Hamburger.clickHumburgerIcon();
        Hamburger.clickSettingsTab();
        Hamburger.clickLanguageSubTab();
        Hamburger.clickEnglishLanguage();
        Assertion.assertTrue(Hamburger.isEnglishLanguagePresent());
        login.closeApp();
    }

    //128
    @Test(priority = 31, enabled = true, description = "Verify that update email address page opens up")
    public void updateEmail_OpensUp() throws Exception {
        Hamburger Hamburger = new Hamburger();
        Login login = new Login();
        login.launchApp();
        login.LoginUser();
        Hamburger.clickHumburgerIcon();
        Hamburger.clickSettingsTab();
        Hamburger.clickUpdateEmail();
        Assertion.assertTrue(Hamburger.isUpdateEmailPagePresent());
        login.closeApp();

    }
    //129
    @Test(priority = 32, enabled = true, description = "Verify that current email left blank in updated email field")
    public void currentEmailBlank_InUpdatedEmail() throws Exception {
        Hamburger Hamburger = new Hamburger();
        Login login = new Login();
        login.launchApp();
        login.LoginUser();
        Hamburger.clickHumburgerIcon();
        Hamburger.clickSettingsTab();
        Hamburger.clickUpdateEmail();
        Hamburger.clickSubmit();
        Assertion.assertEquals(Hamburger.getBlankEmailToastMsg(), BLANKEMAIL_MESSAGE);
        login.closeApp();
    }
    //130 / 133 / 134
    @Test(priority = 33, enabled = true, description = "Verify that update email with non existing email")
    public void NonExistingOrInvalidEmail_InUpdatedEmail() throws Exception {
        Hamburger Hamburger = new Hamburger();
        Login login = new Login();
        login.launchApp();
        login.LoginUser();
        Hamburger.clickHumburgerIcon();
        Hamburger.clickSettingsTab();
        Hamburger.clickUpdateEmail();
        Hamburger.enterNonExistingEmail("test7613@yopmail.com");
        Hamburger.clickSubmit();
        Assertion.assertEquals(Hamburger.getNonExistingEmailToastMsg(), NONEXISTING_EMAIL_MESSAGE);
        login.closeApp();

    }
    //132
    @Test(priority = 34, enabled = true, description = "Verify that update email with already registered email address")
    public void updateEmailWith_AlreadyRegisteredEmail() throws Exception {
        Hamburger Hamburger = new Hamburger();
        Login login = new Login();
        login.launchApp();
        login.LoginUser();
        Hamburger.clickHumburgerIcon();
        Hamburger.clickSettingsTab();
        Hamburger.clickUpdateEmail();
        Hamburger.enterAlreadyRegisteredEmail("test0404@yopmail.com");
        Hamburger.clickSubmit();
        Assertion.assertEquals(Hamburger.getNewEmailValidationMessage(), NEW_EMAIL_MESSAGE);
        login.closeApp();

    }
    //135
    @Test(priority = 35, enabled = true, description = "Verify that update email with new email field left blank")
    public void updateEmailWith_NewEmailBlank() throws Exception {
        Hamburger Hamburger = new Hamburger();
        Login login = new Login();
        login.launchApp();
        login.LoginUser();
        Hamburger.clickHumburgerIcon();
        Hamburger.clickSettingsTab();
        Hamburger.clickUpdateEmail();
        Hamburger.enterCurrentEmail("test0404@yopmail.com");
        Hamburger.enterConfirmEmail("test0404@yopmail.com");
        Hamburger.clickSubmit();
        Assertion.assertEquals(Hamburger.getNewEmailValidationMessage(), NEW_EMAIL_MESSAGE);
        login.closeApp();

    }

    //136 / 138
    @Test(priority = 36, enabled = true, description = "Verify that update email with new email field left blank")
    public void AlreadyRegistered_InAllFields() throws Exception {
        Hamburger Hamburger = new Hamburger();
        Login login = new Login();
        login.launchApp();
        login.LoginUser();
        Hamburger.clickHumburgerIcon();
        Hamburger.clickSettingsTab();
        Hamburger.clickUpdateEmail();
        Hamburger.enterCurrentEmail("test0404@yopmail.com");
        Hamburger.enterConfirmEmail("test0404@yopmail.com");
        Hamburger.clickSubmit();
        Assertion.assertEquals(Hamburger.getNewEmailValidationMessage(), NEW_EMAIL_MESSAGE);
        login.closeApp();

    }

    //137
    @Test(priority = 37, enabled = true, description = "Verify that same email is entered in current and new email field")
    public void sameEmailEntered_InCurrentNewEmail() throws Exception {
        Hamburger Hamburger = new Hamburger();
        Login login = new Login();
        login.launchApp();
        login.LoginUser();
        Hamburger.clickHumburgerIcon();
        Hamburger.clickSettingsTab();
        Hamburger.clickUpdateEmail();
        Hamburger.enterCurrentEmail("test0404@yopmail.com");
        Hamburger.enterNewEmail("test0404@yopmail.com");
        Hamburger.enterConfirmEmail("test0404@yopmail.com");
        Hamburger.clickSubmit();
        //Assertion.assertEquals(Hamburger.getSameEmailValidationMsg(), SAME_EMAIL_MESSAGE);
        login.closeApp();

    }
    //139
    @Test(priority = 38, enabled = true, description = "Verify that confirm email field left blank")
    public void confirmEmailBlank_InUpdatedEmail() throws Exception {
        Hamburger Hamburger = new Hamburger();
        Login login = new Login();
        login.launchApp();
        login.LoginUser();
        Hamburger.clickHumburgerIcon();
        Hamburger.clickSettingsTab();
        Hamburger.clickUpdateEmail();
        Hamburger.enterCurrentEmail("test0404@yopmail.com");
        Hamburger.enterNewEmail("test0404@yopmail.com");
        Hamburger.clickSubmit();
        Assertion.assertEquals(Hamburger.getValidationMessageConfirmEmailBlank(), SAME_EMAIL_MESSAGE);
        login.closeApp();

    }
    //140
    @Test(priority = 39, enabled = true, description = "Verify that New Email and Confirm Email entered different")
    public void differentEmail_InNewEmailConfirmEmail() throws Exception {
        Hamburger Hamburger = new Hamburger();
        Login login = new Login();
        login.launchApp();
        login.LoginUser();
        Hamburger.clickHumburgerIcon();
        Hamburger.clickSettingsTab();
        Hamburger.clickUpdateEmail();
        Hamburger.enterCurrentEmail("test0404@yopmail.com");
        Hamburger.enterNewEmail("test4331@yopmail.com");
        Hamburger.enterConfirmEmail("test4332@yopmail.com");
        Hamburger.clickSubmit();
        login.closeApp();
        //Assertion.assertEquals(Hamburger.getNewEmailValidationMessage(),DIFF_NEW_EMAIL);


    }

    //141
    //TODO Verify email with the link sent on registered email address
    @Test(priority = 40, enabled = false, description = "Verify that Email change request verification link has been sent to your registered email")
    public void validateLink_OnRegisteredEmail() throws Exception {
        Hamburger Hamburger = new Hamburger();
        Login login = new Login();
        login.launchApp();
        login.LoginUser();
        Hamburger.clickHumburgerIcon();
        Hamburger.clickSettingsTab();
        Hamburger.clickUpdateEmail();
        Hamburger.enterCurrentEmail("test0404@yopmail.com");
        Hamburger.enterNewEmail("test4331@yopmail.com");
        Hamburger.enterConfirmEmail("test4332@yopmail.com");
        Hamburger.clickSubmit();
        //Assertion.assertEquals(Hamburger.getNewEmailValidationMessage(),DIFF_NEW_EMAIL);
        login.closeApp();

    }


    //142
    @Test(priority = 41, enabled = true, description = "Verify that User should be able to update email by adding valid details")
    public void enterValidDetailsIn_AllUpdateEmail() throws Exception {
        Hamburger Hamburger = new Hamburger();
        Login login = new Login();
        login.launchApp();
        login.LoginUser();
        Hamburger.clickHumburgerIcon();
        Hamburger.clickSettingsTab();
        Hamburger.clickUpdateEmail();
        Hamburger.enterCurrentEmail("john0404@yopmail.com");
        Hamburger.enterNewEmail("test4331@yopmail.com");
        Hamburger.enterConfirmEmail("test4331@yopmail.com");
        Hamburger.clickSubmit();
        login.closeApp();
    }

    //143
    //TODO To be automated after "validateLink_OnRegisteredEmail"
    @Test(priority = 42, enabled = false, description = "Verify that User is able to login with updated Email")
    public void loginWith_UpdatedEmail() throws Exception {
        Login login = new Login();
        login.launchApp();
        Thread.sleep(2000);
        login.enterUserName("test4331@yopmail.com");
        login.enterPassword("123456");
        login.clickLogin();
        login.acceptAlert();
        login.closeApp();
    }


    //144
    @Test(priority = 43, enabled = true, description = "Verify that User is able to login with updated Email")
    public void updatedEmail_UnderLOGO() throws Exception {
        Hamburger hamburger = new Hamburger();
        Login login = new Login();
        login.launchApp();
        login.enterUserName("test4331@yopmail.com");
        login.enterPassword("123456");
        login.clickLogin();
        login.acceptAlert();
        hamburger.clickHumburgerIcon();
        Assertion.assertEquals(hamburger.getUserNameTXT(), UNSUB_USERNAME);
        login.closeApp();
    }

    //145
    @Test(priority = 44, enabled = true, description = "Verify that User is able to login with updated Email")
    public void updatePasswordSubtab_OpensUp() throws Exception {
        Hamburger hamburger = new Hamburger();
        Login login = new Login();
        login.launchApp();
        Thread.sleep(2000);
        login.LoginUser();
        hamburger.clickHumburgerIcon();
        hamburger.clickSettingsTab();
        hamburger.clickUpdatePassword();
        Assertion.assertTrue(hamburger.isConfirmNewPasswordPresent());
        login.closeApp();
    }

    //146
    @Test(priority = 45, enabled = true, description = "Verify that User is able to login with updated Email")
    public void currentPasswordBlank_InUpdatePasswordSubtab() throws Exception {
        Hamburger hamburger = new Hamburger();
        Login login = new Login();
        login.launchApp();
        Thread.sleep(2000);
        login.LoginUser();
        hamburger.clickHumburgerIcon();
        hamburger.clickSettingsTab();
        hamburger.clickUpdatePassword();
        hamburger.enterNewPassword("123456");
        hamburger.enterConfirmPassword("123456");
        hamburger.clickSubmitPassword();
       //Assertion.assertEquals(hamburger.getTextPleaseEnterCurrentPassword(), CURRENTPASSWORD_TOAST_MSG);
        login.closeApp();
    }

    //147
    @Test(priority = 46, enabled = true, description = "Verify that User is able to login with updated Email")
    public void invalidPassword_InCurrentPassword() throws Exception {
        Hamburger hamburger = new Hamburger();
        Login login = new Login();
        login.launchApp();
        Thread.sleep(2000);
        login.LoginUser();
        hamburger.clickHumburgerIcon();
        hamburger.clickSettingsTab();
        hamburger.clickUpdatePassword();
        hamburger.enterCurrentPassword("123");
        hamburger.enterNewPassword("123456");
        hamburger.enterConfirmPassword("123456");
        hamburger.clickSubmitPassword();
        //Assertion.assertEquals(hamburger.getTextPleaseEnterCurrentPassword(), CURRENTPASSWORD_TOAST_MSG);
        login.closeApp();
    }

    //148
    @Test(priority = 47, enabled = true, description = "Verify that User is able to login with updated Email")
    public void invalidPassword_InNewPassword() throws Exception {
        Hamburger hamburger = new Hamburger();
        Login login = new Login();
        login.launchApp();
        Thread.sleep(2000);
        login.LoginUser();
        hamburger.clickHumburgerIcon();
        hamburger.clickSettingsTab();
        hamburger.clickUpdatePassword();
        hamburger.enterCurrentPassword("123456");
        hamburger.enterNewPassword("123");
        hamburger.enterConfirmPassword("123456");
        hamburger.clickSubmitPassword();
        login.closeApp();
    }

    //149
    @Test(priority = 48, enabled = true, description = "Verify that User is able to login with updated Email")
    public void samePassword_InCurrentandNewPassword() throws Exception {
        Hamburger hamburger = new Hamburger();
        Login login = new Login();
        login.launchApp();
        Thread.sleep(2000);
        login.LoginUser();
        hamburger.clickHumburgerIcon();
        hamburger.clickSettingsTab();
        hamburger.clickUpdatePassword();
        hamburger.enterCurrentPassword("123456");
        hamburger.enterNewPassword("123456");
        hamburger.enterConfirmPassword("123456");
        hamburger.clickSubmitPassword();
        login.closeApp();
    }

    //150
    @Test(priority = 49, enabled = true, description = "Verify that User is able to login with updated Email")
    public void lessThan6_Character_InUpdatePassword() throws Exception {
        Hamburger hamburger = new Hamburger();
        Login login = new Login();
        login.launchApp();
        Thread.sleep(2000);
        login.LoginUser();
        hamburger.clickHumburgerIcon();
        hamburger.clickSettingsTab();
        hamburger.clickUpdatePassword();
        hamburger.enterCurrentPassword("123456");
        hamburger.enterNewPassword("123");
        hamburger.enterConfirmPassword("123");
        hamburger.clickSubmitPassword();
        login.closeApp();
    }


    //122
    @Test(priority = 50, enabled = true, description = "Verify that device list appear after tapping on 'Device List' sub-tab")
    public void validateDeviceList() throws Exception {
        Hamburger Hamburger = new Hamburger();
        Login login = new Login();
        login.launchApp();
        login.LoginUser();
        Hamburger.clickHumburgerIcon();
        Hamburger.clickSettingsTab();
        Hamburger.clickDeviceList();
        Assertion.assertTrue(Hamburger.isDevicePresent());
        login.closeApp();
    }

    //122
    //Not Added Further steps Because user will be deleted
    @Test(priority = 51, enabled = true, description = "Verify that popup opens up after tapping on 'Delete Account'")
    public void validateDeleteAccount() throws Exception {
        Hamburger Hamburger = new Hamburger();
        Login login = new Login();
        login.launchApp();
        login.LoginUser();
        Hamburger.clickHumburgerIcon();
        Hamburger.clickSettingsTab();
        Hamburger.clickDeleteAccount();
        login.closeApp();
    }
    //122
    @Test(priority = 52, enabled = true, description = "Verify that user try to login with deleted account")
    public void deleted_Account_Login() throws Exception {
        Login login = new Login();
        login.launchApp();
        Thread.sleep(2000);
        login.enterUserName("Ella@yopmail.com");
        login.enterPassword("123456");
        login.clickLogin();
        Assertion.assertEquals(login.getDeletedAccount(), DeletedAccountMSG);
        login.closeApp();

    }
    //122
    @Test(priority = 53, enabled = true, description = "Verify that 'Select language' popup opens up on 'Change Language'")
    public void selectLanguagePopUpOpensUp() throws Exception {
        Hamburger Hamburger = new Hamburger();
        Login login = new Login();
        login.launchApp();
        login.LoginUser();
        Hamburger.clickHumburgerIcon();
        Hamburger.clickChangeLanguage();
        Assertion.assertTrue(Hamburger.isLanguagePopUpOpensUp());
        login.closeApp();

    }
    //122
    //TODO //Assertion pending due to xpath issue.
    @Test(priority = 54, enabled = true, description = "Verify that Contact Us page opens up after tapping on 'Contact us'")
    public void contactUsOpensUp() throws Exception {
        Hamburger Hamburger = new Hamburger();
        Login login = new Login();
        login.launchApp();
        login.LoginUser();
        Hamburger.clickHumburgerIcon();
        Hamburger.clickContactUs();
        //Assertion.assertTrue(Humburger.isContactUsTabPresent());
        login.closeApp();

    }
    //122
    @Test(priority = 55, enabled = true, description = "Verify that FAQ's page opens up after tapping on 'FAQs'")
    public void FAQs() throws Exception {
        Hamburger Hamburger = new Hamburger();
        Login login = new Login();
        login.launchApp();
        login.LoginUser();
        Hamburger.clickHumburgerIcon();
        Hamburger.clickFAQs();
        Assertion.assertTrue(Hamburger.isFAQsPresent());
        login.closeApp();

    }
}