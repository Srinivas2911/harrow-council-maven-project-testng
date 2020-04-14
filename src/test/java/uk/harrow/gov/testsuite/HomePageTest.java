package uk.harrow.gov.testsuite;

import org.testng.annotations.Test;
import uk.harrow.gov.pages.HomePage;
import uk.harrow.gov.testbase.TestBase;

public class HomePageTest extends TestBase {
    HomePage homePage = new HomePage();

    @Test (priority = 0, groups = {"sanity"})
    public void verifyHarrowCouncilLogoIsDisplayed(){
    homePage.setIconDisplay();
    }

    @Test(priority = 1, groups = {"sanity", "smoke"})
    public void verifyLoginLinkIsDisplayed(){
        homePage.loginLinkDisplayed();
    }
    @Test (priority = 2, groups = {"smoke", "Regression"})
    public void verifyServicesLinkIsDisplayed (){
        homePage.servicesLinkDisplayed();
    }
}
