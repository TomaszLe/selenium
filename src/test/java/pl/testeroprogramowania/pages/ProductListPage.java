package pl.testeroprogramowania.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductListPage {

    private WebDriver driver;

    public ProductListPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public ProductPage openProductPage(String title){
        driver.findElement(By.xpath("//h2[text()='"+title+"']")).click();
        return new ProductPage(driver);
    }
}
