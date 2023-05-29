package testClasses;

import base.BaseTest;
import org.testng.annotations.Test;
import pageObjects.Hamburger;
import pageObjects.HomePage;
import pageObjects.Login;
import utilities.Assertion;

public class HumburgerMenuTest extends BaseTest {

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

    @Test(priority = 1, enabled = true, description = "Verify that username logo appear with Premium")
    public void validatesubscribeUsernameLogo() throws Exception {
        Hamburger hamburger = new Hamburger();
        LoginTest loginTest = new LoginTest();
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
    }


    @Test(priority = 2, enabled = true, description = "Verify that page refreshes on tapping home icon")
    public void refreshPageOnTap() throws Exception {
        HomePage homepage = new HomePage();
        LoginTest login = new LoginTest();
        login.valid_Login();
        homepage.clickRiverComicsLOGO();
    }

    //TODO // Assertion Fix
    @Test(priority = 3, enabled = true, description = "Verify that page refreshes on tapping home icon")
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

    @Test(priority = 4, enabled = true, description = "Verify that plan detail page opens up")
    public void planDetailPageOpensUp() throws Exception {
        HomePage homepage = new HomePage();
        Hamburger hamburger = new Hamburger();
        LoginTest login = new LoginTest();
        login.valid_Login();
        hamburger.clickHumburgerIcon();
        hamburger.clickSubscribe();
        hamburger.validatePlanPage();
    }

    @Test(priority = 5, enabled = true, description = "Verify that search tab opens up")
    public void searchTabOpensUp() throws Exception {
        HomePage homepage = new HomePage();
        Hamburger hamburger = new Hamburger();
        LoginTest login = new LoginTest();
        login.valid_Login();
        hamburger.clickHumburgerIcon();
        hamburger.clickSearch();
        hamburger.validateSearchPage();
    }


    @Test(priority = 6, enabled = true, description = "Favorite page should open up along with 'SERIES' and 'EPISODE' section tab opens up")
    public void SeriesEpisodeTabOpensUp() throws Exception {
        HomePage homepage = new HomePage();
        Hamburger hamburger = new Hamburger();
        LoginTest login = new LoginTest();
        login.valid_Login();
        hamburger.clickHumburgerIcon();
        hamburger.clickFavourite();
        hamburger.validateSearchField();

    }
}
