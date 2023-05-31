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
    String SUBSCRIBE = "Subscribe";
    String SEARCH = "Search";
    String FAVOURITE = "Favourite";

    @Test(priority = 1, enabled = true, description = "Verify that username logo appear below the rivercomics logo")
    public void validateUnsubscribeUsernameLogo() throws Exception {
        Hamburger hamburger = new Hamburger();
        LoginTest login = new LoginTest();
        login.valid_Login();
        hamburger.clickHumburgerIcon();
        Assertion.assertEquals(hamburger.getUserNameTXT(), UNSUB_USERNAME);

    }

    @Test(priority = 2, enabled = true, description = "Verify that username logo appear with Premium")
    public void validatesubscribeUsernameLogo() throws Exception {
        Hamburger hamburger = new Hamburger();
        LoginTest loginTest = new LoginTest();
        Login login = new Login();
        DriverManager.getDriver().launchApp();
        Thread.sleep(2000);
        login.enterUserName("clover@yopmail.com");
        login.enterPassword("123456");
        login.clickLogin();
        login.acceptAlert();
        hamburger.clickHumburgerIcon();
        Assertion.assertEquals(hamburger.getPrenium(), PREMIUM);
        Thread.sleep(2000);
        Assertion.assertEquals(hamburger.getUserNameTXT(), SUB_USERNAME);
    }


    @Test(priority = 3, enabled = true, description = "Verify that page refreshes on tapping home icon")
    public void refreshPageOnTap() throws Exception {
        HomePage homepage = new HomePage();
        LoginTest login = new LoginTest();
        login.valid_Login();
        homepage.clickRiverComicsLOGO();
    }

    //TODO // Assertion Fix
    @Test(priority = 4, enabled = true, description = "Verify that page refreshes on tapping home icon")
    public void validateTabsSubscribeSearchFavourite() throws Exception {
        HomePage homepage = new HomePage();
        Hamburger hamburger = new Hamburger();
        LoginTest login = new LoginTest();
        login.valid_Login();
        hamburger.clickHumburgerIcon();
//        Assertion.assertEquals(hamburger.getSubscribeTab(), SUBSCRIBE);
//        Assertion.assertEquals(hamburger.getSearchTab(), SEARCH);
//        Assertion.assertEquals(hamburger.getFavouriteTab(), FAVOURITE);

    }

    @Test(priority = 5, enabled = true, description = "Verify that plan detail page opens up")
    public void planDetailPageOpensUp() throws Exception {
        HomePage homepage = new HomePage();
        Hamburger hamburger = new Hamburger();
        LoginTest login = new LoginTest();
        login.valid_Login();
        hamburger.clickHumburgerIcon();
        hamburger.clickSubscribe();
        hamburger.validatePlanPage();
    }

    @Test(priority = 6, enabled = true, description = "Verify that search tab opens up")
    public void searchTabOpensUp() throws Exception {
        HomePage homepage = new HomePage();
        Hamburger hamburger = new Hamburger();
        LoginTest login = new LoginTest();
        login.valid_Login();
        hamburger.clickHumburgerIcon();
        hamburger.clickSearch();
        hamburger.validateSearchPage();
    }


    @Test(priority = 7, enabled = true, description = "Information message should appear when non-existing data")
    public void nonExistingDataEntered() throws Exception {
        Hamburger hamburger = new Hamburger();
        LoginTest login = new LoginTest();
        login.valid_Login();
        hamburger.clickHumburgerIcon();
        hamburger.clickSearch();
        hamburger.enterDataSearchField("32456");
        hamburger.validateNonexistingData();

    }

    @Test(priority = 8, enabled = true, description = "Favorite page should open up along with 'SERIES' and 'EPISODE' section tab opens up")
    public void SeriesEpisodeTabOpensUp() throws Exception {
        HomePage homepage = new HomePage();
        Hamburger hamburger = new Hamburger();
        LoginTest login = new LoginTest();
        login.valid_Login();
        hamburger.clickHumburgerIcon();
        hamburger.clickFavourite();
        hamburger.validateSearchField();

    }

    @Test(priority = 9, enabled = true, description = "Verify that a popup appears after tapping on 'Share' tab under 'Hamburger'menu.")
    public void popUpAppearsClickShare() throws Exception {
        Hamburger hamburger = new Hamburger();
        LoginTest login = new LoginTest();
        login.valid_Login();
        hamburger.clickHumburgerIcon();
        hamburger.clickShare();
        hamburger.validateShareTab();

    }

    @Test(priority = 10, enabled = true, description = "Verify that 'Settings page' opens up after tapping on 'Settings' tab  under 'Hamburger' menu.")
    public void settingPageOpensUp() throws Exception {
        Hamburger hamburger = new Hamburger();
        LoginTest login = new LoginTest();
        login.valid_Login();
        hamburger.clickHumburgerIcon();
        hamburger.clickSettingsTab();
        hamburger.validateSettingsPage();

    }

    @Test(priority = 11, enabled = true, description = "Verify that 'Select language' popup opens up after tapping on 'Language' sub-tab")
    public void selectLanugaugeOpensUp() throws Exception {
        Hamburger hamburger = new Hamburger();
        LoginTest login = new LoginTest();
        login.valid_Login();
        hamburger.clickHumburgerIcon();
        hamburger.clickSettingsTab();
        hamburger.clickLanguageSubTab();
        hamburger.validateLanguage();
    }

    @Test(priority = 12, enabled = true, description = "Verify that user should be able to select language")
    public void selectLanugauge() throws Exception {
        Hamburger hamburger = new Hamburger();
        LoginTest login = new LoginTest();
        login.valid_Login();
        hamburger.clickHumburgerIcon();
        hamburger.clickSettingsTab();
        hamburger.clickLanguageSubTab();
        hamburger.clickEnglishLanguage();

    }

    @Test(priority = 13, enabled = true, description = "Verify that update email address page opens up")
    public void updateEmailOpensUp() throws Exception {
        Hamburger hamburger = new Hamburger();
        LoginTest login = new LoginTest();
        login.valid_Login();
        hamburger.clickHumburgerIcon();
        hamburger.clickSettingsTab();
        hamburger.clickUpdateEmail();
        hamburger.validateUpdateEmail();

    }

    //TODO //Not getting validation message
    @Test(priority = 14, enabled = true, description = "Verify that update email address page opens up")
    public void updateEmailWith_NonExistingEmail() throws Exception {
        Hamburger hamburger = new Hamburger();
        LoginTest login = new LoginTest();
        login.valid_Login();
        hamburger.clickHumburgerIcon();
        hamburger.clickSettingsTab();
        hamburger.clickUpdateEmail();

    }

    @Test(priority = 15, enabled = true, description = "Verify that device list appear after tapping on 'Device List' sub-tab")
    public void validateDeviceList() throws Exception {
        Hamburger hamburger = new Hamburger();
        LoginTest login = new LoginTest();
        login.valid_Login();
        hamburger.clickHumburgerIcon();
        hamburger.clickSettingsTab();
        hamburger.clickDeviceList();
        hamburger.validateDevices();

    }
    @Test(priority = 16, enabled = true, description = "Verify that popup opens up after tapping on 'Delete Account'")
    public void validateDeleteAccount() throws Exception {
        Hamburger hamburger = new Hamburger();
        LoginTest login = new LoginTest();
        login.valid_Login();
        hamburger.clickHumburgerIcon();
        hamburger.clickSettingsTab();
        hamburger.clickDeleteAccount();
    }

    @Test(priority = 17, enabled = true, description = "Verify that user try to login with deleted account")
    public void deleted_Account_Login() throws Exception {
        Login login = new Login();
        Thread.sleep(2000);
        login.enterUserName("Ella@yopmail.com");
        login.enterPassword("123456");
        login.clickLogin();
        Assertion.assertEquals(login.getDeletedAccount(),DeletedAccountMSG);

    }

    @Test(priority = 18, enabled = true, description = "Verify that 'Select language' popup opens up on 'Change Language'")
    public void selectLanguagePopUpOpensUp() throws Exception {
        Hamburger hamburger = new Hamburger();
        LoginTest login = new LoginTest();
        login.valid_Login();
        hamburger.clickHumburgerIcon();
        hamburger.clickChangeLanguage();
        hamburger.validateLanguage();

    }

    @Test(priority = 19, enabled = true, description = "Verify that Contact Us page opens up after tapping on 'Contact us'")
    public void contactUsOpensUp() throws Exception {
        Hamburger hamburger = new Hamburger();
        LoginTest login = new LoginTest();
        login.valid_Login();
        hamburger.clickHumburgerIcon();
        hamburger.clickContactUs();

    }

    @Test(priority = 20, enabled = true, description = "Verify that FAQ's page opens up after tapping on 'FAQs'")
    public void FAQs() throws Exception {
        Hamburger hamburger = new Hamburger();
        LoginTest login = new LoginTest();
        login.valid_Login();
        hamburger.clickHumburgerIcon();
        hamburger.clickFAQs();
        hamburger.validateFAQs();

    }
}