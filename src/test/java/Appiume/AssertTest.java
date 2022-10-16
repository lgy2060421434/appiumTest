package Appiume;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.junit.jupiter.api.Assertions.*;

public class AssertTest extends BaseTest {
    @Test
    public void fun() {
        Integer a = new Integer(1);
        Integer b = new Integer(2);
        assertNotNull(a);
        assertSame(a, b);
        assertTrue(false);
        assertFalse(true);
        assertNull(null);
        assertNotSame(a, b);
        assertEquals(a, b);
        assertArrayEquals(new int[]{1, 3, 4}, new int[]{2, 3, 5});
    }

    //hamcrest断言使用
    @Test
    public void priceAssert() throws InterruptedException {
        WebElement homeSearch_element = driver.findElement(By.id("com.xueqiu.android:id/home_search"));
        homeSearch_element.click();
        WebElement element = driver.findElement(By.id("com.xueqiu.android:id/search_input_text"));
        element.sendKeys("alibaba");
        driver.findElement(By.xpath("//*[@text='BABA']")).click();
        String text = driver.findElement(By.xpath("//*[@text='09988']/../../..//*[@resource-id='com.xueqiu.android:id/current_price']")).getText();
        assertThat("股票的价格", Double.parseDouble(text), greaterThanOrEqualTo(40d));
        Thread.sleep(4000);
    }
}
