package com.google.alexdii;

public class SubStringTest{
    public static void main(String[] args) {
        String a = "Hello";
        String s = a.substring(0,4);
        System.out.println(s);
        String all = String.join("/", "XXX", "XXL", "XL", "L", "M");
        System.out.println(all);
        String repeated = "Java ".repeat(5);   // повтор, количество раз
        System.out.println(repeated);
        a = a.substring(0,3) + "p!";           // изменение строки "Hallo" на "Help!"
        System.out.println(a);
        int n = a.length();                    // длина строки
        System.out.println(n);

    }
}
