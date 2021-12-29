package com.set.training.singleton;

public class MySingleton {

    static  MySingleton mySingleton;
    private MySingleton() {
        if( mySingleton != null ) {
            throw new InstantiationError( "Creating of this object is not allowed." );
        }
    }

    public static MySingleton getInstance() {
        if(mySingleton == null) {
            synchronized (MySingleton.class) {
                if(mySingleton == null)
                    mySingleton = new MySingleton();
            }
        }
        return mySingleton;
    }

    public void print() {
        System.out.println("Class object has been created");
    }
}
