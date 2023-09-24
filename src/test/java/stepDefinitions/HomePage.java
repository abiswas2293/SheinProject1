package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageClasses.SearchPage;
import utility.CommonFunctions;

public class HomePage extends CommonFunctions {

    pageClasses.HomePage home = new pageClasses.HomePage();
    SearchPage search = new SearchPage();


    @Given("^At homepage go to SearchBar and select \"([^\"]*)\"$")
    public void at_homepage_go_to_SearchBar_and_select(String arg1) throws Throwable {
        home.SearchBar(arg1);
    }


    @When("^after search get all links$")
    public void after_search_get_all_links() throws Throwable {
        search.getAllLinks();
    }

    @When("^At search page validate pageTitle is \"([^\"]*)\"$")
    public void at_search_page_validate_pageTitle_is(String arg1) throws Throwable {
        search.validatePageTitle(arg1);
    }

    @Then("^At search page click on link number \"([^\"]*)\"$")
    public void at_search_page_click_on_link_number(int number) throws Throwable {
        search.clickOnLink(number);
    }

}
