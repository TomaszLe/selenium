import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pl.testeroprogramowania.pages.HomePage;
import pl.testeroprogramowania.pages.LoggedUserPage;
import pl.testeroprogramowania.pages.MyAccountPage;
import pl.testeroprogramowania.utils.DriverFactory;

import java.util.concurrent.TimeUnit;

public class StepDefs {

    private WebDriver driver;
    private String email;

    @Before
    public void setup() {
        driver = DriverFactory.getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://seleniumdemo.com");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Given("User with unique email address")
    public void userWithUniqueEmailAddress() {
        int random = (int) (Math.random() * 1000);
        email = "test" + random + "@select.com";

    }

    @When("User registers in app")
    public void userRegistersInApp() {
        new HomePage(driver)
                .openMyAccountPage()
                .registerUserValidData(email, "test33@select.com")
                .getDashboardLink();
    }

    @Then("User should be redirected to logged user page")
    public void userShouldBeRedirectedToLoggedUserPage() {
        WebElement dashboardLink = new LoggedUserPage(driver).getDashboardLink();
        Assert.assertEquals(dashboardLink.getText(), "Dashboard");
    }

    @Given("User with existent email address")
    public void userWithExistentEmailAddress() {
        email="test1@select.com";
    }

    @Then("An error will bi displayed {string}, user ist still on login page")
    public void anErrorWillBiDisplayedUserIstStillOnLoginPage(String arg0) {
        WebElement error = new MyAccountPage(driver).getError();
        Assert.assertTrue(error.getText().contains(" An account is already registered with your email address"));

    }
}
