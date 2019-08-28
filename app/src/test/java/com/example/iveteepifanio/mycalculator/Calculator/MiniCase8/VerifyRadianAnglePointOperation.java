package com.example.iveteepifanio.mycalculator.Calculator.MiniCase8;

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
 * Created by ivete.epifanio on 15/09/2017. ID MiniCse 3150307- Verify the radian angle and point of operation
 */

public class VerifyRadianAnglePointOperation implements IMiniCase{

    private static final int HOME_KEY_EVENT = 3;
    DeviceAccess access= new DeviceAccess();
    EnterCalculator calculator= new EnterCalculator();
    AndroidDriver driver;

    @Before
    public void setDevice() throws MalformedURLException {

        driver =  access.setupDriver();
    }

    @Test
    public void executeTest(){

        calculator.enterCalcular(driver);
        executeSteps();
    }

    public void executeSteps(){

        driver.startActivity("com.tct.calculator","Calculator");
        testStepTwo();
        testStepThree();
    }

    public void testStepTwo(){

        driver.findElement(By.id("com.tct.calculator:id/expend")).click();
        driver.findElement(By.id("com.tct.calculator:id/op_rad")).click();
        //driver.findElement(By.id("com.tct.calculator:id/const_pi")).click();

        driver.findElement(By.id("com.tct.calculator:id/calculator_advenced"))
                .findElement(By.id("com.tct.calculator:id/digit_1")).click();
        driver.findElement(By.id("com.tct.calculator:id/calculator_advenced"))
                .findElement(By.id("com.tct.calculator:id/digit_8")).click();
        driver.findElement(By.id("com.tct.calculator:id/calculator_advenced"))
                .findElement(By.id("com.tct.calculator:id/digit_0")).click();
        driver.findElement(By.id("com.tct.calculator:id/calculator_advenced"))
                .findElement(By.id("com.tct.calculator:id/op_div")).click();
        driver.findElement(By.id("com.tct.calculator:id/const_pi")).click();
        driver.findElement( By.id("com.tct.calculator:id/eq")).click();


    }
    public void testStepThree(){

        TouchAction longPress = new TouchAction(driver);
        longPress.longPress(driver.findElementById("com.tct.calculator:id/del")).perform();

        driver.findElement(By.id("com.tct.calculator:id/expand_bt")).click();
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
