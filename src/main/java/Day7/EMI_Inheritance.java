package Day7;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EMI_Inheritance extends Base_Inheritance {

    //    Enter and Extract
    String extractEmi(String amount, String interest, String tenure) {
        driver.findElement(By.id("loanamount")).sendKeys(amount);
//        Enter the rate of interest
        driver.findElement(By.name("rate")).sendKeys(interest);
//        Enter the tenure
        driver.findElement(By.id("pmonths")).sendKeys(tenure);
//        Click on calcualte
        driver.findElement(By.name("Button1")).click();
//        Extract the value
        String output = driver.findElement(By.id("EMI")).getAttribute("value");
        return output;
    }
}