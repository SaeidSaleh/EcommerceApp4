package StepDefinitions;

import Pages.P12_SuccessfulOrder;
import io.cucumber.java.en.And;
import org.testng.Assert;

public class D12_SuccessfulOrder {
    P12_SuccessfulOrder user = new P12_SuccessfulOrder();
    @And("user click on shopping cart")
    public void shopping_cart() throws InterruptedException {
        user.close_upper_green_bar().click();
        Thread.sleep(1000);
        user.shopping_cart_click1().click();
        Thread.sleep(2000);
    }
    @And("user agree on terms and conditions")
    public void agreement() throws InterruptedException {
        user.agreement_click2().click();
        user.checkout_click3().click();
        Thread.sleep(2000);
    }
    @And("user enter shopping data")
    public void shopping_data() throws InterruptedException {
        user.first_name4().clear();
        user.first_name4().sendKeys("saeid");
        user.last_name5().clear();
        user.last_name5().sendKeys("saleh");
        user.email6().clear();
        user.email6().sendKeys("saeed14@eg.com");
        user.company7().sendKeys("SAS");
        user.egypt8().click();
        user.city9().sendKeys("kom hamada");
        user.adress1_10().sendKeys("shabour");
        user.adress2_11().sendKeys("west");
        user.postal_code12().sendKeys("11511");
        user.phone_number13().sendKeys("01228603916");
        user.fax_number14().sendKeys("25469872");
        user.continue15().click();
        Thread.sleep(2500);
    }
    @And("user press continue 3 times one by one")
    public void continue_press_3_times() throws InterruptedException {
        user.continue16().click();
        Thread.sleep(2000);
        user.continue17().click();
        Thread.sleep(2000);
        user.continue18().click();
        Thread.sleep(2000);
    }
    @And("user confirm order")
    public void confirm_order() throws InterruptedException {
        user.confirm19().click();
        Thread.sleep(4000);
    }
    @And("user make sure of making order")
    public void confirmation(){
        String expect_result = user.confirmation_message();
        String actual_result = user.confirm_message_20().getText();
        Assert.assertTrue(expect_result.contains(actual_result));
    }
}
