package stepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.SignupPage;
import utils.AndroidSetup;

import java.net.MalformedURLException;

public class SignupSteps {
    AndroidSetup androidSetup = new AndroidSetup();
    SignupPage signupPage;

    public SignupSteps() throws MalformedURLException {
        androidSetup.setDriver();
        signupPage = new SignupPage(AndroidSetup.driver);
    }
    
    @Given("user enters {string} in the email field for signup")
    public void userEntersInTheEmailFieldForSignup(String email) {
        signupPage.enterEmailId(email);
    }

    @And("clicks continue button for signup")
    public void clicksContinueButtonForSignup() {
        signupPage.clickContinueBtn();
    }

    @When("User enters {string} in the password field")
    public void userEntersInThePasswordField(String password) {
        signupPage.enterPassword(password);
    }

    @And("clicks next button")
    public void clicksNextButton() {
        signupPage.clickNextButton();
    }

    @And("enters {string} in the full name field")
    public void entersInTheFullNameField(String name) {
        signupPage.enterName(name);
    }

    @And("enters {string} in the age field")
    public void entersInTheAgeField(String age) {
        signupPage.enterAge(age);
    }

    @And("selects a gender")
    public void selectsAGender() {
        signupPage.selectGender();
    }

    @And("selects a country")
    public void selectsACountry() {
        signupPage.selectCountry();
    }

    @And("selects five topics")
    public void selectsFiveTopics() {
        signupPage.selectTopics();
    }

    @And("clicks topic next button")
    public void clicksTopicNextButton() {
        signupPage.clickTopicNextButton();
        androidSetup.tearDown();
    }
}
