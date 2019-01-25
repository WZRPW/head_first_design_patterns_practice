package chapter7_adapter.iterenum;

import chapter3_decorator_pattern.starbuzz.Whip;

import java.util.*;

public class EI {
    public static void main(String[] args) {
        String[] StrArr = {"China", "USA", "Japan", "Germany"};
        Vector<String> v = new Vector<>(Arrays.asList(StrArr));
        Enumeration<String> enumeration = v.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        Iterator<String> iterator = v.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
