package chapter7_adapter.iterenum;

import java.util.*;

public class EnumerationIteratorTestDrive {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>(Arrays.asList());
        Iterator<?> iterator = new EnumerationIterator(v.elements());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
