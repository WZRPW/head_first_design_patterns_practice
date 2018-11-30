package chapter1_strategy_pattern;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
