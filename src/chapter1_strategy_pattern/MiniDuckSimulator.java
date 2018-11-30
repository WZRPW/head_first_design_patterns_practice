package chapter1_strategy_pattern;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.PerformFly();
        mallard.PerformQuack();

        //Design Principle: program to interface
        //use Duck superType as class Type
        Duck modelDuck = new ModelDuck();
        modelDuck.PerformFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.PerformFly();
    }
}
