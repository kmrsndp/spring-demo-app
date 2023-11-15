package com.assignment.springdemoapp.utils;

import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;

@Component
public class ScreenshotUtil {

    @Autowired
    private WebDriver driver;


    public void attachScreenshotToScenario(Scenario scenario){

        byte[] fileContent;

        try {
            File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            fileContent = FileUtils.readFileToByteArray(source);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        scenario.attach(fileContent, "image/png", "Failure screenshot");
    }


}
