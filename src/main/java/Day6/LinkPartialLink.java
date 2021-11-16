package Day6;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LinkPartialLink {
    public static void main(String[] args) {

        //        Launch the application on Firefox browser
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Athira.Ajayaghosh\\Selenium\\Driver\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.unionbankofindia.co.in/english/emicalculator.aspx");

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

//        linktext
//        driver.findElement(By.linkText("Bank Holidays")).click();

//        partial
        driver.findElement(By.partialLinkText("Holidays")).click();

        System.exit(0);

    }
}
