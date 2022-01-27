package pl.testeroprogramowania.test;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pl.testeroprogramowania.pages.HomePage;

public class RegisterTest extends BaseTest{
    @Test
    public void registerUserTest(){

        WebElement entryTitle = new HomePage(driver).openMyAccountPage()
        .registerUser("test34@select.com","test33@select.com").getEntryTitle();

        Assert.assertTrue(entryTitle.isDisplayed());
        Assert.assertEquals(entryTitle.getText(), "My account");

    }

}
