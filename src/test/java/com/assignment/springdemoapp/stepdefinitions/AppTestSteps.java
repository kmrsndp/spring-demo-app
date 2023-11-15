package com.assignment.springdemoapp.stepdefinitions;

import com.assignment.springdemoapp.pages.BasePage;
import com.assignment.springdemoapp.pages.ProductPage;
import com.assignment.springdemoapp.pages.SauceDemo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class AppTestSteps {

    @Autowired
    private SauceDemo sauceDemo;

    @Autowired
    private ProductPage productPage;

    private final Logger log = LoggerFactory.getLogger(AppTestSteps.class);

    @Given("user is on the application login page")
    public void userIsOnTheApplicationLoginPage() {
        assertThat(sauceDemo.getLoginPageHeading(), is(equalTo("Swag Labs")));
        log.info("Login page heading: " + sauceDemo.getLoginPageHeading());
    }

    @When("user enters {string} and {string}")
    public void userEntersAnd(String username, String password) {
        sauceDemo.loginWithCredentials(username, password);
    }

    @And("clicks on submit")
    public void clicksOnSubmit() {
    }

    @Then("user should be able to log in")
    public void userShouldBeAbleToLogIn() {
    }

    @And("user should be redirected to homepage")
    public void userShouldBeRedirectedToHomepage() {
        assertThat(productPage.getProductsPageHeading(), is(equalTo("Products")));
        log.info("Products page heading: " + productPage.getProductsPageHeading());
    }


}
