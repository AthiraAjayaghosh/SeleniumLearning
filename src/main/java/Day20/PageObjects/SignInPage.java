package Day20.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage {

    //For Login ===
    @FindBy(name="logid")
    private WebElement txt_emailID;

    @FindBy(name="pswd")
    private WebElement txt_password;

    @FindBy(xpath="//input[@value='Login']")
    private WebElement btn_login;

//    ====Login ----

    @FindBy(xpath="//b[contains(text(),'The username and/or password you entered is incorrect.')]")
    private WebElement lbl_errorMessage;


    public void enterUserCredentials(String userName,String password){
        txt_emailID.sendKeys(userName);
        txt_password.sendKeys(password);
        btn_login.click();
    }

    public boolean isInvalidErrorMessageDisplayed(){
        return lbl_errorMessage.isDisplayed();
    }
}
