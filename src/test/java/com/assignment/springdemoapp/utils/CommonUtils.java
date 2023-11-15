package com.assignment.springdemoapp.utils;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommonUtils {

    @Autowired
    private WebDriver driver;

}
