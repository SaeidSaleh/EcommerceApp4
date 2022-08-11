package StepDefinitions;

import Pages.P10_Wishlist;
import io.cucumber.java.en.And;
import org.testng.Assert;

public class D10_Wishlist {
    P10_Wishlist wishlist = new P10_Wishlist();
    @And("user choose Electronics")
    public void choose_shoes() throws InterruptedException {
        wishlist.adding_camera1().click();
        Thread.sleep(1000);
    }
    @And("user choose cell camera & photos subcategory")
    public void choose_camera_and_photos() throws InterruptedException {
        wishlist.adding_camera2().click();
        Thread.sleep(1500);
    }
    @And("user add camera to wishlist")
    public void add_to_wishlist() throws InterruptedException {
        wishlist.add_camera_to_wishlist().click();
        Thread.sleep(1000);
    }
    @And("user add digital storm to wishlist")
    public void add_to_wishlist_2() throws InterruptedException {
        wishlist.add_digital_storm_to_wishlist().click();
        Thread.sleep(1000);
    }
    @And("user make sure to add product to wishlist")
    public void successful_adding(){
        String actual_result= wishlist.adding_message().getText();
        String expected_result = "wishlist";
        Assert.assertTrue(expected_result.contains(actual_result));
}
}
