package com.set.training.singleton;

import com.set.training.singleton.MySingleton;

public class Runner {
    public static void main(String[] args) {
        MySingleton mySingleton = MySingleton.getInstance();
        mySingleton.print();
    }
}
