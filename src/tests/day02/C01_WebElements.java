package tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebElements {
    //<input type="text" class="inputtext _55r1 _6luy" name="email" id="email" data-testid="royal_email"
    // placeholder=
    // "E-mailadres of telefoonnummer" autofocus="1" aria-label="E-mailadres of telefoonnummer">
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:/Users/Hamiye`s PC/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");

        //
      WebElement mailTextBox = driver.findElement(By.id("email"));
      mailTextBox.sendKeys("Aliseleniumcu@gmail.com");
      Thread.sleep(2000);
      mailTextBox.clear();
      WebElement mailKutusuTagNameIle=driver.findElement(By.tagName("input"));
      //mailKutusuTagNameIle.sendKeys("veliGocer@gmail.com");
//input tagname i ile 6 tane webelement oldugundan hangisine yazacagina karar veremiyor
        //webelementi buldugu icin noSouhElementException vermez
        //WebElement yanlisElement=driver.findElement(By.id("emailYanlis"));


        /// NoSuchElementException = locatorsda hata var demektir

        // giris yap buttonuna tiklayalim
        WebElement girisButonu=driver.findElement(By.tagName("button"));
        System.out.println(girisButonu.isEnabled());
        girisButonu.click();


    }
}
