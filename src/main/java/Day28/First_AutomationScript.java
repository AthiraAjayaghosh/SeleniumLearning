package Day28;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class First_AutomationScript {
    private static Logger log = Logger.getLogger("EMICaluculator");//Project name can be given instead of class name

    public static void main(String[] args) {
        log.info("Started the Execution");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.setExperimentalOption("useAutomationExtension", false);
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Athira.Ajayaghosh\\Selenium\\Driver\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
        log.error("Started the Execution");
//        Launch the application on Firefox browser
//        System.setProperty("webdriver.gecko.driver","C:\\Training\\Drivers\\geckodriver.exe");
//        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.unionbankofindia.co.in/english/emicalculator.aspx");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        log.warn("taking too much time");

        String amount = "20000";
        driver.findElement(By.id("loanamount")).sendKeys(amount);//        Enter loan amount
        driver.findElement(By.name("rate")).sendKeys("10");//        Enter the rate of interest
        driver.findElement(By.id("pmonths")).sendKeys("120");//        Enter the tenure
        driver.findElement(By.name("Button1")).click();//        Click on calculate
//        Extract the value
        String output = driver.findElement(By.id("EMI")).getAttribute("value");
        System.out.println(output);
        System.exit(0);
    }}
