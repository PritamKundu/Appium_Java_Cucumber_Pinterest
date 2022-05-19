package pages;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class PostPage extends PageObjectManager{
    private String postClass = "android.view.View";
//    private String pinBottomMenu = "com.pinterest:id/pin_closeup_action_button_module";

    public PostPage(WebDriver driver) {
        super(driver);
    }

    public void tapPost(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        getListOfElements("classname", postClass).get(0).click();
    }

    public boolean isPostDisplayed(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return isElementDisplayed("classname", postClass);
    }
}
