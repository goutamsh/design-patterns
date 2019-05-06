package com.gshepur.memento;

//Memento
public class EmployeeMemento {

    private String name;

    private int age;

    public EmployeeMemento(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }


}
