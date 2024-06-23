import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AddProductToWishListTest extends BaseTest{
    /**
     * Добавление товара в избранное авторизированным пользователем
     */
    @Test
    public void authorizationUsers(){
        mainPage.tabSignIn();

        signInPage.fullingEmail(constants.authorizationEmail);
        signInPage.fullingPassword(constants.password);
        signInPage.tabSignIn();

        myAccountPage.tabWomen();

        categoryWomenPage.tabCardProduct();

        cardProductPage.tabAddToWishList();

        assertTrue(wishListPage.visibleMessengerSuccess());

        wishListPage.tabDeleteProduct();
    }
}
