package tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork {
    public static void main(String[] args) throws InterruptedException {
        //1. Bir class oluşturun : AmazonSearchTest
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        // a.google web sayfasına gidin. https://www. amazon.com/
        System.setProperty("webdriver.chrome.driver","C:/Users/Hamiye`s PC/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.navigate().to(" https://www.amazon.com/");
        // b. Search(ara) “city bike”
        WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
        Thread.sleep(2000);
        search.sendKeys("city bike");
        search.submit();
        // c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        WebElement sonucSayisi=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[1]"));
        System.out.println("sonuc sayisi : "+sonucSayisi.getText());
        // d. “Shopping” e tıklayın.
        WebElement sell=driver.findElement(By.linkText("Sell"));
        sell.click();
        // e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.

    }
}


//<a href="/b/?_encoding=UTF8&amp;ld=AZUSSOA-sell&amp;node=12766669011&amp;ref_
// =nav_cs_sell_9321d964d1ab428b8d83e204c043fc01" class="nav-a
// " tabindex="0" data-csa-c-type="link" data-csa-c-slot-id="nav_cs_4"
// data-csa-c-content-id="nav_cs_sell_9321d964d1ab428b8d83e204c043fc01"
// data-csa-c-id="x9aptp-nb2fo8-iyq9os-m3jodt">Sell</a>