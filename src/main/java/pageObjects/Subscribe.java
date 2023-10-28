package pageObjects;


import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Subscribe {
	
	@AndroidFindBy(id = "com.river.comics.us:id/tvToolbarTitle")
	private MobileElement planDetailText;
	
	@AndroidFindBy(id = "com.river.comics.us:id/textViewPlanTop")
	private MobileElement subscribePageText;
	
	@AndroidFindBy(id = "hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageButton")
	private MobileElement backArrowPlanDetail;
	
	public void fetchPlanDetailText() {
		
	}
	
    public void fetchSubscribePageText() {
		
	}
    
    public void clickBackArrow() {
		//click(backArrowPlanDetail);
   	}

}
