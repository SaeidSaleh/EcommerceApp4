package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static StepDefinitions.OpenClose.driver;

public class P05_Currency {
    public WebElement currency_list(){return driver.findElement(By.cssSelector("[name=\"customerCurrency\"]"));}
    public WebElement dollar(){return driver.findElement(By.cssSelector("select#customerCurrency > option[value^='https://demo.nopcommerce.com/changecurrency/1?returnUrl=%2Fa']"));}
    public WebElement euro(){return driver.findElement(By.cssSelector("select#customerCurrency > option[value^='https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2Fa']"));}
    public WebElement current_currency(){return driver.findElement(By.cssSelector("[class='price-value-25']"));}
    public WebElement search_area(){return driver.findElement(By.cssSelector("input[id=\"small-searchterms\"]"));}
    public WebElement search_button(){return driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));}
    public WebElement choose_adidas_campus(){return driver.findElement(By.cssSelector(".product-title [href]"));}



}
