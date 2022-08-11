package StepDefinitions;

import Pages.P11_CompareList;
import io.cucumber.java.en.And;
import org.testng.Assert;

public class D11_CompareList {
    P11_CompareList compareList = new P11_CompareList();

    @And("user add shoes to Compare list")
    public void add_shoes_compare_list() throws InterruptedException {
        compareList.add_shoes_compare_list().click();
        Thread.sleep(1500);
    }
    @And("user add digital storm to Compare list")
    public void add_digital_storm_compare_list() throws InterruptedException {
        compareList.add_digital_storm_compare_list().click();
        Thread.sleep(1500);
    }

    @And("user make sure to add product to Compare list")
    public void successful_adding() {
        String actual_result = compareList.adding_message().getText();
        String expected_result = "product comparison";
        Assert.assertTrue(expected_result.contains(actual_result));
    }
    @And("user choose red shoes")
    public void user_click_on_shoes() throws InterruptedException {
        compareList.choose_red_shoes().click();
        Thread.sleep(2000);
    }
}
