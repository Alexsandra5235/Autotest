package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

/**
 * Страница "My Account"
 */
public class MyAccountPage extends BasePage{
    /**
     * Проверка появления сообщения об успешном создании аккаунта
     * @return
     */
    public boolean visibleMessengerSuccessCreateAccount(){
        return $(By.xpath("//*[@id=\"maincontent\"]/div[1]")).shouldBe(visible).isDisplayed();
    }

    /**
     * Нажатие на кнопку "Edit"
     */
    public AccountInformationPage tabEdit(){
        $$(By.xpath("//*[@class=\"box box-information\"]//a")).first().click();
        return new AccountInformationPage();
    }
    /**
     * Нажатие на категорию "Women"
     */
    public CategoryWomenPage tabWomen(){
        $(By.xpath("//*[@id=\"ui-id-4\"]")).click();
        return new CategoryWomenPage();
    }
    /**
     * Нажатие на категорию "Tops"
     */
    public CategoryTopsPage tabTops(){
        $(By.xpath("//*[@id=\"ui-id-4\"]")).hover();
        $(By.xpath("//*[@id=\"ui-id-9\"]")).click();
        return new CategoryTopsPage();
    }
    /**
     * Ввод текстового запроса
     */
    public ResultQueryPage fullingSearchQuery(){
        $(By.xpath("//*[@id=\"search\"]")).sendKeys(constants.searchQuery);
        $(By.xpath("//*[@id=\"search\"]")).sendKeys(Keys.ENTER);
        return new ResultQueryPage();
    }
    /**
     * Проверка отображения элементов страницы
     */
    public boolean visibleItemPage(){
        return $$(By.xpath("//*[@class=\"box box-information\"]//a")).first().shouldBe(visible).isDisplayed();
    }
}
