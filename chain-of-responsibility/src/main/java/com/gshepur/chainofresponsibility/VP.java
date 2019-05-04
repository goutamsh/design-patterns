package com.gshepur.chainofresponsibility;

public class VP extends Handler {

    @Override
    public void handler(Request request) {
        if(request.getRequestType() == RequestType.ACCESS_TO_SOME_SYSTEM ){
            System.out.println("VP can approve "+request.getRequestType());
        }else{
            successor.handler(request);
        }
    }
}
