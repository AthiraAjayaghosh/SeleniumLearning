package Framework.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends PageObjectBase{

    WebDriver driver;

    @FindBy(linkText = "Sign In")
    private WebElement lk_SignIn;

//    private WebElement lk_SignIn=driver.findElement(By.linkText("Sign In"));

    /**
     *
     * @param driver
     */
    public  HomePage(WebDriver driver){
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    public void clickSignInLink(){
        lk_SignIn.click();
    }
}
