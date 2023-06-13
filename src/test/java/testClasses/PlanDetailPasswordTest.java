package testClasses;

import base.BasePage;
import base.BaseTest;
import org.testng.annotations.Test;
import pageObjects.Login;
import pageObjects.PlanDetailPage;
import utilities.Assertion;

public class PlanDetailPasswordTest extends BaseTest {
    String SUBSCRIBENOW = "Subscribe Now";

    @Test(priority = 64, enabled = true, description = "Verify the subscribe now button on 'PLAN DETAILS' page")
    public void verifyUIPlanPage() throws Exception {
        Login login = new Login();
        PlanDetailPage planDetail = new PlanDetailPage();
        login.launchApp();
        login.LoginUser();
        planDetail.clickSubscribe();
        Assertion.assertEquals(planDetail.getSubscribeNOW(),SUBSCRIBENOW);
        login.closeApp();

    }

    @Test(priority = 65, enabled = true, description = "Verify that plan detail page opens up")
    public void paymentsPage_OpensUp() throws Exception {
        Login login = new Login();
        PlanDetailPage planDetail = new PlanDetailPage();
        login.launchApp();
        login.LoginUser();
        planDetail.clickSubscribe();
        planDetail.clickSubscribeNow();
        //Assertion.assertEquals(planDetail.getSubscribeNOW(),SUBSCRIBENOW);
        login.closeApp();

    }

    //TODO --- Due to emulator issue
    @Test(priority = 66, enabled = false, description = "Verify that change language pop up opens up")
    public void changeLanguage_OpensUp() throws Exception {
        Login login = new Login();
        PlanDetailPage planDetail = new PlanDetailPage();
        login.launchApp();
        login.LoginUser();
        planDetail.clickSubscribe();
        planDetail.clickSubscribeNow();

    }

    //TODO --- Due to emulator issue
    @Test(priority = 67, enabled = false, description = "Verify that 'Order Summary' popup opens up")
    public void orderSummary() throws Exception {
        Login login = new Login();
        PlanDetailPage planDetail = new PlanDetailPage();
        login.launchApp();
        login.LoginUser();
        planDetail.clickSubscribe();
        planDetail.clickSubscribeNow();

    }
    //TODO --- Due to emulator issue
    @Test(priority = 68, enabled = false, description = "Verify that user navigates back to 'PLAN DETAILS' page")
    public void navigateBackTo_PlanPage() throws Exception {
        Login login = new Login();
    }
}
