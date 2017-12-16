How to run automated tests for Amazon on Mac:

1. Download Test folder from GIT
2. Open Terminal.app and verify you have java 1.8 or higher installed. Use    java -version    command
2. Open Terminal.app and go to downloaded Test forder. Use     cd /../../Test   command
3. Execute in Terminal command    java -cp "./lib/*:./bin" org.testng.TestNG testng.xml
4. Check tests results in test-output folder in downloaded Test folder
5. Enjoy!
