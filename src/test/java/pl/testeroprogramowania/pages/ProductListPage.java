package pl.testeroprogramowania.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pl.testeroprogramowania.utils.SeleniumHelper;

public class ProductListPage {

    private WebDriver driver;

    public ProductListPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public ProductPage openProductPage(String title){
        By productXpath = By.xpath("//h2[text()='"+title+"']");
        SeleniumHelper.waitForClckable(productXpath, driver);
        driver.findElement(productXpath).click();
        return new ProductPage(driver);
    }
}
