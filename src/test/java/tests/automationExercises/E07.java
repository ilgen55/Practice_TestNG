package tests.automationExercises;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;

public class E07 {
    @Test
    public void test01() {
        //Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("automationexerciseUrl"));
        //3. Verify that home page is visible successfully
        AutomationExercisePage exercisePage=new AutomationExercisePage();
        Assert.assertTrue(exercisePage.homePage.isDisplayed());
        //4. Click on 'Test Cases' button
        exercisePage.testCaseButton.click();
        //5. Verify user is navigated to test cases page successfully
        Assert.assertTrue(exercisePage.testcaseYazisi.isDisplayed());

    }
}
