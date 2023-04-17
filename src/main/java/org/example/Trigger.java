package org.example;

public class Trigger implements Card{

    String code;
    String name;
    int grade;
    int power;
    int shield;
    String triggerEffect;

    public Trigger(String code, String name, int grade, int power, int shield, String triggerEffect) {
        this.code = code;
        this.name = name;
        this.grade = grade;
        this.power = power;
        this.shield = shield;
        this.triggerEffect = triggerEffect;
    }

    @Override
    public void attack() {
        System.out.println("Atac: " + power);
    }

    @Override
    public void guard() {
        System.out.println("Defensa: " + shield);
    }

    @Override
    public void retire() {
        System.out.println("Retirada");
    }

    public void TriggerEffect() {
        if(triggerEffect == "Heal"){
            System.out.println("Cura una carta");
        }
        if(triggerEffect == "Draw"){
            System.out.println("Roba una carta");
        }
        if(triggerEffect == "Stand"){
            System.out.println("Levanta una carta");
        }
    }
}
