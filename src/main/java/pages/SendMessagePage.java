package pages;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SendMessagePage extends PageObjectManager{
    private String inboxIconPath = "com.pinterest:id/menu_notifications";
    private String messagesBtn = "//android.widget.TextView[@text = \"Messages\"]";
    private String emailFieldPath = "com.pinterest.conversation:id/search_tap_target";
    private String emailInputField = "com.pinterest.conversation:id/people_facet_search_et";
    private String contactList = "android.widget.TextView";
    private String contactNxtBtn = "com.pinterest.conversation:id/next_btn";
    private String msgField = "com.pinterest.conversation:id/message_edit_text";
    private String msgSendIcon = "com.pinterest.conversation:id/send_button";
    private String msgSendConfirmation = "com.pinterest.conversation:id/message_cell";

    public SendMessagePage(WebDriver driver) {
        super(driver);
    }

    public void clickInboxIcon(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        clickElement("id", inboxIconPath);
    }

    public void clickMessageBtn(){
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        clickElement("xpath", messagesBtn);
    }

    public void clickEmailField(){
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        clickElement("id", emailFieldPath);
    }

    public void enterEmail(String email){
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        SendKeysToInputField("id", emailInputField, email);
    }

    public void selectContact(){
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        List<MobileElement> element = getListOfElements("classname", contactList);
        element.get(1).click();
    }

    public void clickContactNextBtn(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        clickElement("id", contactNxtBtn);
    }

    public void enterMessage(String msg){
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        clickElement("id", msgField);
        SendKeysToInputField("id", msgField, msg);
    }

    public void clickSendIcon(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        clickElement("id", msgSendIcon);
    }

    public boolean isSent(){
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        return isElementDisplayed("id", msgSendConfirmation);
    }
}
