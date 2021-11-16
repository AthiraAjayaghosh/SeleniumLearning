package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TagName {
    public static void main(String[] args) {

//        Launch the application on Firefox browser
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Athira.Ajayaghosh\\Selenium\\Driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.bing.com/");

        driver.findElement(By.tagName("input")).sendKeys("India");
        driver.findElement(By.id("sb_form_go")).submit();

    }

}
