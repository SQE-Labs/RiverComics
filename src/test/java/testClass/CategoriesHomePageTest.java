package testClass;

import org.apache.poi.xdgf.usermodel.XmlVisioDocument;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pageObjects.AltantisPage;
import pageObjects.Hamburger;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.PlanDetailPage;
import pageObjects.SeriesDetail;
import pageObjects.VideoPlay;
import utilities.Assertion;

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
		LoginPage login = new LoginPage();
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
		LoginPage login = new LoginPage();
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
		LoginPage login = new LoginPage();
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
		LoginPage login = new LoginPage();
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

	// TODO --- Assertion is pending due to find count of the series
	@Test(priority = 73, enabled = true, description = "Verify that River comics originals series appear")
	public void riverComicsOriginalSeries_Appear() throws Exception {
		LoginPage login = new LoginPage();
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

	// TODO --- Assertion is pending due to find count of the series
	@Test(priority = 74, enabled = true, description = "Verify that all series appear after applying 'All' filter")
	public void allSeries_Appear() throws Exception {
		LoginPage login = new LoginPage();
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
		LoginPage login = new LoginPage();
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
		LoginPage login = new LoginPage();
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

	// Rating are not updated so assertions are not added for now
	@Test(priority = 77, enabled = true, description = "Verify that 'Add Rating' popup appears after tapping on 'Star' icon")
	public void addRatingPopUpAppear_AND_RatingGetsUpdated() throws Exception {
		LoginPage login = new LoginPage();
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

	// TODO --- Assertion pending need to troubleshoot how to validate favourite
	// Icon
	@Test(priority = 78, enabled = true, description = "Verify that 'Favorite icon gets filled with red color")
	public void verifyFavouriteIcon() throws Exception {
		LoginPage login = new LoginPage();
		SeriesDetail series = new SeriesDetail();
		Thread.sleep(2000);
		login.launchApp();
		login.LoginUser();
		series.clickIntroEpisodes();
		series.clickFavouriteIcon();
		login.closeApp();
	}

	// Not able find locators for READ MORE and READ LESS So we can not Automate
	@Test(priority = 79, enabled = true, description = "Verify description should expand and Collpase")
	public void verifyDescriptionExpandRead_AND_CollpaseRead() throws Exception {
		LoginPage login = new LoginPage();
		SeriesDetail series = new SeriesDetail();
		login.launchApp();
		login.LoginUser();
		series.clickAtlantis();
		login.closeApp();
	}

	@Test(priority = 80, enabled = true, description = "Verify that list of episode appears'Sort by date' AND Sort By Number option")
	public void verifyPopUp_SortByNumber_AND_SortByDate() throws Exception {
		LoginPage login = new LoginPage();
		SeriesDetail series = new SeriesDetail();
		login.launchApp();
		login.LoginUser();
		series.clickIntroEpisodes();
		series.clickSort();
		series.clickSortByDate();
		Assertion.assertEquals(series.getAtlantisText(), ATLANTIS_TXT);
		Thread.sleep(2000);
		series.clickSort();
		series.clickSortByNumber();
		Assertion.assertEquals(series.getShauryaText(), SHAURYA_TXT);
		login.closeApp();
	}

	@Test(priority = 81, enabled = true, description = "Verify that all episodes count appear in the 'Issues' section")
	public void verify_IssueCount() throws Exception {
		LoginPage login = new LoginPage();
		SeriesDetail series = new SeriesDetail();
		login.launchApp();
		login.LoginUser();
		series.clickIntroEpisodes();
		Assertion.assertEquals(series.getIssueCountText(), ISSUE_COUNT);

	}

	@Test(priority = 81, enabled = true, description = "Verify that unsubscribed user is able to play only first episode of series for any category except 'Free This Week' ")
	public void verifyUserIsAbleToPLayFirstEpisode() throws Exception {
		LoginPage login = new LoginPage();
		SeriesDetail series = new SeriesDetail();
		HomePage homepage = new HomePage();
		login.launchApp();
		login.LoginUser();
		homepage.clickAtlantisComic();
		AltantisPage atlantis = new AltantisPage();
		atlantis.click_play_button_Episode1();
		VideoPlay videoPlay = new VideoPlay();
		videoPlay.advertisementIsPlayed();

	}

	@Test(priority = 81, enabled = true, description = "Verify that unsubscribed user is able to read only first episode of series")
	public void verifyUserIsAbleToReadFirstEpisode() throws Exception {
		LoginPage login = new LoginPage();
		SeriesDetail series = new SeriesDetail();
		HomePage homepage = new HomePage();
		login.launchApp();
		login.LoginUser();
		homepage.clickAtlantisComic();
		series.readEpisode1();

	}

	@Test(priority = 81, enabled = true, description = "Verify that 'PLAN DETAILS' page opens up after tapping on 'READ' icon, when user is not subscribed to any plan")
	public void verifyUserIsNotAbleToReadOtherThanFirstEpisode() throws Exception {
		LoginPage login = new LoginPage();
		SeriesDetail series = new SeriesDetail();
		HomePage homepage = new HomePage();
		PlanDetailPage planDetail = new PlanDetailPage();
		login.launchApp();
		login.LoginUser();
		homepage.clickAtlantisComic();
		series.readEpisode2();
		planDetail.planDetailsPageDisplayed();

	}

	// TC-78
	@Test(priority = 81, enabled = true, description = "Verify that 'PLAN DETAILS' page opens up when unsubscribed user taps on 'PLAY' button for any episode except first episode ")
	public void verifyUserIsNotAbleToPlayOtherThanFirstEpisode() throws Exception {
		LoginPage login = new LoginPage();
		SeriesDetail series = new SeriesDetail();
		HomePage homepage = new HomePage();
		PlanDetailPage planDetail = new PlanDetailPage();
		login.launchApp();
		login.LoginUser();
		homepage.clickAtlantisComic();
		series.play2ndEpisode();
		planDetail.planDetailsPageDisplayed();

	}

	// TC-75
	@Test(priority = 81, enabled = true, description = "Verify that unsubscribed user is able to play all episodes of 'FREE THIS MONTH' category, ")
	public void verifyUserIsAbleToPlayAllEpisodes() throws Exception {
		LoginPage login = new LoginPage();
		SeriesDetail series = new SeriesDetail();
		HomePage homepage = new HomePage();
		PlanDetailPage planDetail = new PlanDetailPage();
		VideoPlay videoPlay = new VideoPlay();

		login.launchApp();
		login.LoginUser();
		homepage.clickFreeThisMonthSeries();
		series.play2ndEpisode();
		videoPlay.advertisementIsPlayed();

	}

	// TC-76
	@Test(priority = 81, enabled = true, description = "Verify that intro videos of all available series appears after tapping on 'Intro Episodes' ")
	public void verifyUserIsAbleToPlayAllIntroEpisoed() throws Exception {
		LoginPage login = new LoginPage();
		SeriesDetail series = new SeriesDetail();
		HomePage homepage = new HomePage();
		PlanDetailPage planDetail = new PlanDetailPage();
		VideoPlay videoPlay = new VideoPlay();

		login.launchApp();
		login.LoginUser();
		homepage.clickIntroEpisodes();
		series.clickPlay();
		pressAndroidBackKey();
		Thread.sleep(2000);
		series.play2ndEpisode();
		videoPlay.verify_vdo_is_playing();

	}

	// TC-77 to be completed
	@Test(priority = 81, enabled = true, description = "Verify that list of all upcoming series appears after tapping on 'Coming Soon'")
	public void verifyListOfUpcomingSeriesComingSoon() throws Exception {
		LoginPage login = new LoginPage();
		SeriesDetail series = new SeriesDetail();
		HomePage homepage = new HomePage();
		PlanDetailPage planDetail = new PlanDetailPage();
		VideoPlay videoPlay = new VideoPlay();

		login.launchApp();
		login.LoginUser();

	}

	@Test(priority = 85, enabled = true, description = "Verify that 'Home' page opens up after tapping on 'River Comics' logo, on the header of 'Series Details")
	public void verifyHomePageOpensOnTappingRivercomicsLogo() throws Exception {
		LoginPage login = new LoginPage();
		SeriesDetail series = new SeriesDetail();
		HomePage homepage = new HomePage();
		PlanDetailPage planDetail = new PlanDetailPage();
		VideoPlay videoPlay = new VideoPlay();

		login.launchApp();
		login.LoginUser();
		homepage.clickAtlantisComic();
		series.clickRivercomicsLogo();
		Assert.assertTrue(homepage.isHamburgerPresent());

	}

	// TC-80
	@Test(priority = 86, enabled = true, description = "Verify that 'Home' page opens up after tapping 'Back' icon, on the header of 'Series Details")
	public void verifyHomePageOpensOnTappingBackIcon() throws Exception {
		LoginPage login = new LoginPage();
		SeriesDetail series = new SeriesDetail();
		HomePage homepage = new HomePage();
		PlanDetailPage planDetail = new PlanDetailPage();
		VideoPlay videoPlay = new VideoPlay();

		login.launchApp();
		login.LoginUser();
		homepage.clickAtlantisComic();
		series.clickBackButton();
		Assert.assertTrue(homepage.isHamburgerPresent());

	}

	@Test(priority = 86, enabled = true, description = "Verify that subscribed user is able to play all episodes of any series")
	public void verifySubscribedUserAbleToPlayAll() throws Exception {
		LoginPage login = new LoginPage();
		SeriesDetail series = new SeriesDetail();
		HomePage homepage = new HomePage();
		PlanDetailPage planDetail = new PlanDetailPage();
		VideoPlay videoPlay = new VideoPlay();

		login.launchApp();
		login.subscriberUserLogin();
		homepage.clickAtlantisComic();
		series.play2ndEpisode();
		videoPlay.verify_vdo_is_playing();

	}

	// TC-82
	@Test(priority = 86, enabled = true, description = "Verify that 'Do you wish to resume?' popup appears after tapping on 'PLAY'")
	public void doYouWishToResumePopUpIsDisplayed() throws Exception {
		LoginPage login = new LoginPage();
		SeriesDetail series = new SeriesDetail();
		HomePage homepage = new HomePage();
		PlanDetailPage planDetail = new PlanDetailPage();
		VideoPlay videoPlay = new VideoPlay();

		login.launchApp();
		login.subscriberUserLogin();
		homepage.clickAtlantisComic();
		series.clickPlay();
		Thread.sleep(2000);
		pressAndroidBackKey();
		series.clickPlay();
		series.verifyDoYouWishToResumeIsDisplayed();

	}

	//TC-83 Defect
	@Test(priority = 86, enabled = true, description = "Verify that video starts playing from the beginning after tapping on 'Start Over' button")
	public void vdoStartsPlayingFromBeginning() throws Exception {
		LoginPage login = new LoginPage();
		SeriesDetail series = new SeriesDetail();
		HomePage homepage = new HomePage();
		PlanDetailPage planDetail = new PlanDetailPage();
		VideoPlay videoPlay = new VideoPlay();

		login.launchApp();
		login.subscriberUserLogin();
		homepage.clickAtlantisComic();
		series.clickPlay();
		Thread.sleep(2000);
		pressAndroidBackKey();
		series.clickPlay();
		series.verifyDoYouWishToResumeIsDisplayed();
		

	}
	
	//TC-85
		@Test(priority = 86, enabled = true, description = "Verify that popup gets closed after tapping on 'Cross' icon of  'Do you want to resume?' popup")
		public void popUpIsClosed() throws Exception {
			LoginPage login = new LoginPage();
			SeriesDetail series = new SeriesDetail();
			HomePage homepage = new HomePage();
			PlanDetailPage planDetail = new PlanDetailPage();
			VideoPlay videoPlay = new VideoPlay();

			login.launchApp();
			login.subscriberUserLogin();
			homepage.clickAtlantisComic();
			series.clickPlay();
			Thread.sleep(2000);
			pressAndroidBackKey();
			series.clickPlay();
			series.verifyDoYouWishToResumeIsDisplayed();
			series.closePopUp_resumePopup();
			Assert.assertTrue(homepage.isRiverComicsLogoPresent());
		}
		
		//TC-86
		@Test(priority = 86, enabled = true, description = "Verify that series marked as favourite appears under 'SERIES' sub-tab on 'Favorite page,")
		public void verifySeriesAppearsOnFavouritePage() throws Exception {
			LoginPage login = new LoginPage();
			SeriesDetail series = new SeriesDetail();
			HomePage homepage = new HomePage();
			PlanDetailPage planDetail = new PlanDetailPage();
			VideoPlay videoPlay = new VideoPlay();

			login.launchApp();
			login.subscriberUserLogin();
			homepage.clickIntroEpisodes();
			series.clickFavouriteIcon();
			Thread.sleep(5000);
			pressAndroidBackKey();
			homepage.clickFavouriteIcon();
			series.verifySeriesIsAddedUnderFavourites();
		}
		
		//TC-86
				@Test(priority = 86, enabled = true, description = "Verify that 'Remove from favorites? popup appears after tapping on 'Delete' icon for any series on 'Favourite' page.")
				public void verifyRemoveFromFavoritePopUpIsDisplayed() throws Exception {
					LoginPage login = new LoginPage();
					SeriesDetail series = new SeriesDetail();
					HomePage homepage = new HomePage();
					PlanDetailPage planDetail = new PlanDetailPage();
					VideoPlay videoPlay = new VideoPlay();

					login.launchApp();
					login.subscriberUserLogin();
					homepage.clickFreeThisMonthSeries();
					series.clickFavouriteIcon();
					Thread.sleep(5000);
					pressAndroidBackKey();
					homepage.clickFavouriteIcon();
					series.click_removeFavourite();
					series.removeFromFavPopUpDisplayed();
				}
				
				@Test(priority = 86, enabled = true, description = "Verify that series gets removed from Favorite list after tapping on 'Yes' option from 'Remove from Favorites?")
				public void verifySeriesIsRemovedFromFavorite() throws Exception {
					LoginPage login = new LoginPage();
					SeriesDetail series = new SeriesDetail();
					HomePage homepage = new HomePage();
					PlanDetailPage planDetail = new PlanDetailPage();
					VideoPlay videoPlay = new VideoPlay();

					login.launchApp();
					login.subscriberUserLogin();
					homepage.clickFreeThisMonthSeries();
					series.clickFavouriteIcon();
					Thread.sleep(5000);
					pressAndroidBackKey();
					homepage.clickFavouriteIcon();
					series.click_removeFavourite();
					series.removeFromFavPopUpDisplayed();
					series.selectYesForRemoveFavPopUp();
					Assert.assertTrue(homepage.isRiverComicsLogoPresent());
				}
				
				//TC-89
				@Test(priority = 86, enabled = true, description = "Verify that relevant search results appear after entering existing data in 'Search' field, on 'Search' page.")
				public void verifyRelevantSearchResultAppears() throws Exception {
					LoginPage login = new LoginPage();
					SeriesDetail series = new SeriesDetail();
					HomePage homepage = new HomePage();
					PlanDetailPage planDetail = new PlanDetailPage();
					VideoPlay videoPlay = new VideoPlay();
					Hamburger hamberger= new Hamburger();

					login.launchApp();
					login.subscriberUserLogin();
					homepage.clickSearchIcon();
					
					hamberger.enterDataSearchField("Ashman");
					hamberger.clickSearchField();
					Thread.sleep(3000);
					pressSearchKey_keypad();
					Thread.sleep(3000);
					series.verifyAshmanSeriesIsDisplayedAfterSearch();
				}
				
				@Test(priority = 86, enabled = true, description = "Verify that information message appears after entering non-existing data")
				public void verifyInformationMsgAfterInvalidSearch() throws Exception {
					LoginPage login = new LoginPage();
					SeriesDetail series = new SeriesDetail();
					HomePage homepage = new HomePage();
					PlanDetailPage planDetail = new PlanDetailPage();
					VideoPlay videoPlay = new VideoPlay();
					Hamburger hamberger= new Hamburger();

					login.launchApp();
					login.subscriberUserLogin();
					homepage.clickSearchIcon();
					
					hamberger.enterDataSearchField("Anurag");
					hamberger.clickSearchField();
					Thread.sleep(3000);
					pressSearchKey_keypad();
					Thread.sleep(3000);
					series.verifyNoRecordFoundIsDisplayed();
				}
				
				@Test(priority = 86, enabled = true, description = "Verify that information message appears after entering non-existing data")
				public void abc() throws Exception {
					LoginPage login = new LoginPage();
					SeriesDetail series = new SeriesDetail();
					HomePage homepage = new HomePage();
					PlanDetailPage planDetail = new PlanDetailPage();
					VideoPlay videoPlay = new VideoPlay();
					Hamburger hamberger= new Hamburger();

					login.launchApp();
					login.subscriberUserLogin();
					Thread.sleep(3000);;
					homepage.scrollTo2ndLastSeries();
					Thread.sleep(3000);
					homepage.clickCominSoon();
				}




}
