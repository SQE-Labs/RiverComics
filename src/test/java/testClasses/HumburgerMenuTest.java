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
    String CURRENT_EMAIL_BLANK = "Please confirm new email address";

    @Test(priority = 19, enabled = true, description = "Verify that username logo appear below the rivercomics logo")
    public void validateUnsubscribeUsernameLogo() throws Exception {
        Hamburger hamburger = new Hamburger();
        Login login = new Login();
        login.launchApp();
        login.LoginUser();
        hamburger.clickHumburgerIcon();
        Assertion.assertEquals(hamburger.getUserNameTXT(), UNSUB_USERNAME);
        login.closeAppLaunchApp();
    }

    @Test(priority = 20, enabled = true, description = "Verify that username logo appear with Premium")
    public void validatesubscribeUsernameLogo() throws Exception {
        Hamburger hamburger = new Hamburger();
        Login login = new Login();
        Thread.sleep(2000);
        login.enterUserName("clover@yopmail.com");
        login.enterPassword("123456");
        login.clickLogin();
        login.acceptAlert();
        hamburger.clickHumburgerIcon();
        Assertion.assertEquals(hamburger.getPrenium(), PREMIUM);
        Assertion.assertEquals(hamburger.getUserNameTXT(), SUB_USERNAME);
        login.closeAppLaunchApp();
    }


    @Test(priority = 21, enabled = true, description = "Verify that page refreshes on tapping home icon")
    public void refreshPageOnTap() throws Exception {
        HomePage homepage = new HomePage();
        Login login = new Login();
        Hamburger Hamburger = new Hamburger();
        login.LoginUser();
        homepage.clickRiverComicsLOGO();
        Assertion.assertTrue(Hamburger.isProgressBarPresent());
        login.closeAppLaunchApp();
    }

    @Test(priority = 22, enabled = true, description = "Verify that page refreshes on tapping home icon")
    public void validateTabsSubscribeSearchFavourite() throws Exception {
        HomePage homepage = new HomePage();
        Hamburger Hamburger = new Hamburger();
        Login login = new Login();
        login.LoginUser();
        Hamburger.clickHumburgerIcon();
        Assertion.assertTrue(Hamburger.isSubscribeButtonPresent());
        Assertion.assertTrue(Hamburger.isSearchButtonPresent());
        Assertion.assertTrue(Hamburger.isFavouriteButtonPresent());
        login.closeAppLaunchApp();

    }

    @Test(priority = 23, enabled = true, description = "Verify that plan detail page opens up")
    public void planDetailPageOpensUp() throws Exception {
        HomePage homepage = new HomePage();
        Hamburger Hamburger = new Hamburger();
        Login login = new Login();
        login.LoginUser();
        Hamburger.clickHumburgerIcon();
        Hamburger.clickSubscribe();
        Assertion.assertTrue(Hamburger.isPlanDetailPagePresent());
        login.closeAppLaunchApp();
    }

    @Test(priority = 24, enabled = true, description = "Verify that search tab opens up")
    public void searchTabOpensUp() throws Exception {
        HomePage homepage = new HomePage();
        Hamburger Hamburger = new Hamburger();
        Login login = new Login();
        login.LoginUser();
        Hamburger.clickHumburgerIcon();
        Hamburger.clickSearch();
        Assertion.assertTrue(Hamburger.isSearchPagePresent());
        login.closeAppLaunchApp();
    }


    @Test(priority = 25, enabled = true, description = "Information message should appear when non-existing data")
    public void nonExistingDataEntered() throws Exception {
        Hamburger Hamburger = new Hamburger();
        Login login = new Login();
        login.LoginUser();
        Hamburger.clickHumburgerIcon();
        Hamburger.clickSearch();
        Hamburger.enterDataSearchField("32456");
        Assertion.assertTrue(Hamburger.isNoRecordFoundMsgPresent());
        login.closeAppLaunchApp();

    }

    @Test(priority = 26, enabled = true, description = "Favorite page should open up along with 'SERIES' and 'EPISODE' section tab opens up")
    public void SeriesEpisodeTabOpensUp() throws Exception {
        Hamburger Hamburger = new Hamburger();
        Login login = new Login();
        login.LoginUser();
        Hamburger.clickHumburgerIcon();
        Hamburger.clickFavourite();
        Assertion.assertTrue(Hamburger.isSeriesPresent());
        login.closeAppLaunchApp();

    }

    @Test(priority = 27, enabled = true, description = "Verify that a popup appears after tapping on 'Share' tab under 'Hamburger'menu.")
    public void popUpAppearsClickShare() throws Exception {
        Hamburger Hamburger = new Hamburger();
        Login login = new Login();
        login.LoginUser();
        Hamburger.clickHumburgerIcon();
        Hamburger.clickShare();
        Assertion.assertTrue(Hamburger.isUserOnSharePage());
        login.closeAppLaunchApp();

    }

    @Test(priority = 28, enabled = true, description = "Verify that 'Settings page' opens up after tapping on 'Settings' tab  under 'Hamburger' menu.")
    public void settingPageOpensUp() throws Exception {
        Hamburger Hamburger = new Hamburger();
        Login login = new Login();
        login.LoginUser();
        Hamburger.clickHumburgerIcon();
        Hamburger.clickSettingsTab();
        Assertion.assertTrue(Hamburger.isSettingsPagePresent());
        login.closeAppLaunchApp();

    }

    @Test(priority = 29, enabled = true, description = "Verify that 'Select language' popup opens up after tapping on 'Language' sub-tab")
    public void selectLanugaugeOpensUp() throws Exception {
        Hamburger Hamburger = new Hamburger();
        Login login = new Login();
        login.LoginUser();
        Hamburger.clickHumburgerIcon();
        Hamburger.clickSettingsTab();
        Hamburger.clickLanguageSubTab();
        Assertion.assertTrue(Hamburger.isLanguageTabPresent());
        login.closeAppLaunchApp();
    }

    @Test(priority = 30, enabled = true, description = "Verify that user should be able to select language")
    public void selectLanugauge() throws Exception {
        Hamburger Hamburger = new Hamburger();
        Login login = new Login();
        login.LoginUser();
        Hamburger.clickHumburgerIcon();
        Hamburger.clickSettingsTab();
        Hamburger.clickLanguageSubTab();
        Hamburger.clickEnglishLanguage();
        Assertion.assertTrue(Hamburger.isEnglishLanguagePresent());
        login.closeAppLaunchApp();

    }

    @Test(priority = 31, enabled = true, description = "Verify that update email address page opens up")
    public void updateEmailOpensUp() throws Exception {
        Hamburger Hamburger = new Hamburger();
        Login login = new Login();
        login.LoginUser();
        Hamburger.clickHumburgerIcon();
        Hamburger.clickSettingsTab();
        Hamburger.clickUpdateEmail();
        Assertion.assertTrue(Hamburger.isUpdateEmailPagePresent());
        login.closeAppLaunchApp();

    }

    @Test(priority = 32, enabled = true, description = "Verify that update email with blank email entered")
    public void updateEmailWith_BlankEmailEntered() throws Exception {
        Hamburger Hamburger = new Hamburger();
        Login login = new Login();
        login.LoginUser();
        Hamburger.clickHumburgerIcon();
        Hamburger.clickSettingsTab();
        Hamburger.clickUpdateEmail();
        Hamburger.clickSubmit();
        Assertion.assertEquals(Hamburger.getBlankEmailToastMsg(), BLANKEMAIL_MESSAGE);
        login.closeAppLaunchApp();
    }

    @Test(priority = 33, enabled = true, description = "Verify that update email with non existing email")
    public void updateEmailWith_NonExistingEmail() throws Exception {
        Hamburger Hamburger = new Hamburger();
        Login login = new Login();
        login.LoginUser();
        Hamburger.clickHumburgerIcon();
        Hamburger.clickSettingsTab();
        Hamburger.clickUpdateEmail();
        Hamburger.enterNonExistingEmail("test7613@yopmail.com");
        Hamburger.clickSubmit();
        Assertion.assertEquals(Hamburger.getNonExistingEmailToastMsg(), NONEXISTING_EMAIL_MESSAGE);
        login.closeAppLaunchApp();

    }

    @Test(priority = 34, enabled = true, description = "Verify that update email with already registered email")
    public void updateEmailWith_AlreadyRegisteredEmail() throws Exception {
        Hamburger Hamburger = new Hamburger();
        Login login = new Login();
        login.LoginUser();
        Hamburger.clickHumburgerIcon();
        Hamburger.clickSettingsTab();
        Hamburger.clickUpdateEmail();
        Hamburger.enterAlreadyRegisteredEmail("test0404@yopmail.com");
        Hamburger.clickSubmit();
        Assertion.assertEquals(Hamburger.getNewEmailValidationMessage(), NEW_EMAIL_MESSAGE);
        login.closeAppLaunchApp();

    }

    @Test(priority = 35, enabled = true, description = "Verify that update email with new email field left blank")
    public void updateEmailWith_NewEmailBlank() throws Exception {
        Hamburger Hamburger = new Hamburger();
        Login login = new Login();
        login.LoginUser();
        Hamburger.clickHumburgerIcon();
        Hamburger.clickSettingsTab();
        Hamburger.clickUpdateEmail();
        Hamburger.enterCurrentEmail("test0404@yopmail.com");
        Hamburger.enterConfirmEmail("test0404@yopmail.com");
        Hamburger.clickSubmit();
        Assertion.assertEquals(Hamburger.getNewEmailValidationMessage(), NEW_EMAIL_MESSAGE);
        login.closeAppLaunchApp();

    }

    //TODO //Not able to reproduce this test case
    @Test(priority = 36, enabled = true, description = "Verify that update email with new email field left blank")
    public void AlreadyRegisteredEmail_In_NewEmail() throws Exception {
        Hamburger Hamburger = new Hamburger();
        Login login = new Login();
        login.LoginUser();
        Hamburger.clickHumburgerIcon();
        Hamburger.clickSettingsTab();
        Hamburger.clickUpdateEmail();
//        Hamburger.enterAlreadyRegisteredEmail("test0404@yopmail.com");
//        Hamburger.enterConfirmEmail("test0404@yopmail.com");
//        Hamburger.clickSubmit();
//        Assertion.assertEquals(Hamburger.getNewEmailValidationMessage(), NEW_EMAIL_MESSAGE);
        login.closeAppLaunchApp();

    }

    @Test(priority = 37, enabled = true, description = "Verify that same email is entered in current and new email field")
    public void sameEmailEntered() throws Exception {
        Hamburger Hamburger = new Hamburger();
        Login login = new Login();
        login.LoginUser();
        Hamburger.clickHumburgerIcon();
        Hamburger.clickSettingsTab();
        Hamburger.clickUpdateEmail();
        Hamburger.enterCurrentEmail("test0404@yopmail.com");
        Hamburger.enterNewEmail("test0404@yopmail.com");
        Hamburger.enterConfirmEmail("test0404@yopmail.com");
        Hamburger.clickSubmit();
        Assertion.assertEquals(Hamburger.getSameEmailValidationMsg(), SAME_EMAIL_MESSAGE);
        login.closeAppLaunchApp();

    }

    @Test(priority = 38, enabled = true, description = "Verify that confirm email field left blank")
    public void confirmEmailLeftBlank() throws Exception {
        Hamburger Hamburger = new Hamburger();
        Login login = new Login();
        login.LoginUser();
        Hamburger.clickHumburgerIcon();
        Hamburger.clickSettingsTab();
        Hamburger.clickUpdateEmail();
        Hamburger.enterCurrentEmail("test0404@yopmail.com");
        Hamburger.enterNewEmail("test0404@yopmail.com");
        Hamburger.clickSubmit();
        Assertion.assertEquals(Hamburger.getValidationMessageConfirmEmailBlank(), SAME_EMAIL_MESSAGE);
        login.closeAppLaunchApp();

    }

    @Test(priority = 39, enabled = true, description = "Verify that device list appear after tapping on 'Device List' sub-tab")
    public void validateDeviceList() throws Exception {
        Hamburger Hamburger = new Hamburger();
        Login login = new Login();
        login.LoginUser();
        Hamburger.clickHumburgerIcon();
        Hamburger.clickSettingsTab();
        Hamburger.clickDeviceList();
        Assertion.assertTrue(Hamburger.isDevicePresent());
        login.closeAppLaunchApp();

    }

    //Not Added Further steps Because user will be deleted
    @Test(priority = 40, enabled = true, description = "Verify that popup opens up after tapping on 'Delete Account'")
    public void validateDeleteAccount() throws Exception {
        Hamburger Hamburger = new Hamburger();
        Login login = new Login();
        login.LoginUser();
        Hamburger.clickHumburgerIcon();
        Hamburger.clickSettingsTab();
        Hamburger.clickDeleteAccount();
        login.closeAppLaunchApp();
    }

    @Test(priority = 41, enabled = true, description = "Verify that user try to login with deleted account")
    public void deleted_Account_Login() throws Exception {
        Login login = new Login();
        Thread.sleep(2000);
        login.enterUserName("Ella@yopmail.com");
        login.enterPassword("123456");
        login.clickLogin();
        Assertion.assertEquals(login.getDeletedAccount(), DeletedAccountMSG);
        login.closeAppLaunchApp();

    }

    @Test(priority = 42, enabled = true, description = "Verify that 'Select language' popup opens up on 'Change Language'")
    public void selectLanguagePopUpOpensUp() throws Exception {
        Hamburger Hamburger = new Hamburger();
        Login login = new Login();
        login.LoginUser();
        Hamburger.clickHumburgerIcon();
        Hamburger.clickChangeLanguage();
        Assertion.assertTrue(Hamburger.isLanguagePopUpOpensUp());
        login.closeAppLaunchApp();

    }

    //TODO //Assertion pending due to xpath issue.
    @Test(priority = 43, enabled = true, description = "Verify that Contact Us page opens up after tapping on 'Contact us'")
    public void contactUsOpensUp() throws Exception {
        Hamburger Hamburger = new Hamburger();
        Login login = new Login();
        login.LoginUser();
        Hamburger.clickHumburgerIcon();
        Hamburger.clickContactUs();
        //Assertion.assertTrue(Humburger.isContactUsTabPresent());
        login.closeAppLaunchApp();

    }

    @Test(priority = 44, enabled = true, description = "Verify that FAQ's page opens up after tapping on 'FAQs'")
    public void FAQs() throws Exception {
        Hamburger Hamburger = new Hamburger();
        Login login = new Login();
        login.LoginUser();
        Hamburger.clickHumburgerIcon();
        Hamburger.clickFAQs();
        Assertion.assertTrue(Hamburger.isFAQsPresent());
        login.closeAppLaunchApp();

    }
}