package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static StepDefinitions.OpenClose.driver;

public class P08_Tag {
    public WebElement awesome_tag_select(){
        return driver.findElement(By.cssSelector("[href='\\/awesome']"));
    }
    public WebElement cool_tag_select(){
        return driver.findElement(By.cssSelector("[href='\\/cool']"));
    }
    public String awesome_url(){
        return driver.getCurrentUrl();
    }
    public String cool_url(){
        return driver.getCurrentUrl();
    }

}
