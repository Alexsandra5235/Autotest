import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SignInTest extends BaseTest{
    /**
     * Авторизация с корректными параметрами
     */
    @Test
    public void validParameters(){
        mainPage.tabSignIn();

        signInPage.fullingEmail();
        signInPage.fullingPassword(constants.password);
        signInPage.tabSignIn();

        assertTrue(mainPage.visibleItemPage());
    }
    /**
     * Авторизация без параметров
     */
    @Test
    public void emptyParameters(){
        mainPage.tabSignIn();

        signInPage.tabSignIn();

        assertTrue(signInPage.visibleMessengerEmptyParameters());
    }
    /**
     * Авторизация с неверным паролем
     */
    @Test
    public void invalidPassword(){
        mainPage.tabSignIn();

        signInPage.fullingEmail();
        signInPage.fullingPassword(constants.invalidPassword);
        signInPage.tabSignIn();

        assertTrue(signInPage.visibleMessengerInvalidPassword());
    }
}
