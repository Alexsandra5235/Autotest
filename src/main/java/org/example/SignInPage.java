package org.example;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SignInPage extends BasePage{
    /**
     * Заполнение почты
     */
    public void fullingEmail(String email){
        $(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
    }
    /**
     * Заполненение пароля
     */
    public void fullingPassword(String password){
        $(By.xpath("//*[@id=\"pass\"]")).sendKeys(password);
    }
    /**
     * Нажатие на кнопку "Sign In"
     */
    public MyAccountPage tabSignIn(){
        $(By.xpath("//*[@id=\"send2\"]")).click();
        return new MyAccountPage();
    }
    /**
     * Проверка сообщения о необходимости заполнить поля
     */
    public boolean visibleMessengerEmptyParameters(){
        return $$(By.xpath("//*[@class=\"mage-error\"]")).asFixedIterable().stream().
                allMatch(mess->mess.shouldBe(visible).isDisplayed());
    }
    /**
     * Проверка сообщения о неверно указаном пароле
     */
    public boolean visibleMessengerInvalidPassword(){
        return $(By.xpath("//*[@id=\"maincontent\"]/ div[2]")).shouldBe(visible).isDisplayed();
    }
    /**
     * Проверка сообщения об успешно измененной почте
     */
    public boolean visibleMessengerSuccessChange(){
        return $(By.xpath("//div[@data-ui-id=\"message-success\"]")).shouldBe(visible).isDisplayed();
    }
}
