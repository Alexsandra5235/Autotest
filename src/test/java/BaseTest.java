import org.example.Constants;
import com.codeborne.selenide.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;

abstract public class BaseTest {
    Constants constants = new Constants();

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
