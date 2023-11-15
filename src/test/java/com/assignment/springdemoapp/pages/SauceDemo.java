package com.assignment.springdemoapp.pages;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SauceDemo {

    @Autowired
    private WebDriver driver;

    public void visitLoginPage(){

        driver.get("https://www.saucedemo.com/");

    }

}
