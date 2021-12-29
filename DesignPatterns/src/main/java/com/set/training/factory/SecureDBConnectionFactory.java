package com.set.training.factory;

public class SecureDBConnectionFactory implements  BaseFactory{
    @Override
    public Connection create(String type) {
        if(type.equalsIgnoreCase("sql")) {
            return new SecureSQLConnection();
        } else if(type.equalsIgnoreCase("oracle")) {
            return new SecureOracleConnection();
        }else return null;
    }
}
