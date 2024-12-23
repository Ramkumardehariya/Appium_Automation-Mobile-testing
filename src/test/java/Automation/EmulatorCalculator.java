package Automation;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;

public class EmulatorCalculator {
    public AndroidDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("appium:deviceName", "emulator-5556");
        capabilities.setCapability("appium:appPackage", "com.android.calculator2");
        capabilities.setCapability("appium:appActivity", "com.android.calculator2.Calculator");
        capabilities.setCapability("appium:platformVersion", "9.0");
        capabilities.setCapability("platformName", "Android");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        System.out.println("Start Automation .....");
    }

    @Test(priority = 1)
    public void testAddition() throws InterruptedException {
        WebElement five = driver.findElement(By.id("com.android.calculator2:id/digit_5"));
        five.click();
        Thread.sleep(3000);

        driver.findElement(By.id("com.android.calculator2:id/op_add")).click();
        Thread.sleep(3000);

        WebElement six = driver.findElement(By.id("com.android.calculator2:id/digit_7"));
        six.click();
        Thread.sleep(3000);

        driver.findElement(By.id("com.android.calculator2:id/eq")).click();
        Thread.sleep(4000);

        driver.findElement(By.id("com.android.calculator2:id/clr")).click();

    }

    @Test(priority = 2)
    public void testSubtraction() throws InterruptedException {
        WebElement five = driver.findElement(By.id("com.android.calculator2:id/digit_7"));
        five.click();
        Thread.sleep(3000);

        driver.findElement(By.id("com.android.calculator2:id/op_sub")).click();
        Thread.sleep(3000);

        WebElement six = driver.findElement(By.id("com.android.calculator2:id/digit_5"));
        six.click();
        Thread.sleep(3000);

        driver.findElement(By.id("com.android.calculator2:id/eq")).click();
        Thread.sleep(4000);

        driver.findElement(By.id("com.android.calculator2:id/clr")).click();
    }

    @Test(priority = 3)
    public void testMultiplication() throws InterruptedException {
        WebElement five = driver.findElement(By.id("com.android.calculator2:id/digit_7"));
        five.click();
        Thread.sleep(3000);

        driver.findElement(By.id("com.android.calculator2:id/op_mul")).click();
        Thread.sleep(3000);

        WebElement six = driver.findElement(By.id("com.android.calculator2:id/digit_5"));
        six.click();
        Thread.sleep(3000);

        driver.findElement(By.id("com.android.calculator2:id/eq")).click();
        Thread.sleep(4000);

        driver.findElement(By.id("com.android.calculator2:id/clr")).click();
    }

    @Test(priority = 4)
    public void testDivision() throws InterruptedException {
        WebElement five = driver.findElement(By.id("com.android.calculator2:id/digit_7"));
        five.click();
        Thread.sleep(3000);

        driver.findElement(By.id("com.android.calculator2:id/op_div")).click();
        Thread.sleep(3000);

        WebElement six = driver.findElement(By.id("com.android.calculator2:id/digit_5"));
        six.click();
        Thread.sleep(3000);

        driver.findElement(By.id("com.android.calculator2:id/eq")).click();
        Thread.sleep(4000);

        driver.findElement(By.id("com.android.calculator2:id/clr")).click();
        Thread.sleep(4000);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
