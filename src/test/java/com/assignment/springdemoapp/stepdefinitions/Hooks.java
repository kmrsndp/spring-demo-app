package com.assignment.springdemoapp.stepdefinitions;

import com.assignment.springdemoapp.beans.BeanConfig;
import com.assignment.springdemoapp.utils.ScreenshotUtil;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.beans.factory.annotation.Autowired;

public class Hooks {

    @Autowired
    private WebDriver driver;
    @Autowired
    private ScreenshotUtil screenshotUtil;

    @Autowired
    private BeanConfig beanConfig;


    @Before
    public void setUpDriver(){
        if(((RemoteWebDriver) driver).getSessionId() == null){
            driver = beanConfig.chromeDriverBean();
        }

    }

    @AfterStep
    public void addScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            screenshotUtil.attachScreenshotToScenario(scenario);
        }
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
