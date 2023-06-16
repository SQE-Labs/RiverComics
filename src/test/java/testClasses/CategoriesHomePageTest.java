package testClasses;

import base.BaseTest;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.Login;
import pageObjects.SeriesDetail;
import utilities.Assertion;

import java.util.List;

public class CategoriesHomePageTest extends BaseTest {

    String MOST_POPULAR = "MOST POPULAR";
    String ALL = "ALL";
    String RIVERCOMICS_ORIGINALS = "RIVER COMICS ORIGINALS";
    String PREVIEWS = "PREVIEWS";
    String LATEST_SERIES = "LATEST SERIES";
    String INTRO_EPISODE_TXT = "INTRO EPISODES";
    String SHAURYA_TXT = "Shaurya";
    String ATLANTIS_TXT = "Atlantis";
    String ISSUE_COUNT = "Issues (16)";

    @Test(priority = 69, enabled = true, description = "Verify the UI of 'Home' page")
    public void verifyUIHomePage() throws Exception {
        Login login = new Login();
        HomePage HomePage = new HomePage();
        login.launchApp();
        login.LoginUser();
        Assertion.assertTrue(HomePage.isSubscribePresent());
        Thread.sleep(2000);
        Assertion.assertTrue(HomePage.isRiverComicsLogoPresent());
        Thread.sleep(2000);
        Assertion.assertTrue(HomePage.isHamburgerPresent());
        Thread.sleep(2000);
        login.closeApp();

    }

    @Test(priority = 70, enabled = true, description = "Verify that 'Favorite' icon and 'Search' icon appearse, when subscribed users login.")
    public void verifyFavouriteAndSearchIcon_WithSubscribedUser() throws Exception {
        Login login = new Login();
        HomePage HomePage = new HomePage();
        Thread.sleep(2000);
        login.launchApp();
        login.subscriberUserLogin();
        Assertion.assertTrue(HomePage.isFavouriteIconPresent());
        Thread.sleep(2000);
        Assertion.assertTrue(HomePage.isSearchIconPresent());
        login.closeApp();

    }

    @Test(priority = 71, enabled = true, description = "Verify that 5 filter options appear, on 'Home' page.")
    public void verify5Filter() throws Exception {
        Login login = new Login();
        HomePage HomePage = new HomePage();
        Thread.sleep(2000);
        login.launchApp();
        login.LoginUser();
        Assertion.assertEquals(HomePage.getTextAll(), ALL);
        Thread.sleep(2000);
        Assertion.assertEquals(HomePage.getTextPreviews(), PREVIEWS);
        Thread.sleep(2000);
        Assertion.assertEquals(HomePage.getTextRiverComicsOriginals(), RIVERCOMICS_ORIGINALS);
        Thread.sleep(2000);
        Assertion.assertEquals(HomePage.getTextLatestSeries(), LATEST_SERIES);
        Thread.sleep(2000);
        Assertion.assertEquals(HomePage.getTextMostPopular(), MOST_POPULAR);
        login.closeApp();
    }

    @Test(priority = 72, enabled = true, description = "Verify that 'INTRO EPISODES' and 'COMING SOON' categories")
    public void verifyIntroEpisodes_ComingSoon() throws Exception {
        Login login = new Login();
        HomePage HomePage = new HomePage();
        Thread.sleep(2000);
        login.launchApp();
        login.LoginUser();
        HomePage.clickFilter();
        HomePage.clickPreviews();
        Assertion.assertTrue(HomePage.isIntro_EpisodePresent());
        Thread.sleep(2000);
        Assertion.assertTrue(HomePage.isComing_SoonPresent());
        login.closeApp();
    }

    //TODO --- Assertion is pending due to find count of the series
    @Test(priority = 73, enabled = true, description = "Verify that River comics originals series appear")
    public void riverComicsOriginalSeries_Appear() throws Exception {
        Login login = new Login();
        HomePage HomePage = new HomePage();
        Thread.sleep(2000);
        login.launchApp();
        login.LoginUser();
        HomePage.clickFilter();
        HomePage.clickRiverComicsOriginals();
        login.closeApp();
//        TouchAction touch1 = new TouchAction(driver);
//        touch1.tap (80, 300).perform();
//        List optionCount =driver.findElements(By.id("com.river.comics.us:id/a_container"));
//        System.out.println(optionCount.size()-1);

//            List<WebElement> ele = driver.findElements(By.id("com.river.comics.us:id/a_container"));
//            int size=0;
//            size = size+ele.size();
//            System.out.println(size);
    }

    //TODO --- Assertion is pending due to find count of the series
    @Test(priority = 74, enabled = true, description = "Verify that all series appear after applying 'All' filter")
    public void allSeries_Appear() throws Exception {
        Login login = new Login();
        HomePage HomePage = new HomePage();
        Thread.sleep(2000);
        login.launchApp();
        login.LoginUser();
        HomePage.clickFilter();
        HomePage.clickAllSeries();
        login.closeApp();

    }


    @Test(priority = 75, enabled = true, description = "Verify that 'Select category' popup closes after tapping on 'Cancel' button on 'Home' page.")
    public void selectCategoryPopup_Closed() throws Exception {
        Login login = new Login();
        HomePage HomePage = new HomePage();
        Thread.sleep(2000);
        login.launchApp();
        login.LoginUser();
        HomePage.clickFilter();
        HomePage.click_Cancel();
        Assertion.assertTrue(HomePage.isFilterPresent());
        login.closeApp();

    }

    @Test(priority = 76, enabled = true, description = "Verify that 'Series Details' page opens up AND Sharing popup should appear")
    public void seriesDetailPageOpensUp_AND_sharingPopUpAppear() throws Exception {
        Login login = new Login();
        HomePage HomePage = new HomePage();
        SeriesDetail series = new SeriesDetail();
        Thread.sleep(2000);
        login.launchApp();
        login.LoginUser();
        HomePage.clickIntroEpisode();
        Assertion.assertEquals(series.getIntroEpisodeText(), INTRO_EPISODE_TXT);
        series.clickShareIcon();
        Assertion.assertTrue(series.isShareTextPresent());
        login.closeApp();

    }

    //Rating are not updated so assertions are not added for now
    @Test(priority = 77, enabled = true, description = "Verify that 'Add Rating' popup appears after tapping on 'Star' icon")
    public void addRatingPopUpAppear_AND_RatingGetsUpdated() throws Exception {
        Login login = new Login();
        HomePage HomePage = new HomePage();
        SeriesDetail series = new SeriesDetail();
        Thread.sleep(2000);
        login.launchApp();
        login.LoginUser();
        HomePage.clickIntroEpisode();
        series.clickRatingIcon();
        Assertion.assertTrue(series.isRatingCloseIconPresent());
        series.clickSubmit();
        login.closeApp();
    }

    // TODO --- Assertion pending need to troubleshoot how to validate favourite Icon
    @Test(priority = 78, enabled = true, description = "Verify that 'Favorite icon gets filled with red color")
    public void verifyFavouriteIcon() throws Exception {
        Login login = new Login();
        SeriesDetail series = new SeriesDetail();
        Thread.sleep(2000);
        login.launchApp();
        login.LoginUser();
        series.clickIntroEpisodes();
        series.clickFavouriteIcon();
        login.closeApp();
    }
    // Not able find locators for READ MORE and READ LESS So we can not Automate
    @Test(priority = 79, enabled = false, description = "Verify description should expand and Collpase")
    public void verifyDescriptionExpandRead_AND_CollpaseRead() throws Exception {
        Login login = new Login();
        SeriesDetail series = new SeriesDetail();
        login.launchApp();
        login.LoginUser();
        series.clickAtlantis();
        login.closeApp();
    }

    @Test(priority = 80, enabled = true, description = "Verify that list of episode appears'Sort by date' AND Sort By Number option")
    public void verifyPopUp_SortByNumber_AND_SortByDate() throws Exception {
        Login login = new Login();
        SeriesDetail series = new SeriesDetail();
        login.launchApp();
        login.LoginUser();
        series.clickIntroEpisodes();
        series.clickSort();
        series.clickSortByDate();
        Assertion.assertEquals(series.getAtlantisText(),ATLANTIS_TXT);
        Thread.sleep(2000);
        series.clickSort();
        series.clickSortByNumber();
        Assertion.assertEquals(series.getShauryaText(),SHAURYA_TXT);
        login.closeApp();
    }

    @Test(priority = 81, enabled = true, description = "Verify that all episodes count appear in the 'Issues' section")
    public void verify_IssueCount() throws Exception {
        Login login = new Login();
        SeriesDetail series = new SeriesDetail();
        login.launchApp();
        login.LoginUser();
        series.clickIntroEpisodes();
        Assertion.assertEquals(series.getIssueCountText(),ISSUE_COUNT);

    }
}
