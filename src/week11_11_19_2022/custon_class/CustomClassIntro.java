package week11_11_19_2022.custon_class;

public class CustomClassIntro {

    public static void main(String[] args) {

        //how to creat an object
        // Class Name  reference = new keyword constructor
        //FirstClass(int a, String b, SecondClass secondClass) {

        SecondClass secondObject = new SecondClass();
        FirstClass firstObject = new FirstClass(4, "Adam", secondObject);

        // how to get attributes

        System.out.println(firstObject.a);
        System.out.println(firstObject.b);


    }
}
