package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.CreateBoardPage;
import utils.AndroidSetup;

public class CreateBoardSteps {
    AndroidSetup androidSetup = new AndroidSetup();
    CreateBoardPage createBoardPage;

    public CreateBoardSteps() {
        createBoardPage = new CreateBoardPage(AndroidSetup.driver);
    }

    @Given("User taps profile icon")
    public void userTapsProfileIcon() {
        createBoardPage.tapProfileIcon();
    }

    @And("User taps plus icon")
    public void userTapsPlusIcon() {
        createBoardPage.tapPlusIcon();
    }

    @When("Taps Board")
    public void tapsBoard() {
        createBoardPage.tapBoardBtn();
    }

    @And("Enters board {string}")
    public void entersBoard(String name) {
        createBoardPage.enterBoardName(name);
    }

    @And("Taps next")
    public void tapsNext() {
        createBoardPage.tapBoardNextBtn();
    }

    @And("Taps Done button")
    public void tapsDoneButton() {
        createBoardPage.tapBoardDoneBtn();
    }

    @Then("Board should be created")
    public void boardShouldBeCreated() {
        Assert.assertTrue(createBoardPage.isBoardCreated());
        androidSetup.tearDown();
    }
}
