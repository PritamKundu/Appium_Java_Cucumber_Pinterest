package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.PostPage;
import utils.AndroidSetup;

public class OpenPostSteps {
    AndroidSetup androidSetup = new AndroidSetup();
    PostPage postPage;

    public OpenPostSteps() {
        postPage = new PostPage(AndroidSetup.driver);
    }

    @Given("user taps a post")
    public void userTapsAPost() {
        postPage.tapPost();
    }

    @Then("post is opened")
    public void postIsOpened() {
        Assert.assertTrue(postPage.isPostDisplayed());
    }
}
