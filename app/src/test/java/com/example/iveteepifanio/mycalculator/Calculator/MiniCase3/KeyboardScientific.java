package com.example.iveteepifanio.mycalculator.Calculator.MiniCase3;

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
 * Created by ivete.epifanio on 04/09/2017. ID MiniCase 3150296- Verify use keys on base keyboard and science keyboard
 */

public class KeyboardScientific implements IMiniCase{

    private static final int HOME_KEY_EVENT = 3;
    DeviceAccess access= new DeviceAccess();
    EnterCalculator calculator= new EnterCalculator();
    AndroidDriver driver;

    @Before
    public void setDevice() throws MalformedURLException {

        driver =  access.setupDriver();
    };
    /**
     * method for test keyboard scientific in the calculator
     * */

    @Test
    public void executeTest(){

        calculator.enterCalcular(driver);
        executeSteps();
    }

    public void executeSteps(){

        driver.startActivity("com.tct.calculator","Calculator");
        testKeyboardScientificOne();
        testKeyboardScientificTwo();
        testKeyboardScientificThree();
        testKeyboardScientificFour();
        testKeyboardScientificFive();
    }
    public void testKeyboardScientificOne() {

        driver.findElement(By.id("com.tct.calculator:id/expend")).click();
        driver.findElement(By.id("com.tct.calculator:id/lparen")).click();
        driver.findElement(By.id("com.tct.calculator:id/rparen")).click();

        TouchAction longPress = new TouchAction(driver);
        longPress.longPress(driver.findElementById("com.tct.calculator:id/del")).perform();


    }


    public void testKeyboardScientificTwo() {

        driver.findElement(By.id("com.tct.calculator:id/expend")).click();
        driver.findElement(By.id("com.tct.calculator:id/fun_sin")).click();
        driver.findElement(By.id("com.tct.calculator:id/fun_cos")).click();
        driver.findElement(By.id("com.tct.calculator:id/fun_tan")).click();
        driver.findElement(By.id("com.tct.calculator:id/fun_ln")).click();
        driver.findElement(By.id("com.tct.calculator:id/fun_log")).click();
        driver.findElement(By.id("com.tct.calculator:id/op_sqrt")).click();
        driver.findElement(By.id("com.tct.calculator:id/op_pow")).click();

        TouchAction longPress = new TouchAction(driver);
        longPress.longPress(driver.findElementById("com.tct.calculator:id/del")).perform();


    }

    public void testKeyboardScientificThree() {

        driver.findElement(By.id("com.tct.calculator:id/expend")).click();
        driver.findElement(By.id("com.tct.calculator:id/op_inv")).click();
        driver.findElement(By.id("com.tct.calculator:id/fun_arccos")).click();
        driver.findElement(By.id("com.tct.calculator:id/fun_arctan")).click();
        driver.findElement(By.id("com.tct.calculator:id/fun_arcsin")).click();
        driver.findElement(By.id("com.tct.calculator:id/fun_naturExp")).click();
        driver.findElement(By.id("com.tct.calculator:id/fun_comExp")).click();
        driver.findElement(By.id("com.tct.calculator:id/fun_sqr")).click();
        driver.findElement(By.id("com.tct.calculator:id/op_pow")).click();
        driver.findElement(By.id("com.tct.calculator:id/op_inv")).click();
        driver.findElement(By.id("com.tct.calculator:id/del2")).click();

        TouchAction longPress = new TouchAction(driver);
        longPress.longPress(driver.findElementById("com.tct.calculator:id/del")).perform();


    }

    public void testKeyboardScientificFour() {


        driver.findElement(By.id("com.tct.calculator:id/expend")).click();
        driver.findElement(By.id("com.tct.calculator:id/op_rad")).click();
        driver.findElement(By.id("com.tct.calculator:id/op_per")).click();
        driver.findElement(By.id("com.tct.calculator:id/const_pi")).click();
        driver.findElement(By.id("com.tct.calculator:id/const_e")).click();
        driver.findElement(By.id("com.tct.calculator:id/op_fact")).click();
        driver.findElement(By.id("com.tct.calculator:id/del")).click();
        driver.findElement(By.id("com.tct.calculator:id/del")).click();

        TouchAction longPress = new TouchAction(driver);
        longPress.longPress(driver.findElementById("com.tct.calculator:id/del")).perform();

        driver.findElement(By.id("com.tct.calculator:id/op_rad")).click();
    }

    public void testKeyboardScientificFive() {


        driver.findElement(By.id("com.tct.calculator:id/expend")).click();

        driver.findElement(By.id("com.tct.calculator:id/calculator_advenced")).
                findElement(By.id("com.tct.calculator:id/digit_7")).click();
        driver.findElement(By.id("com.tct.calculator:id/calculator_advenced")).
                findElement(By.id("com.tct.calculator:id/digit_8")).click();
        driver.findElement(By.id("com.tct.calculator:id/calculator_advenced")).
                findElement(By.id("com.tct.calculator:id/digit_9")).click();
        driver.findElement(By.id("com.tct.calculator:id/calculator_advenced")).
                findElement(By.id("com.tct.calculator:id/digit_4")).click();
        driver.findElement(By.id("com.tct.calculator:id/calculator_advenced")).
                findElement(By.id("com.tct.calculator:id/digit_5")).click();
        driver.findElement(By.id("com.tct.calculator:id/calculator_advenced")).
                findElement(By.id("com.tct.calculator:id/digit_6")).click();
        driver.findElement(By.id("com.tct.calculator:id/calculator_advenced")).
                findElement(By.id("com.tct.calculator:id/digit_1")).click();
        driver.findElement(By.id("com.tct.calculator:id/calculator_advenced")).
                findElement(By.id("com.tct.calculator:id/digit_2")).click();
        driver.findElement(By.id("com.tct.calculator:id/calculator_advenced")).
                findElement(By.id("com.tct.calculator:id/digit_3")).click();
        driver.findElement(By.id("com.tct.calculator:id/calculator_advenced")).
                findElement(By.id("com.tct.calculator:id/dec_point")).click();
        driver.findElement(By.id("com.tct.calculator:id/calculator_advenced")).
                findElement(By.id("com.tct.calculator:id/digit_0")).click();


        TouchAction longPress = new TouchAction(driver);
        longPress.longPress(driver.findElementById("com.tct.calculator:id/del")).perform();

    }

    /**
     * method for test keyboard scientific in the calculator. ID MineCase 3150296
     */

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
