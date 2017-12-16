import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class bestSellerPage extends test_Settings {


    public bestSellerPage(WebDriver driver, WebDriverWait wait){

             this.driver = driver;
             this.wait = wait;
    }

    public static String findTitleOfItem(int itemPosition) {

        String title1;

        int itemPositionInclHeader = itemPosition + 1;
        String title1Xpath = "//*[@id='zg_centerListWrapper']/div[" + itemPositionInclHeader + "]//div[@title]";

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(title1Xpath)));
        title1 = test_Settings.driver.findElement(By.xpath(title1Xpath)).getText();
        System.out.println("Title on Best Seller page of " +itemPosition + "-th item: " + title1);

        if (title1.contains("…")) {title1 = title1.replace("…", "");}


        return title1;
    }

    public static void goToItemPage (int itemPosition){

        int itemPositionInclHeader = itemPosition + 1;
        String title1LinkXpath = "//*[@id='zg_centerListWrapper']/div[" + itemPositionInclHeader + "]";

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(title1LinkXpath)));
        driver.findElement(By.xpath(title1LinkXpath)).click();
    }

}
