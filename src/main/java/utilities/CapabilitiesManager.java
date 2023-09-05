package utilities;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class CapabilitiesManager<UiAutomator2Options> {
	//GenericUtility utils = new GenericUtility();

	public UiAutomator2Options getCaps() throws IOException {
	    GlobalParams params = new GlobalParams();
	    UiAutomator2Options options= new UiAutomator2Options();
		options.setDeviceName("Anurag");
		options.setApp("C:\\Users\\SQE Labs\\Desktop\\Girgit\\src\\test\\java\\Resources\\ApiDemos-debug.apk");
		options.setChromedriverExecutable("C:\\Users\\SQE Labs\\Downloads\\chromedriver_win32\\chromedriver.exe");
		return options;
	 //   Properties props = new PropertyManager().getProps();

//	    try{
//	        //utils.log().info("getting capabilities");
//	        System.out.println("getting capabilities");
//	        DesiredCapabilities caps = new DesiredCapabilities();
//	       
//
//	        
//	        caps.setCapability("automationName", "UiAutomator2");
//	                caps.setCapability("platformName", "Android");
//	                caps.setCapability("deviceName", "Anurag");
//	                caps.setCapability("platformVersion", "11.0");
//	               caps.setCapability("app", "D:\\RiverComicsMobile\\base.apk");
//	           // caps.setCapability("appPackage","com.river.comics.us");
//	         //  caps.setCapability("appActivity","com.ui.user.login.LoginActivity");
//	               
//	             
//	              
//	        
//	        return caps;
//	    } catch(Exception e){
//	        e.printStackTrace();
//	        //utils.log().fatal("Failed to load capabilities. ABORT!!" + e.toString());
//	        throw e;
//	    }
	}
}