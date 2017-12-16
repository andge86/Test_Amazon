import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class cartPage extends test_Settings {


    public cartPage(WebDriver driver, WebDriverWait wait){

        this.driver = driver;
        this.wait = wait;
    }

    public static String findItemTitle() {

        String itemTitleXpath = "//*[@class='a-size-medium sc-product-title a-text-bold']";

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(itemTitleXpath)));
        String title3 = driver.findElement(By.xpath(itemTitleXpath)).getText();
        System.out.println("Title on Cart Page: " + title3);

        return title3;
    }

    public static double findSubtotalPrice() {

        String subtotalPrice2String;
        String subtotalPrice2Xpath = "//*[@class='a-size-medium a-color-price sc-price sc-white-space-nowrap sc-price-sign']";

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(subtotalPrice2Xpath)));
        subtotalPrice2String = driver.findElement(By.xpath(subtotalPrice2Xpath)).getText();
        System.out.println("Subtotal price on Cart Page: " + subtotalPrice2String);

        subtotalPrice2String = subtotalPrice2String.replace("$", "");

        double subtotalPrice2 = Double.parseDouble(subtotalPrice2String);
        return subtotalPrice2;
    }
}
