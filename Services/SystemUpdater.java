package Services;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

import Controllers.ApplianceController;

public class SystemUpdater {
    
    // this will turn off all the appliances
    public static void performSystemUpdate(){
        System.out.println("System update: Jan 1st, 1:00 AM.");
        System.out.println("Shutting off all Appliances.");
        ApplianceController.turnOffAllAppliances();
    }

    // this checks if its the scheduledupdate time
    // I believe it is better to have this in a seperate config.json file instead of hardcode
    // can be discussed later
    public static boolean isScheduledUpdateTime(LocalDateTime dateTime){
        return dateTime.getMonth() == Month.JANUARY &&
        dateTime.getDayOfMonth() == 1 &&
        dateTime.getHour() == 1 &&
        dateTime.getMinute() == 0;
    }

    // this gets the current time and check if there should be an update
    public static void checkForSystemUpdate(){
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current time is " + now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
        System.out.println("Checking for system update...");

        if (isScheduledUpdateTime(now)){
            performSystemUpdate();
        }else{
            System.out.println("No System update needed. Proceed with actions.");
        }
    }

}
