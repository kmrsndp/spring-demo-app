package com.assignment.springdemoapp.stepdefinitions;

import com.assignment.springdemoapp.pages.SauceDemo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class AppTestSteps {

    @Autowired
    private SauceDemo sauceDemo;


    @Given("user is on the application login page")
    public void userIsOnTheApplicationLoginPage() {

        sauceDemo.visitLoginPage();
//        Assert.fail();
    }

    @When("user enters {string} and {string}")
    public void userEntersAnd(String userName, String password) {
    }

    @And("clicks on submit")
    public void clicksOnSubmit() {
    }

    @Then("user should be able to log in")
    public void userShouldBeAbleToLogIn() {
    }

    @And("user should be redirected to homepage")
    public void userShouldBeRedirectedToHomepage() {
    }



}
