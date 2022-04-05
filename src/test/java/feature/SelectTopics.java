package feature;
import com.nswgovermentwebsite.Pages.Driver;
import com.nswgovermentwebsite.Pages.NewsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.cucumber.java.en.When;



public class SelectTopics extends Driver {

    NewsPage newspage   = new NewsPage();

    @Given("^User navigate to NSW page")
    public void naviagteToWebsite(){
        initializeBrowser("Chrome");
        newspage.navigateToURL();
}
    @When("^Select Topic and sub topics")
    public void selectTopicAndSubTopics(){
        newspage.clickSelectTopics();
        newspage.selectAnyTopics(newspage.properties.getProperty("TOPIC1"));
        newspage.selectAnyTopics(newspage.properties.getProperty("TOPIC2"));
        newspage.clickApply();
    }



    @Then("^Verify Topics are selected and filter is applied")
    public void verifyTopic(){
        newspage.verifyFilterIsApplied();
        newspage.clickClose();
    }

    @Then("^Verify reset filter button removes applied filter on topics")
        public void verifyResetRemovesAppliedFilter(){
        newspage.verifyFilterIsApplied();
        newspage.clickResetAndVerifyFilterRemoved();
        newspage.clickClose();



    }
}
