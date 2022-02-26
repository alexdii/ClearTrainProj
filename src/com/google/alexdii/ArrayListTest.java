package com.google.alexdii;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i<10; i++) {
            list.add(i);
        }
        System.out.println(list);

        list.remove(5);
        System.out.println(list);

        list.add(5);
        System.out.println(list);
        list.add(5,5);
        System.out.println(list);

        list.add(10,10);
        System.out.println(list);
    }


}
