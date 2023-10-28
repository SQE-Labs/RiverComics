package testClass;

import org.testng.annotations.Test;

import base.BaseTest;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.SeriesDetail;
import pageObjects.VideoPlay;

public class UnsubscribedUserTest extends BaseTest {
	
@Test(priority = 7,enabled = true,description = "")
public void UnsubscribedUser() throws Exception {

	HomePage homePg= new HomePage();
	LoginPage login = new LoginPage();
	SeriesDetail seriesDtl = new SeriesDetail();
	VideoPlay videoPly = new VideoPlay();

	login.validate_Login("test0404@yopmail.com", "1234567");
	homePg.selectSeries();
	seriesDtl.clickFavouriteIcon();
	seriesDtl.clickRatingIcon();
	//seriesDtl.closeRating();
	//seriesDtl.clickShareIcon();
	//seriesDtl.clickShareIcon();
	seriesDtl.clickSortingIcon();
	seriesDtl.selectSortByDate();
	seriesDtl.clickPlay();
	videoPly.clickGotIt();
//	videoPly.clickOnVideoScreen();
	videoPly.clickForwardVideo();
	videoPly.clickPauseSeries();
	videoPly.clickRewindVideo();
	videoPly.clickMute();
	videoPly.clickLanguage();
  }
}

