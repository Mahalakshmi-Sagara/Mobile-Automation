package mobile_automation;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;


public class VirtualDeviceCalculator {
    public AndroidDriver driver;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "emulator-5554");
        capabilities.setCapability("appPackage", "com.android.calculator2");
        capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
        capabilities.setCapability("platformVersion", "9.0");
        capabilities.setCapability("platformName", "Android");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        System.out.println("Start Automation...");
    }

    @Test
    public void caladd() throws InterruptedException {
        Thread.sleep(5000);
        WebElement two = driver.findElement(By.id("com.android.calculator2:id/digit_2"));
        two.click();
        Thread.sleep(2000);
        WebElement plus = driver.findElement(AppiumBy.accessibilityId("plus"));
        plus.click();
        WebElement five = driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Numbers and basic operations\"]/android.view.ViewGroup[1]/android.widget.Button[5]"));
        five.click();
        WebElement equal = driver.findElement(AppiumBy.accessibilityId("equals"));
        equal.click();
    }

    @Test
    public void calsub() throws InterruptedException {
        Thread.sleep(5000);
        WebElement eight = driver.findElement(By.id("com.android.calculator2:id/digit_8"));
        eight.click();
        Thread.sleep(2000);
        WebElement minus = driver.findElement(AppiumBy.accessibilityId("minus"));
        minus.click();
        WebElement five = driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Numbers and basic operations\"]/android.view.ViewGroup[1]/android.widget.Button[5]"));
        five.click();
        WebElement equal = driver.findElement(AppiumBy.accessibilityId("equals"));
        equal.click();
    }

    @Test
    public void calmulti() throws InterruptedException {
        Thread.sleep(5000);
        WebElement two = driver.findElement(By.id("com.android.calculator2:id/digit_2"));
        two.click();
        Thread.sleep(2000);
        WebElement multiply = driver.findElement(AppiumBy.accessibilityId("multiply"));
        multiply.click();
        WebElement four = driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Numbers and basic operations\"]/android.view.ViewGroup[1]/android.widget.Button[4]"));
        four.click();
        WebElement equal = driver.findElement(AppiumBy.accessibilityId("equals"));
        equal.click();
    }

    //    @Test
//    public void caldiv() throws InterruptedException
//    {
//        Thread.sleep(5000);
//        WebElement one = driver.findElement(By.id("com.android.calculator2:id/digit_4"));
//        one.click();
//        Thread.sleep(2000);
//        WebElement devide = driver.findElement(AppiumBy.accessibilityId("devide"));
//        devide.click();
//        WebElement two = driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Numbers and basic operations\"]/android.view.ViewGroup[1]/android.widget.Button[8]"));
//        two.click();
//        WebElement equal = driver.findElement(AppiumBy.accessibilityId("equals"));
//        equal.click();
//    }
//}
    @Test
    public void caldiv() throws InterruptedException {
        Thread.sleep(5000);
        WebElement one = driver.findElement(By.id("com.android.calculator2:id/digit_4"));
        one.click();
        Thread.sleep(2000);
        WebElement divide = driver.findElement(By.id("com.android.calculator2:id/op_div"));
        divide.click();
        WebElement two = driver.findElement(By.id("com.android.calculator2:id/digit_2"));
        two.click();
        WebElement equal = driver.findElement(AppiumBy.accessibilityId("equals"));
        equal.click();
    }
}

