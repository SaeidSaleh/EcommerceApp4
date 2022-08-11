package StepDefinitions;

import Pages.P03_ResetPassword;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.time.Duration;

import static StepDefinitions.OpenClose.driver;

public class D03_ResetPassword {
    P03_ResetPassword resetPassword = new P03_ResetPassword();

    @When("^user enters email:\"(.*)\"$")
    public void enter_email(String email){resetPassword.email().sendKeys(email);}
    @And("user enters click recover button")
    public void click_button(){resetPassword.recover_button().click();}
    @Then("user could reset password successfully")
    public void reset_password_successfully() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        String actualResult = resetPassword.resetPasswordSuccess().getText();
        String expectedResult = "Email with instructions has been sent to you.";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Then("user should not be able to reset password")
    public void reset_with_notFound_email() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        String actualResult = resetPassword.emailNotFound().getText();
        String expectedResult = "Email not found.";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

}
