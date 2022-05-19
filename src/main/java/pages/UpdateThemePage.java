package pages;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class UpdateThemePage extends PageObjectManager{
    private String accManagementOption = "//android.widget.TextView[@text=\"Account management\"]";
    private String themeOption = "//android.widget.TextView[@text=\"App theme\"]";
    private String themeRadioClass = "android.widget.RadioButton";
//    private String textViewClass = "android.widget.TextView";

    private String themeText = null;

    public UpdateThemePage(WebDriver driver) {
        super(driver);
    }

    public void tapAccManagementOption(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        clickElement("xpath", accManagementOption);
    }

    public void tapThemeOption(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        clickElement("xpath", themeOption);
    }

    public void selectTheme(){
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        List<MobileElement> elements = getListOfElements("classname", themeRadioClass);

        for(MobileElement element : elements){
            if (element.getAttribute("checked").equalsIgnoreCase("false")){
                themeText = element.getText();
                element.click();
                break;
            }
        }
    }

    public boolean isThemeChanged(){
        String themeTextView = "//android.widget.TextView[@text=\""+themeText+"\"]";
        return getElement("xpath", themeTextView).isDisplayed();
    }
}
