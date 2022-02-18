package pl.testeroprogramowania.test;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pl.testeroprogramowania.pages.HomePage;

public class CeckoutTest extends BaseTest {
    @Test
    public void checkoutTest() {

new HomePage(driver).openShopPage()
                        .openProductPage("Java Selenium WebDriver")
                        .addProductToCart()
                        .viewCart()
                        .openAddressDetails();

    }

}
