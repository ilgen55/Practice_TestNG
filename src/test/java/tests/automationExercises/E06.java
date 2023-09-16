package tests.automationExercises;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ResableMethods;

public class E06 {
    @Test
    public void test01() {
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationexerciseUrl"));
        //3. Verify that home page is visible successfully
        AutomationExercisePage exercisePage=new AutomationExercisePage();
        Assert.assertTrue(exercisePage.homePage.isDisplayed());
        //4. Click on 'Contact Us' button
        exercisePage.contactUsButton.click();
        //5. Verify 'GET IN TOUCH' is visible
        Assert.assertTrue(exercisePage.getintouchYazisi.isDisplayed());

        //6. Enter name, email, subject and message
        String email=ConfigReader.getProperty("email");
        exercisePage.contactNameKutusu.sendKeys("ksm", Keys.TAB,email,Keys.TAB,"Deneme",Keys.TAB,
                "çalısmalarımız suruyor");
        ResableMethods.bekle(2);
        //7. Upload file
        // "C:\Users\Toshiba\Desktop\deneme"
        String dosyaYolu="C:\\Users\\Toshiba\\Desktop\\deneme";
        exercisePage.dosyaSec.sendKeys(dosyaYolu);
        ResableMethods.bekle(2);

        //8. Click 'Submit' button
        exercisePage.submitButton.click();
        ResableMethods.bekle(2);

        //9. Click OK button
        ResableMethods.alertAccept();
        //10. Verify success message 'Success! Your details have been submitted successfully.' is visible
        Assert.assertTrue(exercisePage.successYazisi.isDisplayed());
        //11. Click 'Home' button and verify that landed to home page successfully
        exercisePage.homeButton.click();
        Assert.assertTrue(exercisePage.homePage.isDisplayed());

        ResableMethods.visibleWait(exercisePage.homePage,15);
        // sayfayı kapatiniz
        Driver.closeDriver();
    }
}
