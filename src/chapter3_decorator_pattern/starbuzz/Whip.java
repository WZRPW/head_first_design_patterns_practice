package chapter3_decorator_pattern.starbuzz;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " , Whip";
        //return beverage.description + " , Whip";
    }

    public double cost() {
        return .10 + beverage.cost();
    }
}