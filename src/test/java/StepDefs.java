import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefs {
    @Given("User with unique email address")
    public void userWithUniqueEmailAddress() {
        System.out.println("User with unique email address");
    }

    @When("User registers in app")
    public void userRegistersInApp() {
        System.out.println("User registers in app");
    }

    @Then("User should be redirected to logged user page")
    public void userShouldBeRedirectedToLoggedUserPage() {
        System.out.println("User should be redirected to logged user page");
    }

    @Given("User with existent email address")
    public void userWithExistentEmailAddress() {
        System.out.println("User with existent email address");
    }

    @Then("An error will bi displayed {string}, user ist still on login page")
    public void anErrorWillBiDisplayedUserIstStillOnLoginPage(String arg0) {
        System.out.println("An error will bi displayed, user ist still on login page");
    }
}
