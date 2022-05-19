package pages;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class GoogleLoginPage extends PageObjectManager{
    private String googleLoginBtn = "com.pinterest.identity:id/gplus";
    private String googleView = "//android.view.View[@text='Sign in']";

    public GoogleLoginPage(WebDriver driver) {
        super(driver);
    }

    public void clickContinueWithGoogleBtn(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        clickElement("id", googleLoginBtn);
    }

    public boolean isDisplayed(){
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        return isElementDisplayed("xpath", googleView);
    }
}
