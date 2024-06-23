import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ChangeEmailTest extends BaseTest{
    /**
     * Изменение Email с корректными параметрами
     */
    @Test
    public void correctParameters(){
        mainPage.tabSignIn();

        signInPage.fullingEmail(constants.newEmail);
        signInPage.fullingPassword(constants.password);
        signInPage.tabSignIn();

        mainPage.tabDropDown();
        mainPage.tabMyAccount();

        myAccountPage.tabEdit();

        accountInformationPage.tabCheckBoxChangeEmail();
        accountInformationPage.fullingNewEmail(constants.newEmail);
        accountInformationPage.fullingPassword();
        accountInformationPage.tabSave();

        assertTrue(signInPage.visibleMessengerChangeEmail());

        //Меняем почту обратно
        signInPage.fullingEmail(constants.newEmail);
        signInPage.fullingPassword(constants.password);
        signInPage.tabSignIn();

        mainPage.tabDropDown();
        mainPage.tabMyAccount();

        myAccountPage.tabEdit();

        accountInformationPage.tabCheckBoxChangeEmail();
        accountInformationPage.fullingNewEmail(constants.authorizationEmail);
        accountInformationPage.fullingPassword();
        accountInformationPage.tabSave();
    }
}
