package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static StepDefinitions.OpenClose.driver;

public class P07_ColorFilter {
    public WebElement Apparel_select(){
        return driver.findElement(By.cssSelector(".notmobile [href='\\/apparel']"));
    }
    public WebElement Shoes_select(){
        return driver.findElement(By.cssSelector(".block-category-navigation [href='\\/shoes']"));
    }
    public WebElement select_red_color(){
        return driver.findElement(By.cssSelector(".color-item:nth-of-type(3) [type]"));
    }
    public WebElement red_shoes(){
        return driver.findElement(By.cssSelector("[data-productid] .details [href='\\/adidas-consortium-campus-80s-running-shoes']"));
    }


}
