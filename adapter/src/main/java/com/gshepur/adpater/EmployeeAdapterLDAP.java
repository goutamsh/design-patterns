package com.gshepur.adpater;

public class EmployeeAdapterLDAP implements Employee {

    private EmployeeLDAP employeeLDAP;

    public EmployeeAdapterLDAP(EmployeeLDAP employeeLDAP) {

        this.employeeLDAP = employeeLDAP;
    }

    @Override
    public String getId() {
        return employeeLDAP.getCname();
    }

    @Override
    public String getFirstName() {
        return employeeLDAP.getFirsname();
    }

    @Override
    public String getLastNAme() {
        return employeeLDAP.getLastname();
    }

    @Override
    public String getEmail() {
        return employeeLDAP.getEmailAddress();
    }

    @Override
    public String toString() {
        return employeeLDAP.toString();
    }
}
