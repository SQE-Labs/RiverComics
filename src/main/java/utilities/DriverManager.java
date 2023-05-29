package utilities;

import java.io.IOException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public  class DriverManager {
	private static ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();

	GlobalParams params = new GlobalParams();

	PropertyManager props = new PropertyManager();

	public DriverManager() {
	}


	public static AppiumDriver getDriver() {
		return driver.get();
	}

	public static void setDriver(AppiumDriver driverref) {
		driver.set(driverref);
	}

	public static void unload() {
		driver.remove();
	}

//GenericUtility utils = new GenericUtility();

	public void initializeDriver() throws Exception {
		AppiumDriver driver = null;
		GlobalParams params = new GlobalParams();

		PropertyManager props = new PropertyManager();
URL url =new URL("http://127.0.0.1:4723/wd/hub");
		if (driver == null) {
			try {
				// utils.log().info("initializing Appium driver");
//				switch (params.getPlatformName()) {
//				case "Android":
//					driver = new AndroidDriver(url, new CapabilitiesManager().getCaps());
//					break;
//				case "iOS":
//					driver = new IOSDriver(url,new CapabilitiesManager().getCaps());
//					break;
//				}
//				if (driver == null) {
//					throw new Exception("driver is null. ABORT!!!");
//				}
				// utils.log().info("Driver is initialized");
				driver = new AndroidDriver(url, new CapabilitiesManager().getCaps());
//				break;
				this.driver.set(driver);
			} catch (IOException e) {
				e.printStackTrace();
				// utils.log().fatal("Driver initialization failure. ABORT !!!!" +
				// e.toString());
				throw e;
			}
		}
	}
}