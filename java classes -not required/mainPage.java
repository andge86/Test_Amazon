
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class mainPage extends test_Settings {


    public mainPage(WebDriver driver, WebDriverWait wait){

        this.driver = driver;
        this.wait = wait;
    }


    public static void openBaseUrl(String baseUrl){

        driver.get(baseUrl);
        driver.manage().window().maximize();
        String actualTitle = driver.getTitle();
        System.out.println("Opened page title: " + actualTitle);
    }

    public static void goToDepartmentsPage (){

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Departments")));
        driver.findElement(By.linkText("Departments")).click();
    }


}
