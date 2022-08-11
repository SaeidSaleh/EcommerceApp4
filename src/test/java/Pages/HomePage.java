package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {


    @FindBy(xpath = "//div[@class='nivoSlider']/a[1]")
    WebElement Nokia;

    @FindBy(xpath = "//div[@class='nivo-controlNav']/a[2]")
    WebElement iphone_Selector;

    @FindBy(xpath = "//div[@class='nivoSlider']/a[2]")
    WebElement iphone;

    @FindBy(css = "li.facebook")
    WebElement facebookIcon;

    @FindBy(css = "li.twitter")
    WebElement twitterIcon;

    @FindBy(css = "li.rss")
    WebElement rssIcon;

    @FindBy(css = "li.youtube")
    WebElement youtubeIcon;


    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public WebElement Nokia() {
        return Nokia;
    }

    public WebElement Iphone_Selector() {
        return iphone_Selector;
    }

    public WebElement Iphone() {
        return iphone;
    }

    public WebElement FacebookIcon() {
        return facebookIcon;
    }

    public WebElement TwitterIcon() {
        return twitterIcon;
    }

    public WebElement RssIcon() {
        return rssIcon;
    }

    public WebElement YoutubeIcon() {
        return youtubeIcon;
    }

}
