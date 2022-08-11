package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static StepDefinitions.OpenClose.driver;

public class P12_SuccessfulOrder {
    public WebElement close_upper_green_bar(){
        return driver.findElement(By.cssSelector("[title='Close']"));
    }
    public WebElement shopping_cart_click1(){
        return driver.findElement(By.cssSelector(".cart-label"));
    }
    public WebElement agreement_click2(){
        return driver.findElement(By.cssSelector("input#termsofservice"));
    }
    public WebElement checkout_click3(){
        return driver.findElement(By.cssSelector("[name='checkout']"));
    }
    public WebElement first_name4(){
        return driver.findElement(By.cssSelector("input#BillingNewAddress_FirstName"));
    }
    public WebElement last_name5(){
        return driver.findElement(By.cssSelector("input#BillingNewAddress_LastName"));
    }
    public WebElement email6() {
        return driver.findElement(By.cssSelector("#BillingNewAddress_Email"));
    }
    public WebElement company7() {
        return driver.findElement(By.cssSelector("[name='BillingNewAddress\\.Company']"));
    }
    public WebElement egypt8() {
        return driver.findElement(By.cssSelector("[value='123']"));
    }
    public WebElement city9() {
        return driver.findElement(By.cssSelector("#BillingNewAddress_City"));
    }
    public WebElement adress1_10() {
        return driver.findElement(By.cssSelector("input[name='BillingNewAddress.Address1']"));
    }
    public WebElement adress2_11() {
        return driver.findElement(By.cssSelector("[name='BillingNewAddress\\.Address2']"));
    }
    public WebElement postal_code12() {
        return driver.findElement(By.cssSelector("input#BillingNewAddress_ZipPostalCode"));
    }
    public WebElement phone_number13() {
        return driver.findElement(By.cssSelector("input#BillingNewAddress_PhoneNumber"));
    }
    public WebElement fax_number14() {
        return driver.findElement(By.cssSelector("[name='BillingNewAddress\\.FaxNumber']"));
    }
    public WebElement continue15() {
        return driver.findElement(By.cssSelector("div#billing-buttons-container > button[name='save']"));
    }
    public WebElement continue16() {
        return driver.findElement(By.cssSelector("[onclick='ShippingMethod\\.save\\(\\)']"));
    }
    public WebElement continue17() {
        return driver.findElement(By.cssSelector("[class='button-1 payment-method-next-step-button']"));
    }
    public WebElement continue18() {
        return driver.findElement(By.cssSelector("[onclick='PaymentInfo\\.save\\(\\)']"));
    }
    public WebElement confirm19() {
        return driver.findElement(By.cssSelector("[onclick='ConfirmOrder\\.save\\(\\)']"));
    }
    public WebElement confirm_message_20() {
        return driver.findElement(By.cssSelector(".center-1 .title > strong"));
    }
    public String confirmation_message(){
        return "Your order has been successfully processed!";
    }



}
