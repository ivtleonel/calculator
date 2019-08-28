package com.example.iveteepifanio.mycalculator.Calculator.MiniCase9;

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
 * Created by ivete.epifanio on 15/09/2017. ID MineCase 3150305 Verify delete function
 */

public class VerifyDeleteFunction implements IMiniCase{

    private static final int HOME_KEY_EVENT = 3;
    DeviceAccess access= new DeviceAccess();
    EnterCalculator calculator= new EnterCalculator();
    AndroidDriver driver;

    @Before
    public void setDevice() throws MalformedURLException {

        driver =  access.setupDriver();

    };

    /**
     * method for test step one.
     * */

    @Test
    public void executeTest() throws InterruptedException{

        calculator.enterCalcular(driver);
        executeSteps();
    }

    public void executeSteps(){

        driver.startActivity("com.tct.calculator","Calculator");
        testStepTwo();
        testStepThree();
        mTouchAction();

    }

    public void testStepTwo()  {

//Enter some content in the input box
        driver.findElement(By.id("com.tct.calculator:id/digit_1")).click();
        driver.findElement(By.id("com.tct.calculator:id/digit_2")).click();
        driver.findElement(By.id("com.tct.calculator:id/digit_3")).click();
        driver.findElement(By.id("com.tct.calculator:id/digit_4")).click();
        driver.findElement(By.id("com.tct.calculator:id/digit_5")).click();

    }


    public void testStepThree()  {

        //Short press the delete key to clear
        driver.findElement(By.id("com.tct.calculator:id/clear")).click();
        driver.findElement(By.id("com.tct.calculator:id/clear")).click();
        driver.findElement(By.id("com.tct.calculator:id/clear")).click();
        driver.findElement(By.id("com.tct.calculator:id/clear")).click();
        driver.findElement(By.id("com.tct.calculator:id/clear")).click();


    }

        public void mTouchAction()  {

        //Enter some content in the input box
            driver.findElement( By.id("com.tct.calculator:id/digit_1")).click();
            driver.findElement( By.id("com.tct.calculator:id/digit_2")).click();
            driver.findElement( By.id("com.tct.calculator:id/digit_3")).click();
            driver.findElement( By.id("com.tct.calculator:id/digit_4")).click();
            //driver.findElement( By.id("com.tct.calculator:id/op_add")).click();
            driver.findElement( By.id("com.tct.calculator:id/digit_5")).click();

        //Long press the delete key to delete
            TouchAction longPress = new TouchAction(driver);
            longPress.longPress(driver.findElementById("com.tct.calculator:id/clear")).perform();

    }

    @After
    public void onEndTest() {

        driver.pressKeyCode(HOME_KEY_EVENT);
        //driver.quit();
    }

    @Override
    public void executeMiniCase(AndroidDriver driver) {
        this.driver= driver;
        executeSteps();
    }
}
