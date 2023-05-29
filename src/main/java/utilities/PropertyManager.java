package utilities;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyManager {
private static Properties props = new Properties();
//GenericUtility utils = new GenericUtility();

public Properties getProps() throws IOException {
    InputStream is = null;
    String propsFileName = "config.properties";

    if(props.isEmpty()){
        try{
         //   utils.log().info("I am loading the config properties");
            System.out.println("loading config properties");
            is = getClass().getClassLoader().getResourceAsStream(propsFileName);
            props.load(is);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Failed to load config properties. ABORT!!" + e.toString());
       //     utils.log().fatal("Failed to load config properties. ABORT!!" + e.toString());
            throw e;
        } finally {
            if(is != null){
                is.close();
            }
        }
    }
    return props;
}
}