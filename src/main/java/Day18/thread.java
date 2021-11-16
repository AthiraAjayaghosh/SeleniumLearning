package Day18;

import Day17.Propertiefiles;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class thread {
    public static void main(String[] args) throws IOException, InterruptedException {



//        Launch the application on Firefox browser
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Athira.Ajayaghosh\\Selenium\\Driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(Propertiefiles.getConfigValue(Propertiefiles.getConfigValue("env")));
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);


        String amount = "20000";
//        Enter loan amount
        WebElement loanamount = driver.findElement(By.id("loanamount"));
        loanamount.sendKeys(amount);

//        Enter the rate of interest
        driver.findElement(By.name("rate")).sendKeys("10");
//        Enter the tenure
        driver.findElement(By.id("pmonths")).sendKeys("120");
//        Click on calcualte
        driver.findElement(By.name("Button1")).click();
//        Extract the value

        Thread.sleep(10000);
        WebElement EMI = driver.findElement(By.id("EMI"));
        String output =EMI.getAttribute("value");


//        String output = driver.findElement(By.id("EMI")).getAttribute("value");
        System.out.println(output);

        System.exit(0);

    }
}
