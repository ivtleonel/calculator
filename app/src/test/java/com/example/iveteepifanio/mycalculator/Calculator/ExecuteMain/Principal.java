package com.example.iveteepifanio.mycalculator.Calculator.ExecuteMain;

import com.example.iveteepifanio.mycalculator.Calculator.EnterCalculator.DeviceAccess;
import com.example.iveteepifanio.mycalculator.Calculator.EnterCalculator.EnterCalculator;
import com.example.iveteepifanio.mycalculator.Calculator.EnterCalculator.IMiniCase;
import com.example.iveteepifanio.mycalculator.Calculator.MiniCase2.EnterExitCalculator;
import com.example.iveteepifanio.mycalculator.Calculator.MiniCase3.KeyboardScientific;
import com.example.iveteepifanio.mycalculator.Calculator.MiniCase3.KeyboardSimple;
import com.example.iveteepifanio.mycalculator.Calculator.MiniCase5.KeyboardBaseandSenior;
import com.example.iveteepifanio.mycalculator.Calculator.MiniCase6.FourOperations;
import com.example.iveteepifanio.mycalculator.Calculator.MiniCase7.VerifyFunctionalOperation;
import com.example.iveteepifanio.mycalculator.Calculator.MiniCase73.VerifyHistoryList3;
import com.example.iveteepifanio.mycalculator.Calculator.MiniCase73.VerifyHistoryList2;
import com.example.iveteepifanio.mycalculator.Calculator.MiniCase73.VerifyHistoryList1;
import com.example.iveteepifanio.mycalculator.Calculator.MiniCase8.VerifyRadianAnglePointOperation;
import com.example.iveteepifanio.mycalculator.Calculator.MiniCase9.VerifyDeleteFunction;
import com.example.iveteepifanio.mycalculator.Calculator.MiniCase96.VerifyLastCalculation;
import com.example.iveteepifanio.mycalculator.Calculator.MiniCase97.ClearRecentAfterEnterCalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;
import io.appium.java_client.android.AndroidDriver;

/**
 * Created by ivete.epifanio on 04/10/2017.
 */


public class Principal {

    AndroidDriver driver;
    DeviceAccess access= new DeviceAccess();
    EnterCalculator calculator = new EnterCalculator();
    IMiniCase enterExitCalculator = new EnterExitCalculator();
    IMiniCase keyboardScientific = new KeyboardScientific();
    IMiniCase keyboardSimple = new KeyboardSimple();
    IMiniCase keyboardBaseandSenior = new KeyboardBaseandSenior();
    IMiniCase fourOperation = new FourOperations();
    IMiniCase verifyFunctionalOperation = new VerifyFunctionalOperation();
    IMiniCase verifyRadianAnglePointOperation = new VerifyRadianAnglePointOperation();
    IMiniCase verifyDeleteFunction = new VerifyDeleteFunction();
    IMiniCase verifyHistoryList1 = new VerifyHistoryList1();
    IMiniCase verifyHistoryList2 = new VerifyHistoryList2();
    IMiniCase verifyHistoryList3 = new VerifyHistoryList3();
    IMiniCase verifyLastCalculation = new VerifyLastCalculation();
    IMiniCase clearRecentAfterEnterCalculator = new ClearRecentAfterEnterCalculator();


        @Before
        public void accessEnter() throws MalformedURLException {
            driver =  access.setupDriver();
        };

        @Test
        public void executeTest (){

            calculator.enterCalcular(driver);
            enterExitCalculator.executeMiniCase(driver);
            keyboardSimple.executeMiniCase(driver);
            keyboardScientific.executeMiniCase(driver);
            keyboardBaseandSenior.executeMiniCase(driver);
            fourOperation.executeMiniCase(driver);
            verifyFunctionalOperation.executeMiniCase(driver);
            verifyRadianAnglePointOperation.executeMiniCase(driver);
            verifyDeleteFunction.executeMiniCase(driver);
            verifyHistoryList1.executeMiniCase(driver);
            verifyHistoryList2.executeMiniCase(driver);
            verifyHistoryList3.executeMiniCase(driver);
            verifyLastCalculation.executeMiniCase(driver);
            clearRecentAfterEnterCalculator.executeMiniCase(driver);

        }


    @After
    public void End() {

        driver.quit();
    }
}
