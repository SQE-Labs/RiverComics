package pageObjects;

import base.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

public class Hamburger extends BasePage {

	private By humburgerIcon = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageButton");

	private By usernameText = By.id("com.river.comics.us:id/tv_email");

	private By premium = By.id("com.river.comics.us:id/tv_premium");

	private By subscribe = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.TextView");

	private By search = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[3]");

	private By favourite = By.id("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]");

	private By subscribeNow = By.id("com.river.comics.us:id/buttonBuyNow");

	private By searchField = By.id("com.river.comics.us:id/etToolbarSearch");

	private By validateSeries = By.xpath("//android.widget.LinearLayout[@content-desc=\"Series\"]/android.widget.TextView");

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView")
	private MobileElement homeTab;

	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[5]")
	private MobileElement shareTab;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[7]/android.widget.TextView")
	private MobileElement changeLanguage;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[5]")
	private MobileElement contactUs;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[6]")
	private MobileElement logOut;

	public void clickHumburgerIcon() throws InterruptedException {
		click(humburgerIcon);
		Thread.sleep(4000);
	}

	public void clickFavourite() throws InterruptedException {
		click(favourite);
		Thread.sleep(4000);
	}

	public void clickSearch() throws InterruptedException {
		click(search);
		Thread.sleep(4000);
	}

	public void clickSubscribe() throws InterruptedException {
		click(subscribe);
		Thread.sleep(4000);
	}

	public void validatePlanPage() throws InterruptedException {
		Thread.sleep(4000);
		isElementPresent(subscribeNow);
	}

	public void validateSearchPage() throws InterruptedException {
		Thread.sleep(4000);
		isElementPresent(searchField);
	}

	public void validateSearchField() throws InterruptedException {
		Thread.sleep(2000);
		isElementPresent(validateSeries);
	}

	public String getUserNameTXT() {
		return getText(usernameText);
	}

	public String getPrenium() {
		return getText(premium);
	}

	public String getSubscribeTab() {
		return getText(subscribe);
	}

	public String getSearchTab() {
		return getText(search);
	}

	public String getFavouriteTab() {
		return getText(favourite);
	}


//	public void clickUsername() {
//		click(username);
//	}
//	
//	public void clickHomeIcon() {
//		click(homeTab);
//	}
//	
//	public void clickSubscribeIcon() {
//		click(subscribeTab);
//	}
//	
//	public void clickSearchIcon() {
//		click(searchTab);
//	}
//	
//	public void clickFavouriteIcon() {
//		click(favouriteTab);
//	}
//	
//	public void clickShareIcon() {
//		click(shareTab);
//	}
//	
//	public void clickChangeLanguage() {
//		click(changeLanguage);
//	}
//	
//	public void clickContactUs() {
//		click(contactUs);
//	}
//	
//	public void clickLogoutIcon() {
//		click(logOut);
//	}
}
