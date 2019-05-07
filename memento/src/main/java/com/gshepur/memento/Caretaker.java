package com.gshepur.memento;

import java.util.Stack;

//Caretaker
public class Caretaker {

    private Stack<EmployeeMemento> mementos = new Stack<>();

    public void save(Employee employee){
        mementos.push(employee.save());
    }

    public void revert(Employee employee){
        employee.revert(mementos.pop());
    }
}
