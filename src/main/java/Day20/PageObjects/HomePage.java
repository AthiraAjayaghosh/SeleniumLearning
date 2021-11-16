package Day20.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(linkText = "Sign In")
    private WebElement lk_SignIn;

//    private WebElement lk_SignIn=driver.findElement(By.linkText("Sign In")); same as the above


    public void clickSignInLink(){
        lk_SignIn.click();
    }
}
