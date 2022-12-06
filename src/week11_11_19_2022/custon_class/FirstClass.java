package week11_11_19_2022.custon_class;

import java.util.ArrayList;

public class FirstClass {

    public int a;

    public String b;

    public SecondClass secondClass;

    public ArrayList <Integer> arrayList;

    // shortcut for creating constructor  alt+insert


    public FirstClass(int a, String b, SecondClass secondClass) {
        this.a = a;
        this.b = b;
        this.secondClass = secondClass;
    }


    public String toString() {
        return "FirstClass{" +
                "a=" + a +
                ", b='" + b + '\'' +
                ", secondClass=" + secondClass +
                '}';
    }


}
