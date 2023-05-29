package pageObjects;

import org.openqa.selenium.By;

import base.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SeriesDetail extends BasePage{
	
	
	private By favourite =By.id("com.river.comics.us:id/ivFavorite");
	
	private By rating =By.id("com.river.comics.us:id/ivRating");
	
	private By share = By.id("com.river.comics.us:id/ivShare");
	
	private By closeRatingPopUp = By.id("com.river.comics.us:id/ivClose");
	
	private By closeShareMenu = By.xpath("/hierarchy/android.widget.FrameLayout");
	
	private By sorting = By.id("com.river.comics.us:id/ivSort");
	
	private By sortByDate = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]");
	
	private By play =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.Button[1]");
	
	private By read =By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.Button[2]");
	
	@AndroidFindBy(id = "com.river.comics.us:id/tvSeriesName")
	private MobileElement seriesNameTxt;
	
	@AndroidFindBy(id = "android:id/chooser_row_text_option")
	private MobileElement noShareText;
	
	
	public void clickShareIcon() throws InterruptedException {
		click(share);
		Thread.sleep(3000);
	}
	public void closeRating() {
		//click(closeRatingPopUp);
	}
	
	public void clickFavouriteIcon() throws InterruptedException {
		click(favourite);
		Thread.sleep(2000);
	}
	public void clickRatingIcon() throws InterruptedException {
		click(rating);
	}
	
	public void closeShareMenu() throws InterruptedException {
		click(closeShareMenu);
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public void clickPlay() throws InterruptedException {
		click(play);
		Thread.sleep(15000);
	}
	
//    public void clickRead() {
//    	click(sortByNumber);
//    }
}

