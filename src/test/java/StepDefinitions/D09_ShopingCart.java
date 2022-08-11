package StepDefinitions;

import Pages.P09_ShopingCart;
import io.cucumber.java.en.And;
import org.testng.Assert;

public class D09_ShopingCart {
    P09_ShopingCart shopingCart = new P09_ShopingCart();
    @And("user add shoes to cart first step")
    public void add_to_cart1() throws InterruptedException {
        shopingCart.add_shoes_to_cart().click();
        Thread.sleep(2000);
    }
    @And("user choose size")
    public void choose_size() throws InterruptedException {
        shopingCart.window_size().click();
        Thread.sleep(500);
        shopingCart.choose_size().click();
        Thread.sleep(2000);
    }
    @And("user add shoes to cart final step")
    public void add_to_cart2() throws InterruptedException {
        shopingCart.add_shoes_to_cart_2().click();
        Thread.sleep(2000);
    }
    @And("user make sure to add product to cart")
    public void successful_adding(){
        String actual_result= shopingCart.adding_message().getText();
        String expected_result = "shopping cart";
        Assert.assertTrue(expected_result.contains(actual_result));
    }
    @And("user add digital storm to cart")
    public void add_digital_to_cart() throws InterruptedException {
        shopingCart.add_digital_storm_to_cart().click();
        Thread.sleep(2000);
    }
}
