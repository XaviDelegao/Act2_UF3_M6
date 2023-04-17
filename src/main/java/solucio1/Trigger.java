package solucio1;




public class Trigger{

    Normal card;
    String triggerEffect;

    public Trigger(Normal card, String triggerEffect) {
        this.card = card;
        this.triggerEffect = triggerEffect;
    }


    public void attack() {

        System.out.println(card.attack());
    }


    public void guard() {
        System.out.println(card.guard());
    }


    public void retire() {
        System.out.println(card.retire());
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
