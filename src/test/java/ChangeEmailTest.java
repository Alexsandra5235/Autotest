import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ChangeEmailTest extends BaseTest{
    /**
     * Изменение Email с корректными параметрами
     */
    @Test
    public void correctParameters(){
        mainPage.tabSignIn();

        signInPage.fullingEmail(constants.authorizationEmail);
        signInPage.fullingPassword(constants.password);
        signInPage.tabSignIn();

        mainPage.tabDropDown();
        mainPage.tabMyAccount();

        myAccountPage.tabEdit();

        accountInformationPage.tabCheckBoxChangeEmail();
        accountInformationPage.fullingNewEmail(constants.newEmail);
        accountInformationPage.fullingCurrentPassword(constants.password);
        accountInformationPage.tabSave();

        assertTrue(signInPage.visibleMessengerSuccessChange());

        //Меняем почту обратно
        signInPage.fullingEmail(constants.newEmail);
        signInPage.fullingPassword(constants.password);
        signInPage.tabSignIn();

        mainPage.tabDropDown();
        mainPage.tabMyAccount();

        myAccountPage.tabEdit();

        accountInformationPage.tabCheckBoxChangeEmail();
        accountInformationPage.fullingNewEmail(constants.authorizationEmail);
        accountInformationPage.fullingCurrentPassword(constants.password);
        accountInformationPage.tabSave();
    }
}
