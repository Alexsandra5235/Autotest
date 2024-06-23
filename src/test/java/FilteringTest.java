import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FilteringTest extends BaseTest {
    /**
     * Фильтрация товаров по цвету и размеру
     */
    @Test
    public void colorAndSize(){
        mainPage.tabSignIn();

        signInPage.fullingEmail(constants.authorizationEmail);
        signInPage.fullingPassword(constants.password);
        signInPage.tabSignIn();

        myAccountPage.tabTops();

        categoryTopsPage.choiceSize();
        categoryTopsPage.choiceColor();

        assertTrue(categoryTopsPage.correctFiltering());
    }
}
