package uk.harrow.gov.testsuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import uk.harrow.gov.pages.HomePage;
import uk.harrow.gov.pages.LoginPage;
import uk.harrow.gov.testbase.TestBase;

public class LoginTest extends TestBase {
HomePage homePage = new HomePage();
LoginPage loginPage = new LoginPage();

@Test (priority = 0, groups = {"smoke", "regression"})
    public void verifyUserIsAbleToNavigatetoLoginPage () {
    homePage.setLoginLink();
    loginPage.setWelcomeGuestText();
    SoftAssert sa = new SoftAssert();
    sa.assertTrue(loginPage.getWelcomeGuestText().contains("Welcome Guest!"));

}
}
