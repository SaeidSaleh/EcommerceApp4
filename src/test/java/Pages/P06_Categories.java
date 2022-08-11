package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static StepDefinitions.OpenClose.driver;

public class P06_Categories {
    public WebElement computers_category(){
        return driver.findElement(By.cssSelector(".notmobile [href='\\/computers']"));}
    public WebElement Desktops_subcategory(){
        return driver.findElement(By.cssSelector(".block-category-navigation [href='\\/desktops']"));}
    public String current_url(){
        return driver.getCurrentUrl();
    }

}
