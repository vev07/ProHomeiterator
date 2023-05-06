package org.example.HomeWork.Student;

import java.util.Iterator;
import java.util.List;

/*
Создать класс Студент с полями имя, фамилия, номер курса, средний балл.
Создать лист студентов, куда поместить нескольких студентов с разными значениями полей.
 Написать метод, который принимает лист студентов и при помощи итератора
  удаляет всех студентов с номером курса меньше 3.
  Написать метод, который принимает лист студентов и имя в качестве второго параметра.
   С помощью итератора метод должен удалять всех студентов с таким именем.
 */
public class Student {
    String name;
    String lastName;
    int numbersCourse;
    int averageMark;

    public Student(String name, String lastName, int numbersCourse, int averageMark) {
        this.name = name;
        this.lastName = lastName;
        this.numbersCourse = numbersCourse;
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {

        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", numbersCourse=" + numbersCourse +
                ", averageMark=" + averageMark +
                '}';
    }
    public static void deleteStudentWhoHaveAverageMarkLowerTree(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getNumbersCourse() < 3) {
                iterator.remove();
            }
        }

    }
    public static void deleteStudentWhoHaveNameHow(List<Student> students, String userName) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getName() == userName) {
                iterator.remove();
            }
        }

    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getNumbersCourse() {
        return numbersCourse;
    }

    public int getAverageMark() {
        return averageMark;
    }
}


