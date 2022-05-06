package pl.testeroprogramowania.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    public static WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver","D:/Szkolenie_tester/Chromedriver");
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
       // WebDriverManager.firefoxdriver().setup();
        //return new FirefoxDriver();

    }
}
