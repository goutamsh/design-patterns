package com.gshepur.adpater;

import java.util.ArrayList;
import java.util.List;

public class AdapterDemo {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        Employee employee = new EmployeeDB("1", "Ram", "Gopal", "ram@abc.com");

        employees.add(employee);

        employees.add(new EmployeeAdapterLDAP(new EmployeeLDAP("2", "Bheem", "Bhaskar", "bheem@xyz.com")));

        System.out.println(employees);
    }
}
