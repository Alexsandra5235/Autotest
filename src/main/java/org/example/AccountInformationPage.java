package org.example;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

/**
 * Страница информации об аккаунте
 */
public class AccountInformationPage extends BasePage{
    /**
     * Активация чекбокса "Change Email"
     */
    public void tabCheckBoxChangeEmail(){
        $(By.xpath("//*[@id=\"change-email\"]")).click();
    }

    /**
     * Нажатие на кнопку "Save"
     */
    public SignInPage tabSave(){
        $(By.xpath("//*[@class=\"action save primary\"]")).click();
        return new SignInPage();
    }
}
