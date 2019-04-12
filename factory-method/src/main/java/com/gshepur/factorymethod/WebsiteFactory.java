package com.gshepur.factorymethod;

public class WebsiteFactory {

    public Website createWebsite(WebsiteTypeEnum websiteType){
        Website website;
        switch (websiteType){
            case BLOG:
                website =  new BlogWebsite();
                break;
            case SHOP:
                website = new ShopWebsite();
                break;
            default:
                website = null;
        }
        return website;
    }
}
