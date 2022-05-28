// check whether a number is odd or even

import java.util.Scanner;

public class Odd_or_Even{
    public static void main(String [] args){
        
        int n; // n --> number to check
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number: ")
        n = scan.nextInt();

        if (n % 2 == 0){
            System.out.println("The number is even!");
        }
        else{
            System.out.println("The number is odd!");
        }
    }
}