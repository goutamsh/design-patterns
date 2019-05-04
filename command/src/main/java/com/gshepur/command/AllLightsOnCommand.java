package com.gshepur.command;

import java.util.List;

//Concrete Command Class
public class AllLightsOnCommand  implements Command{

    private List<Light> lights;

    AllLightsOnCommand(List<Light> lights){
        this.lights = lights;
    }

    @Override
    public void execute() {
        for (Light light: lights) {
            if(!light.isOn()){
                light.toggle();
            }
        }
    }
}
