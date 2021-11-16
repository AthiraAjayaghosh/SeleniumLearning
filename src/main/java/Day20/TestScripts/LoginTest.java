package Day20.TestScripts;

import Day20.Commons.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void validateInvalidLogin(){
        driver.findElement(By.linkText("Sign In")).click();
        driver.findElement(By.name("logid")).sendKeys("askjdgkja");
        driver.findElement(By.name("pswd")).sendKeys("alscn");
        driver.findElement(By.xpath("//input[@value='Login']")).click();

        if(driver.findElement(By.xpath("//b[contains(text(),'The username and/or password you entered is incorrect.')]")).isDisplayed()){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }

    }

}
