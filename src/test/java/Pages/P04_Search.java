package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static StepDefinitions.OpenClose.driver;

public class P04_Search {
    public WebElement search_area1(){return driver.findElement(By.cssSelector("input[id=\"small-searchterms\"]"));}
    public WebElement search_area2(){return driver.findElement(By.cssSelector("input[id=\"small-searchterms\"]"));}
    public WebElement search_button(){return driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));}
    public WebElement choose_Apple_mac_pro(){return driver.findElement(By.cssSelector(".product-title [href]"));}
    public WebElement check_search_success(){return driver.findElement(By.cssSelector("[id='sku-4']"));}
}
