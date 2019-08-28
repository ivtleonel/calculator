package com.example.iveteepifanio.mycalculator.Calculator.EnterCalculator;

import android.util.Log;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.By;
import io.appium.java_client.android.AndroidDriver;


/**
 * Created by ivete.epifanio on 02/10/2017.
 */

public class SwipeHistory {

    private static final String IELOG = "IELOG";


    public void swipeHistory(AndroidDriver driver) {

        Dimension size = driver.manage().window().getSize();//Get the size of screen.
        System.out.println(size);
        //Find swipe start and end point from screen's with and height.
        //Find starty point which is at bottom side of screen.
        int starty = (int) (size.height * 0.5);
        //Find endy point which is at top side of screen.
        int endy = (int) (size.height * 0.2);
        //Find horizontal point where you wants to swipe. It is in middle of screen width.
        int startx = size.width / 2;
        System.out.println("starty = " + starty + " ,endy = " + endy + " , startx = " + startx);

        //Swipe from Top to Bottom.
        driver.swipe(startx, endy, startx, starty, 500);
        threadSleepWithException(500);

        //driver.swipe(startx, endy, startx, starty, 100);
        //threadSleepWithException(2000);

        //Swipe from Bottom to Top.
        driver.swipe(startx, starty, startx, endy, 500);
        threadSleepWithException(2000);

        driver.swipe(startx, starty, startx, endy, 500);
        threadSleepWithException(500);

        driver.swipe(startx, starty, startx, endy, 500);
        threadSleepWithException(500);

    }

    private void threadSleepWithException(int value) {
        try {
            Thread.sleep(value);
        } catch (InterruptedException ie) {
            Log.d(IELOG, "swipeHistory: Thread.sleep -->" + ie.toString());
        }
    }
}
