package day01_driverOlusturma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebDriverilkClass {

    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver_win32");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");

    }
}
