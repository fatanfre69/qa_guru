package tests;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static helpers.Environment.*;
import static helpers.Environment.password;

public class OdnoklassnikiTests {


    @Test
    @Description("Домашнее задание к уроку №1")
    void editOdnoklassnikiProfile() {
        Configuration.headless = true;
        open("https://ok.ru/");
        $("#field_email").val("79858959243");
        $("#field_password").val("Sudir123").pressEnter();
//        $("#field_email").val(login);
//        $("#field_password").val(password).pressEnter();
        $(".toolbar_ucard").click();
        $(withText("Пётр")).click();
        $("#nullcity").click();
        $(byText("Москва")).click();
        $("#nullschoolText").val("345");
        $("#nullschoolText").click();
        $(withText("школа")).click();
        $(byText("ещё учусь")).click();
        $("#hook_FormButton_btn_join_communitieswithjoinrblock").click();
        $(".ucard-mini_img").click();
        $(".toolbar_ucard").click();
        $(withText("Пётр")).click();
        $("body").shouldHave(text("345 школа"));
    }
//    команда для запуска из стерминала
//    gradle clean test --tests "tests.facebook.editOdnoklassnikiProfile" -Dlogin= -Dpassword=




}


