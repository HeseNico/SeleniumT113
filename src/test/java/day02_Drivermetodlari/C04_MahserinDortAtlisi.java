package day02_Drivermetodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_MahserinDortAtlisi {

    public static void main(String[] args) {

        // 1- Driver icin gerekli ayarlamalari yap
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver_win32");
        // 2- webdriver olustur
        WebDriver driver=new ChromeDriver();
        // 3- windowu tam exran yap
        driver.manage().window().maximize();
        // 4- gecikmeler icin maximum bekleme suresi tanimla
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // BU 4 ADIM HERTESTIN BASINDA YAPACAGIMIZ ISLEMLERDIR
    }
}
