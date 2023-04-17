package senseIoC;

public class Main {
 public static void main(String[] args) {
     Trigger blasterDarkTrigger = new Trigger( "Heal");

        System.out.println("Blaster Dark Trigger:");
        blasterDarkTrigger.attack();
        blasterDarkTrigger.guard();
        blasterDarkTrigger.retire();
        blasterDarkTrigger.TriggerEffect();
 }

}