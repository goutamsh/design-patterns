package com.gshepur.chainofresponsibility;

public class CEO extends Handler {
    @Override
    public void handler(Request request) {
        System.out.println("CEO can approve anything "+request.getRequestType());
    }
}
