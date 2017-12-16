import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class categoryPage extends test_Settings {

    public categoryPage(WebDriver driver, WebDriverWait wait){

        this.driver = driver;
        this.wait = wait;
    }

    public static void goToBestSellersPage(){

        String bestSellersLinkedText = "Best Sellers";

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(bestSellersLinkedText)));
        driver.findElement(By.linkText(bestSellersLinkedText)).click();

    }

}
