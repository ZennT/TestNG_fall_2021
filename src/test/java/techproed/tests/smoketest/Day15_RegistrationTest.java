package techproed.tests.smoketest;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import techproed.pages.RegistrationPage;
import techproed.utilities.ConfigurationReader;
import techproed.utilities.Driver;

public class Day15_RegistrationTest {

    // RegistrationPage registrationPage = new RegistrationPage();

    RegistrationPage registrationPage;

    @Test
    public void registrationTest(){
//        not pom
//        Driver.getDriver().get("https://www.gmibank.com/account/register");

        registrationPage = new RegistrationPage();

        Driver.getDriver().get(ConfigurationReader.getProperty("gmi_registration_url"));



//         this is not page object model, this is not reusable, this line is specific to this class
        Driver.getDriver().findElement(By.id("ssn")).sendKeys("111111111");
        //        HOMEWORK : complete the test of the test case
//        Enter all fields and click register
//        Create page objects in the page class
//        Then use it in the test class
//        DO MANUAL TESTING FIRST

        //        Driver.getDriver().findElement(By.id("ssn")).sendKeys("111111111");
        registrationPage.ssn.sendKeys("111111111");
//        HOMEWORK : complete the test of the test case
//        Enter all fields and click register
//        Create page objects in the page class
//        Then use it in the test class
//        DO MANUAL TESTING FIRST
    }

    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }
}





