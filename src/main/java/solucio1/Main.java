package solucio1;



public class Main {
 public static void main(String[] args) {
     Normal blasterDark = new Normal("BT01-001", "Blaster Dark", 3, 10000, 10000);

     Trigger blasterDarkTrigger = new Trigger(blasterDark,"Heal");

        System.out.println("Blaster Dark Trigger:");

        blasterDarkTrigger.TriggerEffect();
        blasterDarkTrigger.attack();
        blasterDarkTrigger.guard();
        blasterDarkTrigger.retire();
 }

}