package chapter4_factory_pattern.pizzas;

import java.lang.reflect.Array;
import java.util.ArrayList;

//Principle: program to interface rather than implementation
abstract public class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<String>();

    public String getName() { return name; }

    public void prepare() { System.out.println("Preparing " + name); }

    public void bake() { System.out.println("Baking " + name); }

    public void cut() {  System.out.println("Cutting " + name); }

    public void box() { System.out.println("Boxing " + name); }

    public String toString() {
        //display pizza name and ingredients
        StringBuffer display = new StringBuffer();
        display.append("******" + name + "******\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (String topping : toppings) {
            display.append(topping + "\n");
        }

        return display.toString();
    }

}
