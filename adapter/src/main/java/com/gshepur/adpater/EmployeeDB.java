package com.gshepur.adpater;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class EmployeeDB implements Employee {

    private String id;

    private String firstName;

    private String lastName;

    private String email;

    public  EmployeeDB(String id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }


    public String getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastNAme() {
        return this.lastName;
    }

    public String getEmail() {
        return this.email;
    }


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
