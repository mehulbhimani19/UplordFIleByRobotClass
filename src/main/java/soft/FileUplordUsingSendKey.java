package soft;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by Mehul on 14/04/2017.
 */
public class FileUplordUsingSendKey extends DriverManager
{
    @Test
    public void FileUplordBySendKey () throws AWTException, InterruptedException {

        // give full file path on send key will throw AWTException
        driver.findElement(By.xpath(".//*[@id='imagesrc']")).sendKeys("C:\\IMG_8376.JPG");

        Thread.sleep(2000);
        Robot robot  = new Robot();    // make robot class object to call robot class method

        robot.keyPress(KeyEvent.VK_ENTER); // hit enter
        robot.keyRelease(KeyEvent.VK_ENTER);  
    }
}
