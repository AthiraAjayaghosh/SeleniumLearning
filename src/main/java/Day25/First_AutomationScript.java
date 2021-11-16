package Day25;

import Framework.Constants.ApplicationConstants;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentLoggerReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


public class First_AutomationScript {
    public static void main(String[] args) throws IOException {
        ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "\\Reports\\Report.html");
        ExtentLoggerReporter extentLoggerReporter = new ExtentLoggerReporter(System.getProperty("user.dir") + "\\Reports");
        ExtentReports extentReports = new ExtentReports();
        extentReports.attachReporter(extentSparkReporter,extentLoggerReporter);

        ExtentTest test = extentReports.createTest("Testing the EMI Calculation");
        test.assignAuthor("Athira");
        test.assignDevice("Desktop_Firefox");
        test.assignCategory("Smoke");



        test.info("Execution started");
//        Launch the application on Firefox browser
        System.setProperty("webdriver.gecko.driver", ApplicationConstants.GECKO_DRIVER_PATH);
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.unionbankofindia.co.in/english/emicalculator.aspx");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        test.pass("Successfully launched the application");

        String amount = "20000";
//        Enter loan amount

        driver.findElement(By.id("loanamount")).sendKeys(amount);
//        Enter the rate of interest
        driver.findElement(By.name("rate")).sendKeys("10");
//        Enter the tenure
        driver.findElement(By.id("pmonths")).sendKeys("120");
//        Click on calcualte
        driver.findElement(By.name("Button1")).click();
//        Extract the value
        String output = driver.findElement(By.id("EMI")).getAttribute("value");
        System.out.println(output);
        test.pass("Successfully validated the EMI");


        TakesScreenshot screen = (TakesScreenshot) driver;
        File img = screen.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(img,new File(System.getProperty("user.dir")+"\\Reports\\Screenshots\\screenshot.png"));

        test.fail("Failed validated the EMI" , MediaEntityBuilder.createScreenCaptureFromPath("Screenshots\\screenshot.png").build());

        extentReports.flush();
        System.exit(0);


    }
}
