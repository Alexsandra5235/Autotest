import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

abstract public class BaseTest {

    Constants constants = new Constants();
    MainPage mainPage = new MainPage();
    CreateNewAccountPage createNewAccountPage = new CreateNewAccountPage();
    MyAccountPage myAccountPage = new MyAccountPage();
    AccountInformationPage accountInformationPage = new AccountInformationPage();
    SignInPage signInPage = new SignInPage();
    CategoryWomenPage categoryWomenPage = new CategoryWomenPage();
    CardProductPage cardProductPage = new CardProductPage();
    WishListPage wishListPage = new WishListPage();
    ResultQueryPage resultQueryPage = new ResultQueryPage();
    CheckoutPage checkoutPage = new CheckoutPage();
    SuccessPage successPage = new SuccessPage();
    CategoryTopsPage categoryTopsPage = new CategoryTopsPage();

    public void SetUp(){
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "edge";
        Configuration.headless = false;
    }

    @BeforeEach
    public void Init(){
        SetUp();
        Selenide.open(constants.url);
    }

    @AfterEach()
    public void TernDown(){
        Selenide.closeWebDriver();
    }
}
