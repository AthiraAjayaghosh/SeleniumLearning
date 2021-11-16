package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {
    public static void main(String[] args){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Athira.Ajayaghosh\\Selenium\\Driver\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.bing.com/");

        driver.findElement(By.className("sb_form_q")).sendKeys("selenium");
        driver.findElement(By.id("sb_form_go")).submit();
    }
}
