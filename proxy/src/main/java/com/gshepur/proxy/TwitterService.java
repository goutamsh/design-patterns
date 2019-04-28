package com.gshepur.proxy;

import java.util.List;

public interface TwitterService {

    List<String> readTweets(String handle);

    void postTweet(String message);

}
