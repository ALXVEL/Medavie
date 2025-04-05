package Appliances;

import java.util.Map;

import Interfaces.Appliance;

public class AirConditioner implements Appliance{

    private String currentMode;
    // mapping all the modes
    private static final Map<String,String> modes = Map.of(
        "off", "OFF",
        "cool", "Cool",
        "heat", "Heat"
    );

    public AirConditioner(){
        this.currentMode = "off";
    }

    @Override
    public void on() {
        currentMode = "cool"; // default on
    }

    @Override
    public void off() {
        currentMode = "off";
    }

    // this is an extra method I added, as AC units tend to have multiple modes
    public void setMode(String mode){
        if (modes.containsKey(mode)){
            this.currentMode = mode;
            System.out.println("Air Conditioner mode set to: " + modes.get(mode));
        }else{
            System.out.println("Invalid mode. Here are the modes:\n");
            showModes();
        }
    }

    // printing out all the modes
    public static void showModes(){
        for (Map.Entry<String, String> entry : modes.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    @Override
    public String getStatus() {
        return "Air Conditioner is set to " + modes.get(currentMode);
    }
    
}
