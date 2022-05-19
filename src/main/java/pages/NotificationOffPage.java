package pages;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class NotificationOffPage extends PageObjectManager {
    private String notificationOption = "//android.widget.TextView[@text=\"Notifications\"]";
    private String byEmailOption = "//android.widget.TextView[@text=\"By email\"]";
    private String turnOffBtn1 = "com.pinterest.settings:id/settings_button_wide_turn_off";
    private String turnOffBtn2 = "com.pinterest.settings:id/turn_off_notifs_confirm_button";
    private String enableBtn = "com.pinterest.settings:id/settings_button_wide_select_all";

    public NotificationOffPage(WebDriver driver) {
        super(driver);
    }

    public void tapNotificationOption() {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        clickElement("xpath", notificationOption);
    }

    public void tapByEmailOption() {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        clickElement("xpath", byEmailOption);
    }

    public void tapTurnOffBtn() {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        if (isElementDisplayed("id", turnOffBtn1)) {
            clickElement("id", turnOffBtn1);
        } else {
            clickElement("id", enableBtn);
            driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
            clickElement("id", turnOffBtn1);
        }
    }

    public void tapTurnOffBtnAgain() {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        clickElement("id", turnOffBtn2);
    }

    public boolean isTurnedOff(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        return isElementDisplayed("id", enableBtn);
    }
}
