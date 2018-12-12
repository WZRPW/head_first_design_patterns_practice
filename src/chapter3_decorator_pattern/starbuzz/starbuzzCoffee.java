package chapter3_decorator_pattern.starbuzz;

import java.util.*;

public class starbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $ " + beverage.cost());

        Beverage b2 = new DarkRoast();
        b2 = new Mocha(b2); //Add Decorator
        b2 = new Mocha(b2); //Add Decorator
        b2 = new Whip(b2);
        System.out.println(b2.getDescription() + " $ " + b2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()
                + " $" + beverage3.cost());
    }
}
