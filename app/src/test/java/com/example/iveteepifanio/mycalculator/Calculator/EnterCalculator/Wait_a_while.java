package com.example.iveteepifanio.mycalculator.Calculator.EnterCalculator;

import android.util.Log;

import org.openqa.selenium.Dimension;

import io.appium.java_client.android.AndroidDriver;

/**
 * Created by ivete.epifanio on 05/10/2017.
 */

public class Wait_a_while {

    private static final String IELOG = "IELOG";


    public void waitWhile(AndroidDriver driver) {

        threadSleepWithException(2000);

    }

    private void threadSleepWithException(int value) {
        try {
            Thread.sleep(value);
        } catch (InterruptedException ie) {
            Log.d(IELOG, "swipeHistory: Thread.sleep -->" + ie.toString());
        }
    }

    }

