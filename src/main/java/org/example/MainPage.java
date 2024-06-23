package org.example;

import com.codeborne.selenide.*;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

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

}