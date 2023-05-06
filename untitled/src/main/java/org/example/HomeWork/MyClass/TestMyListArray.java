package org.example.HomeWork.MyClass;

import org.example.HomeWork.MyClass.MyListArray;

import static org.example.HomeWork.MyClass.MyListArray.*;

public class TestMyListArray {
    public static void main(String[] args) {
        MyListArray myListArray = new MyListArray();
        myListArray.add("WWWW");
        myListArray.add("DDDD");

        printMyListArray(myListArray);
        System.out.println();

        myListArray.add("PPPP", 1);
        myListArray.add("TTTT", 3);
        myListArray.add("UUUU", 4);
        myListArray.add("YYYY", 5);
        myListArray.add("QQQQ", 6);
        myListArray.add("AAAA", 7);
        myListArray.add("LLLL", 8);
        myListArray.add("MMMM", 9);

        printMyListArray(myListArray);

        myListArray.removeIndex(0);
        myListArray.removeIndex(0);
        myListArray.removeIndex(0);
        myListArray.removeIndex(0);
        myListArray.removeIndex(9);
        myListArray.removeIndex(3);

        System.out.println();
        printMyListArray(myListArray);


    }
}
