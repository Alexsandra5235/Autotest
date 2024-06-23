import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import org.example.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CreateAnAccountTest extends BaseTest{
    /**
     * Создание аккаунта с корректными параметрами
     */
    @Test
    public void validParameters(){
        mainPage.tabCreateAnAccount();

        createNewAccountPage.fillingUserInformation();
        createNewAccountPage.fullingAuthorizationData();
        createNewAccountPage.tabCreateAnAccount();

        assertTrue(myAccountPage.checkMessengerSuccessCreateAccount());
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
}
