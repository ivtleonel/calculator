package com.example.iveteepifanio.mycalculator.Calculator.MiniCase97;
import com.example.iveteepifanio.mycalculator.Calculator.EnterCalculator.DeviceAccess;
import com.example.iveteepifanio.mycalculator.Calculator.EnterCalculator.EnterCalculator;
import com.example.iveteepifanio.mycalculator.Calculator.EnterCalculator.IMiniCase;
import com.example.iveteepifanio.mycalculator.MainActivity;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.android.AndroidDriver;

/**
 * Created by ivete.epifanio on 26/09/2017. MiniCase 3150492-  Clear recent after enter the calculator from each entry
 */

public class ClearRecentAfterEnterCalculator implements IMiniCase {

    DeviceAccess access= new DeviceAccess();
    EnterCalculator calculator= new EnterCalculator();
    private static final int HOME_KEY_EVENT = 3;
    private static final int APP_SWITCH_EVENT = 187;

    AndroidDriver driver;

    @Before
    public void setDevice() throws MalformedURLException {

        driver =  access.setupDriver();
    };

/** Pré condição para este test: arrastar o calculator para a area de atalho **/
    @Test

    public void executeTest() {//Step01
        calculator.enterCalcular(driver);
        executeSteps();
    }

    @Override
    public void executeSteps(){

        driver.startActivity("com.tct.calculator","Calculator");
        testStepTwo();
        testStepThree();
        cleanRecente();
    }
    public void testStepTwo() {//Step02

        cleanRecente();

    }

     /** Pré condição para este test: remover todos os aplicativos do menu de atalho**/
    public void testStepThree(){//Step 2.1

        driver.findElement(By.xpath("//android.view.ViewGroup[@index='1']")).click();
        driver.startActivity("com.tct.calculator","Calculator");

    }


    public void cleanRecente(){
        driver.pressKeyCode(APP_SWITCH_EVENT);

        if (driver.findElement(By.xpath("//android.widget.ImageButton[@index='1']")) != null) {
            driver.findElement(By.xpath("//android.widget.ImageButton[@index='1']")).click();
        } else {

            driver.pressKeyCode(HOME_KEY_EVENT);
        }

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
