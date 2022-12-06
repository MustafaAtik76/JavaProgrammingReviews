package week12_11_26_2022.Student;

import java.util.Scanner;

public class StudentObject {

    public static void main(String[] args) {
    String name = "Adam";
        Student student1= new Student("Adam");
        System.out.println(student1);
        student1.age = 12;
        student1.batchNumber = 34;

        System.out.println(student1.toString());

        Scanner scanner = new Scanner(System.in);
        System.out.println("please input "+ name + "'s  age");

        int age = scanner.nextInt();

        student1.age = age;

        System.out.println("please input "+ name + "'s  batch number");

        int batchNumber = scanner.nextInt();

        student1.batchNumber = batchNumber;

        System.out.println(student1);


    }
}
