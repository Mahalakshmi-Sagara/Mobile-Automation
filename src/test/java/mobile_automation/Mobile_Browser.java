package mobile_automation;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Mobile_Browser
{
    private AndroidDriver driver;

    @Test
    public void setup() throws MalformedURLException, InterruptedException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
        cap.setCapability("chromeOptions",ImmutableMap.of("w3c",false));
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        Thread.sleep(5000); // Added a longer sleep time to ensure the browser is loaded
        driver.get("https://www.amazon.com");
        Thread.sleep(5000); // Added a long er sleep time to ensure the page is loaded
        WebElement element = driver.findElement(By.name("k"));
        element.sendKeys("Iphone");
        element.sendKeys(Keys.ENTER);
    }

}
