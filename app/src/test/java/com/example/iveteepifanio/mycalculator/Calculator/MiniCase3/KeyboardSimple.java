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

import io.appium.java_client.android.AndroidDriver;

/**
 * Created by ivete.epifanio on 04/09/2017. ID MineCase 3150296- Verify use keys on base keyboard and science keyboard
 */

public class KeyboardSimple implements IMiniCase{

    private static final int HOME_KEY_EVENT = 3;
    DeviceAccess access= new DeviceAccess();
    EnterCalculator calculator= new EnterCalculator();
    AndroidDriver driver;

    @Before
    public void setDevice() throws MalformedURLException {

        driver =  access.setupDriver();
    };

    /**
     * method for test keyboard simple in the calculator.
     * */

@Test

public void executeTest(){

    calculator.enterCalcular(driver);

    executeSteps();
}
    @Override
    public void executeSteps (){

        driver.startActivity("com.tct.calculator","Calculator");
    testKeyBoardSimple();
    testKeyBoardSimpleThreebuttons();
}

 public void testKeyBoardSimple(){

      /*/Mine case 03*/

    driver.findElement(By.id("com.tct.calculator:id/digit_1")).click();
    driver.findElement(By.id("com.tct.calculator:id/digit_2")).click();
    driver.findElement(By.id("com.tct.calculator:id/digit_3")).click();
    driver.findElement(By.id("com.tct.calculator:id/digit_4")).click();
    driver.findElement(By.id("com.tct.calculator:id/digit_5")).click();
    driver.findElement(By.id("com.tct.calculator:id/digit_6")).click();
    driver.findElement(By.id("com.tct.calculator:id/digit_7")).click();
    driver.findElement(By.id("com.tct.calculator:id/digit_8")).click();
    driver.findElement(By.id("com.tct.calculator:id/digit_9")).click();
    driver.findElement(By.id("com.tct.calculator:id/digit_0")).click();
    driver.findElement(By.id("com.tct.calculator:id/dec_point")).click();

    driver.findElement(By.id("com.tct.calculator:id/del2")).click();


    }

    public void testKeyBoardSimpleThreebuttons(){

        driver.findElement(By.id("com.tct.calculator:id/logo_currency")).click();
        driver.findElement(By.id("com.tct.calculator:id/logo_conventer")).click();
        driver.findElement(By.id("com.tct.calculator:id/logo_calculator")).click();

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
