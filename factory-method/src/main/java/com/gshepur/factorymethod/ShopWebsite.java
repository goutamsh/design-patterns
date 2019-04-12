package com.gshepur.factorymethod;

import java.util.List;

public class ShopWebsite extends Website{

    @Override
    protected void createPages() {
        List<Page> pages = getPages();
        pages.add(new ItemPage());
        pages.add(new CartPage());
        pages.add(new PaymentPage());

    }

    @Override
    public String toString() {
        return getPages().toString();
    }
}
