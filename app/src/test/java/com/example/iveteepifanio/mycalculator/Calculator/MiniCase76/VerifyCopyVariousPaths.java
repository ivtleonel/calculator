package com.example.iveteepifanio.mycalculator.Calculator.MiniCase76;

import com.example.iveteepifanio.mycalculator.Calculator.EnterCalculator.DeviceAccess;
import com.example.iveteepifanio.mycalculator.Calculator.EnterCalculator.EnterCalculator;
import com.example.iveteepifanio.mycalculator.Calculator.EnterCalculator.IMiniCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

/**
 * Created by ivete.epifanio on 30/09/2017. ID MiniCase 3150448- Verify copy data from under the various paths
 */

public class VerifyCopyVariousPaths{

    DeviceAccess access= new DeviceAccess();
    EnterCalculator calculator= new EnterCalculator();
    AndroidDriver driver;

    @Before
    public void setDevice() throws MalformedURLException {

        driver =  access.setupDriver();
    };

    @Test
    public void executeTest() throws InterruptedException{

        calculator.enterCalcular(driver);

        testStepTwo();

    }
    public void testStepTwo() throws InterruptedException {

        driver.findElement(By.id("com.tct.calculator:id/digit_5")).click();
        mTouchFormulaArea();
        System.out.println("No response after long press");
        driver.findElement( By.id("com.tct.calculator:id/del2")).click();
        testStepThree();
    }

    public void testStepThree() throws InterruptedException {

        driver.findElement(By.id("com.tct.calculator:id/digit_5")).click();
        driver.findElement( By.id("com.tct.calculator:id/op_mul")).click();
        driver.findElement(By.id("com.tct.calculator:id/digit_3")).click();
        mTouchFormulaArea();
        System.out.println("No response after long press");
        driver.findElement( By.id("com.tct.calculator:id/del2")).click();

        testStepFour();
    }


    public void testStepFour() throws InterruptedException {

        driver.findElement(By.id("com.tct.calculator:id/digit_5")).click();
        driver.findElement( By.id("com.tct.calculator:id/op_mul")).click();
        driver.findElement(By.id("com.tct.calculator:id/digit_3")).click();
        mTouchResultArea();
        System.out.println("copy button");
        driver.findElement(By.id("com.tct.calculator:id/result_copy_btn")).click();
        testStepFive();

    }
    //steps five and six
    public void testStepFive() throws InterruptedException {

        driver.findElement(By.id("com.tct.calculator:id/digit_5")).click();
        driver.findElement( By.id("com.tct.calculator:id/op_mul")).click();
        driver.findElement(By.id("com.tct.calculator:id/digit_3")).click();
        driver.findElement( By.id("com.tct.calculator:id/eq")).click();

        mTouchFormulaArea();
        System.out.println("Copy and Paste button");
        testStepSeven();
    }

    public void testStepSeven() throws InterruptedException {

        TouchAction longPress = new TouchAction(driver);

        longPress.longPress(driver.findElementById("com.tct.calculator:id/clear")).perform();
        swipeHistoryDown();
        longPress.longPress(driver.findElementById("com.tct.calculator:id/historyResult")).perform();
        swipeHistoryTop();
        mTouchFormulaArea();

        testPaste();
    }
    public void testPaste() throws InterruptedException {

        TouchAction longPress = new TouchAction(driver);
        //longPress.longPress(driver.findElementById("com.tct.calculator:id/formula")).perform();
        //driver.findElement(By.id("com.tct.calculator:id/result_copy_btn")).click();
        longPress.longPress(driver.findElementById("com.tct.calculator:id/formula")).perform();
        driver.findElement(By.id("com.tct.calculator:id/formula_paste_btn")).click();
        longPress.longPress(driver.findElementById("com.tct.calculator:id/clear")).perform();

        mTouchFormulaArea();
    }



    public void mTouchFormulaArea() throws InterruptedException {

        //Long press Formula Area
        TouchAction longPress = new TouchAction(driver);
        longPress.longPress(driver.findElementById("com.tct.calculator:id/formula")).perform();
        System.out.println("Show nothing");

        // mTouchResultArea();

    }
    public void mTouchResultArea() throws InterruptedException {

        TouchAction longPress = new TouchAction(driver);
        //Long press Result area
        longPress.longPress(driver.findElementById("com.tct.calculator:id/result")).perform();
        System.out.println("Show copy");


    }



    public void swipeHistoryDown () throws InterruptedException {

        Dimension size = driver.manage().window().getSize();//Get the size of screen.
        System.out.println(size);
        //Find swipe start and end point from screen's with and height.
        //Find starty point which is at bottom side of screen.
        int starty = (int) (size.height * 0.5);
        //Find endy point which is at top side of screen.
        int endy = (int) (size.height * 0.2);
        //Find horizontal point where you wants to swipe. It is in middle of screen width.
        int startx = size.width / 2;
        System.out.println("starty = " + starty + " ,endy = " + endy + " , startx = " + startx);

        //Swipe down.
        driver.swipe(startx, endy, startx, starty, 3000);
        // threadSleepWithException(500);

    }

    public void swipeHistoryTop () throws InterruptedException {

        Dimension size = driver.manage().window().getSize();//Get the size of screen.
        System.out.println(size);
        //Find swipe start and end point from screen's with and height.
        //Find starty point which is at bottom side of screen.
        int starty = (int) (size.height * 0.5);
        //Find endy point which is at top side of screen.
        int endy = (int) (size.height * 0.2);
        //Find horizontal point where you wants to swipe. It is in middle of screen width.
        int startx = size.width / 2;
        System.out.println("starty = " + starty + " ,endy = " + endy + " , startx = " + startx);

        //Swipe Top.
        driver.swipe(startx, starty, startx, endy, 3000);

    }


    @After
    public void End() {

        driver.quit();
    }
}

