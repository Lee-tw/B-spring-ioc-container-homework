package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Foo {

//    @Autowired
    private Bar bar;

    public Foo(Bar bar) {
        this.bar = bar;
    }

//    @Autowired
//    public void setBar(Bar bar) {
//        this.bar = bar;
//    }
}
