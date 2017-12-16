import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class itemPage extends test_Settings {


    public itemPage(WebDriver driver, WebDriverWait wait){

        this.driver = driver;
        this.wait = wait;
    }


    public static String findItemTitle() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("productTitle")));
        String title2 = driver.findElement(By.id("productTitle")).getText();
        System.out.println("Title on Item Page: " + title2);

        return title2;
    }

    public static double findItemPrice(){

        String priceString;

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("priceblock_ourprice")));
        priceString = driver.findElement(By.id("priceblock_ourprice")).getText();
        System.out.println("Price for one item: " + priceString);

        priceString = priceString.replace("$", "");

        double price = Double.parseDouble(priceString);
        return price;


    }

    public static void fillItemsQuantity(String itemsQuantity){

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("quantity")));
        Select select = new Select(driver.findElement(By.id("quantity")));
        select.selectByVisibleText(itemsQuantity);
        System.out.println("Quantity of items: " + itemsQuantity);

    }

    public static void addItemToCart(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("add-to-cart-button")));
        driver.findElement(By.id("add-to-cart-button")).click();
    }
}
