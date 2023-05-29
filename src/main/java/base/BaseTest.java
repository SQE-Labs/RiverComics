package base;

import io.appium.java_client.AppiumDriver;
import utilities.DriverManager;
import java.util.Properties;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest{


public static AppiumDriver driver;
Properties properties;

@BeforeTest
public void initialize() throws Exception {
   // new ServerManager().startServer();

	 new DriverManager().initializeDriver();

}

@AfterTest
public void quit() {
    DriverManager driverManager=new DriverManager();

//    if(driverManager.getDriver()!=null)
//    {
//        driverManager.getDriver().quit();
//        driverManager.setDriver(null);
//    }
//    ServerManager serverManager=new ServerManager();
//    if(serverManager.getServer()!=null)
//    {
//        serverManager.getServer().stop();
//    }
}
}

     
		