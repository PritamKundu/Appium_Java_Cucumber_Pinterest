package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.RecommendationTurnOffPage;
import utils.AndroidSetup;

public class RecommendationTurnOffSteps {
    AndroidSetup androidSetup = new AndroidSetup();
    RecommendationTurnOffPage turnOffPage;

    public RecommendationTurnOffSteps() {
        turnOffPage = new RecommendationTurnOffPage(AndroidSetup.driver);
    }

    @Given("user taps home feed tuner option")
    public void userTapsHomeFeedTunerOption() {
        turnOffPage.tapHomeFeedOption();
    }

    @And("taps history option")
    public void tapsHistoryOption() {
        turnOffPage.tapHistoryOption();
    }

    @And("taps Turn off button for a topic")
    public void tapsTurnOffButtonForATopic() {
        turnOffPage.tapTurnoffBtn();
    }

    @Then("recommendation should be turned off")
    public void recommendationShouldBeTurnedOff() {
        Assert.assertEquals(turnOffPage.getBtnText(), "Turn on");
        androidSetup.tearDown();
    }
}
