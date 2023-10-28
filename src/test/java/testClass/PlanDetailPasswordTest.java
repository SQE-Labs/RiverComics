package testClass;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseTest;
import io.appium.java_client.touch.TapOptions;
import pageObjects.LoginPage;
import pageObjects.PlanDetailPage;
import utilities.Assertion;

public class PlanDetailPasswordTest extends BaseTest {
    String SUBSCRIBENOW = "Subscribe Now";
   

    @Test(priority = 64, enabled = true, description = "Verify that various payment method page opens up after tapping on 'Subscribe Now' ")
    public void verifyVariousPaymentMethods() throws Exception {
       LoginPage login=new LoginPage();
    	login.launchApp();
        login.LoginUser();
    	
        PlanDetailPage planDetail = new PlanDetailPage();
        planDetail.clickSubscribe();
        Assertion.assertEquals(planDetail.getSubscribeNOW(),SUBSCRIBENOW);
        
        
        planDetail.clickSubscribeNow();
        Thread.sleep(3000);
    	planDetail.callTouchByCOrdinates();
    	Thread.sleep(3000);
    	Thread.sleep(3000);
    	
    	planDetail.enterContactNumber();
    	planDetail.clickProceed();
    	 planDetail.clickSubscribeNow();
    	 Thread.sleep(5000);
    	 planDetail.verifyAllPaymentMethodsDisplayed();
    
        
        
       

    }

   //548  1954
    @Test(priority = 64, enabled = true, description = "Verify that 'Change language' popup opens up after tapping on 'Language' ")
    public void verifyChangeLanguagePopUpOpens() throws Exception {
       LoginPage login=new LoginPage();
    	login.launchApp();
        login.LoginUser();
    	
        PlanDetailPage planDetail = new PlanDetailPage();
        planDetail.clickSubscribe();
        Assertion.assertEquals(planDetail.getSubscribeNOW(),SUBSCRIBENOW);
        
        
        planDetail.clickSubscribeNow();
        Thread.sleep(3000);
    	planDetail.callTouchByCOrdinates();
    	Thread.sleep(3000);
    	Thread.sleep(3000);
    	
    	planDetail.enterContactNumber();
    	planDetail.clickProceed();
    	 planDetail.clickSubscribeNow();
    	 Thread.sleep(5000);
    	 planDetail.clickLanguage();
    
        
        
       

    }
    
    @Test(priority = 64, enabled = true, description = "Verify that 'Order Summary' popup opens up after tapping  on 'View Details'")
    public void verifyOrderDetailsPopsUp() throws Exception {
       LoginPage login=new LoginPage();
    	login.launchApp();
        login.LoginUser();
    	
        PlanDetailPage planDetail = new PlanDetailPage();
        planDetail.clickSubscribe();
        Assertion.assertEquals(planDetail.getSubscribeNOW(),SUBSCRIBENOW);
        
        
        planDetail.clickSubscribeNow();
        Thread.sleep(3000);
    	planDetail.callTouchByCOrdinates();
    	Thread.sleep(3000);
    	Thread.sleep(3000);
    	
    	planDetail.enterContactNumber();
    	planDetail.clickProceed();
    	 planDetail.clickSubscribeNow();
    	 Thread.sleep(5000);
    	 planDetail.clickOrderDetails();
    
        
        
       

    }
    
    @Test(priority = 64, enabled = true, description = "Verify that user navigates back to 'PLAN DETAILS' page after tapping on 'Cross' icon ")
    public void verifyUserNavigatesToPlanDetailsPage() throws Exception {
       LoginPage login=new LoginPage();
    	login.launchApp();
        login.LoginUser();
    	
        PlanDetailPage planDetail = new PlanDetailPage();
        planDetail.clickSubscribe();
        Assertion.assertEquals(planDetail.getSubscribeNOW(),SUBSCRIBENOW);
        
        
        planDetail.clickSubscribeNow();
        Thread.sleep(5000);
    	
    	
    	
    	planDetail.enterContactNumber();
    	planDetail.clickProceed();
    	 planDetail.clickSubscribeNow();
    	 Thread.sleep(5000);
    	
    	 planDetail.clickOrderDetails();
    	 planDetail.closeOrderDetails();
    	 planDetail.verifyPayNowIsDisplayed();
    
        
        
       

    }
    
    @Test(priority = 64, enabled = true, description = "Verify that 'PLAN DETAILS' page opens up after tapping on 'SUBSCRIBE'")
    public void verifyPlanDetailsPageOPensUp() throws Exception {
       LoginPage login=new LoginPage();
    	login.launchApp();
        login.LoginUser();
    	
        PlanDetailPage planDetail = new PlanDetailPage();
        planDetail.clickSubscribe();
       Thread.sleep(3000);;
        
        
        planDetail.verifySubscribeNowIsDisplayed();
        
    	
    	
    	
    	
        
       

    }
}
