package pages;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class FbLoginPage extends PageObjectManager {
    private String fbLoginBtn = "com.pinterest.identity:id/facebook";
    private String fbView = "//android.view.View[@text='facebook']";

    public FbLoginPage(WebDriver driver) {
        super(driver);
    }

    public void clickLoginWithFbBtn(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        clickElement("id", fbLoginBtn);
    }

    public boolean isDisplayed(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return isElementDisplayed("xpath", fbView);
    }

}
