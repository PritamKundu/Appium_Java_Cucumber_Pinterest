package pages;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class RemoveTopicPage extends PageObjectManager{
    private String topicsOption = "//android.widget.TextView[@text=\"Topics\"]";
    private String removeBtn = "//android.widget.Button[@text=\"Remove\"]";//index(0)
    private String btnClass = "//android.widget.Button";//index(0)

    public RemoveTopicPage(WebDriver driver) {
        super(driver);
    }

    public void tapTopicsOption(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        clickElement("xpath", topicsOption);
    }

    public void tapRemoveBtn(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        getListOfElements("xpath", removeBtn).get(0).click();
    }

    public String getBtnText(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        return getListOfElements("xpath", btnClass).get(0).getText();
    }
}
