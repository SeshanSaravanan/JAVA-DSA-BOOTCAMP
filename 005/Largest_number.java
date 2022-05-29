//Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class Largest_number{
    public static void main(String[] args){

        int num1, num2;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        num1 = scan.nextInt();

        System.out.println("Enter the second number: ");
        num2 = scan.nextInt();

        if (num1 > num2){
            System.out.println(num1 + " is the largest number");
        }
        else{
            System.out.println(num2 + " is the largest number");
        }
    }
}