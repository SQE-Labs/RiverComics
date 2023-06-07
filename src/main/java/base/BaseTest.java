package base;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.appium.java_client.AppiumDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pageObjects.Hamburger;
import pageObjects.Login;
import utilities.DriverManager;
import utilities.Screenshot;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

import static utilities.DriverManager.getDriver;

public class BaseTest{
    public static ExtentReports extent;
    public static ExtentTest extentTest;

public static AppiumDriver driver;
Properties properties;

@BeforeSuite
public void initialize() throws Exception {
   // new ServerManager().startServer();
    extent = new ExtentReports(System.getProperty("user.dir") + "/test-report/ExtentReportResult.html", true);
    extent.addSystemInfo("Environment", "QA");
    extent.loadConfig(new File(System.getProperty("user.dir") + "/extent-config.xml"));

    new DriverManager().initializeDriver();

}
    // @BeforeTest
    public <LoginTest> void login() throws Exception {
        Login login = new Login();
        new DriverManager().initializeDriver();
        login.enterUserName("test0404@yopmail.com");
        login.enterPassword("1234567");
        login.clickLogin();
        login.acceptAlert();

   // @AfterTest
//    public void CloseApp() throws Exception {
//        Login login = new Login();
//        login.closeApp();


   }

    @BeforeMethod
    public void beforeMethod(Method method) {
        Test test = method.getAnnotation(Test.class);
        extentTest = extent.startTest(method.getName());
        extentTest.setDescription(test.description());
    }

    @AfterMethod
    public void tearDown(ITestResult result) throws IOException {

        if (result.getStatus() == ITestResult.FAILURE) {
            String screenshotPath = Screenshot.getScreenshot(getDriver(), result.getName());
            extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(screenshotPath));

        } else if (result.getStatus() == ITestResult.SUCCESS) {
            String screenshotPath = Screenshot.getScreenshot(getDriver(), result.getName());
            extentTest.log(LogStatus.PASS, extentTest.addScreenCapture(screenshotPath));

        }
        extent.endTest(extentTest);
        extent.flush();
        //getDriver().navigate().refresh();
    }
@AfterSuite
public void quit() {
    DriverManager driverManager=new DriverManager();
     }
}

     
		