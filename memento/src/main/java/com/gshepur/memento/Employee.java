package com.gshepur.memento;

//Originator
public class Employee {

    private String name;

    private int age;

    private String email;

    public Employee(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EmployeeMemento save() {
        return new EmployeeMemento(this.name, this.age);
    }

    public void revert(EmployeeMemento employeeMemento){
        this.name = employeeMemento.getName();
        this.age = employeeMemento.getAge();
    }

    @Override
    public String toString() {
        return "Employee [name:"+this.name+", age:"+this.age+" , email:"+this.email+"]";
    }
}
