package com.gshepur.chainofresponsibility;

public class Request {

    private RequestType requestType;

    public Request(RequestType requestType){
        this.requestType = requestType;
    }

    public RequestType getRequestType() {

        return requestType;
    }
}
