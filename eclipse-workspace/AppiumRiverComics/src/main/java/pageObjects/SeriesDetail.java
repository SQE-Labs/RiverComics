package pageObjects;

import org.openqa.selenium.By;

import base.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SeriesDetail extends BasePage{
	
	
	
	@AndroidFindBy(id = "com.river.comics.us:id/ivFavorite")
	private MobileElement favourite;
	
	@AndroidFindBy(id = "com.river.comics.us:id/rbSeriesRating")
	private MobileElement rating;
	
	@AndroidFindBy(id = "com.river.comics.us:id/ivShare")
	private MobileElement share;
	
	@AndroidFindBy(id = "com.river.comics.us:id/ivSort")

	private MobileElement sorting;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.Button[1]")
	private MobileElement play;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.Button[2]")
	private MobileElement read;
	
	@AndroidFindBy(id = "com.river.comics.us:id/tvSeriesName")
	private MobileElement seriesNameTxt;
	
	
	public void seriesNameGetText() {
		
	}
	
	public void clickFavouriteIcon() {
		click(favourite);
	}
	public void clickRatingIcon() {
		click(rating);
	}
	
	public void clickShareIcon() {
		click(share);
	}
	
	public void clickSortingIcon() {
		click(sorting);
	}
	
	public void clickPlayBtn() {
		click(play);
	}

	public void clickReadBtn() {
		click(read);
	}

}
