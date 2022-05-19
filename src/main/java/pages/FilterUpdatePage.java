package pages;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class FilterUpdatePage extends PageObjectManager{
    private String filterIcon = "com.pinterest.newsHub:id/notification_filter_button";
    private String photosOption = "//android.widget.TextView[@text=\"Photos\"]";
    private String resetFilterBtn = "com.pinterest.newsHub:id/empty_state_button";

    public FilterUpdatePage(WebDriver driver) {
        super(driver);
    }

    public void tapFilterIcon(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        clickElement("id", filterIcon);
    }

    public void tapPhotosOption(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        clickElement("xpath", photosOption);
    }

    public boolean isFilterPageVisible(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        return isElementDisplayed("id", resetFilterBtn);
    }
}
