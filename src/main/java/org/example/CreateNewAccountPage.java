package org.example;

import org.openqa.selenium.By;

import java.util.function.BooleanSupplier;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CreateNewAccountPage extends BasePage{
    /**
     * Заполнение информации о пользователе (имя,фамилмя)
     */
    public void fillingUserInformation(){
        $(By.xpath("//*[@id=\"firstname\"]")).sendKeys(constants.firstName);
        $(By.xpath("//*[@id=\"lastname\"]")).sendKeys(constants.lastName);
    }

    /**
     * Заполнение почты и пароля пользователя
     */
    public void fullingAuthorizationData(){
        $(By.xpath("//*[@id=\"email_address\"]")).sendKeys(constants.createAccountEmail);
        $(By.xpath("//*[@id=\"password\"]")).sendKeys(constants.password);
        $(By.xpath("//*[@id=\"password-confirmation\"]")).sendKeys(constants.password);
    }

    /**
     * Нажатие на кнопку "Create An Account"
     */
    public MyAccountPage tabCreateAnAccount(){
        $$(By.xpath("//div[@class=\"primary\"]/button")).first().click();
        return new MyAccountPage();
    }

    /**
     * Проверка сообщений о незаполненных полях
     * @return
     */
    public boolean visibleMessengerEmptyParameters(){
        return  $$(By.xpath("//*[@class=\"mage-error\"]")).asFixedIterable().stream().
                allMatch(mess->mess.shouldBe(visible).isDisplayed());
    }
}
