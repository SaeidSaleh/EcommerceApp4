package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static StepDefinitions.OpenClose.driver;

public class P09_ShopingCart {
    public WebElement add_shoes_to_cart(){
        return driver.findElement(By.cssSelector("div:nth-of-type(1) > .product-item .button-2.product-box-add-to-cart-button"));
    }
    public  WebElement window_size(){
        return driver.findElement(By.cssSelector("select#product_attribute_9"));
    }
    public WebElement choose_size(){
        return driver.findElement(By.cssSelector("[data-attr-value='24']"));
    }
    public WebElement add_shoes_to_cart_2(){
        return driver.findElement(By.cssSelector(".add-to-cart-panel [data-productid]"));
    }
    public WebElement adding_message(){
        return driver.findElement(By.cssSelector(".content [href]"));
    }
    public WebElement add_digital_storm_to_cart(){
        return driver.findElement(By.cssSelector("[onclick='return AjaxCart\\.addproducttocart_catalog\\(\\\"\\/addproducttocart\\/catalog\\/2\\/1\\/1\\\"\\)\\,\\!1']"));
    }

}
