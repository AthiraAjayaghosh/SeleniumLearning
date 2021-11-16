package Day18;

import Day17.Propertiefiles;
import com.google.common.base.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class fluent {

    public static void main(String[] args) throws IOException {


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

        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(60))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(Exception.class);

        WebElement EMI = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.id("EMI"));
            }
        });


//        WebElement EMI = driver.findElement(By.id("EMI"));
        String output =EMI.getAttribute("value");


//        String output = driver.findElement(By.id("EMI")).getAttribute("value");
        System.out.println(output);

        System.exit(0);

    }
}
