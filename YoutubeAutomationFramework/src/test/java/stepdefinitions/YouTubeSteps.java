package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.YouTubeHomePage;
import utils.DriverFactory;
import utils.TestUtil;

public class YouTubeSteps {

    WebDriver driver;
    YouTubeHomePage homePage;
    String selectedTitle;

    @Before
    public void setUp() {
        driver = DriverFactory.initializeDriver();
    }

    @After
    public void tearDown(io.cucumber.java.Scenario scenario) {
        if (scenario.isFailed()) {
            TestUtil.takeScreenshot(driver, scenario.getName());
        }
        DriverFactory.quitDriver();
    }

    @Given("User is on YouTube homepage")
    public void userIsOnYouTubeHomepage() {
        driver.get("https://www.youtube.com");
        homePage = new YouTubeHomePage(driver);
    }

    @When("User searches for {string}")
    public void userSearchesFor(String keyword) {
        homePage.enterSearchKeyword(keyword);
    }

    @And("User applies Video filter")
    public void userAppliesVideoFilter() throws InterruptedException {
        Thread.sleep(2000);
        homePage.filterButton.click();
        Thread.sleep(1000);
        homePage.videoFilter.click();
    }

    @And("User selects the {int} video")
    public void userSelectsTheNthVideo(int videoIndex) throws InterruptedException {
        Thread.sleep(3000);
            selectedTitle = homePage.getVideoTitleByIndex(videoIndex).getAttribute("title");
            homePage.getVideoTitleByIndex(videoIndex).click();
    }

    @Then("Video title should match")
    public void videoTitleShouldMatch() throws InterruptedException {
        Thread.sleep(3000);
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(selectedTitle));
    }
}