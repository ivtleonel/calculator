package com.example.iveteepifanio.mycalculator.Calculator.EnterCalculator;

import android.util.Log;

import org.openqa.selenium.Dimension;

import io.appium.java_client.android.AndroidDriver;

/**
 * Created by ivete.epifanio on 04/10/2017.
 */

public class SwipeHorizontal {

    private static final String IELOG = "IELOG";


    public void swipeHorizontal(AndroidDriver driver) {

        Dimension size = driver.manage().window().getSize();
        System.out.println(size);

        //Find swipe start and end point from screen's with and height.
        //Find startx point which is at right side of screen.
        int startx = (int) (size.width * 0.8);
        //Find endx point which is at left side of screen.
        int endx = (int) (size.width * 0.1);
        //Find vertical point where you wants to swipe. It is in middle of screen height.
        int starty = size.height /2;
        System.out.println("startx = " + startx + " ,endx = " + endx + " , starty = " + starty);

        //Swipe from Right to Left.
        driver.swipe(startx, starty, endx, starty, 3000);
        threadSleepWithException(2000);

        //Swipe from Left to Right.
        driver.swipe(endx, starty, startx, starty, 3000);
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
