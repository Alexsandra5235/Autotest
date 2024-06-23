import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CreateAnAccountTest extends BaseTest{
    /**
     * Создание аккаунта с корректными параметрами
     */
    @Disabled
    @Test
    public void validParameters(){
        mainPage.tabCreateAnAccount();

        createNewAccountPage.fillingUserInformation();
        createNewAccountPage.fullingEmail();
        createNewAccountPage.fullingPassword();
        createNewAccountPage.tabCreateAnAccount();

        assertTrue(myAccountPage.visibleMessengerSuccessCreateAccount());
    }

    /**
     * Создание аккаунта без параметров
     */
    @Test
    public void emptyParameters(){
        mainPage.tabCreateAnAccount();

        createNewAccountPage.tabCreateAnAccount();

        assertTrue(createNewAccountPage.visibleMessengerEmptyParameters());
    }
    /**
     * Создание аккаунта с зарегестрированным Email
     */
    @Test
    public void registeredEmail(){
        mainPage.tabCreateAnAccount();

        createNewAccountPage.fillingUserInformation();
        createNewAccountPage.fullingRegisteredEmail();
        createNewAccountPage.fullingPassword();
        createNewAccountPage.tabCreateAnAccount();

        assertTrue(createNewAccountPage.visibleMessengerRegisteredEmail());
    }
    /**
     * Создание аккаунта с некоректным Email
     */
    @Test
    public void incorrectEmail(){
        mainPage.tabCreateAnAccount();

        createNewAccountPage.fillingUserInformation();
        createNewAccountPage.fullingIncorrectEmail();
        createNewAccountPage.fullingPassword();
        createNewAccountPage.tabCreateAnAccount();

        assertTrue(createNewAccountPage.visibleMessengerIncorrectEmail());
    }
}
