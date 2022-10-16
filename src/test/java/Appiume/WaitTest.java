package Appiume;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTest extends BaseTest {
    @Test
    public void fun() {
        WebDriverWait wait = new WebDriverWait(driver, 10, 1000);
        WebElement homeSearch_element = driver.findElement(By.id("com.xueqiu.android:id/home_search"));
        homeSearch_element.click();
        WebElement element = driver.findElement(By.id("com.xueqiu.android:id/search_input_text"));
        element.sendKeys("alibaba");
//        显示等待，直到找到指定元素就执行
        WebElement ali = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='BABA']")));
        ali.click();
    }
}
