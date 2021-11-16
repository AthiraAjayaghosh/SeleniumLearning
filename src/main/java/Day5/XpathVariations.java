package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathVariations {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","C:\\Users\\Athira.Ajayaghosh\\Selenium\\Driver\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.unionbankofindia.co.in/english/emicalculator.aspx");

//        Enter values

        driver.findElement(By.xpath("//table[@id='tblinput']//tr[2]/td/following-sibling::td[2]/input ")).sendKeys("500000");
        driver.findElement(By.xpath("//input[@name='rate' and @type='text']")).sendKeys("10");
        driver.findElement(By.xpath("//input[@name='rate' and @type='text']/following::input[1]")).sendKeys("120");
        driver.findElement(By.xpath("//input[@value='Calculate']")).click();


//        Extract values
        String Output = driver.findElement(By.id("EMI")).getAttribute("value");
        System.out.println(Output);

        System.exit( 0);
    }
}
