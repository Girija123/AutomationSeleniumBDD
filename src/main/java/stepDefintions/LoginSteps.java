package stepDefintions;

import functionLibrary.CommonFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginSteps extends CommonFunctions {


    @Given("I Open Home Page {string}")
    public void openHomePage(String url)
    {
        driver.get(url);
        WebElement homePageVerEle = driver.findElement(By.xpath(""));
        Assert.assertTrue(homePageVerEle.isDisplayed());
    }

    @When("I Click My account link")
    public void clickMyAccount()
    {
        driver.findElement(By.xpath("")).click();
        WebElement loginPageVerEle = driver.findElement(By.xpath(""));
        Assert.assertTrue(loginPageVerEle.isDisplayed());
    }

    @When("I Enter username {string} and password {string}")
    public void enterUsernameAndPassword(String username, String password)
    {
        driver.findElement(By.id("")).sendKeys(username);
        driver.findElement(By.id("")).sendKeys(password);
    }

    @When("I Click Sign in button")
    public void clickSignInBtn()
    {
        driver.findElement(By.xpath("")).click();
    }

    @Then("I should be logged in successfully with message as {string}")
    public void verifyLogin(String expectedLoginVerMsg)
    {
        String actualLoginVerMsg = driver.findElement(By.xpath("")).getText();
        Assert.assertEquals(expectedLoginVerMsg, actualLoginVerMsg);
    }

    @Then("I should get re-directed to profile page")
    public void verifyRedirectionAfterLogin()
    {
        WebElement profilePageEle = driver.findElement(By.xpath(""));
        Assert.assertTrue(profilePageEle.isDisplayed());
    }

    @Then("I shouldn't allowed be login with message as {string}")
    public void verifyInvalidLogin(String expectedLoginErrorMsg)
    {
        String actualLoginErrorMsg = driver.findElement(By.xpath("")).getText();
        Assert.assertEquals(expectedLoginErrorMsg, actualLoginErrorMsg);
    }

    @When("I click forgot password link")
    public void clickForgotPasswordLink()
    {
        driver.findElement(By.xpath("")).click();
    }

    @Then("I should be displayed with forgot password pop up")
    public void verifyPresFogotPassword()
    {
        WebElement forgotPasswordVerEle = driver.findElement(By.xpath(""));
        Assert.assertTrue(forgotPasswordVerEle.isDisplayed());
    }
}
