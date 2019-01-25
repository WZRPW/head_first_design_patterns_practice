package chapter7_adapter.iterenum;

import java.util.*;

public class IteratorEnumerationTestDrive  {
    public static void main(String[] args) {
        String[] StrArr = {"abc", "e", "China", "Japan"};
        List<String> list = new ArrayList<String>(Arrays.asList(StrArr));
        Enumeration<?> enumeration = new IteratorEnumeration(list.iterator());
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
