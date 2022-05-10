package pl.testeroprogramowania.steps;

;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import pl.testeroprogramowania.pages.HomePage;
import pl.testeroprogramowania.pages.LoggedUserPage;
import pl.testeroprogramowania.pages.MyAccountPage;
import pl.testeroprogramowania.utils.DriverFactory;


import java.util.concurrent.TimeUnit;

public class SignUpAndInStepDefs {

    protected String email;
    private LoggedUserPage loggedUserPage;


    @Given("User with unique email address")
    public void userWithUniqueEmailAddress() {
        int random = (int) (Math.random() * 1000);
        email = "test" + random + "@select.com";

    }

    @When("User registers in app")
    public void userRegistersInApp() {
        loggedUserPage = new HomePage(DriverFactory.getDriver())
                .openMyAccountPage()
                .registerUserValidData(email, "test33@select.com");
    }

    @Then("User should be redirected to logged user page")
    public void userShouldBeRedirectedToLoggedUserPage() {
        WebElement dashboardLink = loggedUserPage.getDashboardLink();
        Assert.assertEquals(dashboardLink.getText(), "Dashboard");
    }


    @Then("An error will bi displayed {string}, user ist still on login page")
    public void anErrorWillBiDisplayedUserIstStillOnLoginPage(String errors) {
        WebElement error = new MyAccountPage(DriverFactory.getDriver()).getError();
        Assert.assertTrue(error.getText().contains(errors));

    }

    @When("User logs to the application")
    public void userLogsToTheApplication() {
        loggedUserPage = new HomePage(DriverFactory.getDriver())
                .openMyAccountPage()
                .logInValidData(email, "test33@select.com");
    }

    @Given("User with existent email address {string}")
    public void userWithExistentEmailAddress(String email) {
        this.email=email;
    }
}

