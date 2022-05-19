package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.FilterUpdatePage;
import utils.AndroidSetup;

public class FilterUpdatesSteps {
    AndroidSetup androidSetup = new AndroidSetup();
    FilterUpdatePage filterUpdatePage;

    public FilterUpdatesSteps() {
        filterUpdatePage = new FilterUpdatePage(AndroidSetup.driver);
    }

    @When("user taps filter icon")
    public void userTapsFilterIcon() {
        filterUpdatePage.tapFilterIcon();
    }

    @And("selects photos option")
    public void selectsPhotosOption() {
        filterUpdatePage.tapPhotosOption();
    }

    @Then("filtered page should be loaded")
    public void filteredPageShouldBeLoaded() {
        Assert.assertTrue(filterUpdatePage.isFilterPageVisible());
        androidSetup.tearDown();
    }
}
