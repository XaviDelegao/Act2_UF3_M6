package senseIoC;



public class Trigger{

    Normal normal = new Normal("BT01-002", "Blaster Dark Trigger", 0, 5000, 15000);
    String triggerEffect;

    public Trigger(String triggerEffect) {

       this.triggerEffect = triggerEffect;
    }


    public void attack() {

        System.out.println(normal.attack());
    }


    public void guard() {
        System.out.println(normal.guard());
    }


    public void retire() {
        System.out.println(normal.retire());
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
