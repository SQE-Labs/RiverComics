package pageObjects;

import org.openqa.selenium.By;

import base.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage extends BasePage {
    private By rivercomicsLogo = By.id("com.river.comics.us:id/ivToolbarLogo");

    //@AndroidFindBy(id = "com.river.comics.us:id/tvToolbarSubscribe")
    private MobileElement subscribeBtn;

    @AndroidFindBy(id = "com.river.comics.us:id/ivToolbarLogo")
    private MobileElement logo;

    private By selectSeries = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.ImageView");

    //@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.ImageView")
    private MobileElement sselectSeries;

    public void clickSubscribeBtn() {
        //	click(subscribeBtn);
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
    }

}
