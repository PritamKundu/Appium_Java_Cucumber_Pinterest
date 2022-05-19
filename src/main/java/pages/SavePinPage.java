package pages;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class SavePinPage extends PageObjectManager {
    private String saveButton1 = "com.pinterest:id/save_pinit_bt";
    private String saveButton2 = "com.pinterest:id/idea_pin_vertical_action_bar_save_wrapper";
    //Saved!

    public SavePinPage(WebDriver driver) {
        super(driver);
    }

    public void clickSaveButton() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        if (isElementDisplayed("id", saveButton1)) {
            clickElement("id", saveButton1);
        } else if (isElementDisplayed("id", saveButton2)) {
            clickElement("id", saveButton2);
        } else System.out.println("Save Button not found!");
    }

    public boolean isSaved(){
        boolean temp;

        if (isElementDisplayed("id", saveButton1) && getTextString("id", saveButton1).equalsIgnoreCase("Saved!")){
            temp = true;
        } else if (isElementDisplayed("id", saveButton2)){
            temp = true;
        }else {
            temp = false;
        }
        return temp;
    }
}
