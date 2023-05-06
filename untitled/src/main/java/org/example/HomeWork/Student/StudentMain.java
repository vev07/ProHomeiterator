package org.example.HomeWork.Student;

import java.util.ArrayList;
import java.util.List;

import static org.example.HomeWork.Student.Student.deleteStudentWhoHaveAverageMarkLowerTree;
import static org.example.HomeWork.Student.Student.deleteStudentWhoHaveNameHow;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Yevhen", "Victorovich",5,5));
        students.add(new Student("Sergey", "GGG",4,4));
        students.add(new Student("Vasy", "TTT",3,3));
        students.add(new Student("Misha", "YYY",2,2));
        students.add(new Student("Sany", "WWW",1,1));
        System.out.println(students);
        deleteStudentWhoHaveAverageMarkLowerTree(students);
        System.out.println(students);
        deleteStudentWhoHaveNameHow(students, "Sergey");
        System.out.println(students);

    }
}
