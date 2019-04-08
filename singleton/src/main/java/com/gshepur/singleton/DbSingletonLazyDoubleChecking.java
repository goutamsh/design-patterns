package com.gshepur.singleton;

/**
 * Uses Lazy loading
 * Double checking
 * Thread safe
 * Avoid using method level synchronization for better performance
 * Use volatile keyword so the valrable is read from mail memory by the threads
 */
public class DbSingletonLazyDoubleChecking {

    private static volatile DbSingletonLazyDoubleChecking instance = null;

    private DbSingletonLazyDoubleChecking(){
        //To avoid creation of instance using Reflection
        if(instance != null){
            throw new RuntimeException("Use getInstance() method to get the instance");
        }
    }

    public static DbSingletonLazyDoubleChecking getInstance(){
        if(instance == null){
            synchronized (DbSingletonLazyDoubleChecking.class){
                if(instance == null){
                    instance = new DbSingletonLazyDoubleChecking();
                }
            }
        }
        return instance;
    }
}
