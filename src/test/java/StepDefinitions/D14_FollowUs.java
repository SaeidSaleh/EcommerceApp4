package StepDefinitions;

import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

import static StepDefinitions.OpenClose.driver;

public class D14_FollowUs {

    HomePage homePage;

    @Given("User at the home page")
    public void user_navigate_home_page() {
        homePage = new HomePage(driver);
        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @When("User click on facebook icon")
    public void facebook_icon() {
        homePage.FacebookIcon().click();
    }

    @When("User click on twitter icon")
    public void twitter_icon() {
        homePage.TwitterIcon().click();
    }

    @When("User click on rss icon")
    public void rss_icon() {
        homePage.RssIcon().click();
    }

    @When("User click on youtube icon")
    public void youtube_icon() {
        homePage.YoutubeIcon().click();
    }

    @Then("^\"(.*)\" is opened in new tab$")
    public void new_tab(String url) {

        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        try {
            Thread.sleep(3000);
            driver.switchTo().window(tabs.get(1));

        } catch (IndexOutOfBoundsException exp) {
            System.out.println("There is only one tab with url : " + driver.getCurrentUrl());

        } catch (InterruptedException exp) {
            exp.printStackTrace();
        }
        Assert.assertEquals(driver.getCurrentUrl(), url);
        driver.close();
        driver.switchTo().window(tabs.get(0));

    }

}

