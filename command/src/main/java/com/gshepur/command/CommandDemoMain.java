package com.gshepur.command;

import java.util.ArrayList;
import java.util.List;

public class CommandDemoMain {

    public static void main(String[] args) {

        //Receiver
        Light bedroomLight = new Light();
        Light kitcherLight = new Light();

        //Invoker
        Switch   lightSwitch = new Switch();

        //Command and Concrete Command
//        Command onCommand = new OnCommand(light);

        Command toggleCommand = new ToggleCommand(bedroomLight);
//        lightSwitch.storeAndExecute(onCommand);
        lightSwitch.storeAndExecute(toggleCommand);
//
//        lightSwitch.storeAndExecute(toggleCommand);
//
//        lightSwitch.storeAndExecute(toggleCommand);
        List<Light> lights = new ArrayList<>();
        lights.add(bedroomLight);
        lights.add(kitcherLight);
        Command allLightsOnCommand = new AllLightsOnCommand(lights);

        lightSwitch.storeAndExecute(allLightsOnCommand);
    }
}
