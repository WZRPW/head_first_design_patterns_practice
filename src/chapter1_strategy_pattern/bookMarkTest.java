package chapter1_strategy_pattern;

public class bookMarkTest {

    public static void main(String[] args) {
        BookMark b1 = new BookMark3();
        ((BookMark3) b1).start = 100;
        BookMark b2 = new BookMark4();
        ((BookMark4) b2).start = 200;
        ((BookMark4) b2).end = 300;
    }
}
