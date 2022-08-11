package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static StepDefinitions.OpenClose.driver;

public class P11_CompareList {
    public WebElement add_shoes_compare_list() {
        return driver.findElement(By.cssSelector(".product-essential .add-to-compare-list-button.button-2"));}
    public WebElement add_digital_storm_compare_list() {
        return driver.findElement(By.cssSelector("[data-productid='2'] [title='Add to compare list']"));
    }
    public WebElement adding_message() {
        return driver.findElement(By.cssSelector(".content [href]"));
        }
    public WebElement choose_red_shoes(){
        return driver.findElement(By.cssSelector("[data-productid] .details [href='\\/adidas-consortium-campus-80s-running-shoes']"));
        }
}