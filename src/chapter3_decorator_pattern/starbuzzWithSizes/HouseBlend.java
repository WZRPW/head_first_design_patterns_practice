package chapter3_decorator_pattern.starbuzzWithSizes;

public class HouseBlend extends Beverage{
    public HouseBlend() {
        description = "HouseBlend Coffee";
    }

    public double cost() {
        return .89;
    }
}

