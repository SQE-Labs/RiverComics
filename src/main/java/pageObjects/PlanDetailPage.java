package pageObjects;

import base.BasePage;
import org.openqa.selenium.By;

public class PlanDetailPage extends BasePage {

    private By subscribeBtn = By.id("com.river.comics.us:id/tvToolbarSubscribe");

    private By subscribeNow = By.id("com.river.comics.us:id/buttonBuyNow");

    private By hjk = By.id("");
;
    private By edewd = By.id("");

    private By ghddj = By.id("");

    private By ghswns = By.id("");


    public void clickSubscribe() throws InterruptedException {
        click(subscribeBtn);
    }

    public void clickSubscribeNow() throws InterruptedException {
        click(subscribeNow);
        Thread.sleep(2000);
    }

    public String getSubscribeNOW() throws InterruptedException {
        Thread.sleep(4000);
        return getText(subscribeNow);

    }





}
