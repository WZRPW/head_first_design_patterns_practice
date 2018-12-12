package chapter3_decorator_pattern.starbuzz;

public class Milk extends Beverage {
    Beverage beverage;
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " , Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + .1;
    }

}
