package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {
    public static void main(String[] args) {
        //1.Yeni bir class olusturalim (Homework)
        System.setProperty("webdriver.chrome.driver","C:/Users/Hamiye`s PC/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //2.ChromeDriver kullanara, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        //oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://www.facebook.com");
        String exepectedTitel="facebook";
        String actuelTitel=driver.getTitle();
        if (exepectedTitel.equals(actuelTitel)){
            System.out.println("test passed beklenen baslik goruldu");
        }else{
            System.out.println("test faild");
            System.out.println("actuel title : "+ driver.getTitle());
        }

        //3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        //
        //yazdirin.
        String exepectedUrl="facebook";
        String actuelUrl=driver.getCurrentUrl();
        if (actuelUrl.contains(exepectedUrl)){
            System.out.println("beklenen url iceriyor");
        }else{
            System.out.println("test faild");
            System.out.println("actuel url : "+ driver.getCurrentUrl());

        }
        //
        //4.https://www.walmart.com/ sayfasina gidin.
        driver.navigate().to("https://www.walmart.com/");
        //5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String exepectedTitel2="Walmart.com";
        String actuelTitel2=driver.getTitle();
        if (exepectedTitel2.contains(actuelTitel2)){
            System.out.println("test passed"+ exepectedTitel2+"goruldu");
        }else{
            System.out.println("test faild");
            System.out.println("actuel title  : "+ driver.getTitle());
        }
        //6. Tekrar “facebook” sayfasina donun
        driver.navigate().back();
        //7. Sayfayi yenileyin
        driver.navigate().refresh();
        //8. Sayfayi tam sayfa (maximize) yapin
        driver.manage().window().maximize();
        //9.Browser’i kapatin
        driver.close();
    }
}
