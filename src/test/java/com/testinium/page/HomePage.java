package com.testinium.page;

import com.testinium.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {

    Methods methods;
    public HomePage(){
        methods = new Methods();
    }

    public void home(){
        methods.waitBySeconds(2);
        Assert.assertTrue(methods.isElementVisible(By.xpath("//div[@class='logo-icon']")));

    }


}
