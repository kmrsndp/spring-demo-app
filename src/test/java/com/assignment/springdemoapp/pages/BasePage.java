package com.assignment.springdemoapp.pages;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BasePage {

    @Autowired
    protected WebDriver driver;

    private final Logger log = LoggerFactory.getLogger(BasePage.class);

    @PostConstruct
    public void initElements(){
        PageFactory.initElements(driver, this);
    }
}
