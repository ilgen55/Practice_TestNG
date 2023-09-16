package tests.day02;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.IdherokuPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Tekrar01 {
    @DataProvider
    public static Object[][] emailler() {
        return new Object[][]{{"ksm@gmail.com","123455667"},{"fsm@gmail.com","09876543"},{"tsm@gmail.com","6565656565"}};
    }

    @Test(dataProvider = "emailler")
    public void test01(String email,String password) {
        //id.heroku adreine gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("idheroku"));
        // dataprovider ile birden çok yanlıs mail ve passwor ile giriş yapmaya çalısınız
        IdherokuPage herokuPage=new IdherokuPage();
        herokuPage.email.sendKeys(email, Keys.TAB,password,Keys.ENTER);

        String expectedText="There was a problem with your login.";
        String actualText=herokuPage.uyariYazisi.getText();
        Assert.assertEquals(expectedText,actualText);
        System.out.println(actualText);

    }
}
