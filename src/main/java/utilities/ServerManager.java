package utilities;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServerHasNotBeenStartedLocallyException;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServerHasNotBeenStartedLocallyException;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

import java.io.File;
import java.util.HashMap;
public class ServerManager {
//private static ThreadLocal server = new ThreadLocal<>();
//// GenericUtility utils = new GenericUtility();
//
//public AppiumDriverLocalService getServer(){
//    return server.get();
//}
//
//public void startServer(){
//   // utils.log().info("starting appium server");
//    System.out.println("starting appium server");
//    AppiumDriverLocalService server = MacGetAppiumService();
//    server.start();
//    
//    if(server == null || !server.isRunning()){
//        //utils.log().fatal("Appium server not started. ABORT!!!");
//        System.out.println("Appium server not started. ABORT!!!");
//        throw new AppiumServerHasNotBeenStartedLocallyException("Appium server not started. ABORT!");
//    }
//    server.clearOutPutStreams(); //it will o/p server logs in console windows
//    this.server.set(server); //we need to assign server obj to our threadlocal object
//    System.out.println("Appium server started");//utils.log().info("Appium server started");
//}
//
//public AppiumDriverLocalService getAppiumServerDefault() {
//
//    return AppiumDriverLocalService.buildDefaultService();
//}
}