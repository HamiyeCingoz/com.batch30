package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_VerifyPageUrl {
    public static void main(String[] args) {
        //Yeni bir class olusturalim : (VerifyURLTest)
        // Youtube ana sayfasina gidelim https://www.techproeducation.com/
        System.setProperty("webdriver.chrome.driver","C:/Users/Hamiye`s PC/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.techproeducation.com");
        //Sayfa URL’inin www. techproeducation.com oldugunu dogrulayin
        //System.out.println(driver.getCurrentUrl().equals("www. techproeducation.com"));
        String expectedUrl="www. techproeducation.com";
        String actuelUrl=driver.getCurrentUrl();

        if (expectedUrl.equals(actuelUrl)){
            System.out.println("test PASSED");

        }else{
            System.out.println("test FAILD");
            System.out.println("gecerli URL : "+ driver.getCurrentUrl());
        }



    driver.close();

    }
}
