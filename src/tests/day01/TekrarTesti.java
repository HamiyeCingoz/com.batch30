package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TekrarTesti {
    public static void main(String[] args) {


        //1. Yeni bir class olusturun (TekrarTesti)
        System.setProperty("webdriver.chrome.driver", "C:/Users/Hamiye`s PC/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın
        driver.get("https://www.youtube.com");
        String exepectedTitel="youtube";
        String actuelTitel=driver.getTitle();
        if (exepectedTitel.equals(actuelTitel)){
            System.out.println("test passed");
        }else{
            System.out.println("test faild");

        //(verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
            System.out.println("actuel titel : "+driver.getTitle());
        }
        //3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru
        //URL'yi yazdırın.
        String exepectedUrl="youtube";
        String actuelUrl=driver.getCurrentUrl();
        if (exepectedTitel.contains(actuelTitel)){
            System.out.println("beklenen url iceriyor");
        }else{
            System.out.println("test faild");
            System.out.println("actuel url : "+ driver.getCurrentUrl());

        }
        //4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");
        //5. Youtube sayfasina geri donun
        driver.navigate().back();
        //6. RefrSayfayi yenileyin
        driver.navigate().refresh();
        //7. Amazon sayfasina donun
        driver.navigate().forward();
        //8. Sayfayi tamsayfa yapin
        driver.manage().window().maximize();
        //9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa
        //doğru başlığı(Actual Title) yazdırın.
        String exepectedTitel2="Amazon";
        String actuelTitel2=driver.getTitle();
        if (exepectedTitel2.contains(actuelTitel2)){
            System.out.println("test passed");
        }else{
            System.out.println("test faild");
            System.out.println("actuel title : "+ driver.getTitle());
        }
        //10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        //URL'yi yazdırın
        String exepectedUrl2="https://www.amazon.com/";
        String actuelUrl2=driver.getCurrentUrl();
        if (exepectedUrl2.equals(actuelUrl2)){
            System.out.println("test passed beklenen url goruldu ");
        }else{
            System.out.println("test faild");
            System.out.println("beklenen url : "+ driver.getCurrentUrl());

        }
        //11.Sayfayi kapatin
        driver.close();
    }
}