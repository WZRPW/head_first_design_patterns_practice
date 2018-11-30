package chapter1_strategy_pattern;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.PerformFly();
        mallard.PerformQuack();
    }
}
