package pl.testeroprogramowania.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressDetailsPage {
    @FindBy(id = "billing_first_name")
    private WebElement firstNameInput;

    @FindBy(id = "billing_last_name")
    private WebElement lastNameInput;

    @FindBy(id = "billing_company")
    private WebElement companyNameInput;

    @FindBy(id = "select2-billing_country-container")
    private WebElement countrySelect;

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
        this.driver=driver
    }
}
