package com.gshepur.chainofresponsibility;

public class ManagingDirctor extends Handler {
    @Override
    public void handler(Request request) {
        if(request.getRequestType() == RequestType.NEW_HIRE){
            System.out.println("Managing Direcotor can approve "+request.getRequestType());
        }else{
            successor.handler(request);
        }
    }
}
