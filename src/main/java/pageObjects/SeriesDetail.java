package pageObjects;

import org.openqa.selenium.By;

import base.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SeriesDetail extends BasePage {


    private By favourite = By.id("com.river.comics.us:id/ivFavorite");

    private By ratingIcon = By.id("com.river.comics.us:id/ivRating");

    private By share = By.id("com.river.comics.us:id/ivShare");

    private By closeRatingPopUp = By.id("com.river.comics.us:id/ivClose");

    private By closeShareMenu = By.xpath("/hierarchy/android.widget.FrameLayout");

    private By sorting = By.id("com.river.comics.us:id/ivSort");

    private By sortByDate = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]");

    private By play = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.Button[1]");

    private By read = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.Button[2]");

    private By introEpisodeText = By.id("com.river.comics.us:id/tvSeriesName");

    private By shareText = By.id("android:id/title");

    private By submit = By.id("com.river.comics.us:id/btnSubmit");

    private By introEpisode = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.ImageView");

    private By atlantis = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.ImageView");

    private By atlantisText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView");

    private By sort = By.id("com.river.comics.us:id/ivSort");

    private By sortByNumber = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");

    private By shauryaText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView");

    private By issueCount = By.id("com.river.comics.us:id/issuesCount");


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
        Thread.sleep(15000);
    }

}

