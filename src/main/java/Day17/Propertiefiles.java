package Day17;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertiefiles {
    public static Properties prop;
    public static String getConfigValue(String key) throws IOException {
        if(prop==null) {
            prop = new Properties();
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\application.properties");
            prop.load(fis);
            fis.close();
        }
        return prop.getProperty(key);
    }

}
