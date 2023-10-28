package pageObjects;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.BasePage;

public class SeriesDetail extends BasePage {
	
	private By noRecordFoundAfterInvalidSearch= By.id("com.river.comics.us:id/tvNoRecordFound");

	private By startOver = By.id("com.river.comics.us:id/btnStartOver");
	
	private By ashmanDisplayedAfterSearch= By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.GridView/android.widget.RelativeLayout[1]/android.widget.ImageView");

	private By resume = By.id("com.river.comics.us:id/btnResume");

	private By favEpisodesPresent = By.id("com.river.comics.us:id/ivSeries");

	private By removeFromFavourite = By.id("com.river.comics.us:id/ivDelete");

	private By removeFavPopUp = By.id("com.river.comics.us:id/parentPanel");

	private By yes_RemoveFavPopUp = By.id("android:id/button1");

	private By popupDoUWishToResume = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout");

	private By popupClose = By.id("com.river.comics.us:id/ivCancel");
	private By back = By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");

	private By favourite = By.id("com.river.comics.us:id/ivFavorite");

	private By riverComicsLogo = By.id("com.river.comics.us:id/ivToolbarLogo");

	private By advertisementFrame = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View");

	private By ratingIcon = By.id("com.river.comics.us:id/ivRating");

	private By share = By.id("com.river.comics.us:id/ivShare");

	private By closeRatingPopUp = By.id("com.river.comics.us:id/ivClose");

	private By closeShareMenu = By.xpath("/hierarchy/android.widget.FrameLayout");

	private By sorting = By.id("com.river.comics.us:id/ivSort");

	private By sortByDate = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]");

	private By play = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.Button[1]");

	private By read = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.Button[2]");

	private By introEpisodeText = By.id("com.river.comics.us:id/tvSeriesName");

	private By shareText = By.id("android:id/title");

	private By submit = By.id("com.river.comics.us:id/btnSubmit");

	private By introEpisode = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.ImageView");

	private By atlantis = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.ImageView");

	private By atlantisText = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView");

	private By sort = By.id("com.river.comics.us:id/ivSort");

	private By sortByNumber = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");

	private By shauryaText = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView");

	private By issueCount = By.id("com.river.comics.us:id/issuesCount");

	private By readFirstEpisode = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.Button[2]");

	private By backButton = By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]");

	private By playSecondEpisode = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.Button[1]");

	private By read2ndEpisode = By.xpath(
			"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.Button[2]");

	public String getIssueCountText() {
		return getText(issueCount);
	}

	public String getShauryaText() {
		return getText(shauryaText);
	}

	public String getAtlantisText() {
		return getText(atlantisText);
	}

	public String getIntroEpisodeText() {
		return getText(introEpisodeText);
	}

	public void clickSubmit() throws InterruptedException {
		click(submit);
		Thread.sleep(4000);
	}

	public void clickSort() throws InterruptedException {
		click(sort);
		Thread.sleep(4000);
	}

	public void clickSortByDate() throws InterruptedException {
		click(sortByDate);
		Thread.sleep(4000);
	}

	public void clickSortByNumber() throws InterruptedException {
		click(sortByNumber);
		Thread.sleep(4000);
	}

	public boolean isRatingCloseIconPresent() throws InterruptedException {
		Thread.sleep(2000);
		return isElementPresent(closeRatingPopUp);
	}

	public void clickShareIcon() throws InterruptedException {
		click(share);
		Thread.sleep(2000);
	}

	public void clickIntroEpisodes() throws InterruptedException {
		click(introEpisode);
		Thread.sleep(4000);
	}

	public void clickAtlantis() throws InterruptedException {
		click(atlantis);
		Thread.sleep(4000);
	}

	public void clickFavouriteIcon() throws InterruptedException {
		click(favourite);
		Thread.sleep(2000);
	}

	public void clickRatingIcon() throws InterruptedException {
		click(ratingIcon);
		Thread.sleep(3000);
	}

	public void closeShareMenu() throws InterruptedException {
		click(closeShareMenu);
	}

	public boolean isShareTextPresent() throws InterruptedException {
		Thread.sleep(4000);
		return isElementPresent(shareText);
	}

	public void clickSortingIcon() throws InterruptedException {
		click(sorting);
		Thread.sleep(4000);
	}

	public void selectSortByDate() throws InterruptedException {
		click(sortByDate);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickPlay() throws InterruptedException {
		click(play);
		Thread.sleep(5000);
	}

	public void readEpisode1() throws InterruptedException {
		click(readFirstEpisode);
		Thread.sleep(5000);
		Assert.assertTrue(isDisplayed(backButton));
	}

	public void readEpisode2() throws InterruptedException {
		click(read2ndEpisode);
		Thread.sleep(5000);

	}

	public void play2ndEpisode() throws InterruptedException {
		click(playSecondEpisode);

	}

	public void clickRivercomicsLogo() throws InterruptedException {
		click(riverComicsLogo);

	}

	public void clickBackButton() throws InterruptedException {
		click(back);

	}

	public void verifyDoYouWishToResumeIsDisplayed() throws InterruptedException {
		Thread.sleep(3000);
		Assert.assertTrue(isDisplayed(popupDoUWishToResume));

	}

	public void clickStartOverPnPopUp() throws InterruptedException {
		click(startOver);

	}

	public void resumeOnPopUp() throws InterruptedException {

		click(resume);
	}

	public void closePopUp_resumePopup() throws InterruptedException {

		click(popupClose);
	}

	public void verifySeriesIsAddedUnderFavourites() throws InterruptedException {
		Thread.sleep(2000);
		int size = isElementPresentList(favEpisodesPresent);
		Assert.assertEquals(size, 1);
	}

	public void click_removeFavourite() throws InterruptedException {
		Thread.sleep(2000);
		click(removeFromFavourite);
	}

	public void removeFromFavPopUpDisplayed() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(isDisplayed(removeFavPopUp));

	}

	public void selectYesForRemoveFavPopUp() throws InterruptedException {

		click(yes_RemoveFavPopUp);
	}
	public void verifyAshmanSeriesIsDisplayedAfterSearch()
	{
		
		Assert.assertTrue(isDisplayed(ashmanDisplayedAfterSearch));
	}
	
	public void verifyNoRecordFoundIsDisplayed()
	{
		String msg= getText(noRecordFoundAfterInvalidSearch);
		Assert.assertEquals(msg,"No record found.");
		
		
	}

}
