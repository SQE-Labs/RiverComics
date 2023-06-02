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

    @Test(priority = 19, enabled = true, description = "Verify that username logo appear below the rivercomics logo")
    public void validateUnsubscribeUsernameLogo() throws Exception {
        Hamburger hamburger = new Hamburger();
        Login login = new Login();
        login.LoginUser();
        hamburger.clickHumburgerIcon();
        Assertion.assertEquals(hamburger.getUserNameTXT(), UNSUB_USERNAME);
        DriverManager.getDriver().closeApp();
        DriverManager.getDriver().launchApp();

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
        Thread.sleep(2000);
        Assertion.assertEquals(hamburger.getUserNameTXT(), SUB_USERNAME);
        DriverManager.getDriver().closeApp();
        DriverManager.getDriver().launchApp();
    }


    @Test(priority = 21, enabled = true, description = "Verify that page refreshes on tapping home icon")
    public void refreshPageOnTap() throws Exception {
        HomePage homepage = new HomePage();
        Login login = new Login();
        login.LoginUser();
        homepage.clickRiverComicsLOGO();
        DriverManager.getDriver().closeApp();
        DriverManager.getDriver().launchApp();
    }

    //TODO // Assertion Fix
    @Test(priority = 22, enabled = true, description = "Verify that page refreshes on tapping home icon")
    public void validateTabsSubscribeSearchFavourite() throws Exception {
        HomePage homepage = new HomePage();
        Hamburger hamburger = new Hamburger();
        Login login = new Login();
        login.LoginUser();
        hamburger.clickHumburgerIcon();
//        Assertion.assertEquals(hamburger.getSubscribeTab(), SUBSCRIBE);
//        Assertion.assertEquals(hamburger.getSearchTab(), SEARCH);
//        Assertion.assertEquals(hamburger.getFavouriteTab(), FAVOURITE);
        DriverManager.getDriver().closeApp();
        DriverManager.getDriver().launchApp();

    }

    @Test(priority = 23, enabled = true, description = "Verify that plan detail page opens up")
    public void planDetailPageOpensUp() throws Exception {
        HomePage homepage = new HomePage();
        Hamburger hamburger = new Hamburger();
        Login login = new Login();
        login.LoginUser();
        hamburger.clickHumburgerIcon();
        hamburger.clickSubscribe();
        hamburger.validatePlanPage();
        DriverManager.getDriver().closeApp();
        DriverManager.getDriver().launchApp();
    }

    @Test(priority = 24, enabled = true, description = "Verify that search tab opens up")
    public void searchTabOpensUp() throws Exception {
        HomePage homepage = new HomePage();
        Hamburger hamburger = new Hamburger();
        Login login = new Login();
        login.LoginUser();
        hamburger.clickHumburgerIcon();
        hamburger.clickSearch();
        hamburger.validateSearchPage();
        DriverManager.getDriver().closeApp();
        DriverManager.getDriver().launchApp();
    }


    @Test(priority = 25, enabled = true, description = "Information message should appear when non-existing data")
    public void nonExistingDataEntered() throws Exception {
        Hamburger hamburger = new Hamburger();
        Login login = new Login();
        login.LoginUser();
        hamburger.clickHumburgerIcon();
        hamburger.clickSearch();
        hamburger.enterDataSearchField("32456");
        hamburger.validateNonexistingData();
        DriverManager.getDriver().closeApp();
        DriverManager.getDriver().launchApp();

    }

    @Test(priority = 26, enabled = true, description = "Favorite page should open up along with 'SERIES' and 'EPISODE' section tab opens up")
    public void SeriesEpisodeTabOpensUp() throws Exception {
        HomePage homepage = new HomePage();
        Hamburger hamburger = new Hamburger();
        Login login = new Login();
        login.LoginUser();
        hamburger.clickHumburgerIcon();
        hamburger.clickFavourite();
        hamburger.validateSearchField();
        DriverManager.getDriver().closeApp();
        DriverManager.getDriver().launchApp();

    }

    @Test(priority = 27, enabled = true, description = "Verify that a popup appears after tapping on 'Share' tab under 'Hamburger'menu.")
    public void popUpAppearsClickShare() throws Exception {
        Hamburger hamburger = new Hamburger();
        Login login = new Login();
        login.LoginUser();
        hamburger.clickHumburgerIcon();
        hamburger.clickShare();
        hamburger.validateShareTab();
        DriverManager.getDriver().closeApp();
        DriverManager.getDriver().launchApp();

    }

    @Test(priority = 28, enabled = true, description = "Verify that 'Settings page' opens up after tapping on 'Settings' tab  under 'Hamburger' menu.")
    public void settingPageOpensUp() throws Exception {
        Hamburger hamburger = new Hamburger();
        Login login = new Login();
        login.LoginUser();
        hamburger.clickHumburgerIcon();
        hamburger.clickSettingsTab();
        hamburger.validateSettingsPage();
        DriverManager.getDriver().closeApp();
        DriverManager.getDriver().launchApp();

    }

    @Test(priority = 29, enabled = true, description = "Verify that 'Select language' popup opens up after tapping on 'Language' sub-tab")
    public void selectLanugaugeOpensUp() throws Exception {
        Hamburger hamburger = new Hamburger();
        Login login = new Login();
        login.LoginUser();
        hamburger.clickHumburgerIcon();
        hamburger.clickSettingsTab();
        hamburger.clickLanguageSubTab();
        hamburger.validateLanguage();
        DriverManager.getDriver().closeApp();
        DriverManager.getDriver().launchApp();
    }

    @Test(priority = 30, enabled = true, description = "Verify that user should be able to select language")
    public void selectLanugauge() throws Exception {
        Hamburger hamburger = new Hamburger();
        Login login = new Login();
        login.LoginUser();
        hamburger.clickHumburgerIcon();
        hamburger.clickSettingsTab();
        hamburger.clickLanguageSubTab();
        hamburger.clickEnglishLanguage();
        DriverManager.getDriver().closeApp();
        DriverManager.getDriver().launchApp();

    }

    @Test(priority = 31, enabled = true, description = "Verify that update email address page opens up")
    public void updateEmailOpensUp() throws Exception {
        Hamburger hamburger = new Hamburger();
        Login login = new Login();
        login.LoginUser();
        hamburger.clickHumburgerIcon();
        hamburger.clickSettingsTab();
        hamburger.clickUpdateEmail();
        hamburger.validateUpdateEmail();
        DriverManager.getDriver().closeApp();
        DriverManager.getDriver().launchApp();

    }

    //TODO //Not getting validation message
    @Test(priority = 32, enabled = true, description = "Verify that update email address page opens up")
    public void updateEmailWith_NonExistingEmail() throws Exception {
        Hamburger hamburger = new Hamburger();
        Login login = new Login();
        login.LoginUser();
        hamburger.clickHumburgerIcon();
        hamburger.clickSettingsTab();
        hamburger.clickUpdateEmail();
        DriverManager.getDriver().closeApp();
        DriverManager.getDriver().launchApp();

    }

    @Test(priority = 33, enabled = true, description = "Verify that device list appear after tapping on 'Device List' sub-tab")
    public void validateDeviceList() throws Exception {
        Hamburger hamburger = new Hamburger();
        Login login = new Login();
        login.LoginUser();
        hamburger.clickHumburgerIcon();
        hamburger.clickSettingsTab();
        hamburger.clickDeviceList();
        hamburger.validateDevices();
        DriverManager.getDriver().closeApp();
        DriverManager.getDriver().launchApp();

    }
    @Test(priority = 34, enabled = true, description = "Verify that popup opens up after tapping on 'Delete Account'")
    public void validateDeleteAccount() throws Exception {
        Hamburger hamburger = new Hamburger();
        Login login = new Login();
        login.LoginUser();
        hamburger.clickHumburgerIcon();
        hamburger.clickSettingsTab();
        hamburger.clickDeleteAccount();
        DriverManager.getDriver().closeApp();
        DriverManager.getDriver().launchApp();
    }

    @Test(priority = 35, enabled = true, description = "Verify that user try to login with deleted account")
    public void deleted_Account_Login() throws Exception {
        Login login = new Login();
        Thread.sleep(2000);
        login.enterUserName("Ella@yopmail.com");
        login.enterPassword("123456");
        login.clickLogin();
        Assertion.assertEquals(login.getDeletedAccount(),DeletedAccountMSG);
        DriverManager.getDriver().closeApp();
        DriverManager.getDriver().launchApp();

    }

    @Test(priority = 36, enabled = true, description = "Verify that 'Select language' popup opens up on 'Change Language'")
    public void selectLanguagePopUpOpensUp() throws Exception {
        Hamburger hamburger = new Hamburger();
        Login login = new Login();
        login.LoginUser();
        hamburger.clickHumburgerIcon();
        hamburger.clickChangeLanguage();
        hamburger.validateLanguage();
        DriverManager.getDriver().closeApp();
        DriverManager.getDriver().launchApp();

    }

    @Test(priority = 37, enabled = true, description = "Verify that Contact Us page opens up after tapping on 'Contact us'")
    public void contactUsOpensUp() throws Exception {
        Hamburger hamburger = new Hamburger();
        Login login = new Login();
        login.LoginUser();
        hamburger.clickHumburgerIcon();
        hamburger.clickContactUs();
        DriverManager.getDriver().closeApp();
        DriverManager.getDriver().launchApp();

    }

    @Test(priority = 38, enabled = true, description = "Verify that FAQ's page opens up after tapping on 'FAQs'")
    public void FAQs() throws Exception {
        Hamburger hamburger = new Hamburger();
        Login login = new Login();
        login.LoginUser();
        hamburger.clickHumburgerIcon();
        hamburger.clickFAQs();
        hamburger.validateFAQs();
        DriverManager.getDriver().closeApp();
        DriverManager.getDriver().launchApp();

    }
}