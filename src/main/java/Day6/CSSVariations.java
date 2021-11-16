package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSVariations {
        public static void main(String[] args) {

//        Launch the application on Firefox browser
            System.setProperty("webdriver.gecko.driver","C:\\Users\\Athira.Ajayaghosh\\Selenium\\Driver\\geckodriver.exe");
            FirefoxDriver driver = new FirefoxDriver();
            driver.get("https://www.unionbankofindia.co.in/english/emicalculator.aspx");
            String amount = "20000";
//        Enter loan amount
            driver.findElement(By.cssSelector(" input[name='loanamount']")).sendKeys(amount);
//        Enter the rate of interest
            driver.findElement(By.cssSelector(" input[name='rate'][type='text']")).sendKeys("10");
//        Enter the tenure
            driver.findElement(By.cssSelector(" table#tblinput tr:nth-of-type(4) input")).sendKeys("120");
//        Click on calcualte
            driver.findElement(By.cssSelector(" input[value='Calculate']")).click();
//        Extract the value
            String output = driver.findElement(By.cssSelector(" input[id='EMI'],[id='EMI1']")).getAttribute("value");
            System.out.println(output);

            System.exit(0);
        }
}
