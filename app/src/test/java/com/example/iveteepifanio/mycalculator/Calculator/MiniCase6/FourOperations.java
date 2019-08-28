package com.example.iveteepifanio.mycalculator.Calculator.MiniCase6;

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

import io.appium.java_client.android.AndroidDriver;

/**
 * Created by ivete.epifanio on 05/09/2017. ID MineCase 3150303 Verify add,subtract,multiply and divide function
 */

public class FourOperations implements IMiniCase{

    private static final int HOME_KEY_EVENT = 3;
    DeviceAccess access= new DeviceAccess();
    EnterCalculator calculator= new EnterCalculator();
    AndroidDriver driver;

    @Before
    public void setDevice() throws MalformedURLException {

        driver =  access.setupDriver();
};

    /**
     * method for test four operation calculator.
     * */

    @Test

    public void executeTest(){

        calculator.enterCalcular(driver);
        executeSteps();
    }

    public void executeSteps(){

        driver.startActivity("com.tct.calculator","Calculator");
        testSum();
        testSubtraction();
        testMultiplication();
        testDivision();
    }

    public void testSum(){

        driver.findElement( By.id("com.tct.calculator:id/digit_2")).click();
        driver.findElement( By.id("com.tct.calculator:id/op_add")).click();
        driver.findElement( By.id("com.tct.calculator:id/digit_5")).click();
        driver.findElement( By.id("com.tct.calculator:id/op_add")).click();
        driver.findElement( By.id("com.tct.calculator:id/digit_8")).click();
        driver.findElement( By.id("com.tct.calculator:id/eq")).click();

        driver.findElement( By.id("com.tct.calculator:id/del2")).click();

    }

    public void testSubtraction(){

        driver.findElement( By.id("com.tct.calculator:id/digit_2")).click();
        driver.findElement( By.id("com.tct.calculator:id/digit_5")).click();
        driver.findElement( By.id("com.tct.calculator:id/op_sub")).click();
        driver.findElement( By.id("com.tct.calculator:id/digit_8")).click();
        driver.findElement( By.id("com.tct.calculator:id/eq")).click();

        driver.findElement( By.id("com.tct.calculator:id/del2")).click();

    }

    public void testMultiplication(){

        driver.findElement( By.id("com.tct.calculator:id/digit_2")).click();
        driver.findElement( By.id("com.tct.calculator:id/digit_5")).click();
        driver.findElement( By.id("com.tct.calculator:id/op_mul")).click();
        driver.findElement( By.id("com.tct.calculator:id/digit_8")).click();
        driver.findElement( By.id("com.tct.calculator:id/eq")).click();

        driver.findElement( By.id("com.tct.calculator:id/del2")).click();

    }

    public void testDivision(){

        driver.findElement( By.id("com.tct.calculator:id/digit_2")).click();
        driver.findElement( By.id("com.tct.calculator:id/digit_5")).click();
        driver.findElement( By.id("com.tct.calculator:id/op_div")).click();
        driver.findElement( By.id("com.tct.calculator:id/digit_5")).click();
        driver.findElement( By.id("com.tct.calculator:id/eq")).click();


        driver.findElement( By.id("com.tct.calculator:id/del2")).click();

        driver.findElement( By.id("com.tct.calculator:id/digit_0")).click();
        driver.findElement( By.id("com.tct.calculator:id/op_div")).click();
        driver.findElement( By.id("com.tct.calculator:id/digit_0")).click();
        driver.findElement( By.id("com.tct.calculator:id/eq")).click();

        driver.findElement( By.id("com.tct.calculator:id/del2")).click();
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