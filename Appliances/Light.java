package Appliances;

import Interfaces.Appliance;

public class Light implements Appliance {

    private boolean isOn;

    @Override
    public void on() {
        isOn = true;
    }

    @Override
    public void off() {
        isOn = false;
    }

    @Override
    public String getStatus() {
        return "Light is " + (isOn ? "ON" : "OFF");
    }
    
}
