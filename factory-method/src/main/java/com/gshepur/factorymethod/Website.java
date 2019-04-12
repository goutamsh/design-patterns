package com.gshepur.factorymethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

    private List<Page> pages = new ArrayList<>();

    public List<Page> getPages() {
        return pages;
    }

    public void setPages(List<Page> pages) {
        this.pages = pages;
    }

    public Website(){
        createPages();
    }

    //Factory Method
    protected abstract void createPages();
}
