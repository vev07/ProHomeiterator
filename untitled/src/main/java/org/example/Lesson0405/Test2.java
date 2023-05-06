package org.example.Lesson0405;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(11);
        num.add(20);
        num.add(30);
        num.add(21);
        num.add(33);

        List<Integer> newList = comeBack(num);
        System.out.println("newList - " + newList);
        System.out.println("num - " + num);
        List<Integer> num3 = delElement(num, 20);
        System.out.println("num3 - " + num3);
        removeEvent(num);
        System.out.println("removeEvent(num) - " + num);

        List<String> str2 = new ArrayList<>();
        str2.add("YYYYYYYYYY");
        str2.add("DD");
        str2.add("F");
        str2.add("HHH");
        System.out.println("sumWordsLength(str2) - " + sumWordsLength(str2));
    }
    public static List<Integer> comeBack(List<Integer> num) {
        List<Integer> newList = new ArrayList<>();
        for (Integer i: num) {
            newList.add(i * 2);
        }
        return newList;
    }
    public static List<Integer> delElement(List<Integer> num, int key) {
        List<Integer>newList = new ArrayList<>();
        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) != key){
                newList.add(num.get(i));
            }

        }
        return newList;
    }
    public static void removeEvent(List<Integer> num) {
        Iterator<Integer> iterator = num.iterator();
        while (iterator.hasNext()) {
            Integer currentElement = iterator.next();
            if (currentElement % 2 == 0) {
                iterator.remove();
            }
        }
    }
    public static int sumWordsLength(List<String> str) {
        int length = 0;
        for (String word: str) {
            length += word.length();
        }
        return length;
    }


}
