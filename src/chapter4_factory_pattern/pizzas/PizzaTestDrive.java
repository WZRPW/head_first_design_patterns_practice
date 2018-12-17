package chapter4_factory_pattern.pizzas;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class PizzaTestDrive {

    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza("cheese");
        System.out.println("we ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);

        pizza = store.orderPizza("veggie");
        System.out.println("we ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);
    }
}
