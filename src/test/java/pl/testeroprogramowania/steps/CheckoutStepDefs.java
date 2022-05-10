package pl.testeroprogramowania.steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import pl.testeroprogramowania.models.Customer;
import pl.testeroprogramowania.pages.*;
import pl.testeroprogramowania.utils.DriverFactory;

import java.util.concurrent.TimeUnit;

public class CheckoutStepDefs  {

    private Customer customer;
    private CartPage cartPage;
    private OrderDetailsPage orderDetailsPage;
    private ProductListPage productListPage;


    @Given("User on shop homepage")
    public void userOnShopHomepage() {
        customer = new Customer();
        customer.setEmail("testowymail@sejm.pl");
       productListPage = new HomePage(DriverFactory.getDriver()).openShopPage();
    }

    @When("User selects {string} product")
    public void userSelectsProduct(String productName) {
        cartPage = productListPage.openProductPage(productName)
                .addProductToCart()
                .viewCart();
    }


    @And("User fills address details")
    public void userFillsAddressDetails() {
        orderDetailsPage = cartPage.openAddressDetails()
                .fillAddressDetails(customer, "Randomcomment");
    }

    @Then("User should be redirected to thank you page")
    public void userShouldBeRedirectedToThankYouPage() {
        Assert.assertEquals(orderDetailsPage.getOrderNotice().getText(), "Thank you. Your order has been received.");
        Assert.assertEquals(orderDetailsPage.getProductName().getText(), "Java Selenium WebDriver × 1");
    }


}
