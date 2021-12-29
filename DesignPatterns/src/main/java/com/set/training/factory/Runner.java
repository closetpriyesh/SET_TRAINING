package com.set.training.factory;

public class Runner {
    public static void main(String[] args) {
        BaseFactory b = new NormalDBConnectionFactory();
        TestFactory t = new TestFactory(b);
        t.perform("oracle");
         b = new SecureDBConnectionFactory();
         t = new TestFactory(b);
         t.perform("sql");
    }
}
