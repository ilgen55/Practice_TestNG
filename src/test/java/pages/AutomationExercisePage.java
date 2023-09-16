package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutomationExercisePage {
    public AutomationExercisePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //ana sayfanın açıldığnı doğrula
    @FindBy(xpath = "//div[@class='logo pull-left']")
    public WebElement homePage;

    //product butonuha tıkla
    @FindBy(xpath = "(//li)[2]")
    public WebElement productButton;

    //login butonuna tıkla
    @FindBy(xpath = "(//li)[4]")
    public WebElement loginButton;

    //yeni kullanıcı yazısını doğrula
    @FindBy(xpath = "(//h2)[3]")
    public WebElement newUserYazisi;

    //isim kutusu
    @FindBy(xpath = "(//input)[5]")
    public WebElement nameKutusu;

    //email zaten var yazisi
    @FindBy(xpath = "//p[@style='color: red;']")
    public WebElement emailalreadyexistYazisi;

    //contact butonuna tıkla
    @FindBy(xpath = "(//li)[8]")
    public WebElement contactUsButton;

    //getintouch yazisini doğrula
    @FindBy(xpath = "(//h2)[2]")
    public WebElement getintouchYazisi;

    //contact Name kutusu
   @FindBy (xpath = "(//input)[2]")
    public WebElement contactNameKutusu;

   //dosya sec butonuna tıkla
    @FindBy (xpath = "//input[@type='file']")
    public WebElement dosyaSec;

    //submitbutonuna tıkla
    @FindBy (xpath = "//input[@name='submit']")
    public WebElement submitButton;

    //basarı mesaj yasısını doğrula
    @FindBy (xpath = "//div[@class='status alert alert-success']")
    public WebElement successYazisi;

    //ana sayfaya dön
    @FindBy (xpath = "//a[@class='btn btn-success']")
    public WebElement homeButton;

    //testCase butonuna tıkla
    @FindBy (xpath = "(//a[@class='test_cases_list'])[1]")
    public WebElement testCaseButton;

    @FindBy (xpath = "//h5")
    public WebElement testcaseYazisi;

    //tum urunler yazisini doğrula
    @FindBy (xpath = "(//h2)[3]")
    public WebElement allProductYazisi;

    @FindBy (xpath = "//ul")
    public WebElement tumurunler;

    @FindBy (xpath = "//div[@class='ns-p168l-e-14 button-common close-button']")
    public WebElement closeButton;

}
