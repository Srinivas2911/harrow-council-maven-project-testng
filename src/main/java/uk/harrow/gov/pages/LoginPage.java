package uk.harrow.gov.pages;

import org.openqa.selenium.By;
import uk.harrow.gov.utility.Utility;

public class LoginPage extends Utility {

    By welcomeGuestText = By.xpath("//li[@class='navbar-text myprofile_salutation']");

    public void setWelcomeGuestText (){
        verifyThatTextIsDisplayed(welcomeGuestText, "Welcome Guest!");
    }
    public String getWelcomeGuestText (){
        return getTextFromElement(welcomeGuestText);
    }
}
