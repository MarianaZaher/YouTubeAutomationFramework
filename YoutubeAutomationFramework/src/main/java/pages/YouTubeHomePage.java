package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WaitUtils;

public class YouTubeHomePage {

    WebDriver driver;
    WaitUtils wait;

    public YouTubeHomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WaitUtils(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "search_query")
    public WebElement searchInput;

    @FindBy(className  = "ytSearchboxComponentSearchButton")
    public WebElement searchButton;

    @FindBy(id  = "filter-button")
    public WebElement filterButton;

    @FindBy( xpath = "//*[@id='label' and @title='Search for Video']")
    public WebElement videoFilter;

    public void enterSearchKeyword(String keyword) {
        wait.waitForVisibility(searchInput);
       searchInput.clear();
       searchInput.sendKeys(keyword);
        wait.waitForClickability(searchButton).click();
        
    }
    public WebElement getVideoTitleByIndex(int index) {
        String xpath = "(//a[@id='video-title'])[" + index + "]";
        return  wait.waitForElementToBeVisible(xpath) ;
    }
}