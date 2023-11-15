package com.assignment.springdemoapp.stepdefinitions;

import com.assignment.springdemoapp.beans.BeanConfig;
import com.assignment.springdemoapp.utils.ScreenshotUtil;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Hooks {
    @Autowired
    public WebDriver driver;
    @Autowired
    private ScreenshotUtil screenshotUtil;

    @Autowired
    private BeanConfig beanConfig;

    @Value("${qa_url}")
    private String url;


    @Before
    public void launchApp() {
        driver.get(url);
    }

    @AfterStep
    public void addScreenshot(Scenario scenario) {
        if (scenario.isFailed()) {
            screenshotUtil.attachScreenshotToScenario(scenario);
        }
    }
}
