package pages;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class UpdateProfilePage extends PageObjectManager{
    private String threeDotMenu = "com.pinterest:id/user_profile_actions_right_icon";
    private String editProfileBtn = "//android.widget.TextView[@text=\"Edit public profile\"]";
    private String textFieldClass = "android.widget.EditText";
    private String editProfileDoneBtn = "com.pinterest:id/right_button_action_layout";
    private String confirmationToast = "com.pinterest:id/system_message";

    public UpdateProfilePage(WebDriver driver) {
        super(driver);
    }

    public void clickThreeDotMenu(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        clickElement("id", threeDotMenu);
    }

    public void clickEditProfileBtn(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        clickElement("xpath", editProfileBtn);
    }

    public void enterLastName(String lastname){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        MobileElement element = getListOfElements("classname", textFieldClass).get(1);

        element.click();
        String temp = element.getText();
        element.clear();
        element.sendKeys(temp+lastname);
    }

    public void clickDoneBtn(){
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        clickElement("id", editProfileDoneBtn);
    }

    public boolean isToastDisplayed(){
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        return isElementDisplayed("id", confirmationToast);
    }
}
