package stepDefinitions;

import io.cucumber.java.en.And;
import pages.SearchPopularTopicPage;
import utils.AndroidSetup;

public class SearchPopularTopicSteps {
    SearchPopularTopicPage searchPage;

    public SearchPopularTopicSteps() {
        searchPage = new SearchPopularTopicPage(AndroidSetup.driver);
    }

    @And("taps on a popular topic")
    public void tapsOnAPopularTopic() {
        searchPage.tapPopularTopic();
    }
}
