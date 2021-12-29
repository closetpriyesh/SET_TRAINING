package com.set.training.factory;

public class OracleConnection implements Connection{
    @Override
    public void print() {
        System.out.println("Normal Oracle connection");
    }
}
