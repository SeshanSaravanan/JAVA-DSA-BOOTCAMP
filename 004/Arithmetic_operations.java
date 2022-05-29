/* Take in two numbers and an operator (+, -, *, /) 
and calculate the value. (Use if conditions) */

import java.util.*;

public class Arithmetic_operations{
    public static void main(String[] args){

        int num1, num2;
        char operator;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the num1: ");
        num1 = scan.nextInt();

        System.out.println("Enter the num2: ");
        num2 = scan.nextInt();

        System.out.println("Enter the operator: ");
        operator = scan.next().charAt(0);

        if (operator == '+'){
            System.out.println("The Sum is " + (num1 + num2));
        }
        else if(operator == '-'){
            System.out.println("The Difference is "+  (num1 - num2));
        }
        else if(operator == '*'){
            System.out.println("The Product is "+  (num1 * num2));
        }
        else if(operator == '/'){
            System.out.println("The Quotient is "+  (num1 / num2));
        }
    }
}