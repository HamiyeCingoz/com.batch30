package tests.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Xpath {
    //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
    //2- Add Element butonuna basin
    //3- Delete butonu’nun gorunur oldugunu test edin
    //4- Delete tusuna basin
    //5- Delete butonunun gorunur olmadigini test edin
    // eger butona bastigimizda html kodundaki satir da siliniyorsa
    //driver in o elemente ulasmasi mumkun olmayacagindan
    // varligini ya da yoklugunu test etmemeiz mumkun olmaz
    //var olan bir element bu sekilde silindikten sonra locate etmeye calisirsak
    //staleelementreferanceexecption aliriz
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/Hamiye`s PC/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        Thread.sleep(2000);
        // WebElement addButonu= driver.findElement(By.tagName("button"));
        //WebElement addButonu= driver.findElement(By.xpath("//button"));
        //WebElement addButonu= driver.findElement(By.xpath("//button[text()='Add Element']"));
        //WebElement addButonu= driver.findElement(By.xpath("//*[text()='Add Element']"));
        WebElement addButonu= driver.findElement(By.xpath("//button[@onclick='addElement()']"));
         addButonu.click();
         WebElement deleteButonu=driver.findElement(By.xpath("//button[@onclick='deleteElement()']"));
         if (deleteButonu.isDisplayed()){
             System.out.println("delete butonu testi passed");
         }else{
             System.out.println("delete buttonu testi failed");
         }
         deleteButonu.click();
    }
}
