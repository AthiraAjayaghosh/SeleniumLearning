package Day7;

import org.openqa.selenium.By;

public class Bing_inheritance extends Base_Inheritance {
    void Search(String search) {
        driver.findElement(By.className("sb_form_q")).sendKeys(search);
        driver.findElement(By.id("sb_form_go")).submit();
    }


}
