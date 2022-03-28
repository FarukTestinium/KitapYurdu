package com.testinium.test;

import com.testinium.driver.BaseTest;
import com.testinium.page.HomePage;
import com.testinium.page.LoginPage;
import com.testinium.page.ProductPage;
import org.junit.Test;

public class ProductTest extends BaseTest {

    @Test
    public void getSiteTest(){
        HomePage homePage = new HomePage();
        LoginPage loginPage = new LoginPage();
        ProductPage productPage = new ProductPage();

        homePage.home();
        loginPage.login();
        productPage.scrollAndSelect();

        homePage.home();
        productPage.catalog();
        productPage.tumKitap();
        productPage.sepetTest();
        productPage.sepetAdres();
    }

}
