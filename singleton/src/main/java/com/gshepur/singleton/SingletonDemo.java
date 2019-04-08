package com.gshepur.singleton;

import java.util.Scanner;

public class SingletonDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.next();

        DbSingletonEager dbSingletonEager1 =  DbSingletonEager.getInstance();

        System.out.println(dbSingletonEager1);


        DbSingletonLazyDoubleChecking dbSingletonLazyDoubleChecking = DbSingletonLazyDoubleChecking.getInstance();

        System.out.println(dbSingletonLazyDoubleChecking);

    }
}
