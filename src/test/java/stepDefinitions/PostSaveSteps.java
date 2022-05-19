package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.SavePinPage;
import utils.AndroidSetup;

public class PostSaveSteps {
    AndroidSetup androidSetup = new AndroidSetup();
    SavePinPage savePinPage;

    public PostSaveSteps() {
        savePinPage = new SavePinPage(AndroidSetup.driver);
    }

    @And("user taps save button")
    public void userTapsSaveButton() {
        savePinPage.clickSaveButton();
    }

    @Then("post shall be saved")
    public void postShallBeSaved() {
        Assert.assertTrue(savePinPage.isSaved());
        androidSetup.tearDown();
    }
}
