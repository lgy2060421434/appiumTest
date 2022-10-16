package Appiume;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.jupiter.api.Test;

import java.time.Duration;

public class SnowBallTest1 extends BaseTest{
    @Test
    public void swipeTest() throws InterruptedException {
//        得到宽度和高度
        int height = driver.manage().window().getSize().getHeight();
        int width = driver.manage().window().getSize().getWidth();
        Thread.sleep(10000);
//        操作 press(按压)，waitAction(等待),moveto(移动)，release(释放)
        TouchAction touchAction=new TouchAction(driver);
        touchAction.press(PointOption.point((int) (width*0.5),(int)(height*0.8))).waitAction(WaitOptions.waitOptions(Duration.ofMillis(3000)))
                .moveTo(PointOption.point((int) (width*0.5),(int)(height*0.2))).release().perform();
    }
}
