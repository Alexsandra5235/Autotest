package org.example;

import org.openqa.selenium.By;

import javax.smartcardio.Card;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CardProductPage extends BasePage{
    /**
     * Выбор размера и цвета товара
     */
    public void choiceParametersProduct(){
        $(By.xpath("//*[@id=\"option-label-size-143-item-166\"]")).click();
        $(By.xpath("//*[@id=\"option-label-color-93-item-50\"]")).click();
    }

    /**
     * Нажатие на кнопку "Add To Card"
     */
    public void tabAddToCard(){
        $(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
    }
    /**
     * Нажатие на логотип корзины
     */
    public void tabCard(){
        $(By.xpath("//a[@class=\"action showcart\"]")).click();
    }
    /**
     * Удаление товара из корзины
     */
    public void tabDeleteProduct(){
        $$(By.xpath("//div[@class=\"secondary\"]/a")).first().click();
        $(By.xpath("//footer[@class=\"modal-footer\"]/button[2]")).click();
    }
    /**
     * Проверка сообщения об успешном добавлении товара в корзину
     */
    public boolean visibleMessengerSuccess(){
        return $(By.xpath("//div[@data-ui-id=\"message-success\"]")).shouldBe(visible).isDisplayed();
    }
}
