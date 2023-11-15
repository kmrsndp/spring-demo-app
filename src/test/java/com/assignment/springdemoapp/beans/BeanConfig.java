package com.assignment.springdemoapp.beans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    @ConditionalOnProperty(name = "browser", havingValue = "chrome")
    public WebDriver chromeDriverBean(){
        System.setProperty("webdriver.chrome.driver", "src/test/java/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        return new ChromeDriver(options);
    }

//    @Bean
//    @ConditionalOnProperty(name = "browser", havingValue = "edge")
//    public WebDriver edgeDriverBean(){
//        System.setProperty("webdriver.chrome.driver", "src/test/java/chromedriver.exe");
//        return new EdgeDriver();
//    }

}
