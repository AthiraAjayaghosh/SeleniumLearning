package Day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class dropDownValuesRead {

    public static void main(String[] args) {


        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Athira.Ajayaghosh\\Selenium\\Driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.carwale.com/used/cars-in-kochi/#sc=-1&so=-1&city=9&pc=9&pn=1");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        List<WebElement> ele = driver.findElements(By.xpath("//select[@id='drpCity']/option"));

        Iterator<WebElement> iterator = ele.iterator();
        while(iterator.hasNext()){

            WebElement element = iterator.next();
            System.out.println(element.getText());
        }


    }
}
