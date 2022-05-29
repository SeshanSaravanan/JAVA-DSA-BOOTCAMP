// To calculate Fibonacci Series up to n numbers.\

import java.util.Scanner;

public class Fibonnaci_Sequence{
    public static void main(String[] args){
        int num1 = 0, num2 = 1, num, n; // n --> no. of elements in sequence
        Scanner scan =  new Scanner(System.in);

        System.out.println("Enter the numer of elements in the sequence: ");
        n = scan.nextInt();
        System.out.print(num1 + " " +  num2);
        for(int i = 1; i <= n; i++){
            num = num1 + num2;
            System.out.print(" "+ num + " ");

            num2 = num;
            num1 = num2; 
        }
    }
}