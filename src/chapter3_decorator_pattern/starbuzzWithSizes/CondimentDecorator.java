package chapter3_decorator_pattern.starbuzzWithSizes;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public abstract String getDescription();
    public Size getSize() {
        return beverage.getSize();
    }
}
