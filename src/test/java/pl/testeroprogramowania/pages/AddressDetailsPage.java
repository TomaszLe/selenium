package pl.testeroprogramowania.pages;

import org.bouncycastle.operator.bc.BcSignerOutputStream;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pl.testeroprogramowania.models.Customer;

public class AddressDetailsPage {
    @FindBy(id = "billing_first_name")
    private WebElement firstNameInput;

    @FindBy(id = "billing_last_name")
    private WebElement lastNameInput;

    @FindBy(id = "billing_company")
    private WebElement companyNameInput;

    @FindBy(id = "billing_country")
    private WebElement billingCountrySelect;

    @FindBy(id = "billing_address_1")
    private WebElement addressFirstInput;

    @FindBy(id = "billing_address_2")
    private WebElement addressSecondInput;

    @FindBy(id = "billing_postcode")
    private WebElement postcodeInput;

    @FindBy(id = "billing_city")
    private WebElement cityInput;

    @FindBy(id = "billing_phone")
    private WebElement phoneInput;

    @FindBy(id = "billing_email")
    private WebElement emailInput;

    @FindBy(id = "order_comments")
    private WebElement orderCommentsInput;

    @FindBy(id = "place_order")
    private WebElement placeOrderButton;


    public WebDriver driver;



    public AddressDetailsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver=driver;

    }

    public OrderDetailsPage fillAddressDetails(Customer customer, String comments){
        firstNameInput.sendKeys(customer.getFirstName());
        lastNameInput.sendKeys(customer.getLastName());
        companyNameInput.sendKeys(customer.getCompanyName());
        Select countrySelect = new Select(billingCountrySelect);
        countrySelect.selectByVisibleText(customer.getCountry());
        addressFirstInput.sendKeys(String.format("%s %s", customer.getStreet(), customer.getFlatNumber()));
        postcodeInput.sendKeys(customer.getZipCode());
        cityInput.sendKeys(customer.getCity());
        phoneInput.sendKeys(customer.getPhone());
        emailInput.sendKeys(customer.getEmail());
        orderCommentsInput.sendKeys(comments);
        placeOrderButton.click();


        return new OrderDetailsPage(driver);
    }
}
