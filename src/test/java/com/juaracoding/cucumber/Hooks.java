package com.juaracoding.cucumber;

import org.example.driver.util.Constants;
import org.example.driver.util.Utils;
import org.example.driver.util.TestScenarios;
import org.example.driver.strategies.DriveStrategyImplementor;
import org.example.driver.strategies.DriveStrategy;
import org.example.driver.DriverSingleton;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static ExtentReports reports = new ExtentReports("target/extent-reports.html");

    @Before
    public void setUp() {
        DriverSingleton.getInstance(Constants.CHROMEHEADLESS);
        driver = DriverSingleton.getDriver();
        TestScenarios[] tests = TestScenarios.values();
        extentTest = reports.startTest(tests[Utils.testCount].getTestName());
        Utils.testCount++;
    }

    @After
    public void closeObject() {
        reports.endTest(extentTest);
        reports.flush();
    }

    @AfterAll
    public static void closeBrowser() {
        delay(3);
        DriverSingleton.closeObjectInstance();
    }

    public static void delay(int detik) {
        try {
            Thread.sleep(1000*detik);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void scroll(int vertical) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,"+vertical+")");
    }

}
