package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Bar {

    @Autowired
    private Foo foo;

    public Bar(Foo foo) {
        this.foo = foo;
    }

    //    @Autowired
//    public void setFoo(Foo foo) {
//        this.foo = foo;
//    }
}
