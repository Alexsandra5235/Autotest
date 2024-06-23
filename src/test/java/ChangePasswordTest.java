import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ChangePasswordTest extends BaseTest{
    /**
     * Изменение пароля с корректными параметрами
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

        accountInformationPage.tabCheckBoxChangePassword();
        accountInformationPage.fullingNewPassword(constants.invalidPassword);
        accountInformationPage.fullingCurrentPassword(constants.password);
        accountInformationPage.tabSave();

        assertTrue(signInPage.visibleMessengerSuccessChange());

        //Меняем пароль обратно
        signInPage.fullingEmail(constants.authorizationEmail);
        signInPage.fullingPassword(constants.invalidPassword);
        signInPage.tabSignIn();

        mainPage.tabDropDown();
        mainPage.tabMyAccount();

        myAccountPage.tabEdit();

        accountInformationPage.tabCheckBoxChangePassword();
        accountInformationPage.fullingNewPassword(constants.password);
        accountInformationPage.fullingCurrentPassword(constants.invalidPassword);
        accountInformationPage.tabSave();

    }
    /**
     * Изменение пароля с неверным параметром "Current Password"
     */
    @Test
    public void invalidCurrentPassword(){
        mainPage.tabSignIn();

        signInPage.fullingEmail(constants.authorizationEmail);
        signInPage.fullingPassword(constants.password);
        signInPage.tabSignIn();

        mainPage.tabDropDown();
        mainPage.tabMyAccount();

        myAccountPage.tabEdit();

        accountInformationPage.tabCheckBoxChangePassword();
        accountInformationPage.fullingNewPassword(constants.invalidPassword);
        accountInformationPage.fullingCurrentPassword(constants.invalidPassword);
        accountInformationPage.tabSave();

        assertTrue(accountInformationPage.visibleMessengerInvalidCurrentPassword());
    }
}
