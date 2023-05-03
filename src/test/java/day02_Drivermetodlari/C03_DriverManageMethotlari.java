package day02_Drivermetodlari;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_DriverManageMethotlari {

    public static void main(String[] args) throws InterruptedException {

        /*
         Selenium 4.7 versiyonu ile kendi driverini sisteme ekledi.
         Kodlar calismaya basladiginda biz driver icin yol gostermezsek selenium kendi driverine devreeye sokuyor
         ama baslangicta driiver ayari ardiginda biraz yavas calisir

         driver.manage().window(). istenen ayar ile windowsumuxzu istedigimiz boyuta getirir
         veya windowu konum ve buyukluk bilgilerine ulasabiliriz

         biz genelde teste baslamadan once
         windowu maximize etmeyi tercic ederiz
         cunku bazi web sayfasinda bazi butoonlar gorunmeyebilir. oyuzden maximize yapmaliyiz
        */

        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        /*
        implicitlyWait bir web syfasi acilincaya veya aradigimiz elementler bulununcaya kadar driverin
        bekleyecegi maximum sureyi belirler.
        15 cn boyunca sayfa veya aradimizi urunlerin acilmasini bekler acilmazsa hata verir acilmiyor diye


         */

        driver.get("https://www.amazon.com");

        System.out.println("Baslangicta konum : " + driver.manage().window().getPosition()); // Baslangicta konum : (9, 9)
        System.out.println("Baslangicta boyut : " + driver.manage().window().getSize()); // Baslangicta boyut : (1051, 798)

        System.out.println("==============");
        Thread.sleep(1000);

        driver.manage().window().maximize();
        System.out.println("Baslangicta konum : " + driver.manage().window().getPosition()); // Baslangicta konum : (-8, -8)
        System.out.println("Baslangicta boyut : " + driver.manage().window().getSize()); // Baslangicta boyut : (1552, 832)

        System.out.println("==============");
        Thread.sleep(1000);

        driver.manage().window().fullscreen();
        System.out.println("Baslangicta konum : " + driver.manage().window().getPosition()); // Baslangicta konum : (0, 0)
        System.out.println("Baslangicta boyut : " + driver.manage().window().getSize()); // Baslangicta boyut : (1536, 864)

        System.out.println("==============");
        Thread.sleep(1000);

        driver.manage().window().minimize();
        System.out.println("Baslangicta konum : " + driver.manage().window().getPosition()); //
        System.out.println("Baslangicta boyut : " + driver.manage().window().getSize()); //


        // pencereyi istedigimiz boyut ve konuma getirelim

        driver.manage().window().setPosition(new Point(50,50));
        driver.manage().window().setSize(new Dimension(500,500));

        Thread.sleep(1000);
        System.out.println("Istedigimiz konum : " + driver.manage().window().getPosition()); //
        System.out.println("istedigimiz boyut : " + driver.manage().window().getSize()); //



        Thread.sleep(3000);
        driver.close();
    }
}
