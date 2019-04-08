package com.gshepur.singleton;

public class DbSingletonEager {

    private static DbSingletonEager instance = new DbSingletonEager();

    private DbSingletonEager(){

        System.out.println("DbSingletonEager instance created");
    }

    public static DbSingletonEager getInstance(){
        return instance;
    }
}
