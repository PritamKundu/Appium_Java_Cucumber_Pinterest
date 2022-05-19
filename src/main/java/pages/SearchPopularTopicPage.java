package pages;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class SearchPopularTopicPage extends PageObjectManager{
    private String imageViewClass = "android.widget.ImageView";

    public SearchPopularTopicPage(WebDriver driver) {
        super(driver);
    }

    public void tapPopularTopic(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        getListOfElements("classname", imageViewClass).get(5).click();
    }
}
