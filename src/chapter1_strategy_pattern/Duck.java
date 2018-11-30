package chapter1_strategy_pattern;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {}
    public abstract void display();

    public void PerformFly() {
        flyBehavior.fly();
    }

    public void PerformQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys");
    }
}
