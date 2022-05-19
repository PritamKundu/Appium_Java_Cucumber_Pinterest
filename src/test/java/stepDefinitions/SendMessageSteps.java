package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.SendMessagePage;
import utils.AndroidSetup;

public class SendMessageSteps {
    AndroidSetup androidSetup = new AndroidSetup();
    SendMessagePage sendMessagePage;

    public SendMessageSteps() {
        sendMessagePage = new SendMessagePage(AndroidSetup.driver);
    }

    @Given("user clicks inbox icon")
    public void userClicksInboxIcon() {
        sendMessagePage.clickInboxIcon();
    }

    @And("clicks Messages button")
    public void clicksMessagesButton() {
        sendMessagePage.clickMessageBtn();
    }

    @And("user clicks email input field")
    public void userClicksEmailInputField() {
        sendMessagePage.clickEmailField();
    }

    @When("user enters {string} in the contact field")
    public void userEntersInTheContactField(String email) {
        sendMessagePage.enterEmail(email);
    }

    @And("selects a contact")
    public void selectsAContact() {
        sendMessagePage.selectContact();
    }

    @And("clicks contact next button")
    public void clicksContactNextButton() {
        sendMessagePage.clickContactNextBtn();
    }

    @And("enters {string} in the message field")
    public void entersInTheMessageField(String msg) {
        sendMessagePage.enterMessage(msg);
    }

    @And("clicks send icon")
    public void clicksSendIcon() {
        sendMessagePage.clickSendIcon();
    }

    @Then("message is sent")
    public void messageIsSent() {
        Assert.assertTrue(sendMessagePage.isSent());
        androidSetup.tearDown();
    }

}
