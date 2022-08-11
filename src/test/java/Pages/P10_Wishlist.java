package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static StepDefinitions.OpenClose.driver;

public class P10_Wishlist {
    public WebElement choose_shoes(){
        return driver.findElement(By.cssSelector("div:nth-of-type(1) > .product-item  h2 > a"));
    }
    public WebElement add_shoes_to_wishlist(){
        return driver.findElement(By.cssSelector("div:nth-of-type(1) > .product-item  h2 > a"));
    }
    public WebElement adding_message(){
        return driver.findElement(By.cssSelector("div#bar-notification a"));
    }
    public WebElement add_digital_storm_to_wishlist(){
        return driver.findElement(By.cssSelector("[data-productid='2'] [title='Add to wishlist']"));
    }
    public WebElement adding_camera1(){
        return driver.findElement(By.cssSelector(".notmobile [href='\\/electronics']"));
    }
    public WebElement adding_camera2(){
        return driver.findElement(By.cssSelector(".block-category-navigation [href='\\/camera-photo']"));
    }
    public WebElement add_camera_to_wishlist(){
        return driver.findElement(By.cssSelector("[data-productid='16'] [title='Add to wishlist']"));
    }

}
