package org.example;

public class Normal implements Card{

    String code;
    String name;
    int grade;
    int power;
    int shield;

    public Normal(String code, String name, int grade, int power, int shield) {
        this.code = code;
        this.name = name;
        this.grade = grade;
        this.power = power;
        this.shield = shield;
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
}
