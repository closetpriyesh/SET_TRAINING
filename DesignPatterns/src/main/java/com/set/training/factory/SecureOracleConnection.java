package com.set.training.factory;

public class SecureOracleConnection implements  Connection{

    @Override
    public void print() {
        System.out.println("Secure oracle connection");
    }
}
