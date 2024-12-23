import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorRealDevice {
    public AndroidDriver driver;

    @BeforeMethod
    public void setUp() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:deviceName", "vivo 1904");
        capabilities.setCapability("appium:udid", "DATWHALFU44TYXAI");
        capabilities.setCapability("appium:appPackage", "com.android.bbkcalculator");
        capabilities.setCapability("appium:appActivity", ".Calculator");  // Correct activity name
        capabilities.setCapability("appium:appWaitActivity", "*");
        capabilities.setCapability("appium:autoGrantPermissions", true);
        capabilities.setCapability("appium:noReset", true);


        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        System.out.println("Start Automation..............");

    }

    @Test(priority = 1)
    public void testAddition() throws InterruptedException {
        WebElement five = driver.findElement(By.id("com.android.bbkcalculator:id/digit7"));
        five.click();
        Thread.sleep(3000);

        driver.findElement(By.id("com.android.bbkcalculator:id/plus")).click();
        Thread.sleep(3000);

        WebElement six = driver.findElement(By.id("com.android.bbkcalculator:id/digit5"));
        six.click();
        Thread.sleep(3000);

        driver.findElement(By.id("com.android.bbkcalculator:id/equal")).click();
        Thread.sleep(4000);

        driver.findElement(By.id("com.android.bbkcalculator:id/clear")).click();

    }

    @Test(priority = 2)
    public void testSubtraction() throws InterruptedException {
        WebElement five = driver.findElement(By.id("com.android.bbkcalculator:id/digit7"));
        five.click();
        Thread.sleep(3000);

        driver.findElement(By.id("com.android.bbkcalculator:id/minus")).click();
        Thread.sleep(3000);

        WebElement six = driver.findElement(By.id("com.android.bbkcalculator:id/digit5"));
        six.click();
        Thread.sleep(3000);

        driver.findElement(By.id("com.android.bbkcalculator:id/equal")).click();
        Thread.sleep(4000);

        driver.findElement(By.id("com.android.bbkcalculator:id/clear")).click();
    }

    @Test(priority = 3)
    public void testMultiplication() throws InterruptedException {
        WebElement five = driver.findElement(By.id("com.android.bbkcalculator:id/digit7"));
        five.click();
        Thread.sleep(3000);

        driver.findElement(By.id("com.android.bbkcalculator:id/mul")).click();
        Thread.sleep(3000);

        WebElement six = driver.findElement(By.id("com.android.bbkcalculator:id/digit5"));
        six.click();
        Thread.sleep(3000);

        driver.findElement(By.id("com.android.bbkcalculator:id/equal")).click();
        Thread.sleep(4000);

        driver.findElement(By.id("com.android.bbkcalculator:id/clear")).click();
    }

    @Test(priority = 4)
    public void testDivision() throws InterruptedException {
        WebElement five = driver.findElement(By.id("com.android.bbkcalculator:id/digit7"));
        five.click();
        Thread.sleep(3000);

        driver.findElement(By.id("com.android.bbkcalculator:id/div")).click();
        Thread.sleep(3000);

        WebElement six = driver.findElement(By.id("com.android.bbkcalculator:id/digit5"));
        six.click();
        Thread.sleep(3000);

        driver.findElement(By.id("com.android.bbkcalculator:id/equal")).click();
        Thread.sleep(4000);

        driver.findElement(By.id("com.android.bbkcalculator:id/clear")).click();
        Thread.sleep(4000);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}