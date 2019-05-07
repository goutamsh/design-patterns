package com.gshepur.observer;

public class ObserverDemoMain {

    public static void main(String[] args) {
        Subject messageSteam = new MessageStream();

        MobileClient mobileClient = new MobileClient(messageSteam);
        TabletClient tabletClient = new TabletClient(messageSteam);

        mobileClient.postMessage("Message from mobile client");
        tabletClient.postMessage("Message from tablet client");

    }
}
