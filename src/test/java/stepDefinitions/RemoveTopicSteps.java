package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.RemoveTopicPage;
import utils.AndroidSetup;

public class RemoveTopicSteps {
    AndroidSetup androidSetup = new AndroidSetup();
    RemoveTopicPage removeTopicPage;

    public RemoveTopicSteps() {
        removeTopicPage = new RemoveTopicPage(AndroidSetup.driver);
    }

    @And("taps topics option")
    public void tapsTopicsOption() {
        removeTopicPage.tapTopicsOption();
    }

    @And("taps remove button for a topic")
    public void tapsRemoveButtonForATopic() {
        removeTopicPage.tapRemoveBtn();
    }

    @Then("topic should be removed")
    public void topicShouldBeRemoved() {
        Assert.assertEquals(removeTopicPage.getBtnText(), "Add");
        androidSetup.tearDown();
    }
}
