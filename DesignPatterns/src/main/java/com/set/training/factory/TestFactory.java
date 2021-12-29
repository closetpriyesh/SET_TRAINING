package com.set.training.factory;

public class TestFactory {
    private BaseFactory baseFactory;
    public TestFactory(BaseFactory f) {
        this.baseFactory  = f;
    }

    void perform(String type) {
        Connection c =  baseFactory.create(type);
        c.print();
    }
}
