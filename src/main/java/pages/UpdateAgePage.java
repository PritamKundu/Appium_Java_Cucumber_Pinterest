package pages;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class UpdateAgePage extends PageObjectManager{
    private String settingsOption = "//android.widget.TextView[@text=\"Settings\"]";
    private String personalInformationOption = "//android.widget.TextView[@text=\"Personal information\"]";
    private String ageOption = "//android.widget.TextView[@text=\"Age\"]";
    private String ageTextField = "com.pinterest.settings:id/account_settings_text_edit_item_text";
    private String ageDoneBtn = "//android.widget.Button[@text=\"Done\"]";
    private String confirmationToast = "com.pinterest:id/system_message";

    public UpdateAgePage(WebDriver driver) {
        super(driver);
    }

    public void tapSettingsOption(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        clickElement("xpath", settingsOption);
    }

    public void tapPersonalInfoOption(){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        clickElement("xpath", personalInformationOption);
    }

    public void tapAgeOption(){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        clickElement("xpath", ageOption);
    }

    public void enterAge(){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        MobileElement element = getElement("id", ageTextField);
        int tempAge = Integer.parseInt(element.getText())+1;
        String age = ""+tempAge;
        element.click();
        element.clear();

        element.sendKeys(age);
    }

    public void tapAgeDoneBtn(){
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        clickElement("xpath", ageDoneBtn);
    }

    public boolean isToastDisplayed(){
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        return isElementDisplayed("id", confirmationToast);
    }
}
