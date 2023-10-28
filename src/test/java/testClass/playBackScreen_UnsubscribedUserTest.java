package testClass;

import org.testng.annotations.Test;

import base.BaseTest;
import pageObjects.AltantisPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.VideoPlay;

public class playBackScreen_UnsubscribedUserTest extends BaseTest {

	// LoginPage login = new LoginPage();

//	@BeforeMethod
//	public void openTheApp() throws Exception {
//
//		login.launchApp();
//		login.LoginUser();
//
//	}

	@Test(priority = 64, enabled = true, description = "Verify that advertisement appears for 10 seconds after tapping on 'PLAY' button")
	public void verifyUIPlanPage() throws Exception {

		HomePage homepage = new HomePage();
		AltantisPage altantisPage = new AltantisPage();
		LoginPage login = new LoginPage();
		VideoPlay videoPlay = new VideoPlay();
		login.launchApp();
		login.LoginUser();
		// Thread.sleep(5000);
		homepage.selectSeries();
		// homepage.clickAtlantisComic();
		altantisPage.click_play_button_Episode1();
		// videoPlay.tap();
		videoPlay.skipAdvertisement();

	}

	@Test(priority = 65, enabled = true, description = "Verify that advertisement gets paused after tapping on the screen")
	public void verify_pause_button_advertisement() throws Exception {
		HomePage homepage = new HomePage();
		AltantisPage altantisPage = new AltantisPage();
		LoginPage login = new LoginPage();
		VideoPlay videoPlay = new VideoPlay();
		login.launchApp();
		login.LoginUser();
		// Thread.sleep(5000);
		homepage.selectSeries();
		// homepage.clickAtlantisComic();
		altantisPage.click_play_button_Episode1();
		Thread.sleep(9000);
		// videoPlay.tap();
		videoPlay.clk_advertisementPause();

	}

	@Test(priority = 66, enabled = true, description = "Verify that advertisment gets resumed after tapping on the screen")
	public void verify_play_button_advertisement() throws Exception {
		HomePage homepage = new HomePage();
		AltantisPage altantisPage = new AltantisPage();
		LoginPage login = new LoginPage();
		VideoPlay videoPlay = new VideoPlay();
		login.launchApp();
		login.LoginUser();
		// Thread.sleep(5000);
		homepage.selectSeries();
		// homepage.clickAtlantisComic();
		altantisPage.click_play_button_Episode1();
		Thread.sleep(5000);
		// videoPlay.tap();
		videoPlay.clk_advertisementPlay();

	}

	@Test(priority = 67, enabled = true, description = "Verify that advertisement screen expands on zoom in/out")
	public void verify_zoomIn_zoomOut_button_advertisement() throws Exception {
		HomePage homepage = new HomePage();
		AltantisPage altantisPage = new AltantisPage();
		LoginPage login = new LoginPage();
		VideoPlay videoPlay = new VideoPlay();
		login.launchApp();
		login.LoginUser();
		// Thread.sleep(5000);
		homepage.selectSeries();
		// homepage.clickAtlantisComic();
		altantisPage.click_play_button_Episode1();
		Thread.sleep(8000);
		// videoPlay.tap();
		videoPlay.clk_advertisementPause();
		videoPlay.zoomIn();
		videoPlay.zoomOut();

	}

	@Test(priority = 67, enabled = true, description = "Verify that no advertisement appears, when subscribed users login")
	public void verify_no_advertisement_for_subscribed_user() throws Exception {
		HomePage homepage = new HomePage();
		AltantisPage altantisPage = new AltantisPage();
		LoginPage login = new LoginPage();
		VideoPlay videoPlay = new VideoPlay();
		login.launchApp();
		login.subscriberUserLogin();
		// Thread.sleep(5000);
		homepage.selectSeries();
		// homepage.clickAtlantisComic();
		altantisPage.click_play_button_Episode1();
		videoPlay.advertisement_not_Displayed();

	}
	
	@Test(priority = 67, enabled = true, description = "Verify that video starts playing after tapping on 'Play' button")
	public void verify_vdo_starts_playing_for_subscribed() throws Exception {
		HomePage homepage = new HomePage();
		AltantisPage altantisPage = new AltantisPage();
		LoginPage login = new LoginPage();
		VideoPlay videoPlay = new VideoPlay();
		login.launchApp();
		login.subscriberUserLogin();
		// Thread.sleep(5000);
		homepage.selectSeries();
		// homepage.clickAtlantisComic();
		altantisPage.click_play_button_Episode1();
		Thread.sleep(5000);
		videoPlay.verify_vdo_is_playing();
		

	}
	
	@Test(priority = 68, enabled = true, description = "Verify that video gets stopped after tapping on 'Pause' icon ")
	public void verify_vdo_paused() throws Exception {
		HomePage homepage = new HomePage();
		AltantisPage altantisPage = new AltantisPage();
		LoginPage login = new LoginPage();
		VideoPlay videoPlay = new VideoPlay();
		login.launchApp();
		login.subscriberUserLogin();
		// Thread.sleep(5000);
		homepage.selectSeries();
		// homepage.clickAtlantisComic();
		altantisPage.click_play_button_Episode1();
		Thread.sleep(10000);
		videoPlay.verify_vdo_is_paused();
		

	}
	
	@Test(priority = 68, enabled = true, description = "Verify that 'Select Language' popup opens up after tapping the 'Language'  ")
	public void verify_language_pops_up() throws Exception {
		HomePage homepage = new HomePage();
		AltantisPage altantisPage = new AltantisPage();
		LoginPage login = new LoginPage();
		VideoPlay videoPlay = new VideoPlay();
		login.launchApp();
		login.subscriberUserLogin();
		// Thread.sleep(5000);
		homepage.selectSeries();
		// homepage.clickAtlantisComic();
		altantisPage.click_play_button_Episode1();
		Thread.sleep(5000);
		videoPlay.clickLanguage1();
		
		

	}

}
