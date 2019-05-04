package com.gshepur.command;

//Invoker
public class Switch {

    void storeAndExecute(Command command){
        command.execute();
    }
}
