package org.example;

import com.codeborne.selenide.*;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

/**
 * Главная страница сайта
 */
public class MainPage {
    /**
     * Нажатие на кнопку "Create An Account"
     */
    public CreateNewAccountPage tabCreateAnAccount(){
        $(By.xpath("//div[@class=\"panel header\"]/ul[@class=\"header links\"]/li[3]/a")).click();
        return new CreateNewAccountPage();
    }
    /**
     * Нажатие на кнопку "Sign In"
     */
    public SignInPage tabSignIn(){
        $$(By.xpath("//ul[@class=\"header links\"]/li/a")).first().click();
        return new SignInPage();
    }
    /**
     * Проверка отображения элемента страницы
     */
    public boolean visibleItemPage(){
        return $(By.xpath("//div[@class=\"sections nav-sections\"]")).shouldBe(visible).isDisplayed();
    }

}