package com.testinium.methods;

import com.testinium.driver.BaseTest;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.Random;


public class Methods {

    WebDriver driver;
    FluentWait<WebDriver> wait;
    JavascriptExecutor jsdriver;

    public Methods(){

        driver = BaseTest.driver;
        wait = new FluentWait<WebDriver>(driver);
        wait.withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofMillis(300))
                .ignoring(NoSuchElementException.class);
        jsdriver = (JavascriptExecutor) driver;
    }

    public WebElement findElement(By by){
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public By listProduct(int index){
        List<WebElement> productElements= driver.findElements(By.xpath("//div[@class='product-list']/div"));

        return (By.xpath("//div[@class='product-list']/div["+ index +"]"));

    }

    public void favProduct(int index){
        List<WebElement> productElements= driver.findElements(By.xpath("//div[@class='product-list']/div"));
        click(By.xpath("//div[@class='product-list']/div["+ index +"]/div[@class='grid_2 alpha omega relative']/div[@class='hover-menu']/a[@class='add-to-favorites']"));

    }


    public void chooseRandomProduct(){

        int randomProduct = new Random().nextInt(16);
        WebElement webProduct = driver.findElement(By.xpath("//ul[@class='product-grid jcarousel-skin-opencart']/li[" + randomProduct + "]"));
        scrollWithAction(By.xpath("//ul[@class='product-grid jcarousel-skin-opencart']/li[" + randomProduct + "]"));
        webProduct.findElement(By.xpath("//ul[@class='product-grid jcarousel-skin-opencart']/li[" + randomProduct + "]")).click();

    }



    public void hover() {

        WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"header-top\"]/div/div[2]/ul/li[1]/div/ul/li/a"));

        Actions actions = new Actions(driver);

        actions.moveToElement(mainMenu);

        WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"header-top\"]/div/div[2]/ul/li[1]/div/ul/li/div/ul/li[1]/a"));

        actions.moveToElement(subMenu);

        actions.click().build().perform();

    }

    public void hover2() {

        WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"header-top\"]/div/div[1]/div[1]/ul/li/a"));

        Actions actions = new Actions(driver);

        actions.moveToElement(mainMenu);

        WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"header-top\"]/div/div[1]/div[1]/ul/li/div/ul/li[4]/a"));

        actions.moveToElement(subMenu);

        actions.click().build().perform();

    }

    public void clearCard(){

        WebElement p= driver.findElement(By.xpath("//*[@id=\"cart_module\"]/div[1]/table/tbody/tr/td[4]/form/input[1]"));
        p.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE,"2");
    }


    public void click(By by){
        findElement(by).click();
    }

    public void waitBySeconds(long seconds){
        try{
            Thread.sleep(seconds*1000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public boolean isElementVisible(By by){
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            return true;
        }catch (Exception e){
            return false;
        }
    }


    public void sendKeys(By by, String text){
        findElement(by).sendKeys(text);
    }

    public void  scrollWithAction(By by){
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(by)).build().perform();
    }


    public Select getSelect(By by){
        return new Select(findElement(by));
    }

    public void selectByText(By by,String text){
        getSelect(by).selectByVisibleText(text);
    }

    public String getAttribute(By by, String attributeName){
        return findElement(by).getAttribute(attributeName);
    }

}
