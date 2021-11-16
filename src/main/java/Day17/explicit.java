package Day17;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class explicit {
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

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        WebElement EMI = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("EMI")));

//        WebElement EMI = driver.findElement(By.id("EMI"));
        String output =EMI.getAttribute("value");


//        String output = driver.findElement(By.id("EMI")).getAttribute("value");
        System.out.println(output);

        System.exit(0);

    }

}
