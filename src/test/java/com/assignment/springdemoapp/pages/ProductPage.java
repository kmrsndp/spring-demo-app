package com.assignment.springdemoapp.pages;

import com.assignment.springdemoapp.stepdefinitions.AppTestSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ProductPage extends BasePage {

    @Autowired
    private WebDriver driver;

    private final Logger log = LoggerFactory.getLogger(ProductPage.class);

    @FindBy(xpath = "//span[text() = 'Products']")
    private WebElement productsPageHeading;

    public String getProductsPageHeading() {
        return productsPageHeading.getText();
    }

}
