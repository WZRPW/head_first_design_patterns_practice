package chapter1_strategy_pattern;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("cannot fly");
    }
}
