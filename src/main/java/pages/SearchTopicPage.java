package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class SearchTopicPage extends PageObjectManager{
    String searchIconPath = "com.pinterest:id/menu_search";
    String searchBarPath = "com.pinterest:id/static_search_bar";
    String searchInputPath = "com.pinterest:id/view_search_bar_input";
    String searchResultConfirmation = "com.pinterest:id/title_related_search";

    public SearchTopicPage(WebDriver driver) {
        super(driver);
    }

    public void clickSearchIcon(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        clickElement("id", searchIconPath);
    }

    public void clickSearchBar(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        clickElement("id", searchBarPath);
    }

    public void inputTopicInSearchField(String topic){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        SendKeysToInputField("id", searchInputPath, topic);
        ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.ENTER));
    }

    public boolean isResultDisplayed(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return    isElementDisplayed("id", searchResultConfirmation);
    }
}
