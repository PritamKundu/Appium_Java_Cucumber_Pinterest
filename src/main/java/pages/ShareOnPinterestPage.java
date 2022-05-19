package pages;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class ShareOnPinterestPage extends PageObjectManager{
    private String shareOptions = "//android.widget.ImageView[@content-desc=\"External app icon\"]";
    private String importContactBtn = "com.pinterest:id/lego_sync_contacts_button";
    private String permissionModal = "com.pinterest:id/negative_bt";

    public ShareOnPinterestPage(WebDriver driver) {
        super(driver);
    }

    public void tapShareOnPinterestIcon(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        getListOfElements("xpath", shareOptions).get(4).click();
    }

    public void tapImportContactsBtn(){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        clickElement("id", importContactBtn);
    }

    public boolean isModalDisplayed(){
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        return isElementDisplayed("id", permissionModal);
    }
}
