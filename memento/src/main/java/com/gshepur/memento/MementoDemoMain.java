package com.gshepur.memento;

public class MementoDemoMain {

    public static void main(String[] args) {

        Caretaker caretaker = new Caretaker();

        Employee employee = new Employee("Ram", 10, "ram@gmail.com");

        caretaker.save(employee);

        employee.setAge(20);
        employee.setName("Ram2");
        System.out.println("Employee before revert "+employee);

        caretaker.revert(employee);
        System.out.println("Employee before revert "+employee);
    }
}
