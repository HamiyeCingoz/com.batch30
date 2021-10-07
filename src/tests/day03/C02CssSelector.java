package tests.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02CssSelector {
    public static void main(String[] args) throws InterruptedException {
        //1. Bir class oluşturun : Locators_css
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        // a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        System.setProperty("webdriver.chrome.driver","C:/Users/Hamiye`s PC/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://a.testaddressbook.com/sign_in");

        // b. Locate email textbox
        Thread.sleep(2000);
        WebElement emailTextBox=driver.findElement(By.cssSelector(".form-control"));
        emailTextBox.sendKeys("testtechproed@gmail.com");
        // c. Locate password textbox ve
        WebElement passwordTextBox=driver.findElement(By.xpath("(//input[@class='form-control'])[2]"));
        passwordTextBox.sendKeys("Test1234!");
        //WebElement passwordTextBox=driver.findElement(By.xpath("(.form-control)[2]");
        // d. Locate signin button
        WebElement submitButonu=driver.findElement(By.xpath("//input [@type='submit']"));
        submitButonu.click();
        // e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        // i. Username : testtechproed@gmail.com
        // ii. Password : Test1234!
    }

}
