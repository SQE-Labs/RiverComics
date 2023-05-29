package utilities;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.remote.MobileCapabilityType;

public class CapabilitiesManager {
	//GenericUtility utils = new GenericUtility();

	public DesiredCapabilities getCaps() throws IOException {
	    GlobalParams params = new GlobalParams();
	 //   Properties props = new PropertyManager().getProps();

	    try{
	        //utils.log().info("getting capabilities");
	        System.out.println("getting capabilities");
	        DesiredCapabilities caps = new DesiredCapabilities();
	       

	        switch("Android"){
	            case "Android":
	                
	                caps.setCapability("platformName", "Android");
	                caps.setCapability("deviceName", "Pixel 3a API 30");
	                caps.setCapability("platformVersion", "11.0");
	                caps.setCapability("automationName", "Appium");
	               caps.setCapability("app", "C:\\Users\\Itsqe\\eclipse-workspace\\AppiumRiverComics\\RiverComicsAPK\\base.apk");
	           // caps.setCapability("appPackage","com.river.comics.us");
	         //  caps.setCapability("appActivity","com.ui.user.login.LoginActivity");
	             
	                break;
	            case "iOS":
	                //caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, props.getProperty("iOSAutomationName"));
	                //String iOSAppUrl = getClass().getResource(props.getProperty("iOSAppLocation")).getFile();
	                String iOSAppUrl="/Users/avishsharma/Desktop/latest/Instore_Sales.app";
	                System.out.println("appUrl is" + iOSAppUrl);
	                //caps.setCapability("fullReset", "true");
	                //utils.log().info("appUrl is" + iOSAppUrl);
	               // caps.setCapability("bundleId", props.getProperty("iOSBundleId"));
	                caps.setCapability("includeSafariInWebviews",true);
	                caps.setCapability("webviewConnectTimeout", "90000");
	                //caps.setCapability("app", iOSAppUrl);
	                //caps.setCapability("wdaLocalPort", params.getWdaLocalPort());
	                //caps.setCapability("webkitDebugProxyPort", params.getWebkitDebugProxyPort());
	                //caps.setCapability("app", iOSAppUrl);
	                break;
	        }
	        return caps;
	    } catch(Exception e){
	        e.printStackTrace();
	        //utils.log().fatal("Failed to load capabilities. ABORT!!" + e.toString());
	        throw e;
	    }
	}
}