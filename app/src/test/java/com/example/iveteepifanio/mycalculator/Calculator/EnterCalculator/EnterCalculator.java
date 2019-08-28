package com.example.iveteepifanio.mycalculator.Calculator.EnterCalculator;
import org.openqa.selenium.By;
import io.appium.java_client.android.AndroidDriver;

/**
 * Created by ivete.epifanio on 29/09/2017.
 */
//This is just to get into the calculator.
public class EnterCalculator {


    public void enterCalcular(AndroidDriver driver) {

            driver.findElement(By.id("com.tct.calculator:id/tv_next")).click();
            driver.findElement(By.id("com.tct.calculator:id/tv_next")).click();
            driver.findElement(By.id("com.tct.calculator:id/tv_next")).click();
        }

/**
 public void swipingHorizontal() throws InterruptedException {
 //Get the size of screen.
 Dimension size = driver.manage().window().getSize();
 System.out.println(size);

 //Find swipe start and end point from screen's with and height.
 //Find startx point which is at right side of screen.
 int startx = (int) (size.width * 0.8);
 //Find endx point which is at left side of screen.
 int endx = (int) (size.width * 0.1);
 //Find vertical point where you wants to swipe. It is in middle of screen height.
 int starty = size.height / 2;
 System.out.println("startx = " + startx + " ,endx = " + endx + " , starty = " + starty);

 //Swipe from Right to Left.
 driver.swipe(startx, starty, endx, starty, 3000);
 Thread.sleep(2000);
 driver.swipe(startx, starty, endx, starty, 3000);
 Thread.sleep(2000);
 //driver.swipe(startx, starty, endx, starty, 3000);
 //Thread.sleep(2000);
 //Swipe from Left to Right.
 driver.swipe(endx, starty, startx, starty, 3000);
 Thread.sleep(2000);
 //driver.findElement(By.id("com.tct.calculator:id/tv_next")).click();
 }
  * */

}