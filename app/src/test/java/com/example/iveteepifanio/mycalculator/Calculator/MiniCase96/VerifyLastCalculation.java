package com.example.iveteepifanio.mycalculator.Calculator.MiniCase96;

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
 * Created by ivete.epifanio on 26/09/2017. ID MimiCase 3150490- Verify the last calculation before the next calculation is automatically cleared
 */

public class VerifyLastCalculation implements IMiniCase{

    private static final int HOME_KEY_EVENT = 3;
    DeviceAccess access= new DeviceAccess();
    EnterCalculator calculator= new EnterCalculator();
    AndroidDriver driver;

    @Before
    public void onInitTest() throws MalformedURLException {
        driver =  access.setupDriver();
    }


    @Test
    public void executeTest() {

        calculator.enterCalcular(driver);
        executeSteps();

    }
    @Override
    public void executeSteps(){

        driver.startActivity("com.tct.calculator","Calculator");
        testFunCos();
        testFunSin();
        testFunTan();
        testFunIn();
        testFunLog();
    }


    public void testFunCos() {

        driver.findElement(By.id("com.tct.calculator:id/expend")).click();
        driver.findElement(By.id("com.tct.calculator:id/fun_cos")).click();
        driver.findElement(By.id("com.tct.calculator:id/calculator_advenced"))
                .findElement(By.id("com.tct.calculator:id/digit_9")).click();
        driver.findElement(By.id("com.tct.calculator:id/calculator_advenced"))
                .findElement(By.id("com.tct.calculator:id/digit_0")).click();
        driver.findElement( By.id("com.tct.calculator:id/eq")).click();

        //Long press the delete key to delete
        TouchAction longPress = new TouchAction(driver);
        longPress.longPress(driver.findElementById("com.tct.calculator:id/del")).perform();

    }

    public void testFunSin() {

        driver.findElement(By.id("com.tct.calculator:id/fun_sin")).click();
        driver.findElement(By.id("com.tct.calculator:id/calculator_advenced"))
                .findElement(By.id("com.tct.calculator:id/digit_9")).click();
        driver.findElement(By.id("com.tct.calculator:id/calculator_advenced"))
                .findElement(By.id("com.tct.calculator:id/digit_0")).click();
        driver.findElement(By.id("com.tct.calculator:id/eq")).click();

//Long press the delete key to delete
        TouchAction longPress = new TouchAction(driver);
        longPress.longPress(driver.findElementById("com.tct.calculator:id/del")).perform();

    }

    public void testFunTan(){
        driver.findElement(By.id("com.tct.calculator:id/fun_tan")).click();
        driver.findElement(By.id("com.tct.calculator:id/calculator_advenced"))
                .findElement(By.id("com.tct.calculator:id/digit_9")).click();
        driver.findElement(By.id("com.tct.calculator:id/calculator_advenced"))
                .findElement(By.id("com.tct.calculator:id/digit_0")).click();
        driver.findElement( By.id("com.tct.calculator:id/eq")).click();

        //Long press the delete key to delete
        TouchAction longPress = new TouchAction(driver);
        longPress.longPress(driver.findElementById("com.tct.calculator:id/del")).perform();
    }

    public void testFunIn(){

        driver.findElement(By.id("com.tct.calculator:id/fun_ln")).click();
        driver.findElement(By.id("com.tct.calculator:id/calculator_advenced"))
                .findElement(By.id("com.tct.calculator:id/digit_9")).click();
        driver.findElement(By.id("com.tct.calculator:id/calculator_advenced"))
                .findElement(By.id("com.tct.calculator:id/digit_0")).click();
        driver.findElement( By.id("com.tct.calculator:id/eq")).click();

        TouchAction longPress = new TouchAction(driver);
        longPress.longPress(driver.findElementById("com.tct.calculator:id/del")).perform();
    }

    public void testFunLog(){

        driver.findElement(By.id("com.tct.calculator:id/fun_log")).click();
        driver.findElement(By.id("com.tct.calculator:id/calculator_advenced"))
                .findElement(By.id("com.tct.calculator:id/digit_9")).click();
        driver.findElement(By.id("com.tct.calculator:id/calculator_advenced"))
                .findElement(By.id("com.tct.calculator:id/digit_0")).click();
        driver.findElement( By.id("com.tct.calculator:id/eq")).click();

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
