package StepDefinitions;

import Pages.P05_Currency;
import io.cucumber.java.en.And;
import org.testng.Assert;

public class D05_Currency {
    P05_Currency currency = new P05_Currency();

    @And("user search for adidas")
    public void search_for_adidas() throws InterruptedException {
        currency.search_area().sendKeys("adidas");
        Thread.sleep(500);
        currency.search_button().click();
        Thread.sleep(2000);
    }
    @And("user choose adidas Consortium Campus 80s Running Shoes")
    public void choose_adidas_campus_80s() throws InterruptedException {
        currency.choose_adidas_campus().click();
        Thread.sleep(2000);
    }

    @And("user press on currency list")
    public void currency_list() throws InterruptedException {
        currency.currency_list().click();
        Thread.sleep(1000);
    }

    @And("user chooses Euro currency")
    public void euro_select() throws InterruptedException {
        currency.euro().click();
        Thread.sleep(1500);
    }

    @And("user make sure the adidas price in euro")
    public void assert_euro_currency(){
        String expected_result=currency.current_currency().getText();
        String part_of_actual_Result= "€";
        Assert.assertTrue(expected_result.contains(part_of_actual_Result));
    }

    @And("user chooses Dollar currency")
    public void dollar_select() throws InterruptedException {
        currency.dollar().click();
        Thread.sleep(1500);
    }

    @And("user make sure the adidas price in dollar")
    public void assert_dollar_currency(){
        String expected_result=currency.current_currency().getText();
        String part_of_actual_Result= "$";
        Assert.assertTrue(expected_result.contains(part_of_actual_Result));
    }

}
