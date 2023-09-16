package tests.day01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class C01_Priority {
    WebDriver driver;
    // amazon isimli bir test methodu olusturunuz. Ve amazona gidiniz

    // bestbuy isimli bir test methodu olusturunuz. Ve bestbuy'a gidiniz
    // techproeducation isimli bir test methodu olusturunuz. Ve techproeducation'a gidiniz

    // once techproeducation, sonra amazon, sonra bestbuy test methodu calısacak sekilde sıralama yapınız


    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @Test(priority = 2)
    public void amazonTesti() {
        driver.get("https://www.amazon.com");
    }

    @Test(priority = 1)
    public void bestBuyTesti() {
        driver.get("https://www.bestbuy.com");
    }

    @Test
    public void techproeducation() {
        driver.get("https://www.techproeducation.com");
    }
    /*
    TestNG, test methodlarını isim sırasına gore calıstırır.
    Eger isim sıralamasının dısında bir sıralama ile calısmasını isterseniz
    o zaman test methodlarına öncelik(priorty) tanımlayabiliriz.

    priority kucukten buyuge gore calısır
    eger bir test methoduna priority degeri atanmamıssa
    default olarak priority=0 kabul edilir.
     */
}
