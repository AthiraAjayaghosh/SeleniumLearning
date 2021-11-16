package Framework.Commons;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * This class is responsible for providing properties from Property file
 * @author Rajesh.Krishnan1
 */
public class GlobalConfig {

    private static GlobalConfig config = null;
    private Properties prop;
    private FileInputStream fis;

    /**
     * Add a private constructor
     * Avoid outside world to create object
     */
    private GlobalConfig() {
        try {
            prop = new Properties();
            fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\application.properties");
            prop.load(fis);
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /** Return a singleton object
     * @return
     */
    public static GlobalConfig getProperties() {
        if (config == null) {
            config = new GlobalConfig();
        }
        return config;
    }

    /**
     * Get the property value
     * @param key
     * @return
     */
    public String get(String key) {

        return prop.getProperty(key);
    }

    /**
     * Set a property value
     * @param key
     * @param value
     */
    public void set(String key, String value) {
        prop.setProperty(key, value);
    }
}
