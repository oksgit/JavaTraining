package com.selenidehomework.evroopt;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static org.testng.Assert.assertEquals;

public class Test1 {
    @Test
    // @Parameters({"x", "y"}) // параметризация через xml файл
    public void checkPrice() {
        String coffee = "Lavazza qualita oro 500";
        String searchParameter = "64.98";

        open("https://e-dostavka.by/");
        // $(By.xpath ("div.[@class='main_menu__inner']//i[@class='fa fa-search']")).click();
        $x("div.[@class='main_menu__inner']//i[@class='fa fa-search']").click();
        $("#searchtext").setValue(coffee).pressEnter();
        $x("//a[contains(text(),'" + coffee + "')]").click();
        $x("//ul[@class='description']/li[last()]/span").should(text(searchParameter));
    }
    //@Test    //параметризация через джейсон
    //@Parameters({"data"})
    //@TestId("ID123")
    //public void testUsername(String fileName) throws IOException {
    //  DataClass dataClass = new ObjectMapper()
    //        .readValue(new File("/Users/artemmoroz/Projects/training/sparta/src/test/resources/"+fileName+".json"), DataClass.class);

    //Assert.assertEquals(dataClass.getName(), "trusi2");
//    }
// @Test(dataProvider = "getSumData") // параметризация через  @dataprovider
//public void sumTest(int x, int y, String message){
//    assertEquals(x+y, 8, message);
//}

// @DataProvider
// public Object[][] getSumData() throws IOException {
//Object[][] data = new Object[3][3];
// //       data[0][0] = 3;
//        data[0][1] = 5;
//        data[0][2] = "xxxx";
//        data[1][0] = 6;
//        data[1][1] = 23;
//        data[1][2] = "tttt";
//        data[2][0] = 6;
//        data[2][1] = 0;
// //       data[2][2] = null;
//   DataClass dataClass = new ObjectMapper()
//          .readValue(new File("/Users/artemmoroz/Projects/training/sparta/src/test/resources/data.json"), DataClass.class);

// Object[][] data2 = new Object[dataClass.getCarList().size()][2];
// for(int i=0; i<dataClass.getCarList().size(); i++) {
//    Car car = dataClass.getCarList().get(i);
//    data2[i][0] = car.getColor();
//    data2[i][1] = car.getModel();
//  }
//  return data;

}
