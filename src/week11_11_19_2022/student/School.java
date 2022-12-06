package week11_11_19_2022.student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class School {
    /*

2. create a class which is School with main method

3. create a list of student in School class

4. create a method in School class which is getting list of students as parameter the return the list of students if
the name starts with "A"

     */

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        //  LocalDate.of(2000,1,1)  ;
        Student student1 = new Student("Osman", 'M', 'A', LocalDate.of(1976, 1, 1), 111);
        Student student2 = new Student("Erdem", 'M', 'B', LocalDate.of(1999, 1, 1), 111);
        Student student3 = new Student("Veli", 'M', 'A', LocalDate.of(2000, 1, 1), 111);
        Student student4 = new Student("Cevriye", 'F', 'C', LocalDate.of(1975, 1, 1), 111);
        Student student5 = new Student("Aygun", 'F', 'D', LocalDate.of(1995, 1, 1), 111);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);


        ArrayList<Student> result = getStudentsNameStartsWithA(students);
        ArrayList<Student> result1 = getGradeLessThanC(students);

        ArrayList<Student> result2 = getAgeMoreThan40(students);

        ArrayList<Student> result3 = getGenderFemale(students);

        System.out.println(result);

        System.out.println(result1);

        System.out.println(result2);

        System.out.println(result3);

        System.out.println("getGradeD(students) = " + getGradeD(students));

        System.out.println(getGenderFAgeMoreThan40(students));

    }

    public static ArrayList<Student> getStudentsNameStartsWithA(ArrayList<Student> students) {

        ArrayList<Student> result = new ArrayList<>();

        for (Student student : students) {

            if (student.name.startsWith("A")) {
                result.add(student);
            }

        }

        return result;
    }

    public static ArrayList<Student> getGradeLessThanC(ArrayList<Student> students) {
        ArrayList<Student> result1 = new ArrayList<>();

        for (Student student : students) {

            if (student.grade < 'C') {
                result1.add(student);
            }

        }

        return result1;
    }

    public static ArrayList<Student> getAgeMoreThan40(ArrayList<Student> students) {

        ArrayList<Student> result2 = new ArrayList<>();


        for (Student student : students) {
            if (student.age > 40) {
                result2.add(student);
            }
        }
        return result2;
    }

    public static ArrayList<Student> getGenderFemale(ArrayList<Student> students) {

        ArrayList<Student> result3 = new ArrayList<>();

        for (Student student : students) {

            if (student.gender == 'F') {
                result3.add(student);
            }

        }
        return result3;
    }

    public static ArrayList<Student> getGradeD(ArrayList<Student> students) {
        ArrayList<Student> result4 = new ArrayList<>();

        for (Student student : students) {

            if (student.grade == 'D') {
                result4.add(student);
            }

        }

        return result4;
    }

    public static ArrayList<Student> getGenderFAgeMoreThan40(ArrayList<Student> students) {

        ArrayList<Student> result5 = new ArrayList<>();

        for (Student student : students) {

            boolean b = student.age > 40;
            boolean b1 = student.gender == 'F';
            if (b && b1) {


                    result5.add(student);
            }

        }
        return result5;
    }
}
