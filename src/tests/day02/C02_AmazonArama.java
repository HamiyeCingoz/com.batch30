package tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_AmazonArama {
    public static void main(String[] args) {
        // amazon web sayfasina gidip java icin arama yapin ve bulunan sonuc sayisini yazdirin

        //<input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off" placeholder=""
        // class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Zoeken">
        System.setProperty("webdriver.chrome.driver","C:/Users/Hamiye`s PC/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.com");
        WebElement arama=driver.findElement(By.id("twotabsearchtextbox"));
        arama.sendKeys("java"+ Keys.ENTER);

        WebElement sonucYazisi=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[1]"));
        System.out.println(sonucYazisi.getText());
        //webelement ler obje oldugu icin direkt yazdirilamazlar
        // webelementin sahip oldugu yaziyi string olarak yazdirmak icin
        //getText methodu kullanilir

    }
}
