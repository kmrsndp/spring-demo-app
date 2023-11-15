package com.assignment.springdemoapp.webdriverconfig;

import org.springframework.context.support.SimpleThreadScope;
import org.springframework.beans.factory.ObjectFactory;


public class DriverScope extends SimpleThreadScope {

    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        return super.get(name, objectFactory);
    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback){

    }

}
