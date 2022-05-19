package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.ShareOnPinterestPage;
import utils.AndroidSetup;

public class ShareOnPinterestSteps {
    AndroidSetup androidSetup = new AndroidSetup();
    ShareOnPinterestPage sharePage;

    public ShareOnPinterestSteps() {
        sharePage = new ShareOnPinterestPage(AndroidSetup.driver);
    }

    @And("taps share on pinterest icon")
    public void tapsShareOnPinterestIcon() {
        sharePage.tapShareOnPinterestIcon();
    }

    @And("taps import contact button")
    public void tapsImportContactButton() {
        sharePage.tapImportContactsBtn();
    }

    @Then("Access permission modal is displayed")
    public void accessPermissionModalIsDisplayed() {
        Assert.assertTrue(sharePage.isModalDisplayed());
        androidSetup.tearDown();
    }
}
