package stepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.FbLoginPage;
import utils.AndroidSetup;

import java.net.MalformedURLException;

public class FbLoginSteps {
    FbLoginPage fbLoginPage;
    AndroidSetup androidSetup = new AndroidSetup();

    public FbLoginSteps() throws MalformedURLException {
        androidSetup.setDriver();
        fbLoginPage = new FbLoginPage(AndroidSetup.driver);
    }

    @Given("User Clicks Login with fb")
    public void userClicksLoginWithFb() {
        fbLoginPage.clickLoginWithFbBtn();
    }

    @Then("Fb login page should open")
    public void fbLoginPageShouldOpen() {
        Assert.assertTrue(fbLoginPage.isDisplayed());
         androidSetup.tearDown();
    }
}
