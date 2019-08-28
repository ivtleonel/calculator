package com.example.iveteepifanio.mycalculator.Calculator.MiniCase7;

import com.example.iveteepifanio.mycalculator.Calculator.EnterCalculator.DeviceAccess;
import com.example.iveteepifanio.mycalculator.Calculator.EnterCalculator.EnterCalculator;
import com.example.iveteepifanio.mycalculator.Calculator.EnterCalculator.IMiniCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

/**
 * Created by ivete.epifanio on 15/09/2017.
 */

/**
 * Inverse function test: ID MimiCase 3150305- Verify the functional operation
 */
public class VerifyFunctionalOperation implements IMiniCase{

    private static final int HOME_KEY_EVENT = 3;
    DeviceAccess access= new DeviceAccess();
    EnterCalculator calculator= new EnterCalculator();
    AndroidDriver driver;

    @Before
    public void setDevice() throws MalformedURLException {

        driver =  access.setupDriver();
    };

    @Test
    public void executeTest(){

        calculator.enterCalcular(driver);
        executeSteps();
    }

    @Override
    public void executeSteps(){

        driver.startActivity("com.tct.calculator","Calculator");
        testSin1();
        testCos1();
        testTan1();
        testExp1();
        testStepSin2();
        testStepCos2();

    }

    public void testSin1() {

        driver.findElement(By.id("com.tct.calculator:id/expend")).click();
        driver.findElement(By.id("com.tct.calculator:id/op_inv")).click();
        //clica no sin-
        driver.findElement(By.id("com.tct.calculator:id/fun_arcsin")).click();
        driver.findElement(By.id("com.tct.calculator:id/calculator_advenced"))
                .findElement(By.id("com.tct.calculator:id/digit_1")).click();

        driver.findElement(By.id("com.tct.calculator:id/eq")).click();

        //Long press the delete key to delete
        TouchAction longPress = new TouchAction(driver);
        longPress.longPress(driver.findElementById("com.tct.calculator:id/del")).perform();
    }

    public void testCos1(){
        driver.findElement(By.id("com.tct.calculator:id/fun_arccos")).click();
         driver.findElement(By.id("com.tct.calculator:id/calculator_advenced"))
         .findElement(By.id("com.tct.calculator:id/digit_0")).click();

         driver.findElement( By.id("com.tct.calculator:id/eq")).click();
        //Long press the delete key to delete
        TouchAction longPress = new TouchAction(driver);
        longPress.longPress(driver.findElementById("com.tct.calculator:id/del")).perform();

    }
    public void testTan1(){

        driver.findElement(By.id("com.tct.calculator:id/fun_arctan")).click();

        driver.findElement(By.id("com.tct.calculator:id/calculator_advenced"))
                .findElement(By.id("com.tct.calculator:id/digit_1")).click();

        driver.findElement(By.id("com.tct.calculator:id/calculator_advenced"))
                .findElement(By.id("com.tct.calculator:id/dec_point")).click();

        driver.findElement(By.id("com.tct.calculator:id/calculator_advenced"))
                .findElement(By.id("com.tct.calculator:id/digit_6")).click();

        driver.findElement(By.id("com.tct.calculator:id/calculator_advenced"))
                .findElement(By.id("com.tct.calculator:id/digit_3")).click();

        driver.findElement(By.id("com.tct.calculator:id/calculator_advenced"))
                .findElement(By.id("com.tct.calculator:id/digit_3")).click();

        driver.findElement(By.id("com.tct.calculator:id/calculator_advenced"))
                .findElement(By.id("com.tct.calculator:id/digit_1")).click();

        driver.findElement(By.id("com.tct.calculator:id/calculator_advenced"))
                .findElement(By.id("com.tct.calculator:id/digit_2")).click();

        driver.findElement(By.id("com.tct.calculator:id/calculator_advenced"))
                .findElement(By.id("com.tct.calculator:id/digit_3")).click();

        driver.findElement(By.id("com.tct.calculator:id/calculator_advenced"))
                .findElement(By.id("com.tct.calculator:id/digit_9")).click();

        driver.findElement(By.id("com.tct.calculator:id/const_e")).click();
        driver.findElement(By.id("com.tct.calculator:id/calculator_advenced"))
                .findElement(By.id("com.tct.calculator:id/digit_1")).click();

        driver.findElement(By.id("com.tct.calculator:id/calculator_advenced"))
                .findElement(By.id("com.tct.calculator:id/digit_6")).click();

        driver.findElement( By.id("com.tct.calculator:id/eq")).click();

        //Long press the delete key to delete
        TouchAction longPress = new TouchAction(driver);
        longPress.longPress(driver.findElementById("com.tct.calculator:id/del")).perform();

    }

    public void testExp1() {

        driver.findElement(By.id("com.tct.calculator:id/fun_naturExp")).click();
        driver.findElement(By.id("com.tct.calculator:id/calculator_advenced"))
                .findElement(By.id("com.tct.calculator:id/digit_0")).click();

        driver.findElement(By.id("com.tct.calculator:id/eq")).click();

        //Long press the delete key to delete
        TouchAction longPress = new TouchAction(driver);
        longPress.longPress(driver.findElementById("com.tct.calculator:id/del")).perform();
    }



    public void testStepSin2(){

        driver.findElement(By.id("com.tct.calculator:id/fun_arcsin")).click();
        driver.findElement(By.id("com.tct.calculator:id/calculator_advenced")).
                findElement(By.id("com.tct.calculator:id/digit_2")).click();
        driver.findElement( By.id("com.tct.calculator:id/eq")).click();

       //Long press the delete key to delete
        TouchAction longPress = new TouchAction(driver);
        longPress.longPress(driver.findElementById("com.tct.calculator:id/del")).perform();

    }

    public void testStepCos2(){

        driver.findElement(By.id("com.tct.calculator:id/fun_arccos")).click();
        driver.findElement(By.id("com.tct.calculator:id/calculator_advenced")).
                findElement(By.id("com.tct.calculator:id/digit_2")).click();
        driver.findElement( By.id("com.tct.calculator:id/eq")).click();

        //Long press the delete key to delete
        TouchAction longPress = new TouchAction(driver);
        longPress.longPress(driver.findElementById("com.tct.calculator:id/del")).perform();

    }

    @After

    public void onEndTest() {

        driver.pressKeyCode(HOME_KEY_EVENT);
        //driver.quit();
    }

    @Override
    public void executeMiniCase(AndroidDriver driver) {
        this.driver = driver;
        executeSteps();

    }
}
