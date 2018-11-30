package chapter1_strategy_pattern;

//Design Principle:
//(1)
//Identify the aspects of your application
//that vary and separate them from what stays the same
//In the case of Duck class, fly and quack are two behaviors various among different duck species
//Use interfaces to separate them from the Duck class. Leave the specific implementation to the runtime
//(2)
//Favor composition over inheritance
//Fly and Quack are two compositions
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

    //use set function rather than constructor to define fly behavior
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }
    //use set function rather than constructor to define quack behavior
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
