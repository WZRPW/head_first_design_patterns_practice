package chapter1_strategy_pattern;

public class MallardDuck extends Duck {
    //Here MallardDuck still programs to implementations of fly and quack behaviors
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a real Mallard duck");
    }
}
