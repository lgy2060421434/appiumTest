package Appiume;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;

public class loging extends BaseTest{

    @Test
    public  void logingtest(){
        driver.findElement(By.id("com.xueqiu.android:id/tv_login")).click();
         driver.findElement(By.id("com.xueqiu.android:id/login_outside")).click();
        WebElement element = driver.findElement(By.id("com.xueqiu.android:id/login_account"));
        element.sendKeys("18774671339");
        WebElement element1 = driver.findElement(By.id("com.xueqiu.android:id/login_password"));
        element1.sendKeys("aa123456");
        driver.findElement(By.id("com.xueqiu.android:id/button_next")).click();
        driver.findElement(By.id("com.xueqiu.android:id/tv_agree")).click();
    }
}
