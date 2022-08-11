package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static StepDefinitions.OpenClose.driver;

public class P02_Login {
    public WebElement loginEmail() {return driver.findElement(By.cssSelector("input[class=\"email\"]"));}
    public WebElement loginpassword() {return driver.findElement(By.cssSelector("input[class=\"password\"]"));}
    public WebElement loginbutton() {return driver.findElement(By.cssSelector("[class=\"button-1 login-button\"]"));}
    public WebElement loginSuccess() {return driver.findElement(By.cssSelector("a[class=\"ico-logout\"]"));}
    public WebElement loginUnSuccess() {return driver.findElement(By.cssSelector(".validation-summary-errors li"));}

}
