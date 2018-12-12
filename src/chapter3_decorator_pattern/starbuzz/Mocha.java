package chapter3_decorator_pattern.starbuzz;

//Condiment
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
        //description = "Mocha";
    }

    public String getDescription() {
        return beverage.getDescription() + " , Mocha";
        //return beverage.description + " , Mocha";
    }

    public double cost() {
        return .20 + beverage.cost();
    }
}
