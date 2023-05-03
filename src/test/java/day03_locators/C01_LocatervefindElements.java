package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class C01_LocatervefindElements {
    public static void main(String[] args) throws InterruptedException {


        // Bu 4 sart herzaman yazilir
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver_win32");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Amazon anasayfaya gidin
        driver.get("https://www.amazon.com");
        // arama kutusuna Nutella yazdirip
        /*
         NOT: Test otomasyonu yaparken bir Web elementi kullanmak istersek 2 seye ihtiyacimiz var

          1- o web elementi benzersiz olarak tarif edebilecegimiz bir Locater
          2- Bu locateri soyledigimizde bize web elemnti bulup getirecek metod

          Ornegin amazon sitesindeki arama kutusunun uniqe tarif edicisi olarak
          id="twotabsearchtextbox" kullanabiliriz
         */
       //  kaydetmek istersem bir web element data turunde bir obje olusturmaliyim
          WebElement aramaKutusuElementi= driver.findElement(By.id("twotabsearchtextbox"));
        // data turu - objenin adi       =   findElement :webelemntibulan metod
        //                                  (By:webelementi bulacagimizlocaterin turunu yazdigimiz metod
        //                                  "twotabsearchtextbox" : uniqe tarif icin id attribute degeri

        /*
          findElement() verdigimiz lactor turu ve o locator icin verdigimiz degere gore webelenti arar
          locator icin verdigimiz deger hatliysa veya
          locator stratejisinde hata yaptiysak aranan web elementi implicitlywait tanimlayamadigimiz
          maximum sure boyunca arar
          bulamadigi icin "NoSuchElementException" firlatir ve kodlari kalanini calistirmaz

        */
        aramaKutusuElementi.sendKeys("Nutella");
        // sendKeys();istenen web elemente istenen yaziyi gonderir

        // Enter tusuna basarak arama yapiniz
        aramaKutusuElementi.submit();

        // submit(); istenen web elementi uzerinde Enter tusuna basar










        Thread.sleep(7000);
        driver.close();


    }
}
