package com.example.iveteepifanio.mycalculator.Calculator.MiniCase5;

import android.view.KeyEvent;

import com.example.iveteepifanio.mycalculator.Calculator.EnterCalculator.DeviceAccess;
import com.example.iveteepifanio.mycalculator.Calculator.EnterCalculator.EnterCalculator;
import com.example.iveteepifanio.mycalculator.Calculator.EnterCalculator.IMiniCase;
import com.example.iveteepifanio.mycalculator.Calculator.EnterCalculator.SwipeHorizontal;
import com.example.iveteepifanio.mycalculator.Calculator.EnterCalculator.Wait_a_while;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;

/**
 * Created by ivete.epifanio on 12/09/2017. ID MImiCase 3150301- Verify switch base keyboard and senior keyboard
 */

public class KeyboardBaseandSenior implements IMiniCase {

    private static final int HOME_KEY_EVENT = 3;
    DeviceAccess access= new DeviceAccess();
    EnterCalculator calculator= new EnterCalculator();
    SwipeHorizontal swipeH= new SwipeHorizontal();
    Wait_a_while sleep = new Wait_a_while();
    AndroidDriver driver;

    @Before
    public void setDevice() throws MalformedURLException {

        driver =  access.setupDriver();

    };
    /**
     * method for test base keyboard and senior keyboard in the calculator.
     * */

       @Test

    public void executeTest() {

           calculator.enterCalcular(driver);
           executeSteps();
       }

    public void executeSteps(){

        driver.startActivity("com.tct.calculator","Calculator");
        swipiOne();
        testLandscape();

    }

    public void swipiOne() {

        swipeH.swipeHorizontal(driver);

    }

    public void testLandscape() {

        driver.rotate(ScreenOrientation.LANDSCAPE);
        sleep.waitWhile(driver);
        driver.rotate(ScreenOrientation.PORTRAIT);
        sleep.waitWhile(driver);
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
