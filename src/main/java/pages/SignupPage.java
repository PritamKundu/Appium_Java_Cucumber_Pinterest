package pages;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SignupPage extends PageObjectManager {
    private String emailField =  "//android.widget.EditText[@text='Email address']";
    private String emailContinueBtn = "//android.widget.Button[@text='Continue']";
    private String passwordField = "com.pinterest.identity:id/signup_password_edit_text";
    private String passwordNxtBtn = "com.pinterest.identity:id/email_sign_next_button";
    private String fullNameField = "com.pinterest.identity:id/signup_name_edit_text";
    //    private String fullNameNxtBtn = "com.pinterest.identity:id/email_sign_next_button";
    private String ageField = "com.pinterest.identity:id/signup_age_edit_text";
    private String genderMaleBtn = "com.pinterest.nux:id/gender_male_button";
    private String countryNextBtn = "com.pinterest.nux:id/country_next_button";
    private String topicsClass = "android.widget.ImageView";
    private String topicNxtBtn = "com.pinterest.nux:id/nux_top_bar_next_button";


    public SignupPage(WebDriver driver) {
        super(driver);
    }

    public void enterEmailId(String email){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        SendKeysToInputField("xpath", emailField, email);
    }

    public void clickContinueBtn(){
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        clickElement("xpath", emailContinueBtn);
    }

    public void enterPassword(String password) {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        SendKeysToInputField("id", passwordField, password);
    }

    public void clickNextButton() {
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        clickElement("id", passwordNxtBtn);
    }

    public void enterName(String name) {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        SendKeysToInputField("id", fullNameField, name);
    }

    public void enterAge(String age) {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        SendKeysToInputField("id", ageField, age);
    }

    public void selectGender() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        clickElement("id", genderMaleBtn);
    }

    public void selectCountry() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        clickElement("id", countryNextBtn);
    }

    public void selectTopics() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        List<MobileElement> elements = getListOfElements("classname", topicsClass);

        for (int i = 0; i < 5; i++) {
            elements.get(i).click();
        }
    }

    public void clickTopicNextButton() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        clickElement("id", topicNxtBtn);
    }
}
