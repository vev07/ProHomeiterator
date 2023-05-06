package org.example.HomeWork.MyClass;

public class MyListArray {
    private static String[] list = new String[10];
    private static int size = 0;

    public void add(String str, int index) {
        if (list.length == 0) {
            list[0] = str;
        } else if (list.length - 1 == index ) {
            list[index] = str;
        } else {
            String tmp = list[index];
            list[index] = str;
            list[index + 1] = tmp;
            for (int i = list.length - 2; i > index + 1; i--) {
                list[i +1] = list[i];
            }
        }
        MyListArray.getSize();
    }
    public void add(String str) {
        list[size++] = str;
    }
    public void removeIndex (int index) {
        if (list.length - 1 < index) {
            System.out.println("You want to delete element which isn't ");
        } else {
            for (int i = index; i < list.length - 1; i++) {
                list[i] = list[i + 1];
                list[list.length - 1] = null;
            }
        }
      size--;
    }
    public static void printMyListArray(MyListArray myListArray) {
        for (String x: myListArray.getList()) {
            if (x != null)
            System.out.print(x + " ");


        }
    }


    public String[] getList() {
        return list;
    }

    public void setList(String[] list) {
        this.list = list;
    }

    public static int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
