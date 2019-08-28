package com.example.iveteepifanio.mycalculator.Calculator.MiniCase2;

import android.util.Log;

import com.example.iveteepifanio.mycalculator.Calculator.EnterCalculator.DeviceAccess;
import com.example.iveteepifanio.mycalculator.Calculator.EnterCalculator.EnterCalculator;
import com.example.iveteepifanio.mycalculator.Calculator.EnterCalculator.IMiniCase;
import com.example.iveteepifanio.mycalculator.Calculator.EnterCalculator.Wait_a_while;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.ScreenOrientation;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;

/**
 * Created by ivete.epifanio on 06/09/2017. ID MineCase 3150294- Verify the calculator buttons on each physical function
 */

public class EnterExitCalculator implements IMiniCase{

    private static final int HOME_KEY_EVENT = 3;
    private static final int BACK_KEY_EVENT = 4;
    DeviceAccess access= new DeviceAccess();
    EnterCalculator calculator= new EnterCalculator();
    Wait_a_while sleep = new Wait_a_while();
    AndroidDriver driver;



    @Before
    public void onInitTest() throws MalformedURLException {
        driver =  access.setupDriver();
    }

    /**
     * method for test Enter and exit the calculator.
     * */




    @Test
    public void executeTest(){
            calculator.enterCalcular(driver);
            executeSteps();
        }


    @Override
    public void executeSteps(){

         executeStepOne();
         executeStepTwo();
         executeStep3();
     }



    /**
     * ID MineCase 3150294 - Verify the calculator buttons on each physical function
     * Step one : Call Home button
     * @return
     */
    public void executeStepOne(){//Step01

        driver.pressKeyCode(HOME_KEY_EVENT);

    }

    /**
     * ID MineCase 3150294 - Verify the calculator buttons on each physical function
     * Step two : Call Back button
     */
    public void executeStepTwo(){//Step02

      driver.startActivity("com.tct.calculator","Calculator");
      driver.pressKeyCode(BACK_KEY_EVENT);


    }

    /**
     * ID MineCase 3150294 - Verify the calculator buttons on each physical function
     * Step two : Rotate device
     */
    public void executeStep3() {//Step03

        driver.startActivity("com.tct.calculator","Calculator");
        driver.rotate(ScreenOrientation.LANDSCAPE);
        sleep.waitWhile(driver);
        driver.rotate(ScreenOrientation.PORTRAIT);
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
