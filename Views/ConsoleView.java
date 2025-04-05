package Views;

import java.util.Scanner;

import Controllers.ApplianceController;

public class ConsoleView {

    // main method for dealing with user input
    public static void execute(){
        Scanner scanner = new Scanner(System.in);
        showCommands();

        // infinite loop to keep accepting user input until 'exit'
        while(true){
            System.out.println("Enter a command: ");
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("exit")){
                System.out.println("Exiting...");
                break;
            }
            // the controller deals with the command
            ApplianceController.process(command);
        }

        scanner.close();
        
    }

    // displays the list of available commands
    public static void showCommands(){
        System.out.println("Here are the Commands:");
        System.out.println("FAN:\t fan on | fan off | fan increase | fan decrease | fan status");
        System.out.println("LIGHT:\t light on | light off | light status");
        System.out.println("AC:\t ac on | ac off | ac status");
        System.out.println("status");
        System.out.println("exit");
    }
}
