import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AddProductToCardTest extends BaseTest{
    /**
     * Добавление товара в корзину авторизированным пользователем
     */
    @Test
    public void authorizationUsers(){
        mainPage.tabSignIn();

        signInPage.fullingEmail(constants.authorizationEmail);
        signInPage.fullingPassword(constants.password);
        signInPage.tabSignIn();

        myAccountPage.tabWomen();

        categoryWomenPage.tabCardProduct();

        cardProductPage.choiceParametersProduct();
        cardProductPage.tabAddToCard();

        assertTrue(cardProductPage.visibleMessengerSuccess());

        cardProductPage.tabCard();
        cardProductPage.tabDeleteProduct();
    }
}
