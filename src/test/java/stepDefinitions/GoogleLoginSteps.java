package stepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.GoogleLoginPage;
import utils.AndroidSetup;

import java.net.MalformedURLException;

public class GoogleLoginSteps {
    AndroidSetup androidSetup = new AndroidSetup();
    GoogleLoginPage googleLoginPage;

    public GoogleLoginSteps() throws MalformedURLException {
        androidSetup.setDriver();
        googleLoginPage = new GoogleLoginPage(AndroidSetup.driver);
    }

    @Given("User Clicks Login with google")
    public void userClicksLoginWithGoogle() {
        googleLoginPage.clickContinueWithGoogleBtn();
    }

    @Then("Google login page should open")
    public void googleLoginPageShouldOpen() {
        Assert.assertTrue(googleLoginPage.isDisplayed());
        androidSetup.tearDown();
    }
}
