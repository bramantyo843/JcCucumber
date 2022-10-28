package org.example.driver.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeHeadles implements DriveStrategy{

    public WebDriver setStrategy() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless");

        return new ChromeDriver(options);
    }


}
