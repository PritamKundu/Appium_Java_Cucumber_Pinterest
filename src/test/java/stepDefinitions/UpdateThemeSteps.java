package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.UpdateThemePage;
import utils.AndroidSetup;

public class UpdateThemeSteps {
    AndroidSetup androidSetup = new AndroidSetup();
    UpdateThemePage updateThemePage;

    public UpdateThemeSteps() {
        updateThemePage = new UpdateThemePage(AndroidSetup.driver);
    }

    @Given("user taps account management option")
    public void userTapsAccountManagementOption() {
        updateThemePage.tapAccManagementOption();
    }

    @And("taps app theme option")
    public void tapsAppThemeOption() {
        updateThemePage.tapThemeOption();
    }

    @And("selects a theme")
    public void selectsATheme() {
        updateThemePage.selectTheme();
    }

    @Then("theme should be updated")
    public void themeShouldBeUpdated() {
        Assert.assertTrue(updateThemePage.isThemeChanged());
        androidSetup.tearDown();
    }
}
