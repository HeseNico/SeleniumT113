package day02_Drivermetodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_ilkTest {
    public static void main(String[] args) throws InterruptedException {


        // Once gerekli ayarlari yapip driver objesi olusturmaliyiz
        System.setProperty("Webdriver.chrome.driver", "src/resources/chromedriver_win32");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");
        System.out.println("Sayfa basligi : " + driver.getTitle());

        //     1. Yeni bir package olusturalim : day01
        //     2. Yeni bir class olusturalim : C03_GetMethods

        //     3. Amazon sayfasina gidelim. https://www.amazon.com/
        System.out.println("Sayfa basligi : " + driver.getTitle());

        //     4. Sayfa basligini(title) yazdirin
        System.out.println("Sayfa basligi : " + driver.getTitle());

        //     5. Sayfa basliginin “Amazon” icerdigini test edin

        //     6. Sayfa adresini(url) yazdirin
        System.out.println("Sayfa URL : " + driver.getCurrentUrl());

        //     7. Sayfa url’inin “amazon” icerdigini test edin.

        String expectedIcerik;
        expectedIcerik = "amazon";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedIcerik)) {
            System.out.println("URL Amazon iceriyor, PASSED");
        } else {
            System.out.println("URL Amazon icermiyor, FAILED");
        }


        //     8. Sayfa handle degerini yazdirin


        //     9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin

        expectedIcerik = "Amazon";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedIcerik)) {
            System.out.println("Title Amazon iceriyor, PASSED");
        } else {
            System.out.println("Title Amazon icermiyor, FAILED");
        }


        expectedIcerik = "alisveris";
        String actualPageSource = driver.getPageSource();
        if (actualPageSource.contains(expectedIcerik)) {
            System.out.println("Sayfa kaynak kodlari alisveris iceriyor, test PASSED");
        } else {
            System.out.println("Sayfa kaynak kodlari alisveris icermiyor, test FAILED");
        }

//     10. Sayfayi kapatin.
        Thread.sleep(3000);
        driver.close();


    }
}
