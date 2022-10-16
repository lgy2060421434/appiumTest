package Appiume;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SnowBallTest extends BaseTest {
    @Test
    public void searchTest() {
        WebElement homeSearch_element = driver.findElement(By.id("com.xueqiu.android:id/home_search"));
        if (homeSearch_element.getAttribute("enabled").equals("true")){
            System.out.println(homeSearch_element.getLocation());
            homeSearch_element.click();
            WebElement search_input_text = driver.findElement(By.id("com.xueqiu.android:id/search_input_text"));
            if (search_input_text.getAttribute("enabled").equals("true")){
                search_input_text.sendKeys("阿里巴巴");
                System.out.println("搜素成功");
            }else {
                System.out.println("搜索失败");
            }
        }
    }
}
