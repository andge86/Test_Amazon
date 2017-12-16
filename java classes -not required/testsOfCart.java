
import org.testng.Assert;
import org.testng.annotations.*;

public class testsOfCart extends test_Settings{


@BeforeMethod

    public static void openBaseUrl(){

    initializeDriver();

    mainPage.openBaseUrl("http://www.amazon.com");
}


@Test
    public static void checkTitle(){

        String title1;
        String title2;
        String title3;

    mainPage.goToDepartmentsPage ();
    departmentsPage.goToCategoryPage ("Camera, Photo & Video"); //change if you want to go to another category
    categoryPage.goToBestSellersPage ();
    title1 = bestSellerPage.findTitleOfItem (5);
    bestSellerPage.goToItemPage (5);
    title2 = itemPage.findItemTitle ();
    itemPage.addItemToCart ();
    addingToCartPage.goToCartPage ();
    title3 = cartPage.findItemTitle ();

    Assert.assertTrue(title2.contains(title1));
    Assert.assertTrue(title3.contains(title1));
    Assert.assertEquals(title2, title3);

}


@Test
    public void checkSubtotalPrice(){

        int quantity = 8; //change if you want another quantity

        double price;
        double subtotalPrice1;
        double subtotalPrice2;

    mainPage.goToDepartmentsPage ();
    departmentsPage.goToCategoryPage ("Camera, Photo & Video"); //change if you want to go to another category
    categoryPage.goToBestSellersPage ();
    bestSellerPage.goToItemPage (5);
    price = itemPage.findItemPrice();
    itemPage.fillItemsQuantity("" + quantity);
    itemPage.addItemToCart ();
    subtotalPrice1 =  addingToCartPage.findSubtotalPrice();
    addingToCartPage.goToCartPage ();
    subtotalPrice2 = cartPage.findSubtotalPrice();

    Assert.assertEquals(subtotalPrice1, price * quantity);
    Assert.assertEquals(subtotalPrice2, price * quantity);

}

@AfterMethod

    public void closeBrowser(){

    closeDriver();
}

}
