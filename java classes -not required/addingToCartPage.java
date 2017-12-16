import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class addingToCartPage extends test_Settings {


    public addingToCartPage(WebDriver driver, WebDriverWait wait){

        this.driver = driver;
        this.wait = wait;
    }

    public static double findSubtotalPrice() {

        String subtotalPrice1String;
        String subtotalPrice1Xpath = "//*[@class='a-color-price hlb-price a-inline-block a-text-bold']";

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(subtotalPrice1Xpath)));
        subtotalPrice1String = driver.findElement(By.xpath(subtotalPrice1Xpath)).getText();
        System.out.println("Subtotal price on Adding To Cart Page: " + subtotalPrice1String);

        subtotalPrice1String = subtotalPrice1String.replace("$", "");

        double subtotalPrice1 = Double.parseDouble(subtotalPrice1String);
        return subtotalPrice1;
    }

    public static void goToCartPage() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hlb-view-cart-announce")));
        driver.findElement(By.id("hlb-view-cart-announce")).click();
    }


}
