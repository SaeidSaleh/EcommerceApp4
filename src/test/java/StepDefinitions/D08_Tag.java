package StepDefinitions;

import Pages.P08_Tag;
import io.cucumber.java.en.And;
import org.testng.Assert;

public class D08_Tag {
    P08_Tag tag = new P08_Tag();
    @And("user select awesome tag")
    public void awesome_tag(){
        tag.awesome_tag_select().click();
    }
    @And("user select cool tag")
    public void cool_tag(){
        tag.cool_tag_select().click();
    }
    @And("user make sure af awesome selection")
    public void confirm_awesome(){
        String expected_result="https://demo.nopcommerce.com/awesome";
        String actual_result = tag.awesome_url();
        Assert.assertTrue(expected_result.contains(actual_result));
    }
    @And("user make sure af cool selection")
    public void confirm_cool(){
        String expected_result="https://demo.nopcommerce.com/cool";
        String actual_result = tag.cool_url();
        Assert.assertTrue(expected_result.contains(actual_result));
    }
}
