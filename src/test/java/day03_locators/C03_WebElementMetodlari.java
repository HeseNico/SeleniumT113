package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_WebElementMetodlari {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.drive","src/resources/chromedriver_win32");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Amazon a gidip arama kutusunu locate edelim

        driver.get("htpps://www.amazon.com");
        WebElement aramaKutusuElementi= driver.findElement(By.id("twotabsearchtexbox"));

        System.out.println(aramaKutusuElementi.isDisplayed()); // true
        System.out.println(aramaKutusuElementi.isEnabled()); // true
        System.out.println(aramaKutusuElementi.getText());
        // arama kutusu uzerinde hiclik olur her elementin uzerinde olmak zorunda degildir ama varsa getirir
        aramaKutusuElementi.sendKeys("Nutella");
        Thread.sleep(2000);
        aramaKutusuElementi.clear();

        Thread.sleep(3000);
        driver.close();
    }
}
