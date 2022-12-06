package week11_11_19_2022;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {

    //how to creat an arrayList
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();

        //how to add element

        cities.add("London");
        cities.add("Paris");
        cities.add("Istanbul");
        cities.add("Rome");

        //how to print
        //for Array Arrays.toString

        System.out.println(cities);

        //how to add element whit index

        cities.add(0,"Lyon");

        System.out.println(cities);

        //how to get element

        System.out.println(cities.get(0));

        //how to update your element

        System.out.println("cities.set(1, \"New York\") = " + cities.set(1, "New York"));// değişecek elemanı getirir

        cities.set(1, "New York");

        System.out.println(cities);

        //how to learn the position of the element or index of elemen

        System.out.println(cities.indexOf("New York"));

        System.out.println(cities.indexOf("Ankara")); // if element is not existe in the Array result is -1

        System.out.println(cities.indexOf("New"));

        //lastIndexDf ()
        //indexOf () and lastIndexOf will give the same index if the element is unique.
        System.out.println("cities.lastIndexOf(\"Lyon\") (only one element as Lyon) = " + cities.lastIndexOf("Lyon"));
        // if there is more than one of the same element it will give the last one
        cities.add("Lyon");
        System.out.println("cities.lastIndexOf(\"Lyon\") = " + cities.lastIndexOf("Lyon"));
        //indexOf () give the first element asked
        System.out.println("cities.indexOf(\"Lyon\") = " + cities.indexOf("Lyon"));

        System.out.println("------------------------------------------");

       // ArrayList<int> arrayList= new ArrayList<>(); int yazamayız Wrapper kullanmalı Integer

        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add (1);
        numbers.add (1);
        numbers.add (1);
        numbers.add (2);
        numbers.add (3);
        numbers.add (4);
        numbers.add (5);
        numbers.add (1);
        numbers.add (1);

        System.out.println("numbers = " + numbers);
        System.out.println("numbers.indexOf(1) = " + numbers.indexOf(1));
        System.out.println("numbers.lastIndexOf(1) = " + numbers.lastIndexOf(1));
        System.out.println("---------------------------------------------------");

        // how to remove element

        ArrayList<Integer> numbers1 = new ArrayList<>();

        numbers1.add(2);
        numbers1.add(3);
        numbers1.add(4);
        numbers1.add(5);
        numbers1.add(1);
        System.out.println("numbers1 = " + numbers1);

        System.out.println("numbers1.remove(4) = " + numbers1.remove(1));
        System.out.println("numbers1 = " + numbers1);

        Integer b =4;
        numbers1.remove(b); // it will remove your element

        System.out.println("numbers1 = " + numbers1);

        numbers1.remove(new Integer(5));
        System.out.println(numbers1);

        System.out.println("----------------------------------------------");

        // bulk operations

        //addAll

        ArrayList<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Mesut", "Osman", "Seyma"));

        System.out.println("names = " + names);
        System.out.println("------------------------------------------------" );

        //removeAll    //retainAll    //removeIf()

        System.out.println("numbers = " + numbers);

        //iteration the indexes are changing
       /* for (Integer number : numbers) {
            if (number < 3)
                numbers.remove(number); // we are not able to use like this because  or each

        }*/
        numbers.removeIf(k-> k<3);

        System.out.println(numbers);


    }

}
