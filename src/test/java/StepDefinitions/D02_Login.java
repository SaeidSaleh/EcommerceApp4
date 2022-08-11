package StepDefinitions;

import Pages.P02_Login;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

//import java.time.Duration;

import static StepDefinitions.OpenClose.driver;

public class D02_Login {
    P02_Login login = new P02_Login();

    @And("^user navigates to login page:\"(.*)\"$")
    public void navigates_to_registration_url(String url) throws InterruptedException {
        driver.navigate().to(url);
        Thread.sleep(2000);}

    @When("user enters  login email")
    public void enter_email(){login.loginEmail().sendKeys("dfre300@eg.com");}
    @And("user enters login password")
    public void enter_password() throws InterruptedException {
        login.loginpassword().sendKeys("12345678sA");
        Thread.sleep(500);}
    @When("user enters invalid login email")
    public void enter_invalid_email(){login.loginEmail().sendKeys("dfre@eg.com");}
    @And("user enters invalid login password")
    public void enter_invalid_password() throws InterruptedException {
        login.loginpassword().sendKeys("123");
        Thread.sleep(500);}
    @And("user press on login button")
    public void click_login_button() throws InterruptedException {
        login.loginbutton().click();
        Thread.sleep(3000);
    }
    @Then("user could login successfully.")
    public void user_could_login_successfully() {
        String actualResult = login.loginSuccess().getText();
        String expectedResult = "Log out";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
    @Then("user could not login successfully.")
    public void user_could_not_login_successfully() {
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        String actualResult = login.loginUnSuccess().getText();
        String expectedResult = "No customer account found";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

}
