package Day18;

import Day17.Propertiefiles;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class screenshot {
    public static void main(String[] args) throws IOException {

        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat SimpleFormat = new SimpleDateFormat("dd-MMM-yyyy hh-mm-ss");
        String cleanedDate = SimpleFormat.format(date);
        System.out.println(cleanedDate);


//    Launch the application on Firefox browser
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Athira.Ajayaghosh\\Selenium\\Driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(Propertiefiles.getConfigValue(Propertiefiles.getConfigValue("env")));
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);



        String amount = "20000";
        //        Enter loan amount
        WebElement loanamount = driver.findElement(By.id("loanamount"));
        loanamount.sendKeys(amount);
        TakesScreenshot screen = (TakesScreenshot) driver;
        File img = screen.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(img,new File(System.getProperty("user.dir")+"\\Screenshots\\screenshot_" + cleanedDate + ".png"));
//        Enter the rate of interest
        driver.findElement(By.name("rate")).sendKeys("10");
//        Enter the tenure
        driver.findElement(By.id("pmonths")).sendKeys("120");
//        Click on calcualte
        driver.findElement(By.name("Button1")).click();
//        Extract the value

        WebElement EMI = driver.findElement(By.id("EMI"));
        String output = EMI.getAttribute("value");
        date = new Date();
        cleanedDate = SimpleFormat.format(date);

        img = screen.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(img,new File(System.getProperty("user.dir")+"\\Screenshots\\screenshot_" + cleanedDate + ".png"));

//        String output = driver.findElement(By.id("EMI")).getAttribute("value");
        System.out.println(output);

        System.exit(0);
    }
}
