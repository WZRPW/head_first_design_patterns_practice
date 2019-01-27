package chapter7_adapter.ducks;

public class WildTurkey implements Turkey {
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    public void fly() {
        System.out.println("I am flying a short distance");
    }
}
