package Appliances;

import Interfaces.Appliance;

public class Fan implements Appliance {
    private int speed;

    public Fan(){
        this.speed = 0;
    }

    @Override
    public void on() {
        speed = 1; // default
    }

    @Override
    public void off() {
        speed = 0;
    }

    public void increaseSpeed(){
        if (speed < 2){
            speed++;
            System.out.println("Fan speed increased to: " + speed);
        }else{
            System.out.println(String.format("Fan speed is maxed out! {Speed: %d}", speed));
        }
    }

    public void decreaseSpeed(){
        if (speed > 0){
            speed--;
            System.out.println("Fan speed decreased to: " + speed);
        }else{
            System.out.println(String.format("The fan is off! {Speed: %d}", speed));
        }
    }

    @Override
    public String getStatus() {
        if (speed == 0){
            return "Fan is OFF";
        }else{
            return String.format("Fan is ON {Speed: %d }", speed);
        }
    }
    
}
