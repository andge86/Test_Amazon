import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class departmentsPage extends test_Settings {

    public departmentsPage(WebDriver driver, WebDriverWait wait){

        this.driver = driver;
        this.wait = wait;
    }

    public static void goToCategoryPage(String categoryName) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(categoryName)));
        driver.findElement(By.linkText(categoryName)).click();
        System.out.println("Going to category: " + categoryName);

    }
}
