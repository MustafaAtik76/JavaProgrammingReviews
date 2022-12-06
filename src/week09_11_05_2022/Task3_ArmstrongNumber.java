package week09_11_05_2022;

import week04_10_01_2022.ScannerIntro;

import java.util.Scanner;

public class Task3_ArmstrongNumber {
    public static void main(String[] args) {
        /*Task 3 :   Write a method that can check if a number is Armstrong number

                Note: if I have a 3-digit number then each of the digits is raised to the power of three
                and added to obtain a number. If the number obtained equals the original number then,
                we call that armstrong number.

                Armstrong numbers are     === 153 370 371 407 === for 3 digits
                */

            isArmstrongNumber(153);

        }
        public static int isArmstrongNumber(int number){

            if (number <100 || number > 999){
                System.out.println("Invalid number");
                return number;
            }
            int result = (number%10)*(number%10)*(number%10)
                    +((number/10)%10)*((number/10)%10)*((number/10)%10)
                    +(number/100)*(number/100)*(number/100);

            if (number== result){
                System.out.println(number + " is an armstrong number.");
            }else {
                System.out.println(number + " is not an armstrong number.");
            }

            return number;
        }
    }



