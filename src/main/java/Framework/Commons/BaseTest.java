package Framework.Commons;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import static Framework.Constants.ApplicationConstants.*;


public class BaseTest {
    public WebDriver driver;
    public static GlobalConfig config;
    public static ExtentReports extentReports;
    public ExtentTest test;
    public Assertor assertor;

    @BeforeSuite
    public void initSetup(){
        config = GlobalConfig.getProperties();
        extentReports= ReportUtil.getReport();
    }

    @Parameters("browser")
    @BeforeMethod
    public void lauchApp(String browser){

        switch(browser.toLowerCase()){

            case "firefox" :
                driver = getFirefoxDriver();
                break;
            case "chrome" :
                driver = getChromeDriver();
                break;
            case "ie":
                driver = getInternetExplorerDriver();
                break;
        }

//        System.setProperty("webdriver.gecko.driver",GECKO_DRIVER_PATH);
//        driver= new FirefoxDriver();
        driver.get(config.get(config.get(CURRENT_ENVIRONMENT)));
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    /**
     * get the firefox driver
     * @return
     */
    public WebDriver getFirefoxDriver(){
        System.setProperty("webdriver.gecko.driver",GECKO_DRIVER_PATH);
        return  new FirefoxDriver();

    }

    /**
     * get the chrome driver
     * @return
     */
    public WebDriver getChromeDriver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.setExperimentalOption("useAutomationExtension", false);
        System.setProperty("webdriver.chrome.driver",CHROME_DRIVER_PATH);
        return new ChromeDriver(options);

    }

    /**
     * get the IE driver
     * @return
     */
    public WebDriver getInternetExplorerDriver(){
        System.setProperty("webdriver.gecko.driver",GECKO_DRIVER_PATH);
        return  new FirefoxDriver();

    }


    @AfterMethod
    public  void tearDown(){
        extentReports.flush();
        driver.quit();
    }

    /**
     * to take Screenshot
     * @return
     */
    public String getScreenshot(){
        String fileName = null;
        try{
            TakesScreenshot screen = (TakesScreenshot) driver;
            File img = screen.getScreenshotAs(OutputType.FILE);
            fileName=REPORT_PATH + "\\Screenshots\\screenshot_" + getUniqueDateTimeStamp() + ".png";
            FileUtils.copyFile(img,new File(fileName));
        }catch(Exception e){
            e.printStackTrace();
        }
        return fileName;
    }

    /**
     * to get uniquie date and timestamp
     * @return
     */
    public static String getUniqueDateTimeStamp(){
        Date date = new Date();
        SimpleDateFormat SimpleFormat = new SimpleDateFormat("dd-MMM-yyyy hh-mm-ss");
        String cleanedDate = SimpleFormat.format(date);
        return cleanedDate;
    }


    @AfterSuite
    public void cleanProcess() throws IOException {
        Runtime.getRuntime().exec("taskkill /F /IM geckodriver.exe /T");
        Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        Runtime.getRuntime().exec("taskkill /F /IM IEDriverServer.exe /T");
    }

}
