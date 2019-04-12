package com.gshepur.factorymethod;

import java.util.List;

public class BlogWebsite extends Website {
    @Override
    protected void createPages() {

        List<Page> pages = getPages();
        pages.add(new AboutPage());
        pages.add(new ArticlePage());
        pages.add(new CommentPage());
        pages.add((new IndexPage()));

    }

    @Override
    public String toString() {
        return getPages().toString();
    }
}
