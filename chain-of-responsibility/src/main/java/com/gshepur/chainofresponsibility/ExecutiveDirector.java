package com.gshepur.chainofresponsibility;

public class ExecutiveDirector extends Handler {
    @Override
    public void handler(Request request) {
        if(request.getRequestType() == RequestType.VISA){
            System.out.println("Executive Director can approve "+request.getRequestType());
        }else{
            successor.handler(request);
        }
    }
}
