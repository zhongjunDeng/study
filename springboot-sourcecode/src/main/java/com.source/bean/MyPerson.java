package com.source.bean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;


@Component
public class MyPerson implements FactoryBean<Person> {

    @Override
    public Person getObject() throws Exception {
        return new Person();
    }

    @Override
    public Class<?> getObjectType() {
        return Person.class;
    }
}
