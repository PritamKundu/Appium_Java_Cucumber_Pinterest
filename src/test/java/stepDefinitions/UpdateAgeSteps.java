package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.UpdateAgePage;
import utils.AndroidSetup;

public class UpdateAgeSteps {
    AndroidSetup androidSetup = new AndroidSetup();
    UpdateAgePage updateAgePage;

    public UpdateAgeSteps() {
        updateAgePage = new UpdateAgePage(AndroidSetup.driver);
    }

    @And("User taps settings option")
    public void userTapsSettingsOption() {
        updateAgePage.tapSettingsOption();
    }

    @Given("user taps personal information option")
    public void userTapsPersonalInformationOption() {
        updateAgePage.tapPersonalInfoOption();
    }

    @And("taps age option")
    public void tapsAgeOption() {
        updateAgePage.tapAgeOption();
    }

    @And("enters age in the edit age field")
    public void entersAgeInTheEditAgeField() {
        updateAgePage.enterAge();
    }

    @And("taps edit age Done button")
    public void tapsEditAgeDoneButton() {
        updateAgePage.tapAgeDoneBtn();
    }

    @Then("age update toast should be visible")
    public void ageUpdateToastShouldBeVisible() {
        Assert.assertTrue(updateAgePage.isToastDisplayed());
        androidSetup.tearDown();
    }
}
