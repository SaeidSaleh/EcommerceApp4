package StepDefinitions;

import Pages.P07_ColorFilter;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class D07_ColorFilter {
    P07_ColorFilter colorFilter = new P07_ColorFilter();
    @Given("user choose Apparel")
    public void choose_apparel() throws InterruptedException {
        colorFilter.Apparel_select().click();
        Thread.sleep(2000);
    }
    @And("user choose shoes subcategory")
    public void choose_shoes() throws InterruptedException {
        colorFilter.Shoes_select().click();
        Thread.sleep(2000);
    }
    @And("user filter with red color")
    public void filter_color_blue() throws InterruptedException {
        colorFilter.select_red_color().click();
        Thread.sleep(2000);
    }
    @Then("user make sure choosing the red shoes")
    public void red_shoes_confirm(){
        String expected_result="adidas Consortium Campus 80s Running Shoes";
        String actual_result=colorFilter.red_shoes().getText();
        Assert.assertTrue(expected_result.contains(actual_result));
    }
}
