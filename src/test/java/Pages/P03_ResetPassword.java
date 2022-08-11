package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static StepDefinitions.OpenClose.driver;

public class P03_ResetPassword {
    public WebElement email(){return driver.findElement(By.cssSelector("input[class=\"email\"]"));}
    public WebElement recover_button(){return driver.findElement(By.cssSelector("button[name=\"send-email\"]"));}
    public WebElement resetPasswordSuccess() { return driver.findElement(By.cssSelector("p[class=\"content\"]"));}
    public WebElement emailNotFound() {return driver.findElement(By.cssSelector("div[class=\"bar-notification error\"] > p[class=\"content\"]"));}
}
