package org.example;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/pelin/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com.tr/b?ie=UTF8&node=20467303031");
        driver.manage().window().maximize();
        driver.findElement(By.id("sp-cc-accept")).click();
        Thread.sleep(2000);

        /*Actions a = new Actions(driver);
        a.moveToElement(driver.findElement(By.className("nav-arrow"))).build().perform();
        Thread.sleep(1000);
        driver.findElement(By.className("nav-action-inner")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("email")).sendKeys("linabambam46@gmail.com");   //  id'si var.
        Thread.sleep(1000);
        driver.findElement(By.id("continue")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("password")).sendKeys("123456Abc");   // id'si var.
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input[type='checkbox']")).click();
        boolean selected = driver.findElement(By.cssSelector("input[type='checkbox']")).isSelected();  // name var.
        System.out.println("Is the box selected?: " + selected);
        Thread.sleep(1000);
        driver.findElement(By.id("signInSubmit")).click();        */

        /*JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,1300)");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@aria-label='Ev ve Yaşam']")).click();
        js.executeScript("scrollBy(0,1300)");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[text()='Stanley NeverLeak Travel Mug']")).click();
        String productName1 = driver.findElement(By.id("productTitle")).getText();

        String price = driver.findElement(By.cssSelector("div[id='apex_desktop'] span[class='a-price-whole']")).getText();
        String priceDecimal = driver.findElement(By.cssSelector("div[id='apex_desktop'] span[class='a-price-fraction']")).getText();

        driver.findElement(By.id("color_name_2")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("wishListMainButton")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@data-action='continue-shopping-submit']")).click();
        Thread.sleep(2000);
        */

        driver.findElement(By.id("nav-logo-sprites")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("desktop-grid-4")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a[aria-label='Erkek']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div[data-asin='B08P6TCT3J']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("color_name_1")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("wishListMainButton")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@data-action='continue-shopping-submit']")).click();
        Thread.sleep(2000);




        /*driver.findElement(By.id("nav-hamburger-menu")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@data-menu-id='2']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='Sneaker']")).click();
        Thread.sleep(1000);


        js.executeScript("scrollBy(0,1300)");
        driver.findElement(By.xpath("//span[text()='adidas VERTAGO W Ayakkabı Kadın']")).click();
        Thread.sleep(1000);
        String productName2 = driver.findElement(By.id("productTitle")).getText();
        driver.findElement(By.id("size_name_1")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("wishListMainButton")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[@data-action='continue-shopping-submit']")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("nav-hamburger-menu")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("hmenu-arrow-more")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@data-menu-id='19']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@href='/gp/browse.html?node=12467126031&ref_=nav_em_toys_all_0_2_19_18']")).click();
        Thread.sleep(2000);


        driver.findElement(By.xpath("//a[@title='Hasbro Monopoly Kutu Oyunu, 8+ yaş']")).click();
        Thread.sleep(1000);
        String productName3 = driver.findElement(By.id("productTitle")).getText();
        driver.findElement(By.id("wishListMainButton")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("huc-view-your-list-button")).click();
        Thread.sleep(2000);


        String productListName1 = driver.findElement(By.id("itemName_I3MLBQ2NSPGDC")).getText();
        Assert.assertEquals(productName3,productListName1);
        Thread.sleep(1000);

        String productListName2 = driver.findElement(By.id("itemName_IFOCFAOQUEMBH")).getText();
        Assert.assertEquals(productName2,productListName2);
        Thread.sleep(1000);

        String productListName3 = driver.findElement(By.id("itemName_I1QFQ4DQES5Y3O")).getText();
        Assert.assertEquals(productName1,productListName3);
        Thread.sleep(1000);


        System.out.println("Products in shopping list: " + "\n" + productListName1 + "\n" + productListName2 + "\n" + productListName3);


        driver.findElement(By.id("pab-declarative-IFOCFAOQUEMBH")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("pab-I1QFQ4DQES5Y3O")).click();
        Thread.sleep(1000);
        driver.findElement(By.className("g-cart-view-btn")).click();
        Thread.sleep(2000);

        String productBasketName1 = driver.findElement(By.cssSelector("div[data-asin='B08THKLS9Y'] span[class='a-truncate-cut']")).getText();
        String productBasketName2 = driver.findElement(By.cssSelector("div[data-asin='B09N3N1LR6'] span[class='a-truncate-cut']")).getText();


        Assert.assertEquals(productBasketName1,"Stanley Klasik Neverleak Termos Bardak, 0.47 L");
        Assert.assertEquals(productBasketName2,"Adidas VERTAGO W Kadın Ayakkabı NGTSKY/STONE/MINRUS 38");

        System.out.println("Products in basket page: " + "\n" + productBasketName1 + "\n" + productBasketName2);

        String productPrice1 = driver.findElement(By.cssSelector("div[data-asin='B08THKLS9Y'] span[class='a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold']")).getText();
        String productPrice2 = driver.findElement(By.cssSelector("div[data-asin='B09N3N1LR6'] span[class='a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold']")).getText();
        String totalPrice = driver.findElement(By.id("sc-subtotal-amount-activecart")).getText();

        System.out.println(productPrice1 + "\n" + productPrice2 + "\n" + totalPrice);

         */

    }
}