package org.example;

public class Main {
 public static void main(String[] args) {
     Normal blasterDark = new Normal("BT01-001", "Blaster Dark", 2, 10000, 5000);
     Trigger Epona = new Trigger("BT01-001", "Epona", 0, 5000, 15000, "Heal");

     System.out.println("Blaster Dark:");
        blasterDark.attack();
        blasterDark.guard();
        blasterDark.retire();
        System.out.println("Epona:");
        Epona.attack();
        Epona.guard();
        Epona.retire();
        Epona.TriggerEffect();
 }

}