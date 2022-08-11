package StepDefinitions;

import Pages.P04_Search;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class D04_Search {
    P04_Search search = new P04_Search();
    @And("^user uses the search text field and enters :\"(.*)\"$")
    public void search_area(String productName){search.search_area().sendKeys(productName);}
    @Then("user clicks on the search button")
    public void search_button() throws InterruptedException {
        search.search_button().click();
        Thread.sleep(2000);}

    @And("check if search success")
    public void urlOfProductPage() {
        String actualURL = OpenClose.driver.getCurrentUrl();
        String expectedURL = "https://demo.nopcommerce.com/search?q=adidas";
        Assert.assertTrue(actualURL.contains(expectedURL));
    }
    @And("user choose Apple MacBook Pro 13-inch")
    public void choose_apple_macbook() throws InterruptedException {
        search.choose_Apple_mac_pro().click();
        Thread.sleep(2000);
    }
    @And("user check if returned product with the same SKU")
    public void check_success(){
        String expected_result = "AP_MBP_13";
        String actual_result = search.check_search_success().getText();
        Assert.assertTrue(expected_result.contains(actual_result));
    }
}
