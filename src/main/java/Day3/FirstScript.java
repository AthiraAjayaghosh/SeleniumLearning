package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstScript {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","C:\\Users\\Athira.Ajayaghosh\\Selenium\\Driver\\geckodriver.exe");
        FirefoxDriver  driver = new FirefoxDriver();
        driver.get("https://www.unionbankofindia.co.in/english/emicalculator.aspx");

//        Enter values

        driver.findElement(By.id("loanamount")).sendKeys("500000");
        driver.findElement(By.name("rate")).sendKeys("12");
        driver.findElement(By.id("pmonths")).sendKeys("100");
        driver.findElement(By.name("Button1")).click();

//        Extract values
        String Output = driver.findElement(By.id("EMI")).getAttribute("value");
        System.out.println(Output);

        System.exit( 0);
    }

}
