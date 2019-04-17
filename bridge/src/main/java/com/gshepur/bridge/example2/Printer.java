package com.gshepur.bridge.example2;

import java.util.List;

public abstract class Printer {

    public void print(Formatter formatter){
        System.out.println(formatter.format(getHeader(), getDetails()));
    }

    protected abstract String getHeader();

    protected abstract List<Detail> getDetails();
}
