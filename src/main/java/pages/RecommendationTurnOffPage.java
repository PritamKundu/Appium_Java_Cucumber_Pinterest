package pages;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class RecommendationTurnOffPage extends PageObjectManager{
    private String homeFeedOption = "//android.widget.TextView[@text=\"Home feed tuner\"]";
    private String historyOption = "//android.widget.TextView[@text=\"History\"]";
    private String turnOffBtn = "//android.widget.Button[@text=\"Turn off\"]";//index(0)
    private String turnOnBtnClass = "//android.widget.Button";//index(0)

    public RecommendationTurnOffPage(WebDriver driver) {
        super(driver);
    }

    public void tapHomeFeedOption(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        clickElement("xpath", homeFeedOption);
    }

    public void tapHistoryOption(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        clickElement("xpath", historyOption);
    }

    public void tapTurnoffBtn(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        getListOfElements("xpath", turnOffBtn).get(0).click();
    }

    public String getBtnText(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        return getListOfElements("xpath", turnOnBtnClass).get(0).getText();
    }
}
