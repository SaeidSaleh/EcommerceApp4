package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static StepDefinitions.OpenClose.driver;

public class P01_Registration {

    public WebElement maleCheck() {return driver.findElement(By.id("gender-male"));}
    public WebElement firstName() {return driver.findElement(By.id("FirstName"));}
    public WebElement lastName() {return driver.findElement(By.id("LastName"));}

    public WebElement day() {
        return driver.findElement(By.cssSelector("select[name=\"DateOfBirthDay\"] > option[value=\"26\"]"));}

    public WebElement month() {
        return driver.findElement(By.cssSelector("select[name=\"DateOfBirthMonth\"] > option[value=\"2\"]"));}

    public WebElement year() {
        return driver.findElement(By.cssSelector("[value=\"1993\"]"));}

    public WebElement emailAddress() {
        return driver.findElement(By.cssSelector("div[class=\"inputs\"] > input[type=\"email\"]"));}

    public WebElement password() {return driver.findElement(By.id("Password"));}

    public WebElement confirmPassword() {return driver.findElement(By.id("ConfirmPassword"));}

    public WebElement registerButton() {
        return driver.findElement(By.cssSelector("button[name=\"register-button\"]"));}

    public WebElement registrationCompletedMsg() {
        return driver.findElement(By.cssSelector("div[class=\"result\"]"));}

    public WebElement passwordErrorMsg() {return driver.findElement(By.id("Password-error"));}
}
