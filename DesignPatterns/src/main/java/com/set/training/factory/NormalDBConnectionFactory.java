package com.set.training.factory;



public class NormalDBConnectionFactory implements  BaseFactory{
    @Override
    public Connection create(String type) {
        if(type.equalsIgnoreCase("sql")) {
            return new SQLConnection();
        } else if(type.equalsIgnoreCase("oracle")) {
            return new OracleConnection();
        }else return null;
    }
}
