package senseIoC;

import org.example.Card;

public class Normal{

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


    public String attack() {
        String powerS = "Atac: " + power;
        return powerS;
    }


    public String guard() {
        String guard = "Defensa: " + shield;
        return guard;
    }


    public String retire() {
        String retire = "Retirada";
        return retire;
    }
}
