package techproed.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class RegistrationPage {

    public WebElement ssn;

    public RegistrationPage() {
        //page instances we create it refers
        PageFactory.initElements(Driver.getDriver(),this);
        // is used to instanciate the object, every single class we do it

    }
}
