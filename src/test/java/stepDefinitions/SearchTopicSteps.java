package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.SearchTopicPage;
import utils.AndroidSetup;

public class SearchTopicSteps {
    AndroidSetup androidSetup = new AndroidSetup();
    SearchTopicPage searchTopicPage;

    public SearchTopicSteps() {
        searchTopicPage = new SearchTopicPage(AndroidSetup.driver);
    }

    @Given("user clicks search icon")
    public void userClicksSearchIcon() {
        searchTopicPage.clickSearchIcon();
    }

    @And("clicks search bar input field")
    public void clicksSearchBarInputField() {
        searchTopicPage.clickSearchBar();
    }

    @When("user enter a {string} name and clicks enter")
    public void userEnterANameAndClicksEnter(String topic) {
        searchTopicPage.inputTopicInSearchField(topic);
    }

    @Then("search result is displayed")
    public void searchResultIsDisplayed() {
        Assert.assertTrue(searchTopicPage.isResultDisplayed());
        androidSetup.tearDown();
    }

}
