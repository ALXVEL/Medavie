import java.time.LocalDateTime;
import java.time.Month;

import Services.SystemUpdater;
import Views.ConsoleView;

public class Main {
    public static void main(String[] args){

        // These are tests for the SystemUpdater, leaving this here in case.
        // Instead of writing unittests since this is a simple assessment
        //
        // LocalDateTime mockTime = LocalDateTime.of(2025, Month.JANUARY, 1,1,0);
        // if(SystemUpdater.isScheduledUpdateTime(mockTime)){
        //     System.out.println("TEST: The updater will run.");
        //     SystemUpdater.performSystemUpdate();
        // }else{
        //     System.out.println("TEST: The update will NOT run.");
        // }

        SystemUpdater.checkForSystemUpdate();
        ConsoleView.execute();
    }
}
