package pages;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class CopyLinkPage extends PageObjectManager{
    private String shareIcon = "com.pinterest:id/user_profile_actions_center_right_icon";
    private String shareOptions = "//android.widget.ImageView[@content-desc=\"External app icon\"]";
    private String confirmationToast = "com.pinterest:id/system_message";

    public CopyLinkPage(WebDriver driver) {
        super(driver);
    }

    public void tapShareIcon(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        clickElement("id", shareIcon);
    }

    public void tapShareOption(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        getListOfElements("xpath", shareOptions).get(2).click();
    }

    public boolean isToastDisplayed(){
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        return isElementDisplayed("id", confirmationToast);
    }
}
