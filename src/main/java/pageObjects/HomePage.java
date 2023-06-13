package pageObjects;

import org.openqa.selenium.By;

import base.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.Assert;

public class HomePage extends BasePage {
    private By rivercomicsLogo = By.id("com.river.comics.us:id/ivToolbarLogo");

    private By subscribeBtn = By.id("com.river.comics.us:id/tvToolbarSubscribe");

    private By selectSeries = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.ImageView");

    private By humburgerIcon = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageButton");

    private By favouriteIcon = By.id("com.river.comics.us:id/m_f_favourite");

    private By searchIcon = By.id("com.river.comics.us:id/m_f_search");

    private By filterIcon = By.id("com.river.comics.us:id/fab");

    private By introEdisodes = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.ImageView");

    private By filter = By.id("com.river.comics.us:id/fab");

    private By mostPopular = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[5]/android.widget.TextView");

    private By all = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView");

    private By previews = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.TextView");

    private By riverComicsOriginals = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.TextView");

    private By latestSeries = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.TextView");

    private By coming_Soon = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.ImageView");

    private By selectCategory = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView[1]");

    private By cancel = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView[2]");

    public String getTextMostPopular() {
        return getText(mostPopular);
    }

    public String getTextAll() {
        return getText(all);
    }

    public String getTextPreviews() {
        return getText(previews);
    }

    public void click_SelectCategory() throws InterruptedException {
        click(selectCategory);
        Thread.sleep(2000);
    }

    public void click_Cancel() throws InterruptedException {
        click(cancel);
        Thread.sleep(2000);
    }

    public void clickPreviews() throws InterruptedException {
        click(previews);
        Thread.sleep(2000);
    }

    public String getTextLatestSeries() {
        return getText(latestSeries);
    }

    public String getTextRiverComicsOriginals() {
        return getText(riverComicsOriginals);
    }

    public boolean isIntro_EpisodePresent() throws InterruptedException {
        Thread.sleep(2000);
        return isElementPresent(introEdisodes);
    }

    public boolean isComing_SoonPresent() throws InterruptedException {
        Thread.sleep(2000);
        return isElementPresent(coming_Soon);
    }

    public boolean isFilterPresent() throws InterruptedException {
        Thread.sleep(2000);
        return isElementPresent(filter);
    }

    public void clickFilter() throws InterruptedException {
        click(filter);
        Thread.sleep(2000);
    }

    public void clickAllSeries() throws InterruptedException {
        click(all);
        Thread.sleep(2000);
    }

    public void clickRiverComicsOriginals() throws InterruptedException {
        click(riverComicsOriginals);
        Thread.sleep(2000);
    }

    public void clickIntroEpisode() throws InterruptedException {
        click(introEdisodes);
        Thread.sleep(2000);
    }


    public void clickFilterIcon() throws InterruptedException {
        click(filterIcon);
    }

    public boolean isFavouriteIconPresent() throws InterruptedException {
        Thread.sleep(2000);
        return isElementPresent(favouriteIcon);
    }

    public boolean isSearchIconPresent() throws InterruptedException {
        Thread.sleep(2000);
        return isElementPresent(searchIcon);
    }

    public boolean isSubscribePresent() throws InterruptedException {
        Thread.sleep(2000);
        return isElementPresent(subscribeBtn);
    }

    public boolean isHamburgerPresent() throws InterruptedException {
        Thread.sleep(4000);
        return isElementPresent(humburgerIcon);

    }

    public boolean isRiverComicsLogoPresent() throws InterruptedException {
        Thread.sleep(4000);
        return isElementPresent(rivercomicsLogo);
    }

    public void clickLogo() {
        //	click(logo);
    }

    public void selectSeries() throws InterruptedException {
        click(selectSeries);
        Thread.sleep(1000);

    }

    public void clickRiverComicsLOGO() throws InterruptedException {
        click(rivercomicsLogo);
        Thread.sleep(1000);
    }

}
