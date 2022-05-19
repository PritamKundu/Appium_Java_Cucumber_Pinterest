package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.UpdateProfilePage;
import utils.AndroidSetup;

public class UpdateProfileSteps {
    AndroidSetup androidSetup = new AndroidSetup();
    UpdateProfilePage updateProfilePage;

    public UpdateProfileSteps() {
        updateProfilePage = new UpdateProfilePage(AndroidSetup.driver);
    }

    @And("Taps three dots menu")
    public void tapsThreeDotsMenu() {
        updateProfilePage.clickThreeDotMenu();
    }

    @When("User taps edit public profile")
    public void userTapsEditPublicProfile() {
        updateProfilePage.clickEditProfileBtn();
    }

    @And("enters {string} in the last name field")
    public void entersInTheLastNameField(String lastname) {
        updateProfilePage.enterLastName(lastname);
    }

    @And("taps profile edit done button")
    public void tapsProfileEditDoneButton() {
        updateProfilePage.clickDoneBtn();
    }

    @Then("Profile should be updated")
    public void profileShouldBeUpdated() {
        Assert.assertTrue(updateProfilePage.isToastDisplayed());
        androidSetup.tearDown();
    }
}
