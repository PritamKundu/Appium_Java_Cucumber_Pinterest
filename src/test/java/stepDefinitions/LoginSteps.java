package stepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.LoginPage;
import utils.AndroidSetup;

import java.net.MalformedURLException;

public class LoginSteps {
    LoginPage loginPage;
    AndroidSetup androidSetup = new AndroidSetup();

    public LoginSteps() throws MalformedURLException {
        /**
         * In case it shows NullPointerException or driver is null,
         * then call the androidSetup.setDriver manually from stepDefinitions Constructor
         */
        androidSetup.setDriver();
        this.loginPage = new LoginPage(AndroidSetup.driver);
    }

    @Given("user enters {string} in the email field")
    public void userEntersInTheEmailField(String email) {
        loginPage.enterEmailId(email);
    }

    @And("clicks continue button")
    public void clicksContinueButton() {
        loginPage.clickContinueBtn();
    }

    @And("enters {string} in the password field")
    public void entersInThePasswordField(String password) {
        loginPage.enterPassword(password);
    }

    @And("clicks Login button")
    public void clicksLoginButton() {
        loginPage.clickLoginBtn();
    }

    @Then("Home page is loaded")
    public void homePageIsLoaded() {
        Assert.assertTrue(loginPage.isHomepageLoaded());
    }

    @Then("Error message should be visible")
    public void errorMessageShouldBeVisible() {
        Assert.assertTrue(loginPage.isErrorMsgVisible());
        androidSetup.tearDown();
    }
}
