package tests;

import io.qameta.allure.Description;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static helpers.Environment.*;

@Tag("yandex_market")
public class YandexMarketTests extends TestBase {


    @Test
    @Description("Домашнее задание к уроку №1")
    void searchItemYandexMarket() {
        open(yandexMarketUrl);
        $("html").shouldHave(text("Яндекс.Маркет"));
        $("#header-search").val("item").pressEnter();
        $("[class='_2IwbFpEZn7 wwZc93J2Ao']").click();
        $("[class='_3TfWusA7bt _26mXJDBxtH']").shouldHave(text("item"));
    }


}

