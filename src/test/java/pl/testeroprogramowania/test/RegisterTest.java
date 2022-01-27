package pl.testeroprogramowania.test;

import org.testng.annotations.Test;
import pl.testeroprogramowania.pages.HomePage;

public class RegisterTest extends BaseTest{
    @Test
    public void registerUserTest(){

        new HomePage(driver).openMyAccountPage()
        .registerUser("test33@select.com","test33@select.com");
    }

}
