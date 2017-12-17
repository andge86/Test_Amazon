Automated Amazon cart testing suite for Mac using Chrome browser

Description:

Test suite contains 2 tests:
1. Test of subtotal price in cart for several the same items
2. Test of correct product adding to cart (checking headers)


How to run automated tests for Amazon on Mac:

1. Download Test folder from GIT
2. Open Terminal.app and verify you have java 1.8 or higher installed. Use    java -version    command
2. Open Terminal.app and go to downloaded Test forder. Use     cd /../../Test   command
3. Execute in Terminal command    java -cp "./lib/*:./bin" org.testng.TestNG testng.xml
4. Check tests results in test-output folder in downloaded Test folder
5. Enjoy!


Note: test suite was tested only on macOS High Sierra.

To run using Windows OS it is needed (was not tested):
1. Change   System.setProperty("webdriver.chrome.driver", "chromedriver");  line in code to System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
2. Download chromedriver.exe file (for Windows OS) from http://www.seleniumhq.org/download/
3. In downloaded Test folder change chromdriver file (for macOS) to chromedriver.exe file (for Windows OS)
4. Step 4 Terminal command should be   java -cp "./lib/*;./bin" org.testng.TestNG testng.xml
