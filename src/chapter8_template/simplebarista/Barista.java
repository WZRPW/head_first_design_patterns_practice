package chapter8_template.simplebarista;

public class Barista {
    public static void main(String[] args) {
        Tea  tea = new Tea();
        Coffee coffee = new Coffee();
        System.out.println("making tea ...");
        tea.prepareRecipe();
        System.out.println("making tea ...");
        coffee.prepareRecipe();
    }
}
