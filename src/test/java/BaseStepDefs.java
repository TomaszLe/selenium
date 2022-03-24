import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import pl.testeroprogramowania.models.Customer;
import pl.testeroprogramowania.utils.DriverFactory;

import java.util.concurrent.TimeUnit;

public class BaseStepDefs {



    @Before
    public void setup() {
        DriverFactory.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        DriverFactory.getDriver().manage().window().maximize();
        DriverFactory.getDriver().get("http://seleniumdemo.com");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}

