package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    // dropdown'dan "Computers" optionunu secin
    @FindBy(xpath = "//select[@id='searchDropdownBox']")
    public WebElement ddm;

    // arama motoruna "Asus" yazıp aratın
    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    public WebElement aramaKutusu;

    // ikinci urunun fotografını cekin
    @FindBy(xpath = "(//img[@class='s-image'])[3]")
    public WebElement ikinciUrun;

    // sonuc yazısının aradıgımız kelimeyi icerdigini test edelim
     @FindBy(xpath = "//*[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement sonucYazisi;


}
