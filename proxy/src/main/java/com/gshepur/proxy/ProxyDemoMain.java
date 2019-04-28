package com.gshepur.proxy;

public class ProxyDemoMain {

    public static void main(String[] args) {

        TwitterService twitterService = (TwitterService) SecurityProxy.newInstance(new TwitterServiceStub());

        System.out.println(twitterService.readTweets("goutam"));

        twitterService.postTweet("Hello World!!");
    }
}
