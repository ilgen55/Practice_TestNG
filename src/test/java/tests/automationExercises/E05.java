package tests.automationExercises;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;

public class E05 {
    @Test
    public void test01() {
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationexerciseUrl"));
        //3. Verify that home page is visible successfully
        AutomationExercisePage exercisePage=new AutomationExercisePage();
        Assert.assertTrue(exercisePage.homePage.isDisplayed());

        //4. Click on 'Signup / Login' button
        exercisePage.loginButton.click();
        //5. Verify 'New User Signup!' is visible
        Assert.assertTrue(exercisePage.newUserYazisi.isDisplayed());
        //6. Enter name and already registered email address
        //7. Click 'Signup' button
        String email=ConfigReader.getProperty("email");
        exercisePage.nameKutusu.sendKeys("ksm", Keys.TAB,email,Keys.ENTER);
        //8. Verify error 'Email Address already exist!' is visible
        Assert.assertTrue(exercisePage.emailalreadyexistYazisi.isDisplayed());
    }
}
