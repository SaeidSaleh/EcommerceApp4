package StepDefinitions;

import Pages.P06_Categories;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.testng.Assert;

public class D06_Categories {
    P06_Categories categories = new P06_Categories();

    @Given("user select Computers Category")
    public void Category_computers_select() throws InterruptedException {
        categories.computers_category().click();
        Thread.sleep(2000);
    }
    @And("user select Desktops subcategory")
    public void Subcategory_desktops_select() throws InterruptedException {
        categories.Desktops_subcategory().click();
        Thread.sleep(2000);
    }
    @And("make sure the select success1")
    public void Selection_success1(){
        String expected_result = "https://demo.nopcommerce.com/desktops";
        String actual_result = categories.current_url();
        Assert.assertTrue(expected_result.contains(actual_result));
    }

    @And("make sure the select success2")
    public void Selection_success2(){
        String expected_result = "https://demo.nopcommerce.com/shoes";
        String actual_result = categories.current_url();
        Assert.assertTrue(expected_result.contains(actual_result));
    }

}
