package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.NotificationOffPage;
import utils.AndroidSetup;

public class NotificationOffSteps {
    AndroidSetup androidSetup = new AndroidSetup();
    NotificationOffPage notificationOffPage;

    public NotificationOffSteps() {
        notificationOffPage = new NotificationOffPage(AndroidSetup.driver);
    }

    @Given("User taps Notifications option")
    public void userTapsNotificationsOption() {
        notificationOffPage.tapNotificationOption();
    }

    @And("taps By Email option")
    public void tapsByEmailOption() {
        notificationOffPage.tapByEmailOption();
    }

    @And("taps turn off all button")
    public void tapsTurnOffAllButton() {
        notificationOffPage.tapTurnOffBtn();
    }

    @And("taps turn off all button again")
    public void tapsTurnOffAllButtonAgain() {
        notificationOffPage.tapTurnOffBtnAgain();
    }

    @Then("Email notifications should be turned off")
    public void emailNotificationsShouldBeTurnedOff() {
        Assert.assertTrue(notificationOffPage.isTurnedOff());
        androidSetup.tearDown();
    }
}
