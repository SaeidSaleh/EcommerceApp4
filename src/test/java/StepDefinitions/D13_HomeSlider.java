package StepDefinitions;


import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import static StepDefinitions.OpenClose.driver;

import java.time.Duration;

public class D13_HomeSlider {

    HomePage homePage;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
    String nokiaProductDetailsPageUrl = "https://demo.nopcommerce.com/nokia-lumia-1020";
    String iphoneProductDetailsPageUrl = " https://demo.nopcommerce.com/iphone-6";

    @Given("User at home page")
    public void user_navigate_home_page() {
        homePage = new HomePage(driver);
        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @When("User click on first slider nokia image")
    public void user_click_on_first_slider_nokia_image() {
        homePage.Nokia().click();
    }

    @Then("User navigate to nokia product details page")
    public void user_navigate_to_nokia_product_details_page() {
        wait.until(ExpectedConditions.urlToBe(nokiaProductDetailsPageUrl));
        System.out.println(OpenClose.driver.getCurrentUrl());
        Assert.assertEquals(OpenClose.driver.getCurrentUrl(), nokiaProductDetailsPageUrl);

    }

    @When("User click on second slider iphone image")
    public void user_click_on_second_slider_iphone_image() throws InterruptedException {
        homePage.Iphone_Selector().click();
        Thread.sleep(2000);
        homePage.Iphone().click();
    }

    @Then("User navigate to iphone product details page")
    public void user_navigate_to_iphone_product_details_page() {
        wait.until(ExpectedConditions.urlToBe(iphoneProductDetailsPageUrl));
        System.out.println(OpenClose.driver.getCurrentUrl());
        Assert.assertEquals(OpenClose.driver.getCurrentUrl(), iphoneProductDetailsPageUrl);
    }
}
