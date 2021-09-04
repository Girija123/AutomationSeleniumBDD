package stepDefintions;

import functionLibrary.CommonFunctions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchSteps extends CommonFunctions {

    @When("I enter searchTerm {string}")
    public void i_enter_search_term(String searchTerm) {
        driver.findElement(By.id("")).sendKeys(searchTerm);
    }

    @When("I click search icon")
    public void i_click_search_icon() {
        driver.findElement(By.xpath("")).click();
    }

    @Then("I should be re-directed to search results with page with heading as {string}")
    public void i_should_be_re_directed_to_search_results_with_page_with_heading_as(String expectedResultHeading) {
        String actualResultHeading = driver.findElement(By.xpath("")).getText();
        Assert.assertEquals(expectedResultHeading, actualResultHeading);
    }

    @Then("I should see the relevant results {string}")
    public void i_should_see_the_relevant_results(String relevantTermExpected) {
        List<WebElement> products = driver.findElements(By.xpath(""));

        for(WebElement product: products)
        {
            Assert.assertTrue(product.getText().contains(relevantTermExpected));
        }
    }

}
