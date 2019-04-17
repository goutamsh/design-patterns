package com.gshepur.bridge.example2;

public class Detail {

    private String label;

    private String value;

    public Detail(String label, String val) {
        this.label = label;
        this.value = val;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
