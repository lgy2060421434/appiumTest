package Appiume;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SnowBallTest2 extends BaseTest {
    @Test
    public void souchRun() throws InterruptedException {
        WebElement homeSearch_element = driver.findElement(By.id("com.xueqiu.android:id/home_search"));
        homeSearch_element.click();
        WebElement element = driver.findElement(By.id("com.xueqiu.android:id/search_input_text"));
        element.sendKeys("alibaba");
        driver.findElement(By.xpath("//*[@text='BABA']")).click();
        String text = driver.findElement(By.xpath("//*[@text='09988']/../../..//*[@resource-id='com.xueqiu.android:id/current_price']")).getText();
        System.out.println(text);
        Thread.sleep(4000);
    }

    @Test
    public void uiautomatorSelectTest() {
        AndroidDriver<MobileElement> driver = (AndroidDriver<MobileElement>) this.driver;
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.xueqiu.android:id/tab_name\").text(\"基金\")").click();
    }

    @Test
    public void uiautomatorSelectTest1() {
        AndroidDriver<MobileElement> driver = (AndroidDriver<MobileElement>) this.driver;
        driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.TextView\").text(\"我的\")").click();

    }

    @Test
    public void uiautomatorSelectTest2() {
        AndroidDriver<MobileElement> driver = (AndroidDriver<MobileElement>) this.driver;
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.xueqiu.android:id/title_container\").childSelector(text(\"热门\"))").click();

    }

    @Test
    public void uiautomatorSelectTest3() {
        AndroidDriver<MobileElement> driver = (AndroidDriver<MobileElement>) this.driver;
        driver.findElementByAndroidUIAutomator("new UiSelector().className(\"android.widget.TextView\").fromParent(text(\"我的\"))").click();
    }
    @Test
    public void scrollTest() throws InterruptedException {
        AndroidDriver<MobileElement> driver = (AndroidDriver<MobileElement>) this.driver;
        Thread.sleep(3000);
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"关注\").instance(0));").click();
    }
}
