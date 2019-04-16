package com.gshepur.adpater;

import org.apache.commons.lang3.builder.ToStringBuilder;

//Say this is legacy class and cant't be modified
public class EmployeeLDAP {

    private String cname;

    private String firsname;

    private String lastname;

    private String emailAddress;

    public EmployeeLDAP(String cname, String firstname, String lastname, String email) {
        this.cname = cname;
        this.firsname = firstname;
        this.lastname = lastname;
        this.emailAddress = email;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getFirsname() {
        return firsname;
    }

    public void setFirsname(String firsname) {
        this.firsname = firsname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
