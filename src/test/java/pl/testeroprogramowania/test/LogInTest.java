package pl.testeroprogramowania.test;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pl.testeroprogramowania.pages.HomePage;

public class LogInTest extends BaseTest {
    @Test
    public void logInTest() {

        WebElement dashboardLink = new HomePage(driver)
                .openMyAccountPage()
                .logInValidData("test35@select.com", "test33@select.com")
                .getDashboardLink();

        Assert.assertEquals(dashboardLink.getText(), "Dashboard");

    }

    @Test
    public void logInWithInvalidPasswordTest() {
        WebElement error = new HomePage(driver)
                .openMyAccountPage()
                .logInInvalidData("test35@select.com", "test36@select.com")
                .getError();

        Assert.assertTrue(error.getText().contains("Incorrect username or password."), "Expected error is displayed");
    }
}