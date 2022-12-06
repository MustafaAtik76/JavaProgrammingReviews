package week09_11_05_2022;

public class MethodsIntro {

    public static void main(String[] args) {
        // print Hello 5 Times

    printHello5Times();
        System.out.println("----------");
    printHello5Times();
    
    
    int result = sum(5,6);

        System.out.println("result = " + result);

        multiplylwith2AndPrint(result);
    }

    private static void multiplylwith2AndPrint(int result) {

        System.out.println(result * 2);
    }

    private static int sum(int num1, int num2) {
        return num1+num2;
    }

    public static void printHello5Times(){


        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");



    }
    }

