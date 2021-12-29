package com.set.training.factory;

public class SQLConnection implements  Connection{

    @Override
    public void print() {
        System.out.println("Normal SQL Connection");
    }
}
