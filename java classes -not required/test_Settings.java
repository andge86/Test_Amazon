import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class test_Settings {

    static WebDriver driver;
    static WebDriverWait wait;

    public static void initializeDriver() {


        try {
            System.setProperty("webdriver.chrome.driver", "chromedriver");
            driver = new ChromeDriver();
            wait = new WebDriverWait(driver, 10);
            System.out.println("Driver file was found and initialized");
        }
        catch (Exception e ){
            System.out.println("No driver was found");
            e.printStackTrace();
        }
//

    }

    public static void closeDriver(){
        driver.quit();
        System.out.println("Driver closed");

    }

}
