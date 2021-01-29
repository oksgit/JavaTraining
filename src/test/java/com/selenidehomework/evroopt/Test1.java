package com.selenidehomework.evroopt;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Test1 {
    @Test
    public void checkPrice(){

        open ("https://e-dostavka.by/");
        $(By.xpath ("div.[@class='main_menu__inner']//i[@class='fa fa-search']"));

    }

}

