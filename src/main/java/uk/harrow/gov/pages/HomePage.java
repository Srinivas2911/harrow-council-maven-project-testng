package uk.harrow.gov.pages;

import org.openqa.selenium.By;
import uk.harrow.gov.utility.Utility;

public class HomePage extends Utility {

    By iconDisplay = By.xpath("//span[@class='icon icon-logo identity__logo-desktop']");
    By loginLink = By.xpath("//span[@class='icon-fallback']");
    By servicesLink = By.xpath("//span[@class='button__text'][contains(text(),'Services')]");

    public void setIconDisplay(){
        verifyThatElementIsDisplayed(iconDisplay);
    }

    public void loginLinkDisplayed(){
verifyThatElementIsDisplayed(loginLink);
    }

    public void servicesLinkDisplayed(){
        verifyThatElementIsDisplayed(servicesLink);
    }
    public void setLoginLink(){
        clickOnElement(loginLink);
    }

    public void setServicesLink(){
        clickOnElement(servicesLink);
    }
}
