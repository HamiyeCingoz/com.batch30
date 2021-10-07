package tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class C03_Locators {

    public static void main(String[] args) throws InterruptedException {
        //<a id="sign-in" class="nav-item nav-link" data-test="sign-in" href="/sign_in">Sign in</a>
        System.setProperty("webdriver.chrome.driver", "C:/Users/Hamiye`s PC/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //1. Bir class oluşturun: LocatorsIntro
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        // a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");
        // b. Sign in butonuna basin
        WebElement signInLinki=driver.findElement(By.linkText("Sign in"));
        signInLinki.click();
       // WebElement signIn=driver.findElement(By.id(""));

        // c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        Thread.sleep(2000);
        WebElement emailTextBox=driver.findElement(By.id("session_email"));
        WebElement passwordTextBox=driver.findElement(By.id("session_password"));
        WebElement signInButonu=driver.findElement(By.name("commit"));
        // d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        // i. Username : testtechproed@gmail.com
        // ii. Password : Test1234!
        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        signInButonu.click();
        // e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement dogruKullanici=driver.findElement(By.className("navbar-text"));
        String username="testtechproed@gmail.com";
        if (dogruKullanici.getText().equals(username)){
            System.out.println("dogru kullanici testi PASS");
        }else{
            System.out.println("dogru kullanici testi failed");
        }
        // f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement addressesLinki=driver.findElement(By.linkText("Addresses"));
        WebElement signOutLinki=driver.findElement(By.linkText("Sign out"));
        if (addressesLinki.isDisplayed()){
            System.out.println("adresses linki gorunuyor test passed ");
        }else {
            System.out.println("adresses linki gorunmuyor test failed");
        }
        if (signOutLinki.isDisplayed()){
            System.out.println("sign out linki gorunuyor test passed ");
        }else {
            System.out.println("sign out linki gorunmuyor test failed");
        }
        //3. Sayfada kac tane link oldugunu bulun.
        List<WebElement> links= driver.findElements(By.tagName("a"));
        System.out.println("link sayisi"+links.size());
        for (WebElement each:links
             ) {
            System.out.println(each.getText());

        }
        //linklerin yazilarini yazdiralim

    }
}
