package tests.automationExercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ResableMethods;

import java.util.List;

public class E08 {
    @Test
    public void test01() {
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationexerciseUrl"));
        //3. Verify that home page is visible successfully
        AutomationExercisePage exercisePage = new AutomationExercisePage();
        Assert.assertTrue(exercisePage.homePage.isDisplayed());
        //4. Click on 'Products' button
        exercisePage.productButton.click();
        ResableMethods.bekle(2);
        ResableMethods.click(exercisePage.closeButton);
        ResableMethods.bekle(2);
        //5. Verify user is navigated to ALL PRODUCTS page successfully
         Assert.assertTrue(exercisePage.allProductYazisi.isDisplayed());
        //6. The products list is visible
        //7. Click on 'View Product' of first product
        List<WebElement> urunlerListesi = Driver.getDriver().findElements(By.xpath("//ul"));
        urunlerListesi.get(6).click();
        //8. User is landed to product detail page
        //9. Verify that detail detail is visible: product name, category, price, availability, condition, brand
    }
}
