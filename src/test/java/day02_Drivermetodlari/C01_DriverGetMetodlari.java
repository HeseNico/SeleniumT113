package day02_Drivermetodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverGetMetodlari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver_win32");
        // sisteme webdriverin ne olacagini ve bu driverin hangi dosya yolunnda oldugunu soyler
        WebDriver driver=new ChromeDriver();
        // bilgisayarimizdaki Chrome browserin otomazyonla calisavck bir kopyasini olusturur
        // Chrome disinda bir browser kullanmak istesek o brpwserin driverini indirip
        //  System.setProperty("Webdriver.safari.driver","safarinin driverin dosya yolu");

        // olusturdugumuz driver objesi bizim elimiz gozumuzdur gibidir

        driver.get("https://www.amazon.com"); // istenen URL bizi goturur . www olmasada goturur
                                              // www olmasada goturur ama https olmazsa olmaz


        System.out.println(driver.getTitle()); // bize title dondurur
        // Amazon.com. Spend less. Smile more.

        System.out.println(driver.getCurrentUrl()); // Gidilen URL dondurur getirir yani
        // https://www.amazon.com/


        System.out.println(driver.getPageSource());
        // gidilen web sayfasinin kaynak notlarini dondurur

        System.out.println(driver.getWindowHandle());
        // acilan herbir pencereye uniqe hash code degeridir
        // bunu bi daha calistirirsam farkli deger verir

        System.out.println(driver.getWindowHandles());
        // eger driver calisirken birden fazala pencere veya teb olusturduysa
        // acilan tum windows veya tab lerin uniqe has codlarini bir set olarak doondurur.




        Thread.sleep(5000); // 5 saniye ekran acik kalir ve kapatir
        driver.close(); // acilan browseri kapatir
    }
}
