package com.set.training.factory;

public class SecureSQLConnection implements Connection{

    @Override
    public void print() {
        System.out.println("Secure SQL Connection");
    }
}
