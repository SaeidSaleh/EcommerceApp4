package StepDefinitions;

import Pages.P01_Registration;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class D01_Registration {
    P01_Registration register = new P01_Registration();

    @And("user press on male checkbox.")
    public void male_checkbox() {
        register.maleCheck().click();
    }

    @And("^user enters valid first name:\"(.*)\"$")
    public void user_enters_valid_first_name(String first_name) {
        register.firstName().sendKeys(first_name);
    }

    @And("user enters valid last name:\"(.*)\"$")
    public void user_enters_valid_last_name(String last_name) {
        register.lastName().sendKeys(last_name);
    }

    @And("user select valid date of birth.")
    public void date_of_birth() {
        register.day().click();
        register.month().click();
        register.year().click();
    }

    @And ("user enters valid email address:\"(.*)\"$")
    public void user_enters_valid_email_address(String email) {register.emailAddress().sendKeys(email);}

    @And ("user enters valid password:\"(.*)\"$")
    public void user_enters_valid_password(String password) {register.password().sendKeys(password);}

    @And ("user confirm password:\"(.*)\"$")
    public void confirm_password(String password) {register.confirmPassword().sendKeys(password);}

    @And ("user enters invalid password:\"(.*)\"$")
    public void user_enters_invalid_password(String password) {register.password().sendKeys(password);}

    @And ("user reenter valid password:\"(.*)\"$")
    public void user_reenter_valid_password(String password) {register.password().sendKeys(password);}

    @And ("user reenter invalid password:\"(.*)\"$")
    public void user_reenter_invalid_passwordString(String password) {register.password().sendKeys(password);}

    @And ("user clicks on register button.")
    public void user_clicks_on_register_button() throws InterruptedException {
        register.registerButton().click();
        Thread.sleep(2000);
    }

    @Then("user could register successfully.")
    public void user_could_register_successfully() {
        String actualResult = register.registrationCompletedMsg().getText();
        String expectedResult = "Your registration completed";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }


    @Then ("user could not register successfully.")
    public void user_could_not_register_successfully() {
        String actualResult = register.passwordErrorMsg().getText();
        String expectedResult = "Password must meet the following rules:\n" +
                "must have at least 6 characters";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

}
