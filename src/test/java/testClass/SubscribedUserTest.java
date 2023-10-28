package testClass;



import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.SeriesDetail;
import pageObjects.VideoPlay;

public class SubscribedUserTest {

    @Test(priority = 8, enabled = true, description = "")
    public void subscribedUser() throws Exception {

        HomePage homepage = new HomePage();
        SeriesDetail seriesDtl = new SeriesDetail();
        VideoPlay videoPly = new VideoPlay();
        LoginPage login = new LoginPage();

        login.validate_Login("clover@yopmail.com", "123456");

        homepage.selectSeries();
        seriesDtl.clickFavouriteIcon();
        seriesDtl.clickRatingIcon();
      //  seriesDtl.closeRating();
        //seriesDtl.clickShareIcon();
        //seriesDtl.clickShareIcon();
        seriesDtl.clickSortingIcon();
        seriesDtl.selectSortByDate();
        seriesDtl.clickPlay();
        videoPly.clickGotIt();
      //  videoPly.clickOnVideoScreen();
        videoPly.clickForwardVideo();
        videoPly.clickPauseSeries();
        videoPly.clickRewindVideo();
        videoPly.clickMute();
        videoPly.clickLanguage();
    }
}