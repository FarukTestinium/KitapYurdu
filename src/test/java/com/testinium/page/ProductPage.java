package com.testinium.page;

import com.testinium.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ProductPage {

    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);


    public ProductPage(){
        methods = new Methods();
    }

    public void scrollAndSelect(){
        methods.sendKeys(By.id("search-input"),"oyuncak");
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.scrollWithAction(methods.listProduct(7));
        methods.favProduct(4);
        methods.favProduct(5);
        methods.favProduct(6);
        methods.favProduct(7);
        methods.waitBySeconds(2);
    }

    public void catalog(){

        methods.click(By.xpath("//*[@id=\"mainNav\"]/div[1]/div/div[2]/a"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//*[@id=\"landing-point\"]/div[4]/a[2]/img"));
        methods.waitBySeconds(3);
        methods.selectByText(By.xpath("//*[@id=\"content\"]/div/div/div[1]/div/div[1]/select"),"Yüksek Oylama");
        methods.waitBySeconds(3);

    }

    public void tumKitap(){
        methods.click(By.xpath("//*[@id=\"mainNav\"]/div[1]/ul/li[6]/a"));
        methods.waitBySeconds(2);
        methods.scrollWithAction(By.xpath("//*[@id=\"content\"]/div[16]/a"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id=\"content\"]/div[16]/a"));
        methods.waitBySeconds(2);
        methods.chooseRandomProduct();
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id=\"button-cart\"]"));
        methods.waitBySeconds(2);
        methods.hover();
        methods.waitBySeconds(2);
        methods.selectByText(By.xpath("//*[@id=\"content\"]/div[1]/div[3]/div[1]/div/div[1]/select"),"Eklenme Tarihi (Eski - Yeni)");
        methods.waitBySeconds(1);
        methods.click(By.cssSelector("div[class='hover-menu']>a[onclick='removeFromFavorites(577328);']"));
        methods.waitBySeconds(2);

    }


        public void sepetTest(){

        methods.click(By.xpath("//*[@id=\"cart\"]/div[1]/div[2]/h4"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id=\"js-cart\"]"));
        methods.waitBySeconds(2);
        methods.clearCard();
        methods.waitBySeconds(1);
        methods.click(By.xpath("//*[@id=\"cart_module\"]/div[1]/table/tbody/tr/td[4]/form/i"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id=\"cart_module\"]/div[4]/div[1]/a"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id=\"shipping-tabs\"]/a[2]"));
        methods.waitBySeconds(2);

        }

        public void sepetAdres(){
        methods.sendKeys(By.xpath("//*[@id=\"address-firstname-companyname\"]"),"Faruk");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//*[@id=\"address-lastname-title\"]"),"OZER");
        methods.waitBySeconds(2);
        methods.selectByText(By.xpath("//*[@id=\"address-zone-id\"]"),"İstanbul");
        methods.waitBySeconds(2);
        methods.selectByText(By.xpath("//*[@id=\"address-county-id\"]"),"BAHÇELİEVLER");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//*[@id=\"district\"]"),"SOĞANLI MAH");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//*[@id=\"address-address-text\"]"),"BAHÇELİEVLER");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//*[@id=\"address-postcode\"]"),"34180");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//*[@id=\"address-telephone\"]"),"5432491290");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//*[@id=\"address-mobile-telephone\"]"),"5333499085");
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//*[@id=\"address-tax-id\"]"),"40138924786");
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id=\"button-checkout-continue\"]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id=\"button-checkout-continue\"]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//*[@id=\"logo\"]/a/img"));
        methods.waitBySeconds(2);
        methods.hover2();

        }

}
