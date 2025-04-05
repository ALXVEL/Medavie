package Controllers;

import java.util.Map;

import Appliances.AirConditioner;
import Appliances.Fan;
import Interfaces.Appliance;
import DI.DIContainer;

public class ApplianceController {

    // Dependency Injection: managed in DI class
    private static Map<String, Appliance> appliances = DIContainer.getAppliances();

    // main method for processing user commands from the consoleview
    public static void process(String command){

        // we are splitting the commands into a list to handle appliances dynamically
        // ex. "fan increase" becomes ["fan", "increase"]
        String[] parts = command.split(" ");
        
        // here we are checking if it's a one/zero word command
        if(parts.length < 2){
            if(parts[0].equals("status")){
                showStatus();
                return;
            }else{
                System.out.println("Invalid command format.");
                return;
            }
        }

        // extraction of appliance name and action
        String applianceName = parts[0];
        String action = parts[1];

        // fetch the appliance
        Appliance appliance = appliances.get(applianceName);
        if (appliance == null){
            System.out.println(applianceName + " - appliance not found.");
            return;
        }

        // action execution
        switch(action){
            case "on":
                appliance.on();
                break;
            case "off":
                appliance.off();
                break;
            case "increase":
                if(appliance instanceof Fan){
                    ((Fan) appliance).increaseSpeed();
                }
                break;
            case "decrease":
                if(appliance instanceof Fan){
                    ((Fan) appliance).decreaseSpeed();
                }
                break;
            case "cool":
                if(appliance instanceof AirConditioner){
                    ((AirConditioner) appliance).setMode("cool");
                }
                break;
            case "heat":
                if(appliance instanceof AirConditioner){
                    ((AirConditioner) appliance).setMode("heat");
                }
                break;
            case "status":
                System.out.println(appliance.getStatus());
                break;
            default:
                System.out.println("Invalid action.");
        }
    }

    // this displays the status of all the appliances
    private static void showStatus(){
        for (Appliance appliance : appliances.values()){
            System.out.println(appliance.getStatus());
        }
    }

    public static void turnOffAllAppliances(){
        for (Appliance appliance : appliances.values()){
            appliance.off();
        }
    }
}
