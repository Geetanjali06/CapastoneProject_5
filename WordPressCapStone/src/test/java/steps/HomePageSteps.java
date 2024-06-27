package steps;

import org.testng.Assert;

import baseLayer.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageLayer.HomePage;

public class HomePageSteps extends BaseClass{
	
	private static HomePage homepage;
	
    @Given("I launch the WordPress URL")
    public void iLaunchTheWordPressURL() {
    	initialization();
    	homepage = new HomePage();
       
    }

    @Then("I should see the page title as {string}")
    public void iShouldSeeThePageTitleAs(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @When("I mouse over the download menu")
    public void iMouseOverTheDownloadMenu() throws InterruptedException {
        homepage.hoverOnDownload();
    }

    @And("I click on the Get WordPress option")
    public void iClickOnTheGetWordPressOption() throws InterruptedException {
        homepage.clickOnGetWordPress();
    }

    @Then("I should see the text {string}")
    public void iShouldSeeTheText(String expectedText) {
    	homepage.visibleText();
    }

    @Given("I am on the WordPress homepage")
    public void iAmOnTheWordPressHomepage() {
        driver.get("https://wordpress.org/");
    }

    @When("I click on the Community menu")
    public void iClickOnTheCommunityMenu() {
    	homepage.clickcommunityTab();
    }

    @And("I click on the Photo Directory option")
    public void iClickOnThePhotoDirectoryOption() {
    	homepage.clickOnPicture();
    }

    @And("I search for {string}")
    public void iSearchFor(String searchTerm) throws InterruptedException {
       homepage.searchPhoto();
    }

    @Then("I should see pictures displayed")
    public void iShouldSeePicturesDisplayed() {
    	Assert.assertTrue(homepage.seePictures() > 0, "No pictures found");
        driver.quit();
    }


}
