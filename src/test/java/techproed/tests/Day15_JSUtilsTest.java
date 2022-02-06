package techproed.tests;

import org.testng.annotations.Test;
import techproed.utilities.ConfigurationReader;
import techproed.utilities.Driver;

public class Day15_JSUtilsTest {
    @Test
    public void scrollIntoViewTest(){
        Driver.getDriver().get(ConfigurationReader.getProperty("gmi_login_url"));


    }

}
