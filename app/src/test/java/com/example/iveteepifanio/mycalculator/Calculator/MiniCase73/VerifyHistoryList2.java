package com.example.iveteepifanio.mycalculator.Calculator.MiniCase73;

import android.util.Log;

import com.example.iveteepifanio.mycalculator.Calculator.EnterCalculator.DeviceAccess;
import com.example.iveteepifanio.mycalculator.Calculator.EnterCalculator.EnterCalculator;
import com.example.iveteepifanio.mycalculator.Calculator.EnterCalculator.IMiniCase;
import com.example.iveteepifanio.mycalculator.Calculator.EnterCalculator.SwipeHistory;
import com.example.iveteepifanio.mycalculator.Calculator.EnterCalculator.Wait_a_while;

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

import io.appium.java_client.android.AndroidDriver;

/**
 * Created by ivete.epifanio on 19/09/2017. ID MiniCase 3150442- Verify history list Scientific keyboard
 */

//ID MiniCase 3150442- Verify history list Scientific keyboard
public class VerifyHistoryList2 implements IMiniCase {

    private static final int HOME_KEY_EVENT = 3;
    DeviceAccess access= new DeviceAccess();
    EnterCalculator calculator= new EnterCalculator();
    SwipeHistory swipeH= new SwipeHistory();
    Wait_a_while sleep = new Wait_a_while();
    AndroidDriver driver;


    @Before
    public void setDevice() throws MalformedURLException {

        driver =  access.setupDriver();
    };

    /**
     * method for test step one.
     * */

    @Test
    public void executeTest(){
        calculator.enterCalcular(driver);
        executeSteps();
    }

    @Override
    public void executeSteps(){

        driver.startActivity("com.tct.calculator","Calculator");
        testStepTwo();
        testStepThree();

    }

    public void testStepTwo(){
//.Imput dados
        driver.findElement( By.id("com.tct.calculator:id/digit_2")).click();
        driver.findElement( By.id("com.tct.calculator:id/op_add")).click();
        driver.findElement( By.id("com.tct.calculator:id/digit_8")).click();
        driver.findElement( By.id("com.tct.calculator:id/eq")).click();

        //driver.findElement( By.id("com.tct.calculator:id/del2")).click();

        driver.findElement( By.id("com.tct.calculator:id/digit_8")).click();
        driver.findElement( By.id("com.tct.calculator:id/op_sub")).click();
        driver.findElement( By.id("com.tct.calculator:id/digit_5")).click();
        driver.findElement( By.id("com.tct.calculator:id/eq")).click();

        //driver.findElement( By.id("com.tct.calculator:id/del2")).click();

        driver.findElement( By.id("com.tct.calculator:id/digit_2")).click();
        driver.findElement( By.id("com.tct.calculator:id/op_mul")).click();
        driver.findElement( By.id("com.tct.calculator:id/digit_8")).click();
        driver.findElement( By.id("com.tct.calculator:id/eq")).click();

        // driver.findElement( By.id("com.tct.calculator:id/del2")).click();

        driver.findElement( By.id("com.tct.calculator:id/digit_5")).click();
        driver.findElement( By.id("com.tct.calculator:id/op_div")).click();
        driver.findElement( By.id("com.tct.calculator:id/digit_5")).click();
        driver.findElement( By.id("com.tct.calculator:id/eq")).click();

        driver.findElement( By.id("com.tct.calculator:id/digit_3")).click();;
        driver.findElement( By.id("com.tct.calculator:id/op_add")).click();
        driver.findElement( By.id("com.tct.calculator:id/digit_8")).click();
        driver.findElement( By.id("com.tct.calculator:id/eq")).click();

        driver.findElement( By.id("com.tct.calculator:id/digit_5")).click();
        driver.findElement( By.id("com.tct.calculator:id/op_add")).click();
        driver.findElement( By.id("com.tct.calculator:id/digit_8")).click();
        driver.findElement( By.id("com.tct.calculator:id/eq")).click();

        driver.findElement( By.id("com.tct.calculator:id/digit_8")).click();
        driver.findElement( By.id("com.tct.calculator:id/op_div")).click();
        driver.findElement( By.id("com.tct.calculator:id/digit_2")).click();
        driver.findElement( By.id("com.tct.calculator:id/eq")).click();

        driver.findElement( By.id("com.tct.calculator:id/digit_6")).click();
        driver.findElement( By.id("com.tct.calculator:id/op_div")).click();
        driver.findElement( By.id("com.tct.calculator:id/digit_3")).click();
        driver.findElement( By.id("com.tct.calculator:id/eq")).click();

        driver.findElement( By.id("com.tct.calculator:id/digit_4")).click();
        driver.findElement( By.id("com.tct.calculator:id/op_div")).click();
        driver.findElement( By.id("com.tct.calculator:id/digit_2")).click();
        driver.findElement( By.id("com.tct.calculator:id/eq")).click();

        driver.findElement( By.id("com.tct.calculator:id/digit_8")).click();
        driver.findElement( By.id("com.tct.calculator:id/op_div")).click();
        driver.findElement( By.id("com.tct.calculator:id/digit_4")).click();
        driver.findElement( By.id("com.tct.calculator:id/eq")).click();

        driver.findElement( By.id("com.tct.calculator:id/digit_2")).click();
        driver.findElement( By.id("com.tct.calculator:id/op_div")).click();
        driver.findElement( By.id("com.tct.calculator:id/digit_2")).click();
        driver.findElement( By.id("com.tct.calculator:id/eq")).click();

        driver.findElement( By.id("com.tct.calculator:id/digit_2")).click();
        driver.findElement( By.id("com.tct.calculator:id/op_div")).click();
        driver.findElement( By.id("com.tct.calculator:id/digit_1")).click();
        driver.findElement( By.id("com.tct.calculator:id/eq")).click();

        driver.findElement( By.id("com.tct.calculator:id/del2")).click();

        driver.findElement(By.id("com.tct.calculator:id/expend")).click();

    }

    //Steps 2 and 3
    public void testStepThree() {
        
        sleep.waitWhile(driver);
        swipeH.swipeHistory(driver);
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


