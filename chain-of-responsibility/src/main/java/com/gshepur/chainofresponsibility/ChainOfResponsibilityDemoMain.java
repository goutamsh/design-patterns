package com.gshepur.chainofresponsibility;

public class ChainOfResponsibilityDemoMain {

    public static void main(String[] args) {
        VP vp = new VP();
        ExecutiveDirector executiveDirector = new ExecutiveDirector();
        ManagingDirctor managingDirctor = new ManagingDirctor();
        CEO ceo = new CEO();

        vp.setSuccessor(executiveDirector);
        executiveDirector.setSuccessor(managingDirctor);
        managingDirctor.setSuccessor(ceo);

        vp.handler(new Request(RequestType.ACCESS_TO_SOME_SYSTEM));

        ceo.handler(new Request(RequestType.ACCESS_TO_SOME_SYSTEM));

        vp.handler(new Request(RequestType.NEW_HIRE));


    }
}
