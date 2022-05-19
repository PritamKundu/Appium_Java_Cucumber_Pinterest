package pages;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginPage extends PageObjectManager{

    private String emailField =  "//android.widget.EditText[@text='Email address']";
    private String emailContinueBtn = "//android.widget.Button[@text='Continue']";
    private String passwordField = "com.pinterest.identity:id/password";
    private String loginButton = "com.pinterest.identity:id/login_bt";
    private String bottomNavBar = "com.pinterest:id/bottom_nav_bar";
    private String invalidPasswordMsg = "com.pinterest.identity:id/incorrect_password";

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterEmailId(String email){
        driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        SendKeysToInputField("xpath", emailField, email);
    }

    public void clickContinueBtn(){

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        clickElement("xpath", emailContinueBtn);
    }

    public void enterPassword(String password){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        SendKeysToInputField("Id", passwordField, password);
    }

    public void clickLoginBtn(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        clickElement("Id", loginButton);
    }

    public boolean isHomepageLoaded(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return isElementDisplayed("id", bottomNavBar);
    }

    public boolean isErrorMsgVisible(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return isElementDisplayed("id", invalidPasswordMsg);
    }
}
