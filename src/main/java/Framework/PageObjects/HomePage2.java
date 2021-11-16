package Framework.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage2 {


    WebDriver driver;

    @FindBy(linkText = "Sign In")
    private WebElement lk_SignIn;

//    private WebElement lk_SignIn=driver.findElement(By.linkText("Sign In"));

    /**
     *
     * @param driver
     */
    public HomePage2(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    /**
     *
     * @return return the Sign IN Page
     */
    public SignInPage2 clickSignInLink(){

        lk_SignIn.click();
        return new SignInPage2(driver);
    }
}
