package org.example.Lesson0405;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(0,5);
        numbers.add(1,7);
        numbers.add(2,9);
        numbers.add(4);
        System.out.println(numbers);

        List<Integer> num2 = new ArrayList<>();
        num2.add(20);
        num2.add(23);
        System.out.println(num2);
        num2.addAll(0,numbers);
        System.out.println(num2);
        int value = num2.remove(0);
        System.out.println(num2);
        System.out.println(value);
        System.out.println("num2.get(3) - " + num2.get(3));
        num2.set(0,100);
        System.out.println("after num2.set(0,100) - " + num2);
        System.out.println("num2.contains(11) - " + num2.contains(11));
        List<String>str = new ArrayList<>();
        System.out.println("str.isEmpty() - " + str.isEmpty());

    }
}