package com.gshepur.proxy;

import java.util.Arrays;
import java.util.List;

public class TwitterServiceStub implements TwitterService {

    @Override
    public List<String> readTweets(String handle) {

        return Arrays.asList("Tweet1", "Tweet2");
    }

    @Override
    public void postTweet(String message) {

        System.out.println("Posted Tweet "+message);
    }
}
