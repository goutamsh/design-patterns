package com.gshepur.factorymethod;

public class FactoryMethodDemoMain {
    public static void main(String[] args) {

        WebsiteFactory websiteFactory = new WebsiteFactory();
        Website blog = websiteFactory.createWebsite(WebsiteTypeEnum.BLOG);

        System.out.println(blog);

        Website shop = websiteFactory.createWebsite(WebsiteTypeEnum.SHOP);

        System.out.println(shop);
    }
}
