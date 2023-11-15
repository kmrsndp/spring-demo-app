package com.assignment.springdemoapp.listeners;

import io.cucumber.plugin.EventListener;
import io.cucumber.plugin.event.*;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class RunnerLifecycleHandler implements EventListener {

    @Autowired
    WebDriver driver;

    @Override
    public void setEventPublisher(EventPublisher publisher) {
        publisher.registerHandlerFor(TestRunStarted.class, this::onTestRunStarted);
        publisher.registerHandlerFor(TestRunFinished.class, this::onTestRunFinished);
        publisher.registerHandlerFor(TestCaseStarted.class, this::onTestCaseStarted);
        publisher.registerHandlerFor(TestCaseFinished.class, this::onTestCaseFinished);
    }

    private void onTestRunStarted(TestRunStarted event){
        System.out.println("Starting test run");
    }

    private void onTestRunFinished(TestRunFinished event){
        System.out.println("Finishing test run");
    }

    private void onTestCaseStarted(TestCaseStarted event){
        System.out.println("Starting test case");
    }

    private void onTestCaseFinished(TestCaseFinished event){
        System.out.println("Finishing test case");
    }
}
