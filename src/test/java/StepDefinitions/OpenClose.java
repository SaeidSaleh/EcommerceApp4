package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenClose {
    public static WebDriver driver = null;

    @And("user navigates to registration page:\"(.*)\"$")
    public void navigates_to_registration_url(String url) throws InterruptedException {
        OpenClose.driver.navigate().to(url);
        Thread.sleep(2000);
    }

    @Before
    public void open_chrome() throws InterruptedException {
        String chromePath = System.getProperty("user.dir")+"\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromePath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(1000);
    }
   @After
    public void close_browser() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();}
}
