package Day7;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_Inheritance {
    FirefoxDriver driver;

    //    Launch APP
    void launchApp(String url) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Athira.Ajayaghosh\\Selenium\\Driver\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get(url);
    }

    //    Tear down
    void tearDown() {
        driver.quit();
//         System.exit(0);
    }
}
