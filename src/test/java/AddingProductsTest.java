import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DecimalFormat;
import java.time.Duration;

public class AddingProductsTest {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/pelin/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));

        // Sign in to the site.
        Actions a = new Actions(driver);
        a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("nav-action-inner")));
        driver.findElement(By.className("nav-action-inner")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ap_email")));
        driver.findElement(By.name("email")).sendKeys("linabambam46@gmail.com");
        driver.findElement(By.id("continue")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ap_password")));
        driver.findElement(By.name("password")).sendKeys("123456Abc");
        driver.findElement(By.name("rememberMe")).click();
        boolean selected = driver.findElement(By.cssSelector("input[type='checkbox']")).isSelected();
        System.out.println("Is the box selected?: " + selected);
        driver.findElement(By.id("signInSubmit")).click();

        System.out.println("**************************************************************");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[aria-label='Décor']")));
        // Choose a product from home decor products.
        driver.findElement(By.cssSelector("a[aria-label='Décor']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[data-csa-c-item-id='amzn1.asin.1.B09P4PB24P']")));
        driver.findElement(By.cssSelector("div[data-csa-c-item-id='amzn1.asin.1.B09P4PB24P']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("color_name_0")).click();
        Thread.sleep(1000);
        String decorProductTitle = driver.findElement(By.id("productTitle")).getText();
        driver.findElement(By.id("wishListMainButton")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("continue-shopping")));
        driver.findElement(By.id("continue-shopping")).click();

        // Click on Amazon to go to main page.
        driver.findElement(By.id("nav-logo")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href^='/CASIO-FT-500WC-5BVCF-Forester-Sport-Watch']")));

        // Click on a watch product on the homepage
        driver.findElement(By.cssSelector("a[href^='/CASIO-FT-500WC-5BVCF-Forester-Sport-Watch']")).click();
        String watchProductTitle = driver.findElement(By.id("title")).getText();
        String watchProductPrice = driver.findElement(By.cssSelector("div[id='apex_desktop'] span[class='a-price-whole']")).getText();
        String watchPriceDecimal = driver.findElement(By.cssSelector("div[id='apex_desktop'] span[class='a-price-fraction']")).getText();
        Thread.sleep(1000);
        driver.findElement(By.id("wishListMainButton")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("continue-shopping")));
        driver.findElement(By.id("continue-shopping")).click();

        // Click on menu button.
        driver.findElement(By.id("nav-hamburger-menu")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("hmenu-arrow-more")));
        driver.findElement(By.className("hmenu-arrow-more")).click();
        Thread.sleep(1000);

        // Click "Women Fashion" category and then "Clothing" category.
        driver.findElement(By.cssSelector("a[data-menu-id='12']")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("ul.hmenu-visible li:nth-child(3)")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[data-asin='B004C6QPHU']")));

        // Choose a clothing.
        driver.findElement(By.cssSelector("div[data-asin='B004C6QPHU']")).click();
        driver.findElement(By.id("dropdown_selected_size_name")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("size_name_10")));
        driver.findElement(By.id("size_name_10")).click();
        String clothProductTitle = driver.findElement(By.id("title")).getText();
        String clothProductPrice = driver.findElement(By.cssSelector("div[id='apex_desktop'] span[class='a-price-whole']")).getText();
        String clothPriceDecimal = driver.findElement(By.cssSelector("div[id='apex_desktop'] span[class='a-price-fraction']")).getText();
        driver.findElement(By.id("wishListMainButton")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("continue-shopping")));
        driver.findElement(By.id("continue-shopping")).click();

        // Click on menu button.
        driver.findElement(By.id("nav-hamburger-menu")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("hmenu-arrow-more")));
        driver.findElement(By.className("hmenu-arrow-more")).click();
        Thread.sleep(1000);

        // Click "Toys and Games" and then "Games" category.
        driver.findElement(By.cssSelector("a[data-menu-id='25']")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("ul.hmenu-visible li:nth-child(10)")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Hasbro Gaming: Jenga Classic Game']")));

        // Choose a game product.
        driver.findElement(By.xpath("//span[text()='Hasbro Gaming: Jenga Classic Game']")).click();
        String gameProductTitle = driver.findElement(By.id("title")).getText();
        String gameProductPrice = driver.findElement(By.cssSelector("div[id='apex_desktop'] span[class='a-price-whole']")).getText();
        String gamePriceDecimal = driver.findElement(By.cssSelector("div[id='apex_desktop'] span[class='a-price-fraction']")).getText();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("wishListMainButton")));
        driver.findElement(By.id("wishListMainButton")).click();

        // Click "View your list" button to see the products.
        driver.findElement(By.id("huc-view-your-list-button")).click();

        // Check the products titles if they are right or not.
        String gameTitleInList = driver.findElement(By.id("itemName_I2U6L487MKRTWI")).getText();
        String clothTitleInList = driver.findElement(By.id("itemName_IZDUKX8SX0YWM")).getText();
        String watchTitleInList = driver.findElement(By.id("itemName_I3U02HKQ3Z9FSA")).getText();
        String decorTitleInList = driver.findElement(By.id("itemName_I3KFGIMAL4CNAW")).getText();

        Assert.assertEquals(gameProductTitle,gameTitleInList);
        Assert.assertEquals(clothProductTitle,clothTitleInList);
        Assert.assertEquals(watchProductTitle,watchTitleInList);
        Assert.assertEquals(decorProductTitle,decorTitleInList);

        // Print the products on the screen.
        System.out.println("Products in Shopping List: " + "\n" + decorProductTitle + "\n" + watchProductTitle +
                "\n" + clothProductTitle + "\n" + gameProductTitle);

        System.out.println("**************************************************************");

        // Add to Cart 3 of them.
        driver.findElement(By.id("pab-declarative-I2U6L487MKRTWI")).click();
        driver.findElement(By.id("pab-declarative-IZDUKX8SX0YWM")).click();
        driver.findElement(By.id("pab-declarative-I3U02HKQ3Z9FSA")).click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Click on the "Cart" button.
        driver.findElement(By.id("nav-cart-count-container")).click();


        // Check their names to see if the correct products have been added to the cart.
        String watchTitleInBasket = driver.findElement(By.cssSelector("div[data-asin='B004AOLA1A'] span[class='a-truncate-cut']")).getText();
        String clothTitleInBasket = driver.findElement(By.cssSelector("div[data-asin='B004C6QPHU'] span[class='a-truncate-cut']")).getText();
        String gameTitleInBasket = driver.findElement(By.cssSelector("div[data-asin='B00ABA0ZOA'] span[class='a-truncate-cut']")).getText();

        Assert.assertEquals(watchTitleInBasket,"CASIO Men's FT-500WC-5BVCF Forester Sport Watch");
        Assert.assertEquals(clothTitleInBasket,"Arctix Women's Essential Insulated Bib Overalls, Black, Medium");
        Assert.assertEquals(gameTitleInBasket,"Hasbro Gaming: Jenga Classic Game");

        // Print the products in the basket on the screen.
        System.out.println("Products in Basket Page: " + "\n" + watchTitleInBasket +"\n" + clothTitleInBasket + "\n" + gameTitleInBasket);

        System.out.println("**************************************************************");

        // This code is written so that Java can do the calculation correctly with double.
        DecimalFormat formatter = new DecimalFormat("#0.00");

        // The prices of the products got with the string in the basket page are converted to "double".
        String watchPriceInBasket = driver.findElement(By.cssSelector("div[data-asin='B004AOLA1A'] span[class='a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold']")).getText().replace("$", "");
        double watchPrice = Double.parseDouble(watchPriceInBasket);
        String clothPriceInBasket = driver.findElement(By.cssSelector("div[data-asin='B004C6QPHU'] span[class='a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold']")).getText().replace("$", "");
        double clothPrice = Double.parseDouble(clothPriceInBasket);
        String gamePriceInBasket = driver.findElement(By.cssSelector("div[data-asin='B00ABA0ZOA'] span[class='a-size-medium a-color-base sc-price sc-white-space-nowrap sc-product-price a-text-bold']")).getText().replace("$", "");
        double gamePrice = Double.parseDouble(gamePriceInBasket);
        String totalPriceInBasket = driver.findElement(By.id("sc-subtotal-amount-activecart")).getText().replace("$", "");
        double totalPrice = Double.parseDouble(totalPriceInBasket);

        double watchP = Double.parseDouble(watchProductPrice + "." + watchPriceDecimal);
        String formatWatchProductPrice = formatter.format(watchP);
        String formatWatchPrice = formatter.format(watchPrice);

        double clothP = Double.parseDouble(clothProductPrice + "." + clothPriceDecimal);
        String formatClothProductPrice = formatter.format(clothP);
        String formatClothPrice = formatter.format(clothPrice);

        double gameP = Double.parseDouble(gameProductPrice + "." + gamePriceDecimal);
        String formatGameProductPrice = formatter.format(gameP);
        String formatGamePrice = formatter.format(gamePrice);

        // Check if the price information is the same.
        Assert.assertEquals(formatWatchProductPrice, formatWatchPrice);
        Assert.assertEquals(formatClothProductPrice,formatClothPrice);
        Assert.assertEquals(formatGameProductPrice,formatGamePrice);

        // Print the price information on the screen.
        System.out.println("Information products with prices: " + "\n" + watchTitleInBasket + ":" + watchPrice +"\n" + clothTitleInBasket + ":" + clothPrice + "\n"
                + gameTitleInBasket + ":" + gamePrice + "\n" + "Total Price :" + totalPrice);

        System.out.println("**************************************************************");

        // Make a collection. If the total price of the products are really equal to the total price, shopping can be done. If not, shopping cannot be done.
        double productsTotalPrice = watchPrice + clothPrice + gamePrice;

        if (formatter.format(productsTotalPrice).equals(formatter.format(totalPrice))) {
                System.out.println("You can shopping now...");
        }
        else {
            System.out.println("You CANNOT shopping!!!");
        }

    }

}
