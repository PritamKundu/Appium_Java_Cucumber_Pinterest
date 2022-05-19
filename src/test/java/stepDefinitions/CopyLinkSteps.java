package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CopyLinkPage;
import utils.AndroidSetup;

public class CopyLinkSteps {
    AndroidSetup androidSetup = new AndroidSetup();
    CopyLinkPage copyLinkPage;

    public CopyLinkSteps() {
        copyLinkPage = new CopyLinkPage(AndroidSetup.driver);
    }

    @When("user taps share icon")
    public void userTapsShareIcon() {
        copyLinkPage.tapShareIcon();
    }

    @And("taps copy link icon")
    public void tapsCopyLinkIcon() {
        copyLinkPage.tapShareOption();
    }

    @Then("copy link toast should be visible")
    public void copyLinkToastShouldBeVisible() {
        Assert.assertTrue(copyLinkPage.isToastDisplayed());
        androidSetup.tearDown();
    }
}
