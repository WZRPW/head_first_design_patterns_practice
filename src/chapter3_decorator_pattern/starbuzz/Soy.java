package chapter3_decorator_pattern.starbuzz;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " , Soy";
        //return beverage.description + " , Soy";
    }

    public double cost() {
        return .15 + beverage.cost();
    }
}